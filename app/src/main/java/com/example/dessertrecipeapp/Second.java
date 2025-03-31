package com.example.dessertrecipeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find views by ID
        TextView dessertView = findViewById(R.id.textView2);
        ImageView imageView = findViewById(R.id.imageView);

        // Get data from Intent
        Intent intent = getIntent();
        if (intent != null) {
            String text = intent.getStringExtra("TEXT_KEY");
            int imageResId = intent.getIntExtra("IMAGE_KEY", 0);

            // Set values
            if (text != null) {
                dessertView.setText(text);
            }
            if (imageResId != 0) {
                imageView.setImageResource(imageResId);
            }
        }

        // Enabling the button to go to the recipe page
        Button btnViewRecipes = findViewById(R.id.btnViewRecipes);
        btnViewRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dessertName = dessertView.getText().toString();
                Intent intent1 = new Intent(Second.this, Recipe.class);

                // Sending the dessert name
                intent1.putExtra("dessertName", dessertName);

                // Example: Setting ingredients based on dessert
                if (dessertName.equalsIgnoreCase("Fruit Salad")) {
                    intent1.putExtra("ingredients", new String[]{
                            "Fresh strawberries",
                            "Pineapple chunks",
                            "Whipped cream",
                            "Honey"
                    });

                    intent1.putExtra("instructions", new String[]{
                            "Wash and slice the strawberries.",
                            "Cut the pineapple into small chunks.",
                            "Mix the fruits in a bowl.",
                            "Top with whipped cream and honey."
                    });
                } else if (dessertName.equalsIgnoreCase("Banana Pudding")) {
                    intent1.putExtra("ingredients", new String[]{
                            "Sliced bananas",
                            "Vanilla pudding mix",
                            "Whipped cream",
                            "Nilla wafers"
                    });

                    intent1.putExtra("instructions", new String[]{
                            "Whisk sugar, cornstarch, salt, and milk in a saucepan. Cook until thickened and boil. Stir in vanilla.",
                            "Layer vanilla wafer cookies and banana slices in a dish.",
                            "the pudding over the layers. Repeat layers until ingredients are used.",
                            " Refrigerate for 2 hours. Serve chilled with whipped cream or extra banana slices."
                    });
                }

                //Berry Sorbet Recipe
                else if (dessertName.equalsIgnoreCase("Berry Sorbet")) {
                    intent1.putExtra("ingredients", new String[]{
                            " Frozen mixed berries",
                            "Granulated sugar",
                            "Lemon juice",
                            "Water"
                    });

                    intent1.putExtra("instructions", new String[]{
                            "Blend the Berries: Puree your choice of berries (strawberries, raspberries, blueberries) in a blender.",
                            "Mix with Sugar and Lemon: Combine the berry puree with sugar and lemon juice, and stir until sugar dissolves.",
                            "Chill the Mixture: Pour the mixture into an ice cream maker or a shallow dish and freeze.",
                            "Serve: Once frozen, scoop into bowls and enjoy!"
                    });
                }

                //Peanut Butter Cake Recipe
                else if (dessertName.equalsIgnoreCase("Peanut Butter Cake")) {
                    intent1.putExtra("ingredients", new String[]{
                            " Peanut butter",
                            " All-purpose flour",
                            "Granulated sugar",
                            "Eggs"
                    });

                    intent1.putExtra("instructions", new String[]{
                            "Prepare the Batter: Mix flour, sugar, peanut butter, eggs, and milk until smooth.",
                            "Bake: Pour the batter into a greased pan and bake at 350°F (175°C) for 30-35 minutes.",
                            "Cool the Cake: Let the cake cool completely on a wire rack.",
                            "Frost and Serve: Frost with peanut butter frosting and slice to serve."
                    });
                }
                startActivity(intent1);
            }
        });

    }
}
