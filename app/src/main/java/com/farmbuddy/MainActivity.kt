package com.farmbuddy

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import com.farmbuddy.databinding.ActivityMainBinding

/**
 * Launcher activity. User is asked to login to the application.
 * Also, allows the user to perform the following tasks :
 * - Signup to the application
 * - Reset his/her password
 */
class MainActivity : BaseActivity() {

  private lateinit var binding: ActivityMainBinding

  private val backPressedCallback = object : OnBackPressedCallback(true) {
    override fun handleOnBackPressed() {
      if (!findNavController(binding.fragmentContainer.id).navigateUp()) {
        finish()
      }
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    onBackPressedDispatcher.addCallback(backPressedCallback)
  }
}