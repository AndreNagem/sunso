package br.com.andre.sunso.Login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.Consumo.Consumo
import br.com.andre.sunso.Listaestados.ListaEstados
import br.com.andre.sunso.R
import br.com.andre.sunso.contato.contato
import br.com.andre.sunso.explcacao
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class   MainActivity : AppCompatActivity() {


    private lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth=FirebaseAuth.getInstance()


        val listaEstado = findViewById<Button>(R.id.login_entrar)
        listaEstado.setOnClickListener { fazerLogin() }


        fun vaiParaSign () {
            val intencao =  Intent( this, sign_in::class.java)
            startActivity(intencao)}

        val btnsign = findViewById<Button>(R.id.login_criar)
        btnsign.setOnClickListener { vaiParaSign() }

    }


     public fun OnStart(){
        super.onStart()
        val user  = auth.currentUser
        updateUI(user)

    }


    private fun fazerLogin () {

        val email = findViewById<EditText>(R.id.login_campoEmail)
        val senha = findViewById<EditText>(R.id.login_campoSenha)


        if (email.text.toString().isEmpty()){
            email.error = "Por favor preencha o e-mail"
            email.requestFocus()
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()){
            email.error= "Por favor entre com e-mail válido"
            email.requestFocus()
            return

        }

        if (senha.text.toString().isEmpty()){
            senha.error = "Por favor preencha a senha"
            senha.requestFocus()
            return
        }

        auth.signInWithEmailAndPassword(email.text.toString(),senha.text.toString())
            .addOnCompleteListener(this) {task ->
                if(task.isSuccessful) {
                    val user = auth.currentUser
                    updateUI(user)
                }
                else{
                    updateUI(null)
                }
            }
    }




   private fun updateUI(currentUser : FirebaseUser?){

        if(currentUser!= null) {
            if(currentUser.isEmailVerified ) {
                startActivity(Intent(this, explcacao::class.java))
            }
            else{
                Toast.makeText(baseContext,"Favor verificar e-mail",Toast.LENGTH_LONG).show()
            }
        }

        else{
            Toast.makeText(baseContext,"Login falhou",Toast.LENGTH_LONG).show()
        }
    }


}




