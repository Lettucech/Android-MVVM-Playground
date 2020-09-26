package io.github.lettucech.android.mvvmplayground.manager

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.github.lettucech.android.mvvmplayground.model.User
import io.github.lettucech.android.mvvmplayground.util.PreferencesUtil

class UserManager(private val applicationContext: Context) {
    private val currentUser: MutableLiveData<User> by lazy {
        MutableLiveData<User>(PreferencesUtil.getUser(applicationContext))
    }

    fun getCurrentUser(): LiveData<User> {
        return currentUser
    }

    fun setCurrentUser(user: User) {
        PreferencesUtil.setUser(applicationContext, user)
        currentUser.value = user
    }
}