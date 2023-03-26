package com.farmbuddy.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author Akash Yadav
 */
class HomeViewModel : ViewModel() {

  internal val _statusBarColor = MutableLiveData(-1)

  var statusBarColor: Int
    set(value) {
      _statusBarColor.value = value
    }
    get() = _statusBarColor.value ?: -1
}