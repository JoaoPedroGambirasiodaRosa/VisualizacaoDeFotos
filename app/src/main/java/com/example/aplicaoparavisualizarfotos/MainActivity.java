package com.example.aplicaoparavisualizarfotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;


public class MainActivity extends Activity {
    ImageView imgfoto;
    Button btfoto1, btfoto2;
    TextView txtinformacao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = (ImageView) findViewById(R.id.imgFoto);

        btfoto1 = (Button) findViewById(R.id.btFoto1);
        btfoto2 = (Button) findViewById(R.id.btFoto2);
        txtinformacao = (TextView) findViewById(R.id.txtInfromacao);
        btfoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.img);
                txtinformacao.setText("Foto 1");
            } });
        btfoto1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.img_1);
                txtinformacao.setText("Foto 2");

            } }); } }