package ar.edu.ort.tp3.trabajopractico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ar.edu.ort.tp3.trabajopractico.activities.Desafio1
import ar.edu.ort.tp3.trabajopractico.activities.Desafio2
import ar.edu.ort.tp3.trabajopractico.activities.Desafio3

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnDesafio1 = findViewById<Button>(R.id.btnDesafio1)
        val btnDesafio2 = findViewById<Button>(R.id.btnDesafio2)
        val btnDesafio3 = findViewById<Button>(R.id.btnDesafio3)

        btnDesafio1.setOnClickListener{navigateToDesafio1()}
        btnDesafio2.setOnClickListener{navigateToDesafio2()}
        btnDesafio2.setOnClickListener{navigateToDesafio3()}
    }

    private fun navigateToDesafio3() {
        val intent = Intent(this, Desafio3::class.java)
        startActivity(intent)
    }

    private fun navigateToDesafio2() {
        val intent = Intent(this, Desafio2::class.java)
        startActivity(intent)
    }

    private fun navigateToDesafio1() {
        startActivity(Intent(this, Desafio1::class.java))
    }
}