package com.example.padsou.models



import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CommentViewModel (): ViewModel() {
    private var _user = MutableStateFlow<User?>(null)
    val user = _user.asStateFlow()
    private var _test = MutableStateFlow<String>("")
    var test = _test.asStateFlow()


    var db = Firebase.firestore
    var collection1 = db.collection("users")



    fun onOfferChange(user: User){
        viewModelScope.launch {
            _user.emit(user)
        }
    }

    public fun setTest(){
        viewModelScope.launch {
            _test.value = "boop"
        }
    }



    public fun get(id : String){
        var dataOffer:User = User()
        collection1.document(id)
            .get()
            .addOnSuccessListener { result ->
                dataOffer = result.toObject<User>()!!
                _user.value = dataOffer
            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }

    }




}