package com.farmbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Allows the user to create a new account on the application.
 * The user can also go back to the login activity.
 */
class SignupActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_signup)
  }
}