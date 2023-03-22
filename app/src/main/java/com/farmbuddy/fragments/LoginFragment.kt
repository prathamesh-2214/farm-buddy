package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentLoginBinding

/**
 * @author Akash Yadav
 */
class LoginFragment : BaseFragment(R.layout.fragment_login) {

  private lateinit var binding: FragmentLoginBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View {
    return super.onCreateView(inflater, container, savedInstanceState)!!.also {
      binding = FragmentLoginBinding.bind(it)
    }
  }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.login.setOnClickListener {
      findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToVerifyOtpFragment())
    }

    binding.signUp.setOnClickListener {
      findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignupPhoneFragment())
    }
  }
}