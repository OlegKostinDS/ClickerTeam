package ru.dsvusial.clickerteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pigBtn = findViewById<ImageButton>(R.id.pig_btn)
        val crocBtn = findViewById<ImageButton>(R.id.croc_btn)
        crocBtn.isEnabled = false
        crocBtn.visibility = View.INVISIBLE
        pigBtn.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(
                this, R.anim.anim
            )
            val secondAnim = AnimationUtils.loadAnimation(
                this, R.anim.second_anim
            )
            it.isEnabled = false
            it.startAnimation(anim)
            crocBtn.startAnimation(secondAnim)
            crocBtn.visibility = View.VISIBLE
            crocBtn.isEnabled = true
        }
        crocBtn.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(
                this, R.anim.anim
            )
            val secondAnim = AnimationUtils.loadAnimation(
                this, R.anim.second_anim
            )
            it.isEnabled = false
            it.startAnimation(anim)
            pigBtn.startAnimation(secondAnim)
            pigBtn.visibility = View.VISIBLE
            pigBtn.isEnabled = true

        }
    }
}