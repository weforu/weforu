package com.talk2us.utils

import android.content.Context
import androidx.preference.PreferenceManager
import com.talk2us.MainApplication


object PrefManager {
    private val preference by lazy { PreferenceManager.getDefaultSharedPreferences(context) }
    private val context: Context
        get() = MainApplication.instance.applicationContext

    fun putBoolean(preferenceKey: Int, preferenceValue: Boolean) {
        preference.edit().putBoolean(context.getString(preferenceKey), preferenceValue).apply()
    }

    fun getBoolean(preferenceKey: Int, defaultValue: Boolean): Boolean {
        return preference.getBoolean(context.getString(preferenceKey), defaultValue)
    }

    fun putString(preferenceKey: Int, preferenceValue: String) {
        preference.edit().putString(context.getString(preferenceKey), preferenceValue).apply()
    }

    fun getString(preferenceKey: Int, defaultValue: String): String? {
        return preference.getString(context.getString(preferenceKey), defaultValue)
    }

}