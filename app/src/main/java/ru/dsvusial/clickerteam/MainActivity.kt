package ru.dsvusial.clickerteam

import android.animation.AnimatorSet
import android.os.Build
import android.os.Bundle
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pigBtn = findViewById<ImageButton>(R.id.pig_btn)
        val gameField = findViewById<FrameLayout>(R.id.game_field)





        pigBtn.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(
                this, R.anim.hide_anim
            )
            val secondAnim = AnimationUtils.loadAnimation(
                this, R.anim.reveal_anim
            )

            val width: Int = pigBtn.measuredWidth
            val height: Int = pigBtn.measuredHeight

            //pigBtn.startAnimation(anim)
            val an = AnimationUtils.loadAnimation(this, R.anim.hide_anim)
            pigBtn.startAnimation(an)
            pigBtn.translationX = Random.nextInt(-width, width).toFloat()
            pigBtn.translationY = Random.nextInt(-height, height).toFloat()
            Toast.makeText(this, "$width $height", Toast.LENGTH_LONG).show()
            pigBtn.startAnimation(secondAnim)
//            it.isEnabled = false
//            it.startAnimation(anim)


        }

    }
}