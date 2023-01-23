package com.example.padsou.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.padsou.ui.components.FooterAdd
import com.example.padsou.ui.components.FormAdd
import com.example.padsou.ui.components.HeaderAdd

@Composable
fun AddPlan(navController: NavController,pageId : Int){
    Column() {
        HeaderAdd()
        Box(){
            FormAdd(navController,pageId)
        }
    }
    FooterAdd(navController)
}