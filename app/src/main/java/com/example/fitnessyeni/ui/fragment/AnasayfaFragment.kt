package com.example.fitnessyeni.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.fitnessyeni.R
import com.example.fitnessyeni.data.entity.Bolgeler
import com.example.fitnessyeni.databinding.FragmentAnasayfaBinding
import com.example.fitnessyeni.ui.adapter.BolgelerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var  binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "BÖLGELER"
        binding.bolgeRv.layoutManager = LinearLayoutManager(requireContext())
            //StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL)

        val bolgelerListesi = ArrayList<Bolgeler>()

        val b1 = Bolgeler(1,"Goğüs", "")
        val b2 = Bolgeler(2,"Biseps", "")
        val b3 = Bolgeler(3,"Omuz", "")
        val b4 = Bolgeler(4,"Sırt", "")

        bolgelerListesi.add(b1)
        bolgelerListesi.add(b2)
        bolgelerListesi.add(b3)
        bolgelerListesi.add(b4)

        val bolgelerAdapter = BolgelerAdapter(requireContext(),bolgelerListesi)
        binding.bolgeRv.adapter = bolgelerAdapter
        return binding.root
    }


}