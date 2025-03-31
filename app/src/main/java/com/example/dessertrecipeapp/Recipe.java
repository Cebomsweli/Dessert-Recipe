package com.example.dessertrecipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Get the references to the TextViews
        TextView dessertNameView = findViewById(R.id.textViewDessertName);
        TextView ingredientsHeaderView = findViewById(R.id.textViewIngredientsHeader);
        TextView directionsHeaderView = findViewById(R.id.textViewDirectionsHeader);
        TextView ingredient1View = findViewById(R.id.textViewIngredient1);
        TextView ingredient2View = findViewById(R.id.textViewIngredient2);
        TextView ingredient3View = findViewById(R.id.textViewIngredient3);
        TextView ingredient4View = findViewById(R.id.textViewIngredient4);
        TextView direction1View = findViewById(R.id.textViewDirection1);
        TextView direction2View = findViewById(R.id.textViewDirection2);
        TextView direction3View = findViewById(R.id.textViewDirection3);
        TextView direction4View = findViewById(R.id.textViewDirection4);

        // Get the data passed from Second activity
        Intent intent = getIntent();
        String dessertName = intent.getStringExtra("dessertName");
        String[] ingredients = intent.getStringArrayExtra("ingredients");
        String[] instructions = intent.getStringArrayExtra("instructions");

        // Set the dessert name dynamically
        dessertNameView.setText(dessertName);

        // Set the ingredients dynamically
        if (ingredients != null) {
            ingredient1View.setText("1. " + ingredients[0]);
            ingredient2View.setText("2. " + ingredients[1]);
            ingredient3View.setText("3. " + ingredients[2]);
            ingredient4View.setText("4. " + ingredients[3]);
        }

        // Set the instructions dynamically
        if (instructions != null) {
            direction1View.setText("1. " + instructions[0]);
            direction2View.setText("2. " + instructions[1]);
            direction3View.setText("3. " + instructions[2]);
            direction4View.setText("4. " + instructions[3]);
        }

        //Finish Button
        Button btnFinish = findViewById(R.id.buttonFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Recipe.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}

