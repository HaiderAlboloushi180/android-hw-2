package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button email = findViewById(R.id.emailButton);
        Button call = findViewById(R.id.callButton);
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

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + emailClaimed));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "body");

                startActivity(Intent.createChooser(emailIntent, "Chooser Title"));            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneClaimed));
                startActivity(intent);
            }
        });

    }
}