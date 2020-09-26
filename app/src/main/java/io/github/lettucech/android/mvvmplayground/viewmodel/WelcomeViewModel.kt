package io.github.lettucech.android.mvvmplayground.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class WelcomeViewModel(
    private var goToLogin: (() -> Unit)?,
    private var goToVipLogin: (() -> Unit)?,
    private var goToRegister: (() -> Unit)?
) : ViewModel() {
    fun onLoginClick() {
        goToLogin?.invoke()
    }

    fun onVipLoginClick() {
        goToVipLogin?.invoke()
    }

    fun onRegisterClick() {
        goToRegister?.invoke()
    }

    override fun onCleared() {
        super.onCleared()
        goToLogin = null
        goToRegister = null
    }

    class Factory(
        private var goToLogin: (() -> Unit)?,
        private var goToVipLogin: (() -> Unit)?,
        private var goToRegister: (() -> Unit)?
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(WelcomeViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return WelcomeViewModel(goToLogin, goToVipLogin, goToRegister) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}