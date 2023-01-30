package com.example.padsou.models

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private var _offers = MutableStateFlow<List<Offer>>(listOf())
    val offers = _offers.asStateFlow()
    private var _offer = MutableStateFlow<Offer>(Offer())
    val offer = _offer.asStateFlow()

    var db = Firebase.firestore
    var collection = db.collection("offers")

    fun onOfferChange(offers: List<Offer>){
        viewModelScope.launch {
            _offers.emit(offers)
        }
    }


    public fun getAll(){
        var dataOffers:MutableList<Offer> = mutableListOf<Offer>()
        collection
            .get()
            .addOnSuccessListener { result ->
                for (document in result){
                    dataOffers.add(document.toObject())
                }
                _offers.value = dataOffers
            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }
    }

    public fun get(id: String){
        var dataOffer:Offer = Offer()
        collection.document(id)
            .get()
            .addOnSuccessListener { result ->
                dataOffer = result.toObject()!!
                _offer.value=dataOffer
            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }

    }


}