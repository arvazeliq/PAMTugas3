package com.example.listmotor.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.listmotor.model.Motor

private const val NIM = "245150407111058"
private const val NAMA = "Arva Zeliq Pradyatma"

@Composable
fun allMotor(listMotor: List<Motor>, onItemClicked: (Motor) -> Unit) {
    Column(modifier = Modifier.fillMaxSize().statusBarsPadding()) {

        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 12.dp)) {
            Text("NIM: $NIM", style = MaterialTheme.typography.titleMedium)
            Text("Nama: $NAMA", style = MaterialTheme.typography.titleMedium)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Daftar Motor Honda", style = MaterialTheme.typography.headlineMedium)
        }

        LazyColumn(
            modifier = Modifier.fillMaxWidth().weight(1f),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(listMotor, key = { it.id }) { motor ->
                motorCard(motor, onClick = onItemClicked)
            }
        }
    }
}