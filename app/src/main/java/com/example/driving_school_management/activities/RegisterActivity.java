package com.example.driving_school_management.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.driving_school_management.Database;
import com.example.driving_school_management.R;
import com.example.driving_school_management.Teacher;

public class RegisterActivity extends AppCompatActivity {

    private EditText idEditText;
    private EditText firstName;
    private EditText lastName;
    private EditText phoneNumber;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;
    private EditText region;
    private Button registerButton;
    private static Teacher registeredTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        idEditText = findViewById(R.id.idEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(idEditText.getText().toString());
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                //add a new teacher to the database/storage
                Database.registerTeacher(id, password, confirmPassword);


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
