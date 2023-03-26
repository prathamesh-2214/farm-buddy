package com.farmbuddy

import android.os.Bundle
import android.view.ViewGroup.MarginLayoutParams
import android.view.ViewTreeObserver
import androidx.activity.viewModels
import androidx.core.view.updateLayoutParams
import androidx.core.view.updateMarginsRelative
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.farmbuddy.databinding.ActivityHomeBinding
import com.farmbuddy.utils.resolveAttr
import com.farmbuddy.viewmodel.HomeViewModel

/**
 * Main screen that is shown when the user's login session is active.
 */
class HomeActivity : BaseActivity() {

  private lateinit var binding: ActivityHomeBinding
  private val navController by lazy {
    binding.fragmentContainer.getFragment<NavHostFragment>().navController
  }

  private val viewModel by viewModels<HomeViewModel>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityHomeBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.navigation.setupWithNavController(navController)
    viewModel._statusBarColor.observe(this) { color ->
      window?.let { window ->
        window.decorView.post {
          window.statusBarColor = if (color != -1) {
            color
          } else {
            resolveAttr(com.google.android.material.R.attr.colorSurface)
          }
        }
      }
    }

    navController.addOnDestinationChangedListener { _, destination, _ ->
      window?.apply {
        val attr = if (destination.id == R.id.accountFragment) {
          com.google.android.material.R.attr.colorPrimaryContainer
        } else {
          com.google.android.material.R.attr.colorSurface
        }
        viewModel.statusBarColor = resolveAttr(attr)
      }
    }

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