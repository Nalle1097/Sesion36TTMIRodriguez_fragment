package com.example.sesion36ttmirodriguez_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity { //inicia clase
    public Button primetBoton,segundoBoton,tercerBoton;//dos variables objeto que identifican botones de accion

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //integracion de componentes Java-XML
        primetBoton=findViewById(R.id.btnfirst);
        segundoBoton=findViewById(R.id.btnfirst);
        tercerBoton=findViewById(R.id.btnfirst)

        //programacion del primer boton para llamar o invocar primer fragmnet
        primetBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//inicia metodo
                FragmentManager fManager = getSupportFragmentManager();//manejador de fragments
                FragmentTransaction fTrans=fManager.beginTransaction();//transiciones cambios
                fTrans.replace(R.id.fragment,new FirstFragment());//Reemplazar componente
                fTrans.commit();//confirmacion
            }//termina metodo
        });

        //programacion del SEGUNDO boton para llamar o invocar SEGUNDO fragmnet
        segundoBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//inicia metodo
                FragmentManager fManager = getSupportFragmentManager();//manejador de fragments
                FragmentTransaction fTrans=fManager.beginTransaction();//transiciones cambios
                fTrans.replace(R.id.fragment,new SecondFragment());//Reemplazar componente
                fTrans.commit();//confirmacion
            }//termina metodo
        });



    }//termina metodo onCreate

}//termina clase