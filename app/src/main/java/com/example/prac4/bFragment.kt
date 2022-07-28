package com.example.prac4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.prac4.databinding.FragmentABinding
import com.example.prac4.databinding.FragmentBBinding


class bFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_b, container, false)

        //var btn = view.findViewById<Button>(R.id.btnToB)
        binding.btnToC.setOnClickListener(){
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_bFragment_to_cFragment)
        }

        binding.btnToA.setOnClickListener(){
            Navigation.findNavController(binding.root)
                .popBackStack()
        }

        return binding.root
    }


}