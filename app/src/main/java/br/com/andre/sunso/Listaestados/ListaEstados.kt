package br.com.andre.sunso.Listaestados

import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.Consumo.Consumo
import br.com.andre.sunso.R
import br.com.andre.sunso.contato.contato


class ListaEstados : AppCompatActivity() {

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


    companion object parametros

    var irradi :Double = 0.0


    private fun vaiParaConsumo(){

        val intencao =  Intent( this,Consumo::class.java)
        intencao.putExtra("chave_irradi", irradi)
        startActivity(intencao)

    }

    private fun  vaiParaConsumoAcre () {
        irradi = 4.7
        vaiParaConsumo()
    }


    private fun vaiParaConsumoAlagoas () {
        irradi = 5.41
        vaiParaConsumo()
    }

    private fun vaiParaConsumoAmapa () {
         irradi = 5.06
        vaiParaConsumo()
    }

    private fun vaiParaConsumoAmazonas () {
         irradi = 4.62
        vaiParaConsumo()
    }

    private fun vaiParaConsumoBahia () {
         irradi = 5.54
        vaiParaConsumo()
    }

    private fun vaiParaConsumoCeara () {
        irradi = 5.54
        vaiParaConsumo()
    }

    private fun vaiParaConsumoDistrito () {
         irradi = 5.34
        vaiParaConsumo()
    }

    private fun vaiParaConsumoEspiritoSanto () {
        irradi = 4.64
        vaiParaConsumo()
    }

    private fun vaiParaConsumoGoias () {
         irradi = 5.27
        vaiParaConsumo()
    }

    private fun vaiParaConsumoMatoGrosso () {
         irradi = 5.09
        vaiParaConsumo()
    }

    private fun vaiParaConsumoMaranhao () {
         irradi = 4.97
        vaiParaConsumo()
    }

    private fun vaiParaConsumoMinasGerais () {
         irradi = 5.32
        vaiParaConsumo()
    }

    private fun vaiParaConsumoMatoGrossoDoSul () {
         irradi = 5.1
        vaiParaConsumo()
    }

    private fun vaiParaConsumoParaiba () {
         irradi = 5.79
        vaiParaConsumo()
    }

    private fun vaiParaConsumoPara () {
         irradi = 5.1
        vaiParaConsumo()
    }

    private fun vaiParaConsumoPernambuco () {
         irradi = 5.62
        vaiParaConsumo()
    }

    private fun vaiParaConsumoPiaui () {
         irradi = 5.54
        vaiParaConsumo()
    }

    private fun vaiParaConsumoRiodeJaneiro () {
         irradi = 4.49
        vaiParaConsumo()
    }

    private fun vaiParaConsumoRioGrandedoNorte () {
         irradi = 5.72
        vaiParaConsumo()
    }


    private fun vaiParaConsumoRioGrandedoSul () {
         irradi = 4.42
        vaiParaConsumo()
    }

    private fun vaiParaConsumoRoraima () {
         irradi = 4.83
        vaiParaConsumo()
    }

    private fun vaiParaConsumoRondonia () {
         irradi = 4.82
        vaiParaConsumo()
    }


    private fun vaiParaConsumoSaoPaulo () {

         irradi = 4.64
        vaiParaConsumo()
    }

    private fun vaiParaConsumoSantaCatarina () {

         irradi = 4.47
        vaiParaConsumo()
    }

    private fun vaiParaConsumoSergipe () {
         irradi = 5.25
        vaiParaConsumo()
    }

    private fun vaiParaConsumoTocantins () {
         irradi = 5.22
        vaiParaConsumo()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_estados)

        val acre = findViewById<Button>(R.id.acre)
        acre.setOnClickListener { vaiParaConsumoAcre() }

        val alagoas = findViewById<Button>(R.id.alagoas)
        alagoas.setOnClickListener { vaiParaConsumoAlagoas() }

        val amapa = findViewById<Button>(R.id.amapa)
        amapa.setOnClickListener { vaiParaConsumoAmapa() }

        val amazonas = findViewById<Button>(R.id.amazonas)
        amazonas.setOnClickListener { vaiParaConsumoAmazonas() }

        val bahia = findViewById<Button>(R.id.bahia)
        bahia.setOnClickListener { vaiParaConsumoBahia() }

        val ceara = findViewById<Button>(R.id.ceara)
        ceara.setOnClickListener { vaiParaConsumoCeara() }

        val distrito = findViewById<Button>(R.id.distritofederal)
        distrito.setOnClickListener { vaiParaConsumoDistrito() }

        val espirito = findViewById<Button>(R.id.espiritosanto)
        espirito.setOnClickListener { vaiParaConsumoEspiritoSanto() }

        val goias = findViewById<Button>(R.id.goias)
        goias.setOnClickListener { vaiParaConsumoGoias() }

        val maranhao = findViewById<Button>(R.id.maranhao)
        maranhao.setOnClickListener { vaiParaConsumoMaranhao() }

        val matogrosso = findViewById<Button>(R.id.matogrosso)
        matogrosso.setOnClickListener { vaiParaConsumoMatoGrosso() }

        val matogrossodosul = findViewById<Button>(R.id.matogrossodosul)
        matogrossodosul.setOnClickListener { vaiParaConsumoMatoGrossoDoSul() }

        val minas = findViewById<Button>(R.id.minasgerais)
        minas.setOnClickListener { vaiParaConsumoMinasGerais() }

        val para = findViewById<Button>(R.id.para)
        para.setOnClickListener { vaiParaConsumoPara() }

        val paraiba = findViewById<Button>(R.id.paraiba)
        paraiba.setOnClickListener { vaiParaConsumoParaiba() }

        val pernambuco = findViewById<Button>(R.id.pernambuco)
        pernambuco.setOnClickListener { vaiParaConsumoPernambuco() }

        val piaui = findViewById<Button>(R.id.piaui)
        piaui.setOnClickListener { vaiParaConsumoPiaui() }

        val rio = findViewById<Button>(R.id.riodejaneiro)
        rio.setOnClickListener { vaiParaConsumoRiodeJaneiro() }

        val riograndedonorte = findViewById<Button>(R.id.riograndedonorte)
        riograndedonorte.setOnClickListener { vaiParaConsumoRioGrandedoNorte() }

        val riograndedosul = findViewById<Button>(R.id.rioGrandedoSul)
        riograndedosul.setOnClickListener { vaiParaConsumoRioGrandedoSul() }

        val rondonia = findViewById<Button>(R.id.rondonia)
        rondonia.setOnClickListener { vaiParaConsumoRondonia() }

        val roraima = findViewById<Button>(R.id.roraima)
        roraima.setOnClickListener { vaiParaConsumoRoraima() }

        val santacatarina = findViewById<Button>(R.id.santacatarina)
        santacatarina.setOnClickListener { vaiParaConsumoSantaCatarina() }

        val sp = findViewById<Button>(R.id.saoPaulo)
        sp.setOnClickListener { vaiParaConsumoSaoPaulo() }

        val se = findViewById<Button>(R.id.sergipe)
        se.setOnClickListener { vaiParaConsumoSergipe() }

        val to = findViewById<Button>(R.id.tocantins)
        to.setOnClickListener { vaiParaConsumoTocantins() }
    }




}