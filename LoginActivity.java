package com.example.ui_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.Menu;



import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity  extends AppCompatActivity {
    EditText edtEmail, edtPassword;
    Button btnLogin;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //tiến hành ánh xạ
        edtEmail = (EditText)findViewById(R.id.editTextTextEmailAddressLogin);
        edtPassword = (EditText)findViewById(R.id.editTextTextPasswordLogin);
        btnLogin = (Button) findViewById(R.id.buttonLogin);

        //phát sinh sự kiện OnClick

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "anhuynh";
                String password = "123456";
                if (edtEmail.getText().toString().equals(email) && edtPassword.getText().toString().equals(password)){
                    Intent mh2 = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(mh2);
                }
            }
        });
    }
}
