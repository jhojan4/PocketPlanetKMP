package edu.unicauca.example.pocketplanet

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PresentacionViewModel : ViewModel() {
    private val logic = PresentacionLogic()

    //val imageIndex: StateFlow<Int> = logic.imageIndex.state
    val imageIndex: StateFlow<Int> = logic.imageIndex

    val textIndex: StateFlow<Int> = logic.textIndex
    fun nextImage() = viewModelScope.launch { logic.next() }
    fun previousImage() = viewModelScope.launch { logic.previous() }
}
