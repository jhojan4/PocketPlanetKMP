package edu.unicauca.example.pocketplanet

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PresentacionLogic {
    private val _imageIndex = MutableStateFlow(0)
    val imageIndex: StateFlow<Int> = _imageIndex

    private val _textIndex = MutableStateFlow(0)
    val textIndex: StateFlow<Int> = _textIndex

    private val totalItems = 4

    fun next() {
        _imageIndex.value = (_imageIndex.value + 1) % totalItems
        _textIndex.value = (_textIndex.value + 1) % totalItems
    }

    fun previous() {
        _imageIndex.value = (_imageIndex.value - 1 + totalItems) % totalItems
        _textIndex.value = (_textIndex.value - 1 + totalItems) % totalItems
    }
}
