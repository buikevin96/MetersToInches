package com.example.kevinbui.meterstoinches;

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

                // Sets the meterValue to what the users enters and converts to Double
                double meterValue = Double.parseDouble(enterMeters.getText().toString());
                result = meterValue * multiplier;

                // Set the result to resultTextView
                resultTextView.setText(Double.toString(result) + " inches");
            }
        });



    }
}
