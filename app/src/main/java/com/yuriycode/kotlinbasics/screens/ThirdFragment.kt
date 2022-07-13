package com.yuriycode.kotlinbasics.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yuriycode.kotlinbasics.R
import com.yuriycode.kotlinbasics.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    lateinit var binding:FragmentThirdBinding

    override fun onCreateView(
        inflater:LayoutInflater, container:ViewGroup?,
        savedInstanceState:Bundle?
    ):View? {
        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}