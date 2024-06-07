package com.example.fitnessyeni.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessyeni.data.entity.Bolgeler
import com.example.fitnessyeni.databinding.CardTasarimBinding
import com.example.fitnessyeni.databinding.FragmentAnasayfaBinding
import com.example.fitnessyeni.ui.fragment.AnasayfaFragment
import com.example.fitnessyeni.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class BolgelerAdapter(var mContext:Context, var bolgelerListesi:List<Bolgeler>)
    : RecyclerView.Adapter<BolgelerAdapter.CardTasarimTutucu>()  {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val  bolge = bolgelerListesi.get(position)
        val t= holder.tasarim


        t.textViewBolgeler.text = "${bolge.ad}"
        t.imageViewBolge.setImageResource(
            mContext.resources.getIdentifier(bolge.resim, "drawable", mContext.packageName))

        t.cardViewBolge.setOnClickListener{
            val gecis= AnasayfaFragmentDirections.detayGecis1(bolge=bolge)

            Navigation.findNavController(it).navigate(gecis)

        }

        t.buttonHareketler.setOnClickListener{
            Snackbar.make(it,"${bolge.ad} hareketi uygulandı", Snackbar.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {
        return bolgelerListesi.size
    }

}