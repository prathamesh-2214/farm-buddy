package com.farmbuddy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Main screen that is shown when the user's login session is active.
 */
class HomeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)
  }
}