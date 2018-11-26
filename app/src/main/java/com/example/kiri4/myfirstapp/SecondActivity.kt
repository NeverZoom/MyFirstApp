package com.example.kiri4.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textView_Random
import kotlinx.android.synthetic.main.activity_second.textView_Label
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    private fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0

        if(count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        textView_Random.text = Integer.toString(randomInt)
        textView_Label.text = getString(R.string.random_heading, count)
    }


}
