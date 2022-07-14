package ir.filmNet.hiringTest.ui

import android.os.Handler
import android.os.Looper
import android.view.View

/**
 *
 * @author Abbas Asadi
 */
fun View.preventDoubleClick() {
    isClickable = false
    Handler(Looper.getMainLooper()).postDelayed({ isClickable = true }, 5000L)
}