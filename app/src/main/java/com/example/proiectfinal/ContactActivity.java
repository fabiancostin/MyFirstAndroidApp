package com.example.proiectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactActivity extends AppCompatActivity {

    private EditText eSubject, eMessage;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        eSubject = (EditText)findViewById(R.id.editTextTextEmailSubject);
        eMessage = (EditText)findViewById(R.id.editTextTextMultiLine);
        btn = (Button)findViewById(R.id.btn_trimite);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_SEND);
                it.putExtra(Intent.EXTRA_EMAIL, new
                        String[]{"dmateinfo@upit.ro"});
                it.putExtra(Intent.EXTRA_SUBJECT,eSubject.getText().toString());
                it.putExtra(Intent.EXTRA_TEXT,eMessage.getText());
                it.setType("message/rfc822");
                startActivity(Intent.createChooser(it,"Alege aplicatia pentru a trimite mail-ul"));
            }
        });
    }
}