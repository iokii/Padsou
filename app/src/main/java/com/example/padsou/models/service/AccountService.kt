import android.content.Context
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import androidx.navigation.NavController
import com.example.padsou.models.service.UserService
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await

class AccountService {
    private lateinit var auth: FirebaseAuth
    var userService = UserService()

    public fun createAccount(email: String, password: String, secondPassword: String, context: Context, navController: NavController): Boolean{
        var success = false
        if(TextUtils.isEmpty(email) || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(context,"Veuillez mettre un email valide",Toast.LENGTH_LONG).show()
            return success
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(context,"Veuillez mettre un mot de passe valide",Toast.LENGTH_LONG).show()
            return success
        }
        if(password!=secondPassword){
            Toast.makeText(context,"Veuillez vérifier que les deux mots de passe correspondent",Toast.LENGTH_LONG).show()
            return success
        }
        auth = Firebase.auth


        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task: Task<AuthResult> ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("a", "createUserWithEmail:success")
                    userService.createFromAuth(email, password)
                    success = true
                    navController.navigate("home")
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(
                        context, "Le mot de passe doit faire au moins 6 caractères.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        return success
    }

    public fun login(email: String, password: String, context: Context, navController: NavController): Boolean{
        var success = false
        if(TextUtils.isEmpty(password)){
            Toast.makeText(
                context, "Veuillez remplir tous les champs.",
                Toast.LENGTH_SHORT
            ).show()
            return success
        }
        if(TextUtils.isEmpty(email)){
            Toast.makeText(
                context, "Veuillez remplir tous les champs.",
                Toast.LENGTH_SHORT
            ).show()
            return success
        }
        auth = Firebase.auth
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task: Task<AuthResult> ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth.currentUser
                    success = true
                    navController.navigate("home")
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(
                        context, "Erreur lors de la connection.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        Log.d("a", success.toString())
        return success
    }

    public fun disconnect(navController: NavController){
        auth = Firebase.auth
        auth.signOut()
        navController.navigate("onBoarding")
    }

}
