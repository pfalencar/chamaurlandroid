package com.androidjava.pa.chamaurl;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovoCapitulo (View view) {

        final int min = 1;
        final int max = 150;
        int numcapitulo = new Random().nextInt((max - min) + 1) + min;
        String url = "https://www.wordproject.org/bibles/po/19/" + numcapitulo + ".htm";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}
