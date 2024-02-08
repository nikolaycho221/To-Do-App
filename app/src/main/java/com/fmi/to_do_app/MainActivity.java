package com.fmi.to_do_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        details = findViewById(R.id.details);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

details.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (selectedTask != null) {
                Intent intent = new Intent(MainActivity.this, TaskDetailActivity.class);
                intent.putExtra("TITLE", selectedTask.getTitle());
                intent.putExtra("DESCRIPTION", selectedTask.getTask());
                intent.putExtra("DATE", selectedTask.getDue());
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Select a task !", Toast.LENGTH_SHORT).show();
            }
        }
    });
}


