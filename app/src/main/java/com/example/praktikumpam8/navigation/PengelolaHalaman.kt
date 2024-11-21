package com.example.praktikumpam8.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.praktikumpam8.model.Mahasiswa
import com.example.praktikumpam8.ui.view.viewModel.MahasiswaViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    MataKuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel= viewModel(),
    krsViewModel: MahasiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()

){

}