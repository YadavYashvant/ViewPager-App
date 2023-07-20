package com.example.viewpager_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator

class MainActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        val viewpager:ViewPager2 = findViewById(R.id.viewPager)
        viewpager.adapter = ViewPagerAdapter(titlesList,imagesList)
        viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
    private fun addToList(title: String, image:Int) {
        titlesList.add(title)
        imagesList.add(image)


    }

    private fun postToList(){
        val imgarr = arrayOf(R.drawable.gwagon,R.drawable.cake,R.drawable.house1,R.drawable.spiritual,R.drawable.ishuai)
        val titlearr = arrayOf("Gwagon","Cake","House","God","Ishu")
        for (i in 0..4) {
            addToList(titlearr[i],imgarr[i])
        }

    }
}