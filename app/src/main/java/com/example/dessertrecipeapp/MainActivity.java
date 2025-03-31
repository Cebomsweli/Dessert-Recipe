package com.example.dessertrecipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Add action event to btn_peanut_butter_cake
        Button btnNext = findViewById(R.id.btn_peanut_butter_cake);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("TEXT_KEY", "Peanut Butter Cake"); // Sending text data
                intent.putExtra("IMAGE_KEY", R.drawable.peanut_butter_cookies); // Sending image resource ID
                startActivity(intent);
            }
        });

        //Add action event to btn_fruit_salad
        Button btnFruit =findViewById(R.id.btn_fruit_salad);
        btnFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("TEXT_KEY", "Fruit Salad"); // Sending text data
                intent.putExtra("IMAGE_KEY", R.drawable.fruit_salard); // Sending image resource ID
                startActivity(intent);

            }
        });

        //Adds action to btn_berry_sorbet
        Button btnBerry=findViewById(R.id.btn_berry_sorbet);
        btnBerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("TEXT_KEY", "Berry Sorbet"); // Sending text data
                intent.putExtra("IMAGE_KEY", R.drawable.berry_sobert); // Sending image resource ID
                startActivity(intent);

            }
        });

        //Adds action to btn_banana_pudding
        Button btnBanana=findViewById(R.id.btn_banana_pudding);
        btnBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("TEXT_KEY", "Banana Pudding"); // Sending text data
                intent.putExtra("IMAGE_KEY", R.drawable.banana_pudding); // Sending image resource ID
                startActivity(intent);

            }
        });


    }
}