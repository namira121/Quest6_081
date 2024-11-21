package com.example.praktikumpam8.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.praktikumpam8.R
import com.example.praktikumpam8.model.Mahasiswa
import com.example.praktikumpam8.model.RencanaStudy

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var choosenDropdown by remember { mutableStateOf("") }

    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember { mutableStateOf("") }
    var listData: MutableList<String> = mutableListOf(choosenDropdown, pilihanKelas)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}