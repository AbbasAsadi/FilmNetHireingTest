package ir.filmNet.hiringTest.ui.main

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject internal constructor(private val repository: InstituteRepository) :
    ViewModel()