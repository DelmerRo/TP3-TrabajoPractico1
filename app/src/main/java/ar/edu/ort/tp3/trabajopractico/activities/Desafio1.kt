package ar.edu.ort.tp3.trabajopractico.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatEditText
import ar.edu.ort.tp3.trabajopractico.R

class Desafio1 : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnNextDesafio1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desafio1)
        initComponents()
        initListeners()
    }

    private fun initListeners() {

        btnNextDesafio1.setOnClickListener {
            val email1 = etEmail.text.toString()
            val password1 = etPassword.text.toString()
            if (email1 == "Jindrg" && password1 == "96959956") {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", email1)
                startActivity(intent)
            }
        }
    }

    private fun initComponents() {
        etEmail = findViewById<AppCompatEditText>(R.id.etLoginEmail)
        etPassword = findViewById<AppCompatEditText>(R.id.etLoginPassword)
        btnNextDesafio1 = findViewById(R.id.btnNextDesafio1)
    }
}