package com.voidhash.heartstone.ui.card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.voidhash.heartstone.R
import com.voidhash.heartstone.databinding.FragmentCardBinding
import com.voidhash.heartstone.databinding.FragmentMainBinding
import com.voidhash.heartstone.framework.model.card.CardModel
import com.voidhash.heartstone.ui.main.MainViewModel

class CardFragment : Fragment(R.layout.fragment_card) {

    private var fragmentCardBinding: FragmentCardBinding? = null

    private val viewModel: CardViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentCardBinding.bind(view)
        fragmentCardBinding = binding

       viewModel.getAllCard()

       observerViewModel()
    }

    private fun observerViewModel() {
        viewModel.cardCollection.observe(viewLifecycleOwner, Observer { collection ->
            collection.let {
                println()
            }
        })

        viewModel.loadError.observe(viewLifecycleOwner, Observer { hasError ->
            hasError.let {

            }
        })

        viewModel.loading.observe(viewLifecycleOwner, Observer { isLoading ->
            isLoading.let {

            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentCardBinding = null
    }
}