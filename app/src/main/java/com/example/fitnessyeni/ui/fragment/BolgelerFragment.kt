package com.example.fitnessyeni.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fitnessyeni.R
import com.example.fitnessyeni.data.entity.Hareketler
import com.example.fitnessyeni.databinding.FragmentBolgelerBinding
import com.example.fitnessyeni.ui.adapter.HareketlerAdapter

class BolgelerFragment : Fragment() {
    private lateinit var binding: FragmentBolgelerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBolgelerBinding.inflate(inflater, container, false)

        binding.hareketlerRv.layoutManager = LinearLayoutManager(requireContext())
        val hareketlerListesi = ArrayList<Hareketler>()
        val h1 = Hareketler(1,"Şınav", "sinav")
        val h2 = Hareketler(1,"Şınav", "sinav")
        val h3 = Hareketler(1,"Şınav", "sinav")
        hareketlerListesi.add(h1)
        hareketlerListesi.add(h2)
        hareketlerListesi.add(h3)



        val hareketlerAdapter = HareketlerAdapter(requireContext(),hareketlerListesi)
        binding.hareketlerRv.adapter = hareketlerAdapter

        val bundle : BolgelerFragmentArgs by navArgs()
        val bolge = bundle.bolge

        binding.toolbarBolgeler.title = bolge.ad



        return binding.root
    }


}