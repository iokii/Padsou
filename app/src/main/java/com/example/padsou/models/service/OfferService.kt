package com.example.padsou.models.service

import android.util.Log
import com.example.padsou.models.Offer
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class OfferService {
    var db = Firebase.firestore
    var collection = db.collection("offers")

    public fun getAll(): List<Offer>{
        var offers: List<Offer> = listOf<Offer>()
        collection
            .get()
            .addOnSuccessListener { result ->
                for (document in result){
                    offers += document.toObject<Offer>()
                }

            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
        return offers
    }

    public fun get(id: String): Offer?{
        var offer: Offer? = null
        collection.document(id)
            .get()
            .addOnSuccessListener { result ->
                offer = result.toObject<Offer>()
            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
        return offer
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