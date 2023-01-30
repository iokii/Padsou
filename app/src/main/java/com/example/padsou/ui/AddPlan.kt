package com.example.padsou.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.models.LoginViewModel
import com.example.padsou.models.PageAddViewModel
import com.example.padsou.ui.components.FooterAdd
import com.example.padsou.ui.components.FormAdd
import com.example.padsou.ui.components.HeaderAdd

@Composable
fun AddPlan(navController: NavController,pageId : Int, label: String, souslabel: String, img: String){
    val pageAddViewModel = viewModel<PageAddViewModel>()
    pageAddViewModel.onLabelChange(label)
    pageAddViewModel.onSousLabelChange(souslabel)
    pageAddViewModel.onImgChange(img)
    Column() {
        HeaderAdd()
        Box(){
            FormAdd(navController,pageId,pageAddViewModel)
        }
    }
    FooterAdd(navController)
}