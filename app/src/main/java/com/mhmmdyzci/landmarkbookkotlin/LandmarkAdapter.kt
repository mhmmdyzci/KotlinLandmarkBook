package com.mhmmdyzci.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mhmmdyzci.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter (var landmarkList : ArrayList<LandMark>) : RecyclerView.Adapter<LandmarkAdapter.LandMarkHolder>() {
    class LandMarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        // (" Layout ile Recycler_row.xml dosyası ile bağlama yapılıyor ")
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
       // ("Bağlandıktan sonra ne olcak (Hangi textte hangi veri kullanılacak)")

        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent (holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landMark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       // ("Kaç tane oluşturacağız")
        return landmarkList.size
    }
}