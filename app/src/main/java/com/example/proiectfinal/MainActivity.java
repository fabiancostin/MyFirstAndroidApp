package com.example.proiectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardMat, cardGal, cardWeb, cardCont, cardMap, cardLog;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        cardMap = (CardView) findViewById(R.id.cardHarta);
        cardMat = (CardView) findViewById(R.id.cardMaterii);
        cardCont = (CardView) findViewById(R.id.cardContact);
        cardGal = (CardView) findViewById(R.id.cardTask);
        cardWeb = (CardView) findViewById(R.id.cardPagina);
        cardLog = (CardView) findViewById(R.id.cardLogout);

        cardMap.setOnClickListener(this);
        cardLog.setOnClickListener(this);
        cardWeb.setOnClickListener(this);
        cardGal.setOnClickListener(this);
        cardCont.setOnClickListener(this);
        cardMat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId())
        {
            case R.id.cardHarta:
                i = new Intent(this,HartaActivity.class);
                startActivity(i);
                break;
            case R.id.cardMaterii:
                i = new Intent(this,MateriiActivity.class);
                startActivity(i);
                break;
            case R.id.cardTask:
                i = new Intent(this, TaskActivity.class);
                startActivity(i);
                break;
            case R.id.cardPagina:
                i = new Intent(this,WebActivity.class);
                startActivity(i);
                break;
            case R.id.cardContact:
                i = new Intent(this,ContactActivity.class);
                startActivity(i);
                break;
            // !TO-DO: LOG-OUT CASE
            case R.id.cardLogout:
                mAuth.signOut();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user==null)
        {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }
}