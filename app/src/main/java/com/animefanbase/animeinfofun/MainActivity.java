package com.animefanbase.animeinfofun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String fruitList[] = {"Banana", "watermelon"};
    int fruitImages [] = {R.drawable.banana, R.drawable.watermelon};

    // https://api.jikan.moe/v4/anime - for animes
    String BASE_URL = "https://api.jikan.moe/v3/";

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), fruitList, fruitImages);
        listView.setAdapter(customBaseAdapter);

        Button logoutButton = findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
