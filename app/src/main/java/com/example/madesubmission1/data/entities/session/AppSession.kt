package com.example.madesubmission1.data.entities.session

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Franz Andel on 2019-12-31.
 * Android Engineer
 */

class AppSession(context: Context) {

    companion object {
        const val SHARED_PREF_NAME = "app_shared_preference"
        const val KEY_LANGUAGE = "key_language"
        lateinit var sharedPreferences: SharedPreferences
    }

    init {
        sharedPreferences =
            context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }

    fun getLanguage(): String {
        return sharedPreferences.getString(KEY_LANGUAGE, "en").toString()
    }

    fun setLanguage(language: String) {
        val sharedPreferencesEditor = sharedPreferences.edit()
        sharedPreferencesEditor.putString(KEY_LANGUAGE, language)
        sharedPreferencesEditor.apply()
    }
}