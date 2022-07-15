package ir.filmNet.hiringTest.ui.main.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import ir.filmNet.hiringTest.data.Status.*
import ir.filmNet.hiringTest.databinding.FragmentMainBinding
import ir.filmNet.hiringTest.ui.BaseFragment
import ir.filmNet.hiringTest.ui.main.MainViewModel

class MainFragment : BaseFragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this, viewModelFactory!!)[MainViewModel::class.java]
        searchTextWatcher()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeResponse()
    }

    private fun searchTextWatcher() {
        binding.searchEditText.addTextChangedListener(
            object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (s!!.length > 2) {
                        viewModel.searchResponse.removeObservers(viewLifecycleOwner)
                        viewModel.search(s.toString())
                    }
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.isLoading = s!!.length > 2
                }
            }
        )
    }

    private fun subscribeResponse() {
        viewModel.searchResponse.observe(viewLifecycleOwner) {
            when (it.status) {
                SUCCESS -> {
                    binding.isLoading = false
                    Toast.makeText(requireContext(), "SUCCESS", Toast.LENGTH_LONG).show()
                }
                SERVER_ERROR -> {
                    binding.isLoading = false
                    Toast.makeText(requireContext(), "SERVER_ERROR", Toast.LENGTH_LONG).show()
                }
                LOADING -> {
                    binding.isLoading = true
                    Toast.makeText(requireContext(), "LOADING", Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}



