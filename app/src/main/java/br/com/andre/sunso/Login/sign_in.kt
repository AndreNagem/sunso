package br.com.andre.sunso.Login

import android.content.Intent
import android.os.Bundle
import android.os.PatternMatcher
import android.util.Log
import android.util.Patterns
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.R
import br.com.andre.sunso.contato.contato
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.sign_in.*

class sign_in : AppCompatActivity() {

    private lateinit var  auth: FirebaseAuth

    private fun irParaContato(){
        val intencao = Intent(this, contato::class.java)
        startActivity(intencao)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_geral,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.contato_menu -> {
                irParaContato()
                finish()
            }
        }
        return true
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        auth = FirebaseAuth.getInstance()

        val botao_sign = findViewById<Button>(R.id.signin)

        botao_sign.setOnClickListener {
            signUpUser()
        }
    }

    private fun signUpUser(){

        val email = findViewById<EditText>(R.id.email_sign)
        val senha = findViewById<EditText>(R.id.senha_sign)


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

        auth.createUserWithEmailAndPassword(email.text.toString(),senha.text.toString())
            .addOnCompleteListener(this){task->
                if(task.isSuccessful){

                    val user = auth.currentUser
                    user?.sendEmailVerification()
                        ?.addOnCompleteListener { task->
                        if(task.isSuccessful){
                            Toast.makeText(this,"E-mail de verificação enviado, cheque também a caixa SPAM",Toast.LENGTH_LONG).show()
                            startActivity(Intent(this,MainActivity::class.java))
                            finish()
                        }

                    }

                }

                else{

                    Toast.makeText(baseContext,"Falha na criação de Usuário", Toast.LENGTH_LONG).show()

                }




            }
    }

}