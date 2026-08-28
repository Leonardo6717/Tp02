package com.example.tp02

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detalhes)

        val txtTituloLivro = findViewById<TextView>(R.id.txtTituloLivro)
        val txtAutorLivro = findViewById<TextView>(R.id.txtAutorLivro)

        val btnVoltar = findViewById<ImageButton>(R.id.btnVoltar)



        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")



        txtTituloLivro.text = "Título: ${titulo ?: "Não informado"}"
        txtAutorLivro.text = "Autor: ${autor ?: "Não informado"}"



        btnVoltar.setOnClickListener {
            finish()
        }
    }
}