package com.sabre.avfm.airfaresmanager.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.sabre.avfm.airfaresmanager.R;
import com.sabre.avfm.airfaresmanager.api.RestApiActivity;

public class MainActivity extends AppCompatActivity {

    EditText userId, password;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.button);
        userId = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editPass);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = userId.getText().toString();
                String pass = password.getText().toString();
                if ("abc".equals(id) && "123".equals(pass)){
                    Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), RestApiActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
