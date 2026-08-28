package com.example.tp02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)

        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val btnAvancar = findViewById<ImageButton>(R.id.btnAvancar)



        btnCadastrar.setOnClickListener {

            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()


            if (titulo.isNotEmpty() && autor.isNotEmpty()) {

                Toast.makeText(
                    this,
                    "Livro cadastrado com sucesso!",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Preencha todos os campos!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }



        btnAvancar.setOnClickListener {

            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()

            val intent = Intent(
                this,
                DetalhesActivity::class.java
            )

            intent.putExtra("titulo", titulo)
            intent.putExtra("autor", autor)

            startActivity(intent)
        }
    }
}