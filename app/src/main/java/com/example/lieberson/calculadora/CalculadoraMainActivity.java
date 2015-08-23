package com.example.lieberson.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CalculadoraMainActivity extends ActionBarActivity {

    TextView textOperacao;
    TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_main);

        textOperacao = (TextView) findViewById(R.id.text_operacao);
        textOperacao.setText(" ");

        textResult = (TextView) findViewById(R.id.text_resultado);
        textResult.setText(" ");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora_main, menu);
        return true;
    }

    public void clickOne(View view){

        textOperacao.append("1");
    }

    public void clickTwo(View view){

        textOperacao.append("2");
    }

    public void clickThree(View view){

        textOperacao.append("3");
    }

    public void clickPlus(View view){

        textOperacao.append("+");
    }

    public void clickFour(View view){

        textOperacao.append("4");
    }

    public void clickFive(View view){

        textOperacao.append("5");
    }

    public void clickSix(View view){

        textOperacao.append("6");
    }

    public void clickSubtract(View view){

        textOperacao.append("-");
    }

    public void clickSeven(View view){

        textOperacao.append("7");
    }

    public void clickEight(View view){

        textOperacao.append("8");
    }

    public void clickNine(View view){

        textOperacao.append("9");
    }

    public void clickMultiply(View view){

        textOperacao.append("x");
    }

    public void clickZero(View view){

        textOperacao.append("0");
    }

    public void clickDivide(View view){

        textOperacao.append("/");
    }

    public void clickClear(View view){

        textOperacao.setText("");
        textResult.setText("");
    }

    public void clickResult(View view){

        String operacao = textOperacao.getText().toString();
        String[] componentes = operacao.split(" ");

        double numero1 = (double) Integer.parseInt(componentes[0]);
        String sinal = componentes[1];

        double numero2 = (double) Integer.parseInt(componentes[2]);

        if(sinal.equals("+"))
            textResult.setText( String.format("%.0f", (numero1 + numero2)));

        if(sinal.equals("-"))
            textResult.setText( String.format("%.0f", (numero1 - numero2)));

        if (sinal.equals("x"))
            textResult.setText( String.format("%.0f",(numero1 * numero2)));

        if (sinal.equals("/")){
            if (numero1 % numero2 != 0)
                textResult.setText( String.format("%.2f",(numero1 / numero2)));
            else textResult.setText( String.format("%.0f", (numero1 / numero2)));
        }

        else textResult.setText("Operação não reconhecida");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
