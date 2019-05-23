package com.example.aluno.telacadastro

import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class Login : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        lateinit var btncadastrar: Button
        lateinit var btnentrar : Button

        val btncadastrar : Button = findViewById<Button>(R.id.btncadastrar)
        val btnentrar: Button = findViewById<Button>(R.id.btnentrar)


        btncadastrar.setOnClickListener(View.OnClickListener {
            startActivity<MainActivity>()
        })

        btnentrar.setOnClickListener(View.OnClickListener {

        })


    }



}
