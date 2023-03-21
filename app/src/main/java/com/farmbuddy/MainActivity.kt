package com.farmbuddy

import android.os.Bundle

/**
 * Launcher activity. User is asked to login to the application.
 * Also, allows the user to perform the following tasks :
 * - Signup to the application
 * - Reset his/her password
 */
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)
    }
}