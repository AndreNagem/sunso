package br.com.andre.sunso.financiamentos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import br.com.andre.sunso.R
import br.com.andre.sunso.contato.contato
import org.w3c.dom.Text

class desenvolvesp : AppCompatActivity() {

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


    lateinit var tbl: TableLayout
    lateinit var tbl1: TableLayout
    lateinit var tblCarencia : TableLayout
    lateinit var scrollView1 : ScrollView
    lateinit var scrollView : ScrollView
    lateinit var tblrow: TableRow
    lateinit var tblrow3: TableRow
    lateinit var tblrow6: TableRow
    lateinit var tblrow9: TableRow
    lateinit var tblrow12: TableRow
    lateinit var tblrow15: TableRow
    lateinit var tblrow18: TableRow
    lateinit var tblrow21: TableRow
    lateinit var tblrow24: TableRow
    lateinit var tblrow25: TableRow
    lateinit var tblrow26: TableRow
    lateinit var tblrow27: TableRow
    lateinit var tblrow28: TableRow
    lateinit var tblrow29: TableRow
    lateinit var tblrow30: TableRow
    lateinit var tblrow31: TableRow
    lateinit var tblrow32: TableRow
    lateinit var tblrow33: TableRow
    lateinit var tblrow34: TableRow
    lateinit var tblrow35: TableRow
    lateinit var tblrow36: TableRow
    lateinit var tblrow37: TableRow
    lateinit var tblrow38: TableRow
    lateinit var tblrow39: TableRow
    lateinit var tblrow40: TableRow
    lateinit var tblrow41: TableRow
    lateinit var tblrow42: TableRow
    lateinit var tblrow43: TableRow
    lateinit var tblrow44: TableRow
    lateinit var tblrow45: TableRow
    lateinit var tblrow46: TableRow
    lateinit var tblrow47: TableRow
    lateinit var tblrow48: TableRow
    lateinit var tblrow49: TableRow
    lateinit var tblrow50: TableRow
    lateinit var tblrow51: TableRow
    lateinit var tblrow52: TableRow
    lateinit var tblrow53: TableRow
    lateinit var tblrow54: TableRow
    lateinit var tblrow55: TableRow
    lateinit var tblrow56: TableRow
    lateinit var tblrow57: TableRow
    lateinit var tblrow58: TableRow
    lateinit var tblrow59: TableRow
    lateinit var tblrow60: TableRow


    lateinit var Text1: TextView
    lateinit var Text2: TextView
    lateinit var Text3: TextView
    lateinit var Text4: TextView
    lateinit var Text5: TextView
    lateinit var Text6: TextView
    lateinit var Text7: TextView
    lateinit var Text8: TextView
    lateinit var Text9: TextView
    lateinit var Text10: TextView
    lateinit var Text11: TextView
    lateinit var Text12: TextView
    lateinit var Text13: TextView
    lateinit var Text14: TextView
    lateinit var Text15: TextView
    lateinit var Text16: TextView
    lateinit var Text17: TextView
    lateinit var Text18: TextView
    lateinit var Text19: TextView
    lateinit var Text20: TextView
    lateinit var Text21: TextView
    lateinit var Text22: TextView
    lateinit var Text23: TextView
    lateinit var Text24: TextView
    lateinit var Text25: TextView
    lateinit var Text26: TextView
    lateinit var Text27: TextView
    lateinit var Text28: TextView
    lateinit var Text29: TextView
    lateinit var Text30: TextView
    lateinit var Text31: TextView
    lateinit var Text32: TextView
    lateinit var Text33: TextView
    lateinit var Text34: TextView
    lateinit var Text35: TextView
    lateinit var Text36: TextView
    lateinit var Text37: TextView
    lateinit var Text38: TextView
    lateinit var Text39: TextView
    lateinit var Text40: TextView
    lateinit var Text41: TextView
    lateinit var Text42: TextView
    lateinit var Text43: TextView
    lateinit var Text44: TextView
    lateinit var Text45: TextView
    lateinit var Text46: TextView
    lateinit var Text47: TextView
    lateinit var Text48: TextView
    lateinit var Text49: TextView
    lateinit var Text50: TextView
    lateinit var Text51: TextView
    lateinit var Text52: TextView
    lateinit var Text53: TextView
    lateinit var Text54: TextView
    lateinit var Text55: TextView
    lateinit var Text56: TextView
    lateinit var Text57: TextView
    lateinit var Text58: TextView
    lateinit var Text59: TextView
    lateinit var Text60: TextView
    lateinit var Text61: TextView
    lateinit var Text62: TextView
    lateinit var Text63: TextView
    lateinit var Text64: TextView
    lateinit var Text65: TextView
    lateinit var Text66: TextView
    lateinit var Text67: TextView
    lateinit var Text68: TextView
    lateinit var Text69: TextView
    lateinit var Text70: TextView
    lateinit var Text71: TextView
    lateinit var Text72: TextView
    lateinit var Text73: TextView
    lateinit var Text74: TextView
    lateinit var Text75: TextView
    lateinit var Text76: TextView
    lateinit var Text77: TextView
    lateinit var Text78: TextView
    lateinit var Text79: TextView
    lateinit var Text80: TextView
    lateinit var Text81: TextView
    lateinit var Text82: TextView
    lateinit var Text83: TextView
    lateinit var Text84: TextView
    lateinit var Text85: TextView
    lateinit var Text86: TextView
    lateinit var Text87: TextView
    lateinit var Text88: TextView
    lateinit var Text89: TextView
    lateinit var Text90: TextView
    lateinit var Text91: TextView
    lateinit var Text92: TextView
    lateinit var Text93: TextView
    lateinit var Text94: TextView
    lateinit var Text95: TextView
    lateinit var Text96: TextView
    lateinit var Text97: TextView
    lateinit var Text98: TextView
    lateinit var Text99: TextView
    lateinit var Text100: TextView
    lateinit var Text101: TextView
    lateinit var Text102: TextView
    lateinit var Text103: TextView
    lateinit var Text104: TextView
    lateinit var Text105: TextView
    lateinit var Text106: TextView
    lateinit var Text107: TextView
    lateinit var Text108: TextView
    lateinit var Text109: TextView
    lateinit var Text110: TextView
    lateinit var Text111: TextView
    lateinit var Text112: TextView
    lateinit var Text113: TextView
    lateinit var Text114: TextView
    lateinit var Text115: TextView
    lateinit var Text116: TextView
    lateinit var Text117: TextView
    lateinit var Text118: TextView
    lateinit var Text119: TextView
    lateinit var Text120: TextView
    lateinit var Text121: TextView
    lateinit var Text122: TextView
    lateinit var Text123: TextView
    lateinit var Text124: TextView
    lateinit var Text125: TextView
    lateinit var Text126: TextView
    lateinit var Text127: TextView
    lateinit var Text128: TextView
    lateinit var Text129: TextView
    lateinit var Text130: TextView
    lateinit var Text131: TextView
    lateinit var Text132: TextView
    lateinit var Text133: TextView
    lateinit var Text134: TextView
    lateinit var Text135: TextView
    lateinit var Text136: TextView
    lateinit var Text137: TextView
    lateinit var Text138: TextView
    lateinit var Text139: TextView
    lateinit var Text140: TextView
    lateinit var Text141: TextView
    lateinit var Text142: TextView
    lateinit var Text143: TextView
    lateinit var Text144: TextView
    lateinit var Text145: TextView
    lateinit var Text146: TextView
    lateinit var Text147: TextView
    lateinit var Text148: TextView
    lateinit var Text149: TextView
    lateinit var Text150: TextView
    lateinit var Text151: TextView
    lateinit var Text152: TextView
    lateinit var Text153: TextView
    lateinit var Text154: TextView
    lateinit var Text155: TextView
    lateinit var Text156: TextView
    lateinit var Text157: TextView
    lateinit var Text158: TextView
    lateinit var Text159: TextView
    lateinit var Text160: TextView
    lateinit var Text161: TextView
    lateinit var Text162: TextView
    lateinit var Text163: TextView
    lateinit var Text164: TextView
    lateinit var Text165: TextView
    lateinit var Text166: TextView
    lateinit var Text167: TextView
    lateinit var Text168: TextView
    lateinit var Text169: TextView
    lateinit var Text170: TextView
    lateinit var Text171: TextView
    lateinit var Text172: TextView
    lateinit var Text173: TextView
    lateinit var Text174: TextView
    lateinit var Text175: TextView
    lateinit var Text176: TextView
    lateinit var Text177: TextView
    lateinit var Text178: TextView
    lateinit var Text179: TextView
    lateinit var Text180: TextView
    lateinit var Text181: TextView
    lateinit var Text182: TextView
    lateinit var Text183: TextView
    lateinit var Text184: TextView
    lateinit var Text185: TextView
    lateinit var Text186: TextView
    lateinit var Text187: TextView
    lateinit var Text188: TextView
    lateinit var Text189: TextView
    lateinit var Text190: TextView
    lateinit var Text191: TextView
    lateinit var Text192: TextView
    lateinit var Text193: TextView
    lateinit var Text194: TextView
    lateinit var Text195: TextView
    lateinit var Text196: TextView
    lateinit var Text197: TextView
    lateinit var Text198: TextView
    lateinit var Text199: TextView
    lateinit var Text200: TextView
    lateinit var Text201: TextView
    lateinit var Text202: TextView
    lateinit var Text203: TextView
    lateinit var Text204: TextView
    lateinit var Text205: TextView
    lateinit var Text206: TextView
    lateinit var Text207: TextView
    lateinit var Text208: TextView
    lateinit var Text209: TextView
    lateinit var Text210: TextView
    lateinit var Text211: TextView
    lateinit var Text212: TextView
    lateinit var Text213: TextView
    lateinit var Text214: TextView
    lateinit var Text215: TextView
    lateinit var Text216: TextView
    lateinit var Text217: TextView
    lateinit var Text218: TextView
    lateinit var Text219: TextView
    lateinit var Text220: TextView
    lateinit var Text221: TextView
    lateinit var Text222: TextView
    lateinit var Text223: TextView
    lateinit var Text224: TextView
    lateinit var Text225: TextView
    lateinit var Text226: TextView
    lateinit var Text227: TextView
    lateinit var Text228: TextView
    lateinit var Text229: TextView
    lateinit var Text230: TextView
    lateinit var Text231: TextView
    lateinit var Text232: TextView
    lateinit var Text233: TextView
    lateinit var Text234: TextView
    lateinit var Text235: TextView
    lateinit var Text236: TextView
    lateinit var Text237: TextView
    lateinit var Text238: TextView
    lateinit var Text239: TextView
    lateinit var Text240: TextView
    lateinit var Text241: TextView
    lateinit var Text242: TextView
    lateinit var Text243: TextView
    lateinit var Text244: TextView
    lateinit var Text245: TextView
    lateinit var Text246: TextView
    lateinit var Text247: TextView
    lateinit var Text248: TextView
    lateinit var Text249: TextView
    lateinit var Text250: TextView
    lateinit var Text251: TextView
    lateinit var Text252: TextView
    lateinit var Text253: TextView
    lateinit var Text254: TextView
    lateinit var Text255: TextView
    lateinit var Text256: TextView
    lateinit var Text257: TextView
    lateinit var Text258: TextView
    lateinit var Text259: TextView
    lateinit var Text260: TextView
    lateinit var Text261: TextView
    lateinit var Text262: TextView
    lateinit var Text263: TextView
    lateinit var Text264: TextView
    lateinit var Text265: TextView
    lateinit var Text266: TextView
    lateinit var Text267: TextView
    lateinit var Text268: TextView
    lateinit var Text269: TextView
    lateinit var Text270: TextView




    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_dsp)


        val extras = intent.getExtras()
        val economiaAnual = extras.getString("chave1")
        val economiaMensal = extras.getString("chave2")
        val custo = extras.getString("chave3")
        val custoInstalacao = extras.getString("chave4")


        val ecoAnual = economiaAnual.toDouble()
        val ecoMensal = economiaMensal.toDouble()
        val custoEquipamentos = custo.toDouble()
        val custoDeInstalacao = custoInstalacao.toDouble()


        val economiaTotal = ecoAnual + ecoMensal
        var financiamento = (custoDeInstalacao + custoEquipamentos)

        tbl = TableLayout(this)
        tbl1 = TableLayout(this)
        tblCarencia = TableLayout(this)
        tblrow = TableRow(this)
        tblrow3 = TableRow(this)
        tblrow6 = TableRow(this)
        tblrow9 = TableRow(this)
        tblrow12 = TableRow(this)
        tblrow15 = TableRow(this)
        tblrow18 = TableRow(this)
        tblrow21 = TableRow(this)
        tblrow24 = TableRow(this)
        tblrow25 = TableRow(this)
        tblrow26 = TableRow(this)
        tblrow27 = TableRow(this)
        tblrow28 = TableRow(this)
        tblrow29 = TableRow(this)
        tblrow30 = TableRow(this)
        tblrow31 = TableRow(this)
        tblrow32 = TableRow(this)
        tblrow33 = TableRow(this)
        tblrow34 = TableRow(this)
        tblrow35 = TableRow(this)
        tblrow36 = TableRow(this)
        tblrow37 = TableRow(this)
        tblrow38 = TableRow(this)
        tblrow39 = TableRow(this)
        tblrow40 = TableRow(this)
        tblrow41 = TableRow(this)
        tblrow42 = TableRow(this)
        tblrow43 = TableRow(this)
        tblrow44 = TableRow(this)
        tblrow45 = TableRow(this)
        tblrow46 = TableRow(this)
        tblrow47 = TableRow(this)
        tblrow48 = TableRow(this)
        tblrow49 = TableRow(this)
        tblrow50 = TableRow(this)
        tblrow51 = TableRow(this)
        tblrow52 = TableRow(this)
        tblrow53 = TableRow(this)
        tblrow54 = TableRow(this)
        tblrow55 = TableRow(this)
        tblrow56 = TableRow(this)
        tblrow57 = TableRow(this)
        tblrow58 = TableRow(this)
        tblrow59 = TableRow(this)
        tblrow60 = TableRow(this)


        Text1 = TextView(this)
        Text2 = TextView(this)
        Text3 = TextView(this)
        Text4 = TextView(this)
        Text5 = TextView(this)



        Text6 = TextView(this)
        Text7 = TextView(this)
        Text8 = TextView(this)
        Text9 = TextView(this)
        Text10 = TextView(this)
        Text11 = TextView(this)
        Text12 = TextView(this)
        Text13 = TextView(this)
        Text14 = TextView(this)
        Text15 = TextView(this)
        Text16 = TextView(this)
        Text17 = TextView(this)
        Text18 = TextView(this)
        Text19 = TextView(this)
        Text20 = TextView(this)
        Text21 = TextView(this)
        Text22 = TextView(this)
        Text23 = TextView(this)
        Text24 = TextView(this)
        Text25 = TextView(this)
        Text26 = TextView(this)
        Text27 = TextView(this)
        Text28 = TextView(this)
        Text29 = TextView(this)
        Text30 = TextView(this)
        Text31 = TextView(this)
        Text32 = TextView(this)
        Text33 = TextView(this)
        Text34 = TextView(this)
        Text35 = TextView(this)
        Text36 = TextView(this)
        Text37 = TextView(this)
        Text38 = TextView(this)
        Text39 = TextView(this)
        Text40 = TextView(this)
        Text41 = TextView(this)
        Text42 = TextView(this)
        Text43 = TextView(this)
        Text44 = TextView(this)
        Text45 = TextView(this)
        Text46 = TextView(this)
        Text47 = TextView(this)
        Text48 = TextView(this)
        Text49 = TextView(this)
        Text50 = TextView(this)
        Text51 = TextView(this)
        Text52 = TextView(this)
        Text53 = TextView(this)
        Text54 = TextView(this)
        Text55 = TextView(this)
        Text56 = TextView(this)
        Text57 = TextView(this)
        Text58 = TextView(this)
        Text59 = TextView(this)
        Text60 = TextView(this)
        Text61 = TextView(this)
        Text62 = TextView(this)
        Text63 = TextView(this)
        Text64 = TextView(this)
        Text65 = TextView(this)
        Text66 = TextView(this)
        Text67 = TextView(this)
        Text68 = TextView(this)
        Text69 = TextView(this)
        Text70 = TextView(this)
        Text71 = TextView(this)
        Text72 = TextView(this)
        Text73 = TextView(this)
        Text74 = TextView(this)
        Text75 = TextView(this)
        Text76 = TextView(this)
        Text77 = TextView(this)
        Text78 = TextView(this)
        Text79 = TextView(this)
        Text80 = TextView(this)
        Text81 = TextView(this)
        Text82 = TextView(this)
        Text83 = TextView(this)
        Text84 = TextView(this)
        Text85 = TextView(this)
        Text86 = TextView(this)
        Text87= TextView(this)
        Text88 = TextView(this)
        Text89 = TextView(this)
        Text90 = TextView(this)
        Text91 = TextView(this)
        Text92 = TextView(this)
        Text93 = TextView(this)
        Text94 = TextView(this)
        Text95 = TextView(this)
        Text96 = TextView(this)
        Text97 = TextView(this)
        Text98 = TextView(this)
        Text99 = TextView(this)
        Text100 = TextView(this)
        Text101 = TextView(this)
        Text102 = TextView(this)
        Text103 = TextView(this)
        Text104 = TextView(this)
        Text105 = TextView(this)
        Text106 = TextView(this)
        Text107 = TextView(this)
        Text108 = TextView(this)
        Text109 = TextView(this)
        Text110 = TextView(this)
        Text111 = TextView(this)
        Text112 = TextView(this)
        Text113 = TextView(this)
        Text114 = TextView(this)
        Text115 = TextView(this)
        Text116 = TextView(this)
        Text117 = TextView(this)
        Text118 = TextView(this)
        Text119 = TextView(this)
        Text120 = TextView(this)
        Text121 = TextView(this)
        Text122 = TextView(this)
        Text123 = TextView(this)
        Text124 = TextView(this)
        Text125 = TextView(this)
        Text126 = TextView(this)
        Text127 = TextView(this)
        Text128 = TextView(this)
        Text129 = TextView(this)
        Text130 = TextView(this)
        Text131 = TextView(this)
        Text132 = TextView(this)
        Text133 = TextView(this)
        Text134 = TextView(this)
        Text135 = TextView(this)
        Text136 = TextView(this)
        Text137 = TextView(this)
        Text138 = TextView(this)
        Text139 = TextView(this)
        Text140 = TextView(this)
        Text141 = TextView(this)
        Text142 = TextView(this)
        Text143 = TextView(this)
        Text144 = TextView(this)
        Text145 = TextView(this)
        Text146 = TextView(this)
        Text147 = TextView(this)
        Text148 = TextView(this)
        Text149 = TextView(this)
        Text150 = TextView(this)
        Text151 = TextView(this)
        Text152 = TextView(this)
        Text153 = TextView(this)
        Text154 = TextView(this)
        Text155 = TextView(this)
        Text156 = TextView(this)
        Text157 = TextView(this)
        Text158 = TextView(this)
        Text159 = TextView(this)
        Text160 = TextView(this)
        Text161 = TextView(this)
        Text162 = TextView(this)
        Text163 = TextView(this)
        Text164 = TextView(this)
        Text165 = TextView(this)
        Text166 = TextView(this)
        Text167 = TextView(this)
        Text168 = TextView(this)
        Text169 = TextView(this)
        Text170 = TextView(this)
        Text171 = TextView(this)
        Text172 = TextView(this)
        Text173 = TextView(this)
        Text174 = TextView(this)
        Text175 = TextView(this)
        Text175 = TextView(this)
        Text176 = TextView(this)
        Text177 = TextView(this)
        Text178 = TextView(this)
        Text179 = TextView(this)
        Text180 = TextView(this)
        Text181 = TextView(this)
        Text182 = TextView(this)
        Text183 = TextView(this)
        Text184 = TextView(this)
        Text185 = TextView(this)
        Text185 = TextView(this)
        Text186 = TextView(this)
        Text187 = TextView(this)
        Text188 = TextView(this)
        Text189 = TextView(this)
        Text190 = TextView(this)
        Text191 = TextView(this)
        Text192 = TextView(this)
        Text193 = TextView(this)
        Text194 = TextView(this)
        Text195 = TextView(this)
        Text196 = TextView(this)
        Text197 = TextView(this)
        Text198 = TextView(this)
        Text199 = TextView(this)
        Text200 = TextView(this)
        Text201 = TextView(this)
        Text202 = TextView(this)
        Text203 = TextView(this)
        Text204 = TextView(this)
        Text205 = TextView(this)
        Text206 = TextView(this)
        Text207 = TextView(this)
        Text208 = TextView(this)
        Text209 = TextView(this)
        Text210 = TextView(this)
        Text211 = TextView(this)
        Text212 = TextView(this)
        Text213 = TextView(this)
        Text214 = TextView(this)
        Text215 = TextView(this)
        Text216 = TextView(this)
        Text217 = TextView(this)
        Text218 = TextView(this)
        Text219 = TextView(this)
        Text220 = TextView(this)
        Text221 = TextView(this)
        Text222 = TextView(this)
        Text223 = TextView(this)
        Text224 = TextView(this)
        Text225 = TextView(this)
        Text226 = TextView(this)
        Text226 = TextView(this)
        Text227 = TextView(this)
        Text228 = TextView(this)
        Text229 = TextView(this)
        Text230 = TextView(this)
        Text231 = TextView(this)
        Text232 = TextView(this)
        Text233 = TextView(this)
        Text234 = TextView(this)
        Text235 = TextView(this)
        Text236 = TextView(this)
        Text237 = TextView(this)
        Text238 = TextView(this)
        Text239 = TextView(this)
        Text240 = TextView(this)
        Text241 = TextView(this)
        Text242 = TextView(this)
        Text243 = TextView(this)
        Text244 = TextView(this)
        Text245 = TextView(this)
        Text246 = TextView(this)
        Text247 = TextView(this)
        Text248 = TextView(this)
        Text249 = TextView(this)
        Text250 = TextView(this)
        Text251 = TextView(this)
        Text252 = TextView(this)
        Text253 = TextView(this)
        Text254 = TextView(this)
        Text255 = TextView(this)
        Text256 = TextView(this)
        Text257 = TextView(this)
        Text258 = TextView(this)
        Text259 = TextView(this)
        Text260 = TextView(this)
        Text261 = TextView(this)
        Text262 = TextView(this)
        Text263 = TextView(this)
        Text264 = TextView(this)
        Text265 = TextView(this)
        Text266 = TextView(this)
        Text267 = TextView(this)
        Text268 = TextView(this)
        Text269 = TextView(this)
        Text270 = TextView(this)




        val lp: TableLayout.LayoutParams = TableLayout.LayoutParams(
            ViewGroup.LayoutParams.FILL_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        val lp1: TableLayout.LayoutParams = TableLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        val leftMargin =10
        val topMargin = 2
        val rightMargin = 10
        val bottomMargin = 5

        lp1.setMargins(leftMargin,topMargin,rightMargin,bottomMargin)
        lp.setMargins(leftMargin,topMargin,rightMargin,bottomMargin)

        tbl1.layoutParams = lp1
        tbl.layoutParams = lp

        scrollView = findViewById(R.id.ScrollViewDSP)
        scrollView1 = findViewById(R.id.tbl)



        Text1.setText("MÊS").toString()
        Text1.setBackgroundResource(R.drawable.botao_redondo_mes)
        Text2.setText("SALDO DEVEDOR").toString()
        Text2.setBackgroundResource(R.drawable.botao_redondo_tabela)
        Text3.setText("JUROS").toString()
        Text3.setBackgroundResource(R.drawable.botao_redondo_tabela)
        Text4.setText("AMORTIZAÇÃO").toString()
        Text4.setBackgroundResource(R.drawable.botao_redondo_tabela)
        Text5.setText("PRESTAÇÃO").toString()
        Text5.setBackgroundResource(R.drawable.botao_redondo_tabela)
        Text226.setText("ECONOMIA ACUMULADA").toString()
        Text226.setBackgroundResource(R.drawable.botao_redondo_tabela)
        Text1.setPadding(5,0,10,0)
        Text2.setPadding(5,0,10,0)
        Text3.setPadding(5,0,10,0)
        Text4.setPadding(5,0,10,0)
        Text5.setPadding(5,0,10,0)
        Text226.setPadding(5,0,10,0)


        tblrow.addView(Text1)
        tblrow.addView(Text2)
        tblrow.addView(Text3)
        tblrow.addView(Text4)
        tblrow.addView(Text5)
        tblrow.addView(Text226)
        tbl1.addView(tblrow)


        scrollView1.addView(tbl1)



        var x = 24
        var saldoDevedor = financiamento
        var amortizacao = financiamento / 36

        var y = 0

        while(y < 24){

            y += 3
            var jurosCarencia = saldoDevedor*0.005546
            var prestacaoCarencia = jurosCarencia*3
            var amortizacaoCarencia = 0.0

            if( y == 3 ){
                var eco = ecoMensal*3

                var mes = y.toString()
                Text186.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text187.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text188.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text189.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text190.setText(prestacaoTexto)

                var economia = String.format("%.2f",eco)
                Text227.setText(economia)



                Text186.setPadding(8,0,10,0)
                Text187.setPadding(40,0,10,0)
                Text188.setPadding(176,0,10,0)
                Text189.setPadding(38,0,10,0)
                Text190.setPadding(164,0,10,0)
                Text227.setPadding(164,0,10,0)


                tblrow3.addView(Text186)
                tblrow3.addView(Text187)
                tblrow3.addView(Text188)
                tblrow3.addView(Text189)
                tblrow3.addView(Text190)
                tblrow3.addView(Text227)
                tbl.addView(tblrow3)


            }

            if( y == 6 ){

                var eco = ecoMensal*6

                var mes = y.toString()
                Text191.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text192.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text193.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text194.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text195.setText(prestacaoTexto)

                var economia = String.format("%.2f",eco)
                Text228.setText(economia)



                Text191.setPadding(8,0,10,0)
                Text192.setPadding(40,0,10,0)
                Text193.setPadding(176,0,10,0)
                Text194.setPadding(38,0,10,0)
                Text195.setPadding(164,0,10,0)
                Text228.setPadding(164,0,10,0)

                tblrow6.addView(Text191)
                tblrow6.addView(Text192)
                tblrow6.addView(Text193)
                tblrow6.addView(Text194)
                tblrow6.addView(Text195)
                tblrow6.addView(Text228)
                tbl.addView(tblrow6)


            }

            if( y == 9 ){

                var eco = ecoMensal*9


                var mes = y.toString()
                Text196.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text197.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text198.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text199.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text200.setText(prestacaoTexto)

                var economia = String.format("%.2f",eco)
                Text229.setText(economia)



                Text196.setPadding(8,0,10,0)
                Text197.setPadding(40,0,10,0)
                Text198.setPadding(176,0,10,0)
                Text199.setPadding(38,0,10,0)
                Text200.setPadding(164,0,10,0)
                Text229.setPadding(164,0,10,0)

                tblrow9.addView(Text196)
                tblrow9.addView(Text197)
                tblrow9.addView(Text198)
                tblrow9.addView(Text199)
                tblrow9.addView(Text200)
                tblrow9.addView(Text229)
                tbl.addView(tblrow9)


            }

            if( y == 12 ){

                var eco = ecoMensal*9

                var mes = y.toString()
                Text201.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text202.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text203.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text204.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text205.setText(prestacaoTexto)
                
                var economia = String.format("%.2f",eco)
                Text230.setText(economia)



                Text201.setPadding(8,0,10,0)
                Text202.setPadding(40,0,10,0)
                Text203.setPadding(176,0,10,0)
                Text204.setPadding(38,0,10,0)
                Text205.setPadding(164,0,10,0)
                Text230.setPadding(164,0,10,0)


                tblrow12.addView(Text201)
                tblrow12.addView(Text202)
                tblrow12.addView(Text203)
                tblrow12.addView(Text204)
                tblrow12.addView(Text205)
                tblrow12.addView(Text230)
                tbl.addView(tblrow12)


            }

            if( y == 15 ){

                var eco = ecoMensal*15
                
                var mes = y.toString()
                Text206.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text207.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text208.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text209.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text210.setText(prestacaoTexto)

                var economia = String.format("%.2f",eco)
                Text231.setText(economia)



                Text206.setPadding(8,0,10,0)
                Text207.setPadding(40,0,10,0)
                Text208.setPadding(176,0,10,0)
                Text209.setPadding(38,0,10,0)
                Text210.setPadding(164,0,10,0)
                Text231.setPadding(164,0,10,0)


                tblrow15.addView(Text206)
                tblrow15.addView(Text207)
                tblrow15.addView(Text208)
                tblrow15.addView(Text209)
                tblrow15.addView(Text210)
                tblrow15.addView(Text231)
                tbl.addView(tblrow15)


            }

            if( y == 18 ){

                var eco = ecoMensal*18
                
                var mes = y.toString()
                Text211.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text212.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text213.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text214.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text215.setText(prestacaoTexto)

                var economia = String.format("%.2f",eco)
                Text232.setText(economia)
                

                Text211.setPadding(8,0,10,0)
                Text212.setPadding(40,0,10,0)
                Text213.setPadding(176,0,10,0)
                Text214.setPadding(38,0,10,0)
                Text215.setPadding(164,0,10,0)
                Text232.setPadding(164,0,10,0)


                tblrow18.addView(Text211)
                tblrow18.addView(Text212)
                tblrow18.addView(Text213)
                tblrow18.addView(Text214)
                tblrow18.addView(Text215)
                tblrow18.addView(Text232)
                tbl.addView(tblrow18)


            }

            if( y == 21 ){

                var eco = ecoMensal*21

                var mes = y.toString()
                Text216.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text217.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text218.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text219.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text220.setText(prestacaoTexto)
                
                var economia = String.format("%.2f",eco)
                Text233.setText(economia)




                Text216.setPadding(8,0,10,0)
                Text217.setPadding(40,0,10,0)
                Text218.setPadding(176,0,10,0)
                Text219.setPadding(38,0,10,0)
                Text220.setPadding(164,0,10,0)
                Text233.setPadding(164,0,10,0)


                tblrow21.addView(Text216)
                tblrow21.addView(Text217)
                tblrow21.addView(Text218)
                tblrow21.addView(Text219)
                tblrow21.addView(Text220)
                tblrow21.addView(Text233)
                tbl.addView(tblrow21)


            }

            if( y == 24 ){

                var eco = ecoMensal*24

                var mes = y.toString()
                Text221.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text222.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",jurosCarencia)
                Text223.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacaoCarencia)
                Text224.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacaoCarencia)
                Text225.setText(prestacaoTexto)

                var economia = String.format("%.2f",eco)
                Text234.setText(economia)



                Text221.setPadding(8,0,10,0)
                Text222.setPadding(40,0,10,0)
                Text223.setPadding(176,0,10,0)
                Text224.setPadding(38,0,10,0)
                Text225.setPadding(164,0,10,0)
                Text234.setPadding(164,0,10,0)


                tblrow24.addView(Text221)
                tblrow24.addView(Text222)
                tblrow24.addView(Text223)
                tblrow24.addView(Text224)
                tblrow24.addView(Text225)
                tblrow24.addView(Text234)
                tbl.addView(tblrow24)


            }


        }

        while (x < 60) {

            var n = 0
            n += 1
            x += 1

            var juros = saldoDevedor * 0.005546

            var prestacao = amortizacao + juros

            var econ =  ecoMensal*x



            if (x == 25) {
                saldoDevedor=financiamento

                var mes = x.toString()
                Text6.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text7.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text8.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text9.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text10.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text235.setText(econTexto)

                Text6.setPadding(8,0,10,0)
                Text7.setPadding(40,0,10,0)
                Text8.setPadding(176,0,10,0)
                Text9.setPadding(38,0,10,0)
                Text10.setPadding(164,0,10,0)
                Text235.setPadding(164,0,10,0)


                tblrow25.addView(Text6)
                tblrow25.addView(Text7)
                tblrow25.addView(Text8)
                tblrow25.addView(Text9)
                tblrow25.addView(Text10)
                tblrow25.addView(Text235)
                tbl.addView(tblrow25)

            }


             if (x == 26) {


                var mes = x.toString()
                Text11.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text12.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text13.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text14.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text15.setText(prestacaoTexto)
                 
                 var econTexto = String.format("%.2f",econ)
                 Text236.setText(econTexto)

                 Text11.setPadding(8,0,10,0)
                 Text12.setPadding(40,0,10,0)
                 Text13.setPadding(176,0,10,0)
                 Text14.setPadding(38,0,10,0)
                 Text15.setPadding(164,0,10,0)
                 Text236.setPadding(164,0,10,0)


                 tblrow26.addView(Text11)
                 tblrow26.addView(Text12)
                 tblrow26.addView(Text13)
                 tblrow26.addView(Text14)
                 tblrow26.addView(Text15)
                 tblrow26.addView(Text236)


             }
            if (x == 27) {
                var mes = x.toString()
                Text16.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text17.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text18.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text19.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text20.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text237.setText(econTexto)

                Text16.setPadding(8,0,10,0)
                Text17.setPadding(40,0,10,0)
                Text18.setPadding(176,0,10,0)
                Text19.setPadding(38,0,10,0)
                Text20.setPadding(164,0,10,0)
                Text237.setPadding(164,0,10,0)


                 tblrow27.addView(Text16)
                 tblrow27.addView(Text17)
                 tblrow27.addView(Text18)
                 tblrow27.addView(Text19)
                 tblrow27.addView(Text20)
                 tblrow27.addView(Text237)

            }
                 if (x == 28) {
                     var mes = x.toString()
                     Text21.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text22.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text23.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text24.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text25.setText(prestacaoTexto)
                     
                     var econTexto = String.format("%.2f",econ)
                     Text238.setText(econTexto)

                     Text21.setPadding(8,0,10,0)
                     Text22.setPadding(40,0,10,0)
                     Text23.setPadding(176,0,10,0)
                     Text24.setPadding(38,0,10,0)
                     Text25.setPadding(164,0,10,0)
                     Text238.setPadding(164,0,10,0)


                     tblrow28.addView(Text21)
                     tblrow28.addView(Text22)
                     tblrow28.addView(Text23)
                     tblrow28.addView(Text24)
                     tblrow28.addView(Text25)
                     tblrow28.addView(Text238)

                 }
                 if (x == 29) {
                     var mes = x.toString()
                     Text26.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text27.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text28.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text29.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text30.setText(prestacaoTexto)


                     var econTexto = String.format("%.2f",econ)
                     Text239.setText(econTexto)


                     Text26.setPadding(8,0,10,0)
                     Text27.setPadding(40,0,10,0)
                     Text28.setPadding(176,0,10,0)
                     Text29.setPadding(38,0,10,0)
                     Text30.setPadding(164,0,10,0)
                     Text239.setPadding(164,0,10,0)


                     tblrow29.addView(Text26)
                     tblrow29.addView(Text27)
                     tblrow29.addView(Text28)
                     tblrow29.addView(Text29)
                     tblrow29.addView(Text30)
                     tblrow29.addView(Text239)

                 }
                 if (x == 30) {
                     var mes = x.toString()
                     Text31.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text32.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text33.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text34.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text35.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text240.setText(econTexto)

                     Text31.setPadding(8,0,10,0)
                     Text32.setPadding(40,0,10,0)
                     Text33.setPadding(176,0,10,0)
                     Text34.setPadding(38,0,10,0)
                     Text35.setPadding(164,0,10,0)
                     Text240.setPadding(164,0,10,0)


                     tblrow30.addView(Text31)
                     tblrow30.addView(Text32)
                     tblrow30.addView(Text33)
                     tblrow30.addView(Text34)
                     tblrow30.addView(Text35)
                     tblrow30.addView(Text240)

                 }
                 if (x == 31) {
                     var mes = x.toString()
                     Text36.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text37.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text38.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text39.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text40.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text241.setText(econTexto)

                     Text36.setPadding(8,0,10,0)
                     Text37.setPadding(40,0,10,0)
                     Text38.setPadding(176,0,10,0)
                     Text39.setPadding(38,0,10,0)
                     Text40.setPadding(164,0,10,0)
                     Text241.setPadding(164,0,10,0)




                     tblrow31.addView(Text36)
                     tblrow31.addView(Text37)
                     tblrow31.addView(Text38)
                     tblrow31.addView(Text39)
                     tblrow31.addView(Text40)
                     tblrow31.addView(Text241)

                 }
                 if (x == 32) {
                     var mes = x.toString()
                     Text41.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text42.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text43.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text44.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text45.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text242.setText(econTexto)

                     Text41.setPadding(8,0,10,0)
                     Text42.setPadding(40,0,10,0)
                     Text43.setPadding(176,0,10,0)
                     Text44.setPadding(38,0,10,0)
                     Text45.setPadding(164,0,10,0)
                     Text242.setPadding(164,0,10,0)

                     tblrow32.addView(Text41)
                     tblrow32.addView(Text42)
                     tblrow32.addView(Text43)
                     tblrow32.addView(Text44)
                     tblrow32.addView(Text45)
                     tblrow32.addView(Text242)

                 }
                 if (x == 33) {
                     var mes = x.toString()
                     Text46.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text47.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text48.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text49.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text50.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text243.setText(econTexto)

                     Text46.setPadding(8,0,10,0)
                     Text47.setPadding(40,0,10,0)
                     Text48.setPadding(176,0,10,0)
                     Text49.setPadding(38,0,10,0)
                     Text50.setPadding(164,0,10,0)
                     Text243.setPadding(164,0,10,0)




                     tblrow33.addView(Text46)
                     tblrow33.addView(Text47)
                     tblrow33.addView(Text48)
                     tblrow33.addView(Text49)
                     tblrow33.addView(Text50)
                     tblrow33.addView(Text243)

                 }

            if (x == 34) {

                     var mes = x.toString()
                     Text51.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text52.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text53.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text54.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text55.setText(prestacaoTexto)
                
                var econTexto = String.format("%.2f",econ)
                Text244.setText(econTexto)

                Text51.setPadding(8,0,10,0)
                Text52.setPadding(40,0,10,0)
                Text53.setPadding(176,0,10,0)
                Text54.setPadding(38,0,10,0)
                Text55.setPadding(164,0,10,0)
                Text244.setPadding(164,0,10,0)



                tblrow34.addView(Text51)
                tblrow34.addView(Text52)
                tblrow34.addView(Text53)
                tblrow34.addView(Text54)
                tblrow34.addView(Text55)
                tblrow34.addView(Text244)

            }
                 if (x == 35) {

                      var mes = x.toString()
                     Text56.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text57.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text58.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text59.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text60.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text245.setText(econTexto)


                     Text56.setPadding(8,0,10,0)
                     Text57.setPadding(40,0,10,0)
                     Text58.setPadding(176,0,10,0)
                     Text59.setPadding(38,0,10,0)
                     Text60.setPadding(164,0,10,0)
                     Text245.setPadding(164,0,10,0)



                     tblrow35.addView(Text56)
                     tblrow35.addView(Text57)
                     tblrow35.addView(Text58)
                     tblrow35.addView(Text59)
                     tblrow35.addView(Text60)
                     tblrow35.addView(Text245)

                 }
                 if (x == 36) {


            var mes = x.toString()

            Text61.setText(mes).toString()

            var financiamentoTexto = String.format("%.2f",saldoDevedor)
            Text62.setText(financiamentoTexto).toString()

            var jurosTexto = String.format("%.2f",juros)
            Text63.setText(jurosTexto)

            var amortizacaoTexto = String.format("%.2f",amortizacao)
            Text64.setText(amortizacaoTexto)

            var prestacaoTexto = String.format("%.2f",prestacao)
            Text65.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text246.setText(econTexto)

                     Text61.setPadding(8,0,10,0)
                     Text62.setPadding(40,0,10,0)
                     Text63.setPadding(176,0,10,0)
                     Text64.setPadding(38,0,10,0)
                     Text65.setPadding(164,0,10,0)
                     Text246.setPadding(164,0,10,0)



                     tblrow36.addView(Text61)
                     tblrow36.addView(Text62)
                     tblrow36.addView(Text63)
                     tblrow36.addView(Text64)
                     tblrow36.addView(Text65)
                     tblrow36.addView(Text246)

                 }
                if (x == 37) {

                      var mes = x.toString()
                     Text66.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text67.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text68.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text69.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text70.setText(prestacaoTexto)

                    var econTexto = String.format("%.2f",econ)
                    Text247.setText(econTexto)

                    Text66.setPadding(8,0,10,0)
                    Text67.setPadding(40,0,10,0)
                    Text68.setPadding(176,0,10,0)
                    Text69.setPadding(38,0,10,0)
                    Text70.setPadding(164,0,10,0)
                    Text247.setPadding(164,0,10,0)




                    tblrow37.addView(Text66)
                     tblrow37.addView(Text67)
                     tblrow37.addView(Text68)
                     tblrow37.addView(Text69)
                     tblrow37.addView(Text70)
                    tblrow37.addView(Text247)

                }
                 if (x == 38) {


                    var mes = x.toString()

                     Text71.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text72.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text73.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text74.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text75.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text248.setText(econTexto)

                     Text71.setPadding(8,0,10,0)
                     Text72.setPadding(40,0,10,0)
                     Text73.setPadding(176,0,10,0)
                     Text74.setPadding(38,0,10,0)
                     Text75.setPadding(164,0,10,0)
                     Text248.setPadding(164,0,10,0)




                     tblrow38.addView(Text71)
                     tblrow38.addView(Text72)
                     tblrow38.addView(Text73)
                     tblrow38.addView(Text74)
                     tblrow38.addView(Text75)
                     tblrow38.addView(Text248)

                 }
                 if (x == 39) {

                 var mes = x.toString()
                     Text76.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text77.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text78.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text79.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text80.setText(prestacaoTexto)
                     
                     var econTexto = String.format("%.2f",econ)
                     Text249.setText(econTexto)


                     Text76.setPadding(8,0,10,0)
                     Text77.setPadding(40,0,10,0)
                     Text78.setPadding(176,0,10,0)
                     Text79.setPadding(38,0,10,0)
                     Text80.setPadding(164,0,10,0)
                     Text249.setPadding(164,0,10,0)



                     tblrow39.addView(Text76)
                     tblrow39.addView(Text77)
                     tblrow39.addView(Text78)
                     tblrow39.addView(Text79)
                     tblrow39.addView(Text80)
                     tblrow39.addView(Text249)

                 }
                 if (x == 40) {

                  var mes = x.toString()
                     Text81.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text82.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text83.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text84.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text85.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text250.setText(econTexto)


                     Text81.setPadding(8,0,10,0)
                     Text82.setPadding(40,0,10,0)
                     Text83.setPadding(176,0,10,0)
                     Text84.setPadding(38,0,10,0)
                     Text85.setPadding(164,0,10,0)
                     Text250.setPadding(164,0,10,0)



                     tblrow40.addView(Text81)
                     tblrow40.addView(Text82)
                     tblrow40.addView(Text83)
                     tblrow40.addView(Text84)
                     tblrow40.addView(Text85)
                     tblrow40.addView(Text250)

                 }
                 if (x == 41) {

                  var mes = x.toString()
                     Text86.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text87.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text88.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text89.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text90.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text251.setText(econTexto)

                     Text86.setPadding(8,0,10,0)
                     Text87.setPadding(40,0,10,0)
                     Text88.setPadding(176,0,10,0)
                     Text89.setPadding(38,0,10,0)
                     Text90.setPadding(164,0,10,0)
                     Text251.setPadding(164,0,10,0)

                     

                     tblrow41.addView(Text86)
                     tblrow41.addView(Text87)
                     tblrow41.addView(Text88)
                     tblrow41.addView(Text89)
                     tblrow41.addView(Text90)
                     tblrow41.addView(Text251)

                 }
                 if (x == 42) {

                 var mes = x.toString()
                     Text91.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text92.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text93.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text94.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text95.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text252.setText(econTexto)

                     Text91.setPadding(8,0,10,0)
                     Text92.setPadding(40,0,10,0)
                     Text93.setPadding(176,0,10,0)
                     Text94.setPadding(38,0,10,0)
                     Text95.setPadding(164,0,10,0)
                     Text252.setPadding(164,0,10,0)
                     


                     tblrow42.addView(Text91)
                     tblrow42.addView(Text92)
                     tblrow42.addView(Text93)
                     tblrow42.addView(Text94)
                     tblrow42.addView(Text95)
                     tblrow42.addView(Text252)

                 }
                if (x == 43) {

                  var mes = x.toString()
                     Text96.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text97.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text98.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text99.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text100.setText(prestacaoTexto)

                    var econTexto = String.format("%.2f",econ)
                    Text253.setText(econTexto)

                    Text96.setPadding(8,0,10,0)
                    Text97.setPadding(40,0,10,0)
                    Text98.setPadding(176,0,10,0)
                    Text99.setPadding(38,0,10,0)
                    Text100.setPadding(164,0,10,0)
                    Text253.setPadding(164,0,10,0)




                    tblrow43.addView(Text96)
                     tblrow43.addView(Text97)
                     tblrow43.addView(Text98)
                     tblrow43.addView(Text99)
                     tblrow43.addView(Text100)
                    tblrow43.addView(Text253)

                }
                 if (x == 44) {

                  var mes = x.toString()
                     Text101.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text102.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text103.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text104.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text105.setText(prestacaoTexto)

                     var econTexto = String.format("%.2f",econ)
                     Text254.setText(econTexto)

                     Text101.setPadding(8,0,10,0)
                     Text102.setPadding(40,0,10,0)
                     Text103.setPadding(176,0,10,0)
                     Text104.setPadding(38,0,10,0)
                     Text105.setPadding(164,0,10,0)
                     Text254.setPadding(164,0,10,0)




                     tblrow44.addView(Text101)
                     tblrow44.addView(Text102)
                     tblrow44.addView(Text103)
                     tblrow44.addView(Text104)
                     tblrow44.addView(Text105)
                     tblrow44.addView(Text254)

                 }
                if (x == 45) {

                  var mes = x.toString()
                     Text106.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text107.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text108.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text109.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text110.setText(prestacaoTexto)

                    var econTexto = String.format("%.2f",econ)
                    Text255.setText(econTexto)


                    Text106.setPadding(8,0,10,0)
                    Text107.setPadding(40,0,10,0)
                    Text108.setPadding(176,0,10,0)
                    Text109.setPadding(38,0,10,0)
                    Text110.setPadding(164,0,10,0)
                    Text255.setPadding(164,0,10,0)




                    tblrow45.addView(Text106)
                     tblrow45.addView(Text107)
                     tblrow45.addView(Text108)
                     tblrow45.addView(Text109)
                     tblrow45.addView(Text110)
                    tblrow45.addView(Text255)

                }
                if (x == 46) {

                 var mes = x.toString()
                     Text111.setText(mes).toString()

                     var financiamentoTexto = String.format("%.2f",saldoDevedor)
                     Text112.setText(financiamentoTexto).toString()

                     var jurosTexto = String.format("%.2f",juros)
                     Text113.setText(jurosTexto)

                     var amortizacaoTexto = String.format("%.2f",amortizacao)
                     Text114.setText(amortizacaoTexto)

                     var prestacaoTexto = String.format("%.2f",prestacao)
                     Text115.setText(prestacaoTexto)

                    var econTexto = String.format("%.2f",econ)
                    Text256.setText(econTexto)


                    Text111.setPadding(8,0,10,0)
                    Text112.setPadding(40,0,10,0)
                    Text113.setPadding(176,0,10,0)
                    Text114.setPadding(38,0,10,0)
                    Text115.setPadding(164,0,10,0)
                    Text256.setPadding(164,0,10,0)




                    tblrow46.addView(Text111)
                     tblrow46.addView(Text112)
                     tblrow46.addView(Text113)
                     tblrow46.addView(Text114)
                     tblrow46.addView(Text115)
                     tblrow46.addView(Text256)

                }
             if (x == 47) {

             var mes = x.toString()
                Text116.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text117.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text118.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text119.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text120.setText(prestacaoTexto)

                 var econTexto = String.format("%.2f",econ)
                 Text257.setText(econTexto)

                 Text116.setPadding(8,0,10,0)
                 Text117.setPadding(40,0,10,0)
                 Text118.setPadding(176,0,10,0)
                 Text119.setPadding(38,0,10,0)
                 Text120.setPadding(164,0,10,0)
                 Text257.setPadding(164,0,10,0)




                 tblrow47.addView(Text116)
                tblrow47.addView(Text117)
                tblrow47.addView(Text118)
                tblrow47.addView(Text119)
                tblrow47.addView(Text120)
                 tblrow47.addView(Text257)

             }
            if (x == 48) {

             var mes = x.toString()
                Text121.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text122.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text123.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text124.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text125.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text258.setText(econTexto)

                Text121.setPadding(8,0,10,0)
                Text122.setPadding(40,0,10,0)
                Text123.setPadding(176,0,10,0)
                Text124.setPadding(38,0,10,0)
                Text125.setPadding(164,0,10,0)
                Text258.setPadding(164,0,10,0)



                tblrow48.addView(Text121)
                tblrow48.addView(Text122)
                tblrow48.addView(Text123)
                tblrow48.addView(Text124)
                tblrow48.addView(Text125)
                tblrow48.addView(Text258)

            }
            if (x == 49) {

             var mes = x.toString()
                Text126.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text127.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text128.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text129.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text130.setText(prestacaoTexto)
                
                var econTexto = String.format("%.2f",econ)
                Text259.setText(econTexto)

                Text126.setPadding(8,0,10,0)
                Text127.setPadding(40,0,10,0)
                Text128.setPadding(176,0,10,0)
                Text129.setPadding(38,0,10,0)
                Text130.setPadding(164,0,10,0)
                Text259.setPadding(164,0,10,0)




                tblrow49.addView(Text126)
                tblrow49.addView(Text127)
                tblrow49.addView(Text128)
                tblrow49.addView(Text129)
                tblrow49.addView(Text130)
                tblrow49.addView(Text259)

            }
            if (x == 50) {


             var mes = x.toString()
                Text131.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text132.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text133.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text134.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text135.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text260.setText(econTexto)


                Text131.setPadding(8,0,10,0)
                Text132.setPadding(40,0,10,0)
                Text133.setPadding(176,0,10,0)
                Text134.setPadding(38,0,10,0)
                Text135.setPadding(164,0,10,0)
                Text260.setPadding(164,0,10,0)





                tblrow50.addView(Text131)
                tblrow50.addView(Text132)
                tblrow50.addView(Text133)
                tblrow50.addView(Text134)
                tblrow50.addView(Text135)
                tblrow50.addView(Text260)

            }
            if (x == 51) {
                var mes = x.toString()
                Text136.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text137.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text138.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text139.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text140.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text261.setText(econTexto)

                Text136.setPadding(8,0,10,0)
                Text137.setPadding(40,0,10,0)
                Text138.setPadding(176,0,10,0)
                Text139.setPadding(38,0,10,0)
                Text140.setPadding(164,0,10,0)
                Text261.setPadding(164,0,10,0)


                tblrow51.addView(Text136)
                tblrow51.addView(Text137)
                tblrow51.addView(Text138)
                tblrow51.addView(Text139)
                tblrow51.addView(Text140)
                tblrow51.addView(Text261)

            }
            if (x == 52) {
                var mes = x.toString()
                Text141.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text142.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text143.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text144.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text145.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text262.setText(econTexto)

                Text141.setPadding(8,0,10,0)
                Text142.setPadding(40,0,10,0)
                Text143.setPadding(176,0,10,0)
                Text144.setPadding(38,0,10,0)
                Text145.setPadding(164,0,10,0)
                Text262.setPadding(164,0,10,0)



                tblrow52.addView(Text141)
                tblrow52.addView(Text142)
                tblrow52.addView(Text143)
                tblrow52.addView(Text144)
                tblrow52.addView(Text145)
                tblrow52.addView(Text262)

            }
            if (x == 53) {

             var mes = x.toString()
                Text146.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text147.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text148.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text149.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text150.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text263.setText(econTexto)

                Text146.setPadding(8,0,10,0)
                Text147.setPadding(40,0,10,0)
                Text148.setPadding(176,0,10,0)
                Text149.setPadding(38,0,10,0)
                Text150.setPadding(164,0,10,0)
                Text263.setPadding(164,0,10,0)




                tblrow53.addView(Text146)
                tblrow53.addView(Text147)
                tblrow53.addView(Text148)
                tblrow53.addView(Text149)
                tblrow53.addView(Text150)
                tblrow53.addView(Text263)

            }


            if (x == 54) {

                var mes = x.toString()
                Text151.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text152.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text153.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text154.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text155.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text264.setText(econTexto)

                Text151.setPadding(8,0,10,0)
                Text152.setPadding(40,0,10,0)
                Text153.setPadding(176,0,10,0)
                Text154.setPadding(38,0,10,0)
                Text155.setPadding(164,0,10,0)
                Text264.setPadding(164,0,10,0)




                tblrow54.addView(Text151)
                tblrow54.addView(Text152)
                tblrow54.addView(Text153)
                tblrow54.addView(Text154)
                tblrow54.addView(Text155)
                tblrow54.addView(Text264)

            }
            if (x == 55) {

            var mes = x.toString()
                Text156.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text157.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text158.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text159.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text160.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text265.setText(econTexto)

                Text156.setPadding(8,0,10,0)
                Text157.setPadding(40,0,10,0)
                Text158.setPadding(176,0,10,0)
                Text159.setPadding(38,0,10,0)
                Text160.setPadding(164,0,10,0)
                Text265.setPadding(164,0,10,0)




                tblrow55.addView(Text156)
                tblrow55.addView(Text157)
                tblrow55.addView(Text158)
                tblrow55.addView(Text159)
                tblrow55.addView(Text160)
                tblrow55.addView(Text265)


            }
            if (x == 56) {

                  var mes = x.toString()
                Text161.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text162.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text163.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text164.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text165.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text266.setText(econTexto)

                Text161.setPadding(8,0,10,0)
                Text162.setPadding(40,0,10,0)
                Text163.setPadding(176,0,10,0)
                Text164.setPadding(38,0,10,0)
                Text165.setPadding(164,0,10,0)
                Text266.setPadding(164,0,10,0)



                tblrow56.addView(Text161)
                tblrow56.addView(Text162)
                tblrow56.addView(Text163)
                tblrow56.addView(Text164)
                tblrow56.addView(Text165)
                tblrow56.addView(Text266)

            }
            if (x == 57) {


                var mes = x.toString()
                Text166.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text167.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text168.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text169.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text170.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text267.setText(econTexto)

                Text166.setPadding(8,0,10,0)
                Text167.setPadding(40,0,10,0)
                Text168.setPadding(176,0,10,0)
                Text169.setPadding(38,0,10,0)
                Text170.setPadding(164,0,10,0)
                Text267.setPadding(164,0,10,0)




                tblrow57.addView(Text166)
                tblrow57.addView(Text167)
                tblrow57.addView(Text168)
                tblrow57.addView(Text169)
                tblrow57.addView(Text170)
                tblrow57.addView(Text267)

            }
            if (x == 58) {

                var mes = x.toString()
                Text171.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text172.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text173.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text174.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text175.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text268.setText(econTexto)

                Text171.setPadding(8,0,10,0)
                Text172.setPadding(40,0,10,0)
                Text173.setPadding(176,0,10,0)
                Text174.setPadding(38,0,10,0)
                Text175.setPadding(164,0,10,0)
                Text268.setPadding(164,0,10,0)



                tblrow58.addView(Text171)
                tblrow58.addView(Text172)
                tblrow58.addView(Text173)
                tblrow58.addView(Text174)
                tblrow58.addView(Text175)
                tblrow58.addView(Text268)

            }
            if (x == 59) {
                var mes = x.toString()
                Text176.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text177.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text178.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text179.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text180.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text269.setText(econTexto)

                Text176.setPadding(8,0,10,0)
                Text177.setPadding(40,0,10,0)
                Text178.setPadding(176,0,10,0)
                Text179.setPadding(38,0,10,0)
                Text180.setPadding(164,0,10,0)
                Text269.setPadding(164,0,10,0)



                tblrow59.addView(Text176)
                tblrow59.addView(Text177)
                tblrow59.addView(Text178)
                tblrow59.addView(Text179)
                tblrow59.addView(Text180)
                tblrow59.addView(Text269)

            }
            if (x == 60) {
                var mes = x.toString()
                Text181.setText(mes).toString()

                var financiamentoTexto = String.format("%.2f",saldoDevedor)
                Text182.setText(financiamentoTexto).toString()

                var jurosTexto = String.format("%.2f",juros)
                Text183.setText(jurosTexto)

                var amortizacaoTexto = String.format("%.2f",amortizacao)
                Text184.setText(amortizacaoTexto)

                var prestacaoTexto = String.format("%.2f",prestacao)
                Text185.setText(prestacaoTexto)

                var econTexto = String.format("%.2f",econ)
                Text270.setText(econTexto)

                Text181.setPadding(8,0,10,0)
                Text182.setPadding(40,0,10,0)
                Text183.setPadding(176,0,10,0)
                Text184.setPadding(38,0,10,0)
                Text185.setPadding(164,0,10,0)
                Text270.setPadding(164,0,10,0)



                tblrow60.addView(Text181)
                tblrow60.addView(Text182)
                tblrow60.addView(Text183)
                tblrow60.addView(Text184)
                tblrow60.addView(Text185)
                tblrow60.addView(Text270)


            }

            saldoDevedor = saldoDevedor - amortizacao

        }
        tbl.addView(tblrow26)
        tbl.addView(tblrow27)
        tbl.addView(tblrow28)
        tbl.addView(tblrow29)
        tbl.addView(tblrow30)
        tbl.addView(tblrow31)
        tbl.addView(tblrow32)
        tbl.addView(tblrow33)
        tbl.addView(tblrow34)
        tbl.addView(tblrow35)
        tbl.addView(tblrow36)
        tbl.addView(tblrow37)
        tbl.addView(tblrow38)
        tbl.addView(tblrow39)
        tbl.addView(tblrow40)
        tbl.addView(tblrow41)
        tbl.addView(tblrow42)
        tbl.addView(tblrow43)
        tbl.addView(tblrow44)
        tbl.addView(tblrow45)
        tbl.addView(tblrow46)
        tbl.addView(tblrow47)
        tbl.addView(tblrow48)
        tbl.addView(tblrow49)
        tbl.addView(tblrow50)
        tbl.addView(tblrow51)
        tbl.addView(tblrow52)
        tbl.addView(tblrow53)
        tbl.addView(tblrow54)
        tbl.addView(tblrow55)
        tbl.addView(tblrow56)
        tbl.addView(tblrow57)
        tbl.addView(tblrow58)
        tbl.addView(tblrow59)
        tbl.addView(tblrow60)




       scrollView.addView(tbl)

        Toast.makeText(this, "Vire o celular para melhor vizualização", Toast.LENGTH_LONG).show()

    }


}