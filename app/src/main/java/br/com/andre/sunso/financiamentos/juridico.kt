package br.com.andre.sunso.financiamentos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.R
import br.com.andre.sunso.contato.contato

class juridico : AppCompatActivity() {


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

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jurdico)

        val extras = intent.getExtras()
        val economiaAnual =extras.getString("chave1")
        val economiaMensal = extras.getString("chave2")
        val custo = extras.getString("chave3")
        val custoInstalacao = extras.getString("chave4")


        fun vaiParaDesenvolve(){
            val intencao = Intent(this, desenvolvesp::class.java)
            intencao.putExtra("chave1",economiaAnual.toString())
            intencao.putExtra("chave2",economiaMensal.toString())
            intencao.putExtra("chave3", custo.toString())
            intencao.putExtra("chave4",custoInstalacao.toString())
            startActivity(intencao)
        }

        val juridico = findViewById<Button>(R.id.desenvolveSP)
        juridico.setOnClickListener{vaiParaDesenvolve()}
    }
}