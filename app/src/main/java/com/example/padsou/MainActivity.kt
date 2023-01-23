package com.example.padsou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.example.padsou.ui.components.*
import com.example.padsou.ui.components.Register
import com.example.padsou.ui.AddPlanDesc
import com.example.padsou.ui.AddPlanPhoto
import com.example.padsou.ui.MainNav
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite

import com.example.padsou.ui.theme.PadsouTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = DarkBlue
                ) {
                }
            }
        }
    }
}
