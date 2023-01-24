package com.example.padsou.models.service

import android.util.Log
import com.example.padsou.models.Offer
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class OfferService {
    var db = Firebase.firestore
    var collection = db.collection("offers")

    public fun getAll(){
        var offers: List<String> = listOf<String>()
        collection
            .get()
            .addOnSuccessListener { result ->
                for (document in result){
                    Log.d("aaa", "ggwp:  ${ document.data }")
                }
                //offers = result.toObjects()

            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
    }

    public fun get(id: String){
        var offers: List<String> = listOf<String>()
        collection.document(id)
            .get()
            .addOnSuccessListener { result ->
                Log.d("aaa", "ggwp:  ${ result.data }")
                //offers = result.toObjects<Offer>()

            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
    }

    public fun create(offer: Offer){
        collection
            .add(offer)
            .addOnSuccessListener { documentReference ->
                Log.d("a", "DocumentSnapshot written with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("a", "Error adding document", e)
            }
    }
}