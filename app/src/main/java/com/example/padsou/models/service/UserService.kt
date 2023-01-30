package com.example.padsou.models.service

import android.util.Log
import com.example.padsou.models.Offer
import com.example.padsou.models.User
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class UserService {
    var db = Firebase.firestore
    var collection = db.collection("users")


    public fun get(id: String): User?{
        var user: User? = null
        collection
            .whereEqualTo("uid_auth", id)
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    user = document.toObject()
                }
            }
        .addOnFailureListener { exception ->
            Log.d("aaa", "Error getting documents: ", exception)
        }
        return user
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

    public fun createFromAuth(email: String, password: String, uid: String){
        var name = email.split("@")[0]
        var user = User(name,"",email,password,uid)
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