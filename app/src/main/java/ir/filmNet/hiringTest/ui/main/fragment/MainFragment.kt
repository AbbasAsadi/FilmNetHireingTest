package ir.filmNet.hiringTest.ui.main.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.filmNet.hiringTest.data.Status.*
import ir.filmNet.hiringTest.data.remote.model.Data
import ir.filmNet.hiringTest.databinding.FragmentMainBinding
import ir.filmNet.hiringTest.ui.BaseFragment
import ir.filmNet.hiringTest.ui.main.MainViewModel
import ir.filmNet.hiringTest.ui.main.fragment.adapter.VideoListAdapter

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
                    if (s!!.length > 1) {
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
                }
            }
        )
    }

    private fun subscribeResponse() {
        viewModel.searchResponse.observe(viewLifecycleOwner) {
            binding.isLoading = viewModel.loading.get()
            when (it.status) {
                SUCCESS -> {
                    if (it.data?.data != null) {
                        if (!it.data.data.videos.isNullOrEmpty()) {
                            binding.isEmptyList = false
                            setupRecyclerView(it.data.data)
                        } else {
                            binding.isEmptyList = true
                        }
                    } else
                        Toast.makeText(
                            requireContext(),
                            "داده ای یافت نشد",
                            Toast.LENGTH_LONG
                        ).show()
                }
                SERVER_ERROR -> {
                    Toast.makeText(
                        requireContext(),
                        "SERVER_ERROR\n" + it.message,
                        Toast.LENGTH_LONG
                    )
                        .show()
                }
                LOADING -> {
                }
            }
        }
    }

    private fun setupRecyclerView(data: Data) {
        binding.videoRecyclerView.layoutManager = GridLayoutManager(
            requireContext(),
            2,
            RecyclerView.VERTICAL,
            false
        )
        binding.videoRecyclerView.adapter = VideoListAdapter(requireContext(), data.videos)
    }
}



