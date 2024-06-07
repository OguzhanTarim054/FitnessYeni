package com.example.fitnessyeni.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessyeni.data.entity.Hareketler
import com.example.fitnessyeni.databinding.CardTasarimBinding
import com.example.fitnessyeni.databinding.CardTasarimHareketlerBinding
import com.example.fitnessyeni.databinding.FragmentAnasayfaBinding

class HareketlerAdapter(var mContext: Context, var hareketListesi: List<Hareketler>) :
     RecyclerView.Adapter<HareketlerAdapter.cardTasarimTutucu2>() {
    inner class cardTasarimTutucu2(var tasarim2 : CardTasarimHareketlerBinding): RecyclerView.ViewHolder(tasarim2.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimTutucu2 {
        val binding = CardTasarimHareketlerBinding.inflate(LayoutInflater.from(mContext), parent , false)
        return cardTasarimTutucu2(binding)
    }



    override fun onBindViewHolder(holder: cardTasarimTutucu2, position: Int) {
        val hareket = hareketListesi.get(position)

        val t = holder.tasarim2
        t.textViewHareketAdi.text = hareket.ad
        t.imageViewHareketResim.setImageResource(
            mContext.resources.getIdentifier(hareket.resim, "drawable", mContext.packageName))





    }

    override fun getItemCount(): Int {
        return hareketListesi.size
    }

}