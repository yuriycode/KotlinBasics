package com.yuriycode.kotlinbasics.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yuriycode.kotlinbasics.MAIN
import com.yuriycode.kotlinbasics.R
import com.yuriycode.kotlinbasics.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater:LayoutInflater, container:ViewGroup?,
        savedInstanceState:Bundle?
    ):View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState:Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFragment1.setOnClickListener{
            MAIN.navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

}