package com.siddhantkushwaha.www.demo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {

    ProgressBar progressBar;
    EditText editTextEmail, editTextPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextEmail = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.login_progress);

        mAuth = FirebaseAuth.getInstance();
//
//        findViewById(R.id.email_sign_up_button).setOnClickListener(this);
//        findViewById(R.id.email_sign_in_button).setOnClickListener(this);

    }

//    private void registerUser() {
//        String email = editTextEmail.getText().toString().trim();
//        String password = editTextPassword.getText().toString().trim();
//
//        if (email.isEmpty()) {
//            editTextEmail.setError("Email is required");
//            editTextEmail.requestFocus();
//            return;
//        }
//
//        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//            editTextEmail.setError("Please enter a valid email");
//            editTextEmail.requestFocus();
//            return;
//        }
//
//        if (password.isEmpty()) {
//            editTextPassword.setError("Password is required");
//            editTextPassword.requestFocus();
//            return;
//        }
//
//        if (password.length() < 6) {
//            editTextPassword.setError("Minimum length of password should be 6");
//            editTextPassword.requestFocus();
//            return;
//        }
//
//        progressBar.setVisibility(View.VISIBLE);
//        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                progressBar.setVisibility(View.GONE);
//                if (task.isSuccessful()) {
//                    finish();
//                    startActivity(new Intent(Signup.this, MainActivity.class));
//                } else {
//                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
//                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();
//                    } else {
//                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.email_sign_up_button:
//                registerUser();
//                break;
//            case R.id.email_sign_in_button:
//                finish();
//                startActivity(new Intent(this, MainActivity.class));
//                break;
//        }
//    }

//    public void GoToLoginPage(View view){
//        //////////////// Photo - > name of the activity to which it will jump
//
//        Intent i = new Intent(this, Login.class);
////        ///      id of thefield whose fdata is to be send   is editText2
////        final TextView user_email = (TextView)findViewById(R.id.email);
////        String userMessage=user_email.getText().toString();
////        i.putExtra("sndMessage", userMessage);
//
//        startActivity(i);
//    }
}