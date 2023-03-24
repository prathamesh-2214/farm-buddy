package com.farmbuddy

import android.os.Bundle
import android.view.ViewGroup.MarginLayoutParams
import android.view.ViewTreeObserver
import androidx.core.view.updateLayoutParams
import androidx.core.view.updateMarginsRelative
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.farmbuddy.databinding.ActivityHomeBinding

/**
 * Main screen that is shown when the user's login session is active.
 */
class HomeActivity : BaseActivity() {

  private lateinit var binding: ActivityHomeBinding
  private val navController by lazy {
    binding.fragmentContainer.getFragment<NavHostFragment>().navController
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityHomeBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.navigation.setupWithNavController(navController)
    binding.root.viewTreeObserver.addOnGlobalLayoutListener(object :
      ViewTreeObserver.OnGlobalLayoutListener {
      override fun onGlobalLayout() {
        binding.root.viewTreeObserver.removeOnGlobalLayoutListener(this)
        binding.fragmentContainer.updateLayoutParams<MarginLayoutParams> {
          updateMarginsRelative(bottom = binding.navigation.height)
        }
      }
    })
  }
}