package com.example.listmotor

import androidx.lifecycle.ViewModel
import com.example.listmotor.model.Motor
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MotorViewModel : ViewModel() {
    private val _motor = MutableStateFlow<Motor?>(null)
    val motor: StateFlow<Motor?> = _motor

    fun setMotor(motor: Motor) {
        _motor.value = motor
    }
}