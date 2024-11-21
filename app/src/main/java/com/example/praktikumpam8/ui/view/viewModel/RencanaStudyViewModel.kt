package com.example.praktikumpam8.ui.view.viewModel

import androidx.lifecycle.ViewModel
import com.example.praktikumpam8.model.RencanaStudy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel :ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudy())
    val krsStateUi:StateFlow<RencanaStudy> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan:String){
        _krsState.update { stateMK -> stateMK.copy(mataKuliah = mkPilihan)}
    }
}