package com.mhmmdyzci.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.mhmmdyzci.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<LandMark>()
        var kızKulesi = LandMark("Kız Kulesi","İstanbul",R.drawable.bbb)
        var kenny = LandMark("Kick","Skate",R.drawable.kenny)
        landmarkList.add(kızKulesi)
        landmarkList.add(kenny)

        // alt alta olmasını söylüyoruz burda
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        var landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter



        /*

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landMark -> landMark.name  })
        binding.listView.adapter = adapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            var intent = Intent(MainActivity@this,DetailsActivity::class.java)
            // intent ile sınıf gönderebilelim diye LandMark sınıfını Serializable yaptık
            intent.putExtra("landMark",landmarkList.get(i))
            startActivity(intent)

        }

         */



    }
}