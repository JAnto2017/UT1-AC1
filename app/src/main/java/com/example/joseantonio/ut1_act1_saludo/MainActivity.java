package com.example.joseantonio.ut1_act1_saludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eTxt;
    Button btn_1, btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTxt = (EditText)findViewById(R.id.editTxt1);
        btn_1= (Button)findViewById(R.id.btn1);
        btn_2= (Button)findViewById(R.id.btn2);

    }

    //-----------------------------------------------------------
    /** Métdo asociado al Button=Saludar **/
    public void BotonSaludar(View view){

        String mensaje;

        mensaje = eTxt.getText().toString();
        int n = 0;
        n = mensaje.compareTo("");

        if (n==0){
            Toast.makeText(this,"Error campo nombre vacio",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Hola "+mensaje,Toast.LENGTH_SHORT).show();
        }
    }

    //-----------------------------------------------------------
    public void BotonLimpiar(View view){

        eTxt.setText("");
    }
}
