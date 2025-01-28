package edu.temple.classactivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var clickmebutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickmebutton = findViewById(R.id.button3) //or you can do it like this "findViewById(R.id.**itemid**)setOnClickListener{view: View -> (view as Button).text = "Button CLicked!"}
        clickmebutton.setOnClickListener{
            clickmebutton.text = "Button Clicked"
        }

        (findViewById<Button>(R.id.button2)!!).setOnClickListener {
            (it as Button).text = "Button Clicked"
        }

    }
}