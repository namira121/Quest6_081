package com.example.praktikumpam8.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikumpam8.model.Mahasiswa
import com.example.praktikumpam8.model.RencanaStudy

@Composable
fun DetailView(
    modifier: Modifier,
    uiStateMahasiswa: Mahasiswa,
    uiStateStudy: RencanaStudy,
    onBackButtonClicked: () -> Unit = {}
){
    val listDetail = listOf(
        Pair("NIM", uiStateMahasiswa.nim),
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("Email", uiStateMahasiswa.email),
        Pair("MataKuliah", uiStateStudy.mataKuliah),
        Pair("Kelas", uiStateStudy.kelas),
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        listDetail.forEach{ items -> CardSection(
            judulParam = items.first,
            isiParam = items.second
        )
        }
        Button(onClick = {onBackButtonClicked()}) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun CardSection(judulParam: String, isiParam:String){
    Column(){
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = " = ", modifier = Modifier.weight(0.2f))
            Text(text = "$isiParam",
                modifier = Modifier.weight(2f))
        }
    }
}