package com.example.compose_bottomnavigationbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import com.example.compose_bottomnavigationbar.ui.theme.Compose_BottomNavigationBarTheme
import com.example.compose_bottomnavigationbar.ui.theme.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_BottomNavigationBarTheme {
                // A surface container using the 'background' color from the theme
                MainScreen(Modifier)
            }
        }
    }
}
