import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.padsou.models.service.UserService
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AccountService {
    private lateinit var auth: FirebaseAuth
    var userService = UserService()

    public fun createAccount(email: String, password: String, context: Context){
        auth = Firebase.auth


        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task: Task<AuthResult> ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("a", "createUserWithEmail:success")
                    val user = task.result.user
                    userService.createFromAuth(email, password)

                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("a", "createUserWithEmail:failure", task.exception)
                }
            }
    }
}
