package com.mehmetdolasan.instagramcloneparseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.Parse;

public class SignUpActivity extends AppCompatActivity {

    EditText usernameText,passwordText;
    Button signIn,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        usernameText = findViewById(R.id.sign_up_activity_name_text);
        passwordText = findViewById(R.id.sign_up_activity_password_text);

        signIn = findViewById(R.id.sign_up_activity_sign_in_button);
        signUp = findViewById(R.id.sign_up_activity_sign_up_button);


    }

    public void signIn(View view){

    }

    public void signUp(View view){

    }
}
