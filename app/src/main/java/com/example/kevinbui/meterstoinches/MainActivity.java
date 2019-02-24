package com.example.kevinbui.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1 meter = 39.3701in

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);

        convertButton = (Button) findViewById(R.id.convertID);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Conversion Logic
                double multiplier = 39.37;
                double result = 0.0;

                // If nothing is entered
                if (enterMeters.getText().toString().equals("")) {

                    // Error Message will appear in red
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);

                } else {

                    // Sets the meterValue to what the users enters and converts to Double
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue * multiplier;

                    resultTextView.setTextColor(Color.DKGRAY);
                    // Set the result to resultTextView and convert to 2 decimal points
                    resultTextView.setText(String.format("%.2f", result) + " inches");
                }


            }
        });



    }
}
