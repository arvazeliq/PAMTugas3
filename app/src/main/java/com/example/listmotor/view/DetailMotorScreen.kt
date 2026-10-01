package com.example.listmotor.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.listmotor.model.Motor

@Composable
fun detail(motor: Motor) {
    Column(modifier = Modifier.statusBarsPadding().padding(24.dp)) {
        Image(
            painter = painterResource(motor.image),
            contentDescription = motor.name,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth().height(220.dp)
        )
        Text(text = "id = " + motor.id)
        Text(text = "nama = " + motor.name)
        Text(text = "kategori = " + motor.category)
        Text(text = "seri = " + motor.series)
    }
}