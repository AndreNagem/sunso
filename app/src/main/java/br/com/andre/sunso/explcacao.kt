package br.com.andre.sunso

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.Listaestados.ListaEstados
import br.com.andre.sunso.contato.contato

class explcacao : AppCompatActivity() {

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
        setContentView(R.layout.explicacao)

        fun vaiParaLista(){
            startActivity(Intent(this, ListaEstados::class.java))

        }

        val btn = findViewById<Button>(R.id.proximo)
        btn.setOnClickListener { vaiParaLista() }

    }

    }