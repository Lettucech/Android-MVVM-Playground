package io.github.lettucech.android.mvvmplayground.util

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.google.gson.Gson
import io.github.lettucech.android.mvvmplayground.BuildConfig
import io.github.lettucech.android.mvvmplayground.model.User

object PreferencesUtil {
    private const val SHARED_PREFERENCES_NAME = BuildConfig.APPLICATION_ID
    private const val PREFERENCES_USER = "user"

    fun getPreferences(context: Context): SharedPreferences =
        context.getSharedPreferences(SHARED_PREFERENCES_NAME, MODE_PRIVATE)

    fun getUser(context: Context): User? {
        val json = getPreferences(context).getString(PREFERENCES_USER, "")
        return Gson().fromJson(json, User::class.java)
    }

    fun setUser(context: Context, user: User) {
        getPreferences(context).edit().putString(PREFERENCES_USER, Gson().toJson(user)).apply()
    }
}