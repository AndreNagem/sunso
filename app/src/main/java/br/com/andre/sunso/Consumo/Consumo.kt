package br.com.andre.sunso.Consumo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.R
import br.com.andre.sunso.Resultado.Resultado
import br.com.andre.sunso.contato.contato
import kotlinx.android.synthetic.main.activity_consumo.*

class Consumo : AppCompatActivity() {

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
        setContentView(R.layout.activity_consumo)


        val extras = intent.getExtras()
        val irradi = extras.getDouble("chave_irradi")
            Toast.makeText(this,"irradiação média:   " + irradi.toString(), Toast.LENGTH_LONG).show()


        var campoConsumo = findViewById<EditText>(R.id.consumoMedio)
        var campoTarifa = findViewById<EditText>(R.id.valorTarifa)


        var consumo = campoConsumo.text
        var tarifa = campoTarifa.text

        }

    override fun onPause() {
        super.onPause()

        var campoConsumo = findViewById<EditText>(R.id.consumoMedio)

        var campoTarifa = findViewById<EditText>(R.id.valorTarifa)


        campoConsumo.setText(null)
        campoTarifa.setText(null)

    }

    override fun onResume() {
        super.onResume()

        var placas : Double

        val eficiencia : Double =0.1789
        val tamanhoModulo : Double =1.984
        val fatorPerda : Double = 1.15

        val extras = intent.getExtras()
        val irradi = extras.getDouble("chave_irradi")
        Toast.makeText(this,"irradiação média:   " + irradi.toString(), Toast.LENGTH_LONG).show()


        var campoConsumo = findViewById<EditText>(R.id.consumoMedio)

        var campoTarifa = findViewById<EditText>(R.id.valorTarifa)


        var consumo = campoConsumo.text
        var tarifa = campoTarifa.text



        fun vaiParaResultado() {

            if (consumo.isNullOrBlank()) {
                Toast.makeText(this, "Preencher todos os dados ", Toast.LENGTH_LONG).show()

            } else {
                if (tarifa.isNullOrBlank()) {
                    Toast.makeText(this, "Preencher todos os dados", Toast.LENGTH_LONG).show()
                } else {

                    var consumoMedio = consumo.toString()
                    var consumoM = consumoMedio.toDouble()

                    placas=((consumoM/30)/(irradi*tamanhoModulo*eficiencia))*fatorPerda


                    if(placas>3) {
                        if(placas<113) {
                            val intencaoResultado = Intent(this, Resultado::class.java)
                            intencaoResultado.putExtra("chave1", consumo.toString())
                            intencaoResultado.putExtra("chave2", tarifa.toString())
                            intencaoResultado.putExtra("chave3", irradi)
                            startActivity(intencaoResultado)
                        }
                        else{
                            Toast.makeText(this, "Sistema muito grande, favor consultar em contato.",Toast.LENGTH_SHORT).show()
                        }
                    }
                    else{
                    Toast.makeText(this, "Sistema muito pequeno para ser dimensionado, caso tenha alguma dúvida consulte em contato.",Toast.LENGTH_LONG).show()
                    }


                }

            }


        }

        val resultado = findViewById<Button>(R.id.proximo)
        resultado.setOnClickListener { vaiParaResultado() }

    }



    }




