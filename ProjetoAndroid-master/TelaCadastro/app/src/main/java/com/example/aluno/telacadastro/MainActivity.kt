package com.example.aluno.telacadastro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.aluno.telacadastro.R.id.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnincluir: Button = findViewById<Button>(R.id.btnincluir)
        val btnlimpar: Button = findViewById<Button>(R.id.btnlimpar)
        val btnverificar: Button = findViewById<Button>(R.id.btnverificar)












        btnincluir.setOnClickListener(View.OnClickListener {
            var u: Usuario = Usuario(
                    txtnome.text.toString(),
                    txtemail.text.toString(),
                    txtlogin.text.toString(),
                    txtsenha.text.toString()

            )
            UsuarioRepository(getApplicationContext()).create(u)

            alert(
                    "Usuario Cadastrado com Sucesso",
                    "Vc ja conhecia o toast com maior duracao?") {
                yesButton { longToast("Esse toast dura mais tempo…") }
                noButton {}
            }.show()

            toast("toast normal: Usuario Incluido com sucesso")
        })

        btnverificar.setOnClickListener(View.OnClickListener {
            toast("Listar Usuarios...")
            var listU: List<Usuario> = UsuarioRepository(getApplicationContext()).findAll()
            for (u: Usuario in listU) {
                toast(u.nome)
            }
        })

        btnVerificarEmail.setOnClickListener (View.OnClickListener {

        })





        btnlimpar.setOnClickListener(View.OnClickListener {
            val txtnome = txtnome.text.clear()
            val txtemail = txtemail.text.clear()
            val txtlogin = txtlogin.text.clear()
            val txtsenha = txtsenha.text.clear()

        })



    }
}

