package com.voidhash.heartstone.ui.card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.voidhash.heartstone.R
import com.voidhash.heartstone.databinding.FragmentCardBinding
import com.voidhash.heartstone.databinding.FragmentMainBinding

class CardFragment : Fragment(R.layout.fragment_card) {

    private var fragmentCardBinding: FragmentCardBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentCardBinding.bind(view)
        fragmentCardBinding = binding

        binding.button.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentCardBinding = null
    }
}