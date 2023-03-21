package com.farmbuddy.utils

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue

/**
 * @author Akash Yadav
 */

@JvmOverloads
fun Context.resolveAttr(id: Int, resolveRefs: Boolean = true): Int {
  return theme.resolveAttr(id, resolveRefs)
}

@JvmOverloads
fun Resources.Theme.resolveAttr(id: Int, resolveRefs: Boolean = true): Int =
  TypedValue().let {
    resolveAttribute(id, it, resolveRefs)
    it.data
  }