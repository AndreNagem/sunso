package br.com.andre.sunso.contato

import android.app.Activity
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.R
import kotlinx.android.synthetic.main.contato.*

class contato : AppCompatActivity() {



    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contato)

         fun enviarEmail(){
             val assuntoTexto= assunto.getText().toString()
             val mensagemTexto=mensagem.getText().toString()
             val email = arrayOf<String>("contato@sunso.com.br")

             val intencao = Intent(Intent.ACTION_SEND)
             intencao.putExtra(Intent.EXTRA_EMAIL,  email)
             intencao.putExtra(Intent.EXTRA_SUBJECT, assuntoTexto)
             intencao.putExtra(Intent.EXTRA_TEXT, mensagemTexto)

             intencao.setType("messege/rfc822")
             startActivity(Intent.createChooser(intencao, "Escolha a opção de envio"))

        }
        val assunto = findViewById<EditText>(R.id.assunto)
        val mensagem = findViewById<EditText>(R.id.mensagem)
        val enviar = findViewById<Button>(R.id.enviar)
        enviar.setOnClickListener { enviarEmail()}


              fun enviarWhats(){

                  val intencaoCtt = Intent(ContactsContract.Intents.Insert.ACTION)
                  intencaoCtt.setType(ContactsContract.RawContacts.CONTENT_TYPE)

                  val nome : String = "Sunso"
                  val email : String = "contato@sunso.com.br"
                  val numero : String = "+5511992601841"

                  intencaoCtt.putExtra(ContactsContract.Intents.Insert.EMAIL, email)
                      .putExtra(ContactsContract.Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
                      .putExtra(ContactsContract.Intents.Insert.PHONE, numero)
                      .putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK)
                      .putExtra(ContactsContract.Intents.Insert.NAME, nome)

                  startActivity(intencaoCtt)

                  val uri = Uri.parse("smsto:"+ 5511992601841)
                  val intencao = Intent(Intent.ACTION_SENDTO, uri)
                  intencao.setPackage("com.whatsapp")
                  startActivity(intencao)
            }



        val whats = findViewById<Button>(R.id.whats)
        whats.setOnClickListener { enviarWhats() }

    }


}