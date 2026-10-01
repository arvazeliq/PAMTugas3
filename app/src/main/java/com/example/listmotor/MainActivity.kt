package com.example.listmotor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.listmotor.model.motors
import com.example.listmotor.ui.theme.ListMotorTheme
import com.example.listmotor.view.allMotor
import com.example.listmotor.view.detail

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListMotorTheme {
                val navController = rememberNavController()
                val motorViewModel: MotorViewModel = viewModel()
                val selectedMotor by motorViewModel.motor.collectAsState()

                NavHost(navController = navController, startDestination = NavDestination.List) {
                    composable(NavDestination.List) {
                        allMotor(motors, onItemClicked = {
                            motorViewModel.setMotor(it)
                            navController.navigate(NavDestination.Detail)
                        })
                    }
                    composable(NavDestination.Detail) {
                        selectedMotor?.let { detail(it) }
                    }
                }
            }
        }
    }
}