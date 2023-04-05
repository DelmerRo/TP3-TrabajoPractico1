package ar.edu.ort.tp3.trabajopractico.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ar.edu.ort.tp3.trabajopractico.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val email: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text= "Hola $email"

    }
}