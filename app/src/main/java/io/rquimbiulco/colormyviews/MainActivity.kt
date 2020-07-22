package io.rquimbiulco.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickabkleViews: List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, mainLayout)
        for (item in clickabkleViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_two_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_three_text -> view.setBackgroundColor(Color.RED)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)
            else -> view.setBackgroundResource(android.R.color.holo_blue_light)
        }
    }
}