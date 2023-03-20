package com.farmbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Launcher activity. User is asked to login to the application.
 * Also, allows the user to perform the following tasks :
 * - Signup to the application
 * - Reset his/her password
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}