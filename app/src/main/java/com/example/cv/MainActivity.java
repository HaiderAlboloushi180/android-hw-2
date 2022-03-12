package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText enterName  = findViewById(R.id.name);
        EditText enterAge   = findViewById(R.id.age);
        EditText enterJob   = findViewById(R.id.job);
        EditText enterPhone = findViewById(R.id.phone);
        EditText enterEmail = findViewById(R.id.email);

        Button nextPage = findViewById(R.id.next);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ticket = new Intent(MainActivity.this, SecondPage.class);

                String nameEntered  = enterName.getText().toString();
                String ageEntered   = enterAge.getText().toString();
                String jobEntered   = enterJob.getText().toString();
                String phoneEntered = enterPhone.getText().toString();
                String emailEntered = enterEmail.getText().toString();

                ticket.putExtra("name", nameEntered);
                ticket.putExtra("age", ageEntered);
                ticket.putExtra("job", jobEntered);
                ticket.putExtra("phone", phoneEntered);
                ticket.putExtra("email", emailEntered);

                if (nameEntered == null || nameEntered.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter any missing info", Toast.LENGTH_SHORT).show();
                } else if (ageEntered == null || ageEntered.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter any missing info", Toast.LENGTH_SHORT).show();
                } else if (jobEntered == null || jobEntered.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter any missing info", Toast.LENGTH_SHORT).show();
                } else if (phoneEntered == null || phoneEntered.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter any missing info", Toast.LENGTH_SHORT).show();
                } else if (emailEntered == null || emailEntered.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter any missing info", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(ticket);
                }
            }
        });

    }
}