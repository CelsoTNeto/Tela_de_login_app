package com.example.aluno.telacadastro

import android.os.Bundle
import android.app.Activity
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_tela__array.*

class tela_Array : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela__array)


        var listView = findViewById<ListView>(R.id.listview1)
        val arrayDeLinhas: ArrayList<String> = ArrayList<String>()
        arrayDeLinhas.add("Primeira Linha ...")
        arrayDeLinhas.add("Segunda Linha ...")
        arrayDeLinhas.add("Terceira Linha ...")
        arrayDeLinhas.add("Quarta Linha ...")
        arrayDeLinhas.add("Quinta Linha ...")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1, arrayDeLinhas)
    }
}
