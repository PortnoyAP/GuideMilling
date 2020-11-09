package com.example.guidemilling;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.myTechnology.MyTechnologySelector;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {

    private EditText eMail;
    private EditText password;

    private Button logIn;
    private Button newUser;

    private Button start;
    private Button logOut;

    private TextView userEmail;
    private TextView passwordAnnotation;
    private TextView forgotPassword;

    private FirebaseAuth myAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        Intent intent =new Intent(this, MyTechnologySelector.class);
//        startActivity(intent );


        init();

    }

    public void init() {
        myAuth = FirebaseAuth.getInstance();
        userEmail = findViewById(R.id.tv_user_mail);

        eMail = findViewById(R.id.ed_email);
        password = findViewById(R.id.ed_password);
        forgotPassword=findViewById(R.id.tv_reset_password);

        newUser = findViewById(R.id.button__signUp);
        logIn = findViewById(R.id.button_logIn);

        start = findViewById(R.id.buttonStart);
        logOut = findViewById(R.id.buttonLogOut);


        passwordAnnotation=findViewById(R.id.tv_password_annotation);


    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = myAuth.getCurrentUser();

        if (currentUser != null) {
            showIfSigned();
            String userName = currentUser.getEmail();
            userEmail.setText(userName);
            userEmail.setVisibility(View.VISIBLE);

        } else {
            showIfSignOut();
            Toast.makeText(this, "Enter Email & Password", Toast.LENGTH_SHORT).show();
        }

    }

    //
    public void onClickCreateNewUser(View view) {
        if (!TextUtils.isEmpty(eMail.getText().toString()) && !TextUtils.isEmpty(password.getText().toString())) {

            myAuth.createUserWithEmailAndPassword(eMail.getText().toString(), password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(LoginActivity.this, "User Registered ", Toast.LENGTH_SHORT).show();
                        showIfSigned();

                    } else {
                        Toast.makeText(LoginActivity.this, "REGISTRATION FAILED", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        } else {
            Toast.makeText(this, "Enter email+password", Toast.LENGTH_SHORT).show();
        }

    }

    //
    public void onClickLogIN(View view) {

        if (!TextUtils.isEmpty(eMail.getText().toString()) && !TextUtils.isEmpty(password.getText().toString())) {

            myAuth.signInWithEmailAndPassword(eMail.getText().toString(), password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(LoginActivity.this, "User SignIN Successful", Toast.LENGTH_LONG).show();
                        showIfSigned();
                    } else {
                        Toast.makeText(LoginActivity.this, "Retry or Create new User", Toast.LENGTH_LONG).show();

                    }
                }
            });
        }
    }

    public void onClickLogOut(View view) {

        FirebaseAuth.getInstance().signOut();
        showIfSignOut();

    }

    public void showIfSigned() {
        eMail.setVisibility(View.INVISIBLE);
        password.setVisibility(View.INVISIBLE);
        newUser.setVisibility(View.INVISIBLE);
        logIn.setVisibility(View.INVISIBLE);
        passwordAnnotation.setVisibility(View.INVISIBLE);
        forgotPassword.setVisibility(View.INVISIBLE);

        start.setVisibility(View.VISIBLE);
        logOut.setVisibility(View.VISIBLE);

    }

    public void showIfSignOut() {
        eMail.setVisibility(View.VISIBLE);
        password.setVisibility(View.VISIBLE);
        logIn.setVisibility(View.VISIBLE);
        newUser.setVisibility(View.VISIBLE);
        forgotPassword.setVisibility(View.VISIBLE);
        passwordAnnotation.setVisibility(View.VISIBLE);

        start.setVisibility(View.INVISIBLE);
        logOut.setVisibility(View.INVISIBLE);
        userEmail.setVisibility(View.INVISIBLE);

    }

    public void moveToOptionSelectorScreen(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);

    }

    public void getNewPassword(View view) {

        final EditText resetMail=new EditText(view.getContext());
        final AlertDialog.Builder passwordResetDialog=new AlertDialog.Builder(view.getContext());
        passwordResetDialog.setTitle("Reset password ?");
        passwordResetDialog.setMessage("Enter your Email to received reset link");
        passwordResetDialog.setView(resetMail);

        passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String email=resetMail.getText().toString();
                myAuth.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(LoginActivity.this, "Reset Link sent to your Email", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(LoginActivity.this, "Error! Link is not sent!"+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
        passwordResetDialog.show();
    }
}

