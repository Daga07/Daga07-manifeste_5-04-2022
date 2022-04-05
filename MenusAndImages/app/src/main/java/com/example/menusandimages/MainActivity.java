package com.example.menusandimages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.menusandimages.fragments.BlankFragmentA;
import com.example.menusandimages.fragments.BlankFragmentB;

public class MainActivity extends AppCompatActivity {

    //FragmentManager fragmentManager;
    //FragmentTransaction  fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragmentManager = getSupportFragmentManager();
        //fragmentTransaction = fragmentManager.beginTransaction();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.initial_menu,menu);
        return true;
    }

    public void cambiarFragmentos(int option){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (option == 1){
            //fragmentTransaction.replace(R.id.contenedor, null);
            BlankFragmentA fa =  new BlankFragmentA();
            //BlankFragmentA fa = BlankFragmentA.newInstance('a','b');
            fragmentTransaction.replace(R.id.contenedor, fa);
            fragmentTransaction.commit();
        }else if(option == 2){
            //fragmentTransaction.replace(R.id.contenedor, null);
            BlankFragmentB fb =  new BlankFragmentB();
            fragmentTransaction.replace(R.id.contenedor, fb);
            fragmentTransaction.commit();
        }else {
            Toast.makeText(this, "nada por hacer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.acudientes:
                //Toast.makeText(this, "acudientes", Toast.LENGTH_SHORT).show();
                cambiarFragmentos(1);
               break;
            case R.id.estudiantes:
                //Toast.makeText(this, "estudiantes", Toast.LENGTH_SHORT).show();
                cambiarFragmentos(2);
                break;
            case R.id.profesores:
                //Toast.makeText(this, "profesores", Toast.LENGTH_SHORT).show();
                cambiarFragmentos(3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}