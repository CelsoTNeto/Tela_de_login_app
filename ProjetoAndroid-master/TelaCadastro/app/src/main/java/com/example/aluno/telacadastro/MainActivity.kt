package com.example.aluno.telacadastro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.aluno.telacadastro.R.id.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.startActivity

import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnincluir : Button = findViewById<Button>(R.id.btnincluir)
        val btnlimpar : Button = findViewById<Button>(R.id.btnlimpar)
        val btnArray : Button = findViewById<Button>(R.id.btnArray)

        btnincluir.setOnClickListener(View.OnClickListener {
        })

        btnlimpar.setOnClickListener(View.OnClickListener {
            val txtnome = txtnome.text.clear()
            val txtemail = txtemail.text.clear()
            val txtlogin = txtlogin.text.clear()
            val txtsenha = txtsenha.text.clear()

        })

        btnArray.setOnClickListener(View.OnClickListener {
            startActivity<tela_Array>()
        })


    }
}
