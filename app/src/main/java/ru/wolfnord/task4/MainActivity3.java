package ru.wolfnord.task4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ru.wolfnord.task4.databinding.ActivityMain2Binding;
import ru.wolfnord.task4.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button3) {
            Intent intent = new Intent();
            String day = binding.editTextText4.getText().toString();
            String time = binding.editTextText5.getText().toString();
            String comments = binding.editTextText6.getText().toString();
            intent.putExtra("day", day);
            intent.putExtra("time", time);
            intent.putExtra("comments", comments);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}