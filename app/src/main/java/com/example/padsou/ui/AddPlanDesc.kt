package com.example.padsou.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.padsou.ui.components.FooterAdd
import com.example.padsou.ui.components.FormAdd
import com.example.padsou.ui.components.HeaderAdd

@Composable
fun AddPlanDesc(){
    var pageId = 1
    Column() {
        HeaderAdd()
        Box(){
            FormAdd(pageId)
            FooterAdd()
        }
    }
}