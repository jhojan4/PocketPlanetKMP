package edu.unicauca.example.pocketplanet

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RegistroViewModel {
    private val _nombre = MutableStateFlow("")
    val nombre: StateFlow<String> = _nombre

    private val _correo = MutableStateFlow("")
    val correo: StateFlow<String> = _correo

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password

    private val _country = MutableStateFlow("")
    val country: StateFlow<String> = _country

    private val _phone = MutableStateFlow("")
    val phone : StateFlow<String> = _phone
    private val _repassword = MutableStateFlow("")
    val repeatpassword : StateFlow<String> = _repassword



    fun onNombreChanged(value: String) {
        _nombre.value = value
    }

    fun onCorreoChanged(value: String) {
        _correo.value = value
    }

    fun onPasswordChanged(value: String) {
        _password.value = value
    }
    fun onCountryChanged(value: String) {
        _country.value = value
    }
    fun onCorreohanged(value: String) {
        _correo.value = value
    }
    fun onPhoneChanged(value: String) {
        _phone.value = value
    }
    fun onRepeatPasswordChanged(value: String) {
        _repassword.value = value
    }

    fun registrar() {
        // Aquí podrías implementar la lógica de Firebase, backend, etc.
        println("Registrando usuario: $_nombre, $_correo")
    }
}
