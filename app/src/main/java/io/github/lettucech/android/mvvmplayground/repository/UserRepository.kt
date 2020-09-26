package io.github.lettucech.android.mvvmplayground.repository

import android.content.Context
import io.github.lettucech.android.mvvmplayground.model.User
import io.github.lettucech.android.mvvmplayground.util.PreferencesUtil

object UserRepository {
    fun getCurrentUser(context: Context) :User? {
        return PreferencesUtil.getUser(context)
    }
}