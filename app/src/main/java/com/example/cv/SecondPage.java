package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        TextView nameText  = findViewById(R.id.name);
        TextView ageText   = findViewById(R.id.age);
        TextView jobText   = findViewById(R.id.job);
        TextView phoneText = findViewById(R.id.phone);
        TextView emailText = findViewById(R.id.email);
        Bundle claim = getIntent().getExtras();

        String nameClaimed  = claim.getString("name");
        String ageClaimed   = claim.getString("age");
        String jobClaimed   = claim.getString("job");
        String phoneClaimed = claim.getString("phone");
        String emailClaimed = claim.getString("email");

        nameText.setText(nameClaimed);
        ageText.setText(ageClaimed);
        jobText.setText(jobClaimed);
        phoneText.setText(phoneClaimed);
        emailText.setText(emailClaimed);

    }
}