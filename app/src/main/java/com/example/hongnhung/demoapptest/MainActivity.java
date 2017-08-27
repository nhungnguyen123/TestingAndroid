package com.example.hongnhung.demoapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtEmail;
    EditText edtPass;
    TextView txtMessge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=(Button)findViewById(R.id.loginButton);
        edtEmail=(EditText)findViewById(R.id.emailEdit);
        edtPass=(EditText)findViewById(R.id.passEdit);
        txtMessge=(TextView)findViewById(R.id.txtMessage);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = edtPass.getText().toString();
                if(pass.length()<4){
                    txtMessge.setText("Bad Password");
                    txtMessge.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}
