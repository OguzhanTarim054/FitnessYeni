package com.example.fitnessyeni.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitnessyeni.R
import com.example.fitnessyeni.databinding.FragmentHareketlerBinding


class HareketlerFragment : Fragment() {
    private lateinit var binding: FragmentHareketlerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHareketlerBinding.inflate(inflater, container, false)
        return binding.root
    }


}