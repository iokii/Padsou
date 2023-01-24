package com.example.padsou.models.service

import android.util.Log
import com.example.padsou.models.Offer
import com.example.padsou.models.User
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class UserService {
    var db = Firebase.firestore
    var collection = db.collection("users")


    public fun get(id: String){
        var users: List<User> = listOf<User>()
        collection.document(id)
            .get()
            .addOnSuccessListener { result ->
                Log.d("aaa", "ggwp:  ${ result.data }")
                //offers = result.toObjects()

            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
    }


    public fun update(id: String, user: User){
        var users: List<User> = listOf<User>()
        collection.document(id)
            .set(user)
            .addOnSuccessListener {
                Log.d("aaa", "ggwp:")
            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
    }


    public fun create(user: User){
        collection
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("a", "DocumentSnapshot written with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("a", "Error adding document", e)
            }
    }

    public fun createFromAuth(email: String, password: String){
        var name = email.split("@")[0]
        var user = User(name,"",email,password)
        collection
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("a", "DocumentSnapshot written with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("a", "Error adding document", e)
            }
    }


}