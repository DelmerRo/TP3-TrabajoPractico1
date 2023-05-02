package ar.edu.ort.tp3.trabajopractico.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import ar.edu.ort.tp3.trabajopractico.MenuActivity
import ar.edu.ort.tp3.trabajopractico.R
import com.bumptech.glide.Glide

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

         upLoadGif();
    }

    private fun upLoadGif() {
        val imageLoad: ImageView = findViewById(R.id.imagen_carga)
        Glide.with(this).asGif().load(R.drawable.cargando).into(imageLoad)
    }

    override fun onStart() {
        super.onStart()

        Handler().postDelayed({
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }

}