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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * --------Testing Account--------
 * |  Username : Test@test.test  |
 * |  Password : testtest        |
 * -------------------------------
 **/

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout eMail, password;
    private Button logIn, newUser, start, logOut;
    private TextView userEmail, forgotPassword;
    private FirebaseAuth myAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init() {
        eMail = findViewById(R.id.ed_email);
        password = findViewById(R.id.ed_password);

        logIn = findViewById(R.id.button_logIn);
        newUser = findViewById(R.id.button__signUp);
        start = findViewById(R.id.buttonStart);
        logOut = findViewById(R.id.buttonLogOut);

        userEmail = findViewById(R.id.tv_user_mail);
        forgotPassword = findViewById(R.id.tv_reset_password);

        myAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = myAuth.getCurrentUser();
        showIfSigned();

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

    public void onClickCreateNewUser(View view) {
        if (!TextUtils.isEmpty(eMail.getEditText().getText().toString()) && !TextUtils.isEmpty(password.getEditText().getText().toString())) {

            myAuth.createUserWithEmailAndPassword(eMail.getEditText().getText().toString(),
                    password.getEditText().getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
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

    public void onClickLogIN(View view) {
        if (!TextUtils.isEmpty(eMail.getEditText().getText().toString().trim()) && !TextUtils.isEmpty(password.getEditText().getText().toString().trim())) {

            myAuth.signInWithEmailAndPassword(eMail.getEditText().getText().toString(),
                    password.getEditText().getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
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
        logIn.setVisibility(View.INVISIBLE);
        newUser.setVisibility(View.INVISIBLE);
        start.setVisibility(View.VISIBLE);
        logOut.setVisibility(View.VISIBLE);
        forgotPassword.setVisibility(View.INVISIBLE);
    }

    public void showIfSignOut() {
        eMail.setVisibility(View.VISIBLE);
        password.setVisibility(View.VISIBLE);
        logIn.setVisibility(View.VISIBLE);
        newUser.setVisibility(View.VISIBLE);
        start.setVisibility(View.INVISIBLE);
        logOut.setVisibility(View.INVISIBLE);
        userEmail.setVisibility(View.INVISIBLE);
        forgotPassword.setVisibility(View.VISIBLE);
    }

    public void moveToOptionSelectorScreen(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void getNewPassword(View view) {
        final EditText resetMail = new EditText(view.getContext());
        final AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(view.getContext());
        passwordResetDialog.setTitle("Reset password ?");
        passwordResetDialog.setMessage("Enter your Email to received reset link");
        passwordResetDialog.setView(resetMail);

        passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String email = resetMail.getText().toString();
                myAuth.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(LoginActivity.this, "Reset Link sent to your Email", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(LoginActivity.this, "Error! Link is not sent!" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        passwordResetDialog.show();
    }
}

