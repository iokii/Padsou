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

class OneOfferViewModel : ViewModel() {
    private var _offer = MutableStateFlow<Offer>(Offer())
    val offer = _offer.asStateFlow()


    var db = Firebase.firestore
    var collection1 = db.collection("offers")


    fun onOfferChange(offer: Offer){
        viewModelScope.launch {
            _offer.emit(offer)
        }
    }

    public fun get(id: String){
        var dataOffer:Offer = Offer()
        collection1.document(id)
            .get()
            .addOnSuccessListener { result ->
                dataOffer = result.toObject()!!


                db.collection("offers/$id/comments")
                    .get()
                    .addOnSuccessListener{documents ->
                        for (document in documents) {
                            var comment :Comment  = document.toObject<Comment>()
                            db.collection("").get()
                                .addOnSuccessListener { user ->
                                    comment.user = user.toObject()!!
                                }



                            dataOffer.listComment.add(document.toObject<Comment>()!!)
                        }



                    }


                _offer.value=dataOffer

            }
            .addOnFailureListener { exception ->
                Log.d("aaa", "Error getting documents: ", exception)
            }

    }


}