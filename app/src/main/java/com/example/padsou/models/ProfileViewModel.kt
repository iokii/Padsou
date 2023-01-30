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

class ProfileViewModel (): ViewModel() {
    private var _user = MutableStateFlow<User?>(null)
    var user = _user.asStateFlow()



    var db = Firebase.firestore
    var collection1 = db.collection("users")



    fun onOfferChange(user: User){
        viewModelScope.launch {
            _user.emit(user)
        }
    }




    public fun get(id : String){
        var dataOffer:User = User()
        collection1.whereEqualTo("uid_auth",id)
            .get()
            .addOnSuccessListener { result ->
                result.forEach{
                    it ->
                    dataOffer = it.toObject()
                    _user.value = dataOffer

                }
                Log.d("boop",_user.value.toString())
            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }

    }




}