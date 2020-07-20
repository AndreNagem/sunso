package br.com.andre.sunso.Resultado

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.andre.sunso.Listaestados.ListaEstados
import br.com.andre.sunso.R
import br.com.andre.sunso.contato.contato

class Resultado : AppCompatActivity() {

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
        setContentView(R.layout.resultado)

        var placas : Double

        val eficiencia : Double =0.1789
        val tamanhoModulo : Double =1.984
        val fatorPerda : Double = 1.15



        val extra = intent.getExtras()
        val consumo =extra.getString("chave1")
        val tarifa =extra.getString("chave2")
        val irradi =extra.getDouble("chave3")


        var consumoMedio = consumo.toDouble()
        var tarifa1= tarifa.toDouble()

        placas=((consumoMedio/30)/(irradi*tamanhoModulo*eficiencia))*fatorPerda



        if(placas<9){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 2


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.91
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*5780)*1.2
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao= custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    intencao.putExtra("chave5",economia.toString())
                    startActivity(intencao)

                }

            val btnFinanciamento = findViewById<Button>(R.id.financiamento)
            btnFinanciamento.setOnClickListener{irParaFragment()}


        }

        if(placas>9){
        if(placas<13){



            val textInversor = findViewById<TextView>( R.id.resultadoInversor)
            textInversor.setText("Númerio de Inversores :  1").toString()

            val inversores = 1
            val inversoresPotencia = 3


            var placasArredondado =String.format("%.0f", placas)
            val placasPotencia =String.format("%.0f",(placas*330/1000))
            val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
            textPlacas.setText("Número de placas:   "+placasArredondado).toString()



            val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
            textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

            val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.91
            val geracaoText=String.format("%.1f",geracao)


            val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
            textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

            var custo =(placas*550+ inversores*5780)*1.2
            var custoText=String.format("%.1f",custo)

            val textCusto = findViewById<TextView>(R.id.resultadoCusto)
            textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

            var custoInstalacao =custo*0.2
            var instalacaoText=String.format("%.1f",custoInstalacao)

            val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
            textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


            val economia =tarifa1*geracao
            val economiaText = String.format("%.1f",economia)

            val economiaAnual= tarifa1*geracao*12
            val economiaAnualText=String.format("%.1f",economiaAnual)

            val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
            textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

            val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
            val retornoText = String.format("%.1f",retorno)

            val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
            textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


            fun irParaFragment(){
                val intencao = Intent(this, FragmentResultado::class.java)
                intencao.putExtra("chave1",economiaAnual.toString())
                intencao.putExtra("chave2",economia.toString())
                intencao.putExtra("chave3", custo.toString())
                intencao.putExtra("chave4",custoInstalacao.toString())
                startActivity(intencao)

            }


            val btnFinanciamento = findViewById<Button>(R.id.financiamento)
            btnFinanciamento.setOnClickListener{irParaFragment()}


        }
        }

        if(placas>13){
            if(placas<18){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 4


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.91
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*8000)*1.2
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }


        if(placas>18){
            if(placas<27){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 6


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.91
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*7540)*1.2
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }


        if(placas>27){
            if(placas<36){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 8


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.91
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*9710)*1.2
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }



        if(placas>36){
            if(placas<45){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 10


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.91
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =placas*550+ inversores*28000
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =(placas*550+ inversores*28000)*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }


        if(placas>45){
            if(placas<54){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 12


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=(irradi*tamanhoModulo*eficiencia*30*placas*0.9)*0.92
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =placas*550+ inversores*31750
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =(placas*550+ inversores*31750)*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }

        if(placas>54){
            if(placas<68){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 15


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.87
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*30000)*1.1
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }

        if(placas>68){
            if(placas<90){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 20


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=irradi*tamanhoModulo*eficiencia*30*placas*0.86
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*32000)*1.2
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }


        if(placas>90){
            if(placas<113){



                val textInversor = findViewById<TextView>( R.id.resultadoInversor)
                textInversor.setText("Númerio de Inversores :  1").toString()

                val inversores = 1
                val inversoresPotencia = 25


                var placasArredondado =String.format("%.0f", placas)
                val placasPotencia =String.format("%.0f",(placas*330/1000))
                val textPlacas = findViewById<TextView>(R.id.resultadoPlacas)
                textPlacas.setText("Número de placas:   "+placasArredondado).toString()



                val textTamanho = findViewById<TextView>(R.id.resultadoTamanho)
                textTamanho.setText("Potência CC:"+placasPotencia+" KW"+"  Potência CA:"+inversoresPotencia+" KW").toString()

                val geracao=(irradi*tamanhoModulo*eficiencia*30*placas*0.86)*0.97
                val geracaoText=String.format("%.1f",geracao)


                val textGeracao = findViewById<TextView>(R.id.resultadoGeracao)
                textGeracao.setText("Geração estimada :"+geracaoText+" Kwh/mês").toString()

                var custo =(placas*550+ inversores*35000)*1.23
                var custoText=String.format("%.1f",custo)

                val textCusto = findViewById<TextView>(R.id.resultadoCusto)
                textCusto.setText("Custo estimado dos equipamentos :  R$"+custoText).toString()

                var custoInstalacao =custo*0.2
                var instalacaoText=String.format("%.1f",custoInstalacao)

                val textInstalacao = findViewById<TextView>(R.id.resultadoInstalacao)
                textInstalacao.setText("Custo estimado de instalação :  R$"+instalacaoText).toString()


                val economia =tarifa1*geracao
                val economiaText = String.format("%.1f",economia)

                val economiaAnual= tarifa1*geracao*12
                val economiaAnualText=String.format("%.1f",economiaAnual)

                val textEconomia = findViewById<TextView>(R.id.resultadoEconomia)
                textEconomia.setText("Economia mensal:  R$"+economiaText+"   Economia anual:  R$"+economiaAnualText).toString()

                val retorno =(custo+custoInstalacao)/(tarifa1*geracao*12)
                val retornoText = String.format("%.1f",retorno)

                val textRetorno = findViewById<TextView>(R.id.resultadoRetorno)
                textRetorno.setText("Retorno estimado do investimento:  "+retornoText+" anos").toString()


                fun irParaFragment(){
                    val intencao = Intent(this, FragmentResultado::class.java)
                    intencao.putExtra("chave1",economiaAnual.toString())
                    intencao.putExtra("chave2",economia.toString())
                    intencao.putExtra("chave3", custo.toString())
                    intencao.putExtra("chave4",custoInstalacao.toString())
                    startActivity(intencao)

                }


                val btnFinanciamento = findViewById<Button>(R.id.financiamento)
                btnFinanciamento.setOnClickListener{irParaFragment()}


            }
        }






        /*Toast.makeText(this,"Consumo:   " + consumo + "  Tarifa:   " +tarifa+"irradiação :     " + irradi,Toast.LENGTH_LONG ).show()*/

    }

    }

