package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentAccountBinding

/**
 * @author Akash Yadav
 */
class AccountFragment : BaseHomeFragment<FragmentAccountBinding>(R.layout.fragment_account,
  FragmentAccountBinding::bind)