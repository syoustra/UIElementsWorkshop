package com.syoustra.uielementsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 *
 * Show connection between views/design vs text layout
 * Change to Pixel 2XL to show how Hello World stays in the middle regardless of size
 * Constrain must be top and one side
 * Constrain button to Switch, but show switch is still unconstrained
 * Every element must have constraints
 * Show chain (vertical) of the three elements
 * Show Aligning the group (try Vertically in Parent BUT that eliminates chain, try vertical, end up horizontal center)
 *
 * Change back to other screen sizes and see what happens
 *
 * Select button, and just start demonstrating options ... include padding vs marging
 *
 * Then work way down the elements
 *
 * Do the binding and listeners below
 *
 * Give 30 minutes for them to practice/play with it (timing may have been specific for this group)
 *
 *
 *
 *
 *
 * **/



public class MainActivity extends AppCompatActivity {

    //declare views

    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        textView.setText("This text is changed in the onCreate.");

        setListener();

    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Take input from EditText and set as value for TextView
                textView.setText(editText.getText());
            }
        });
    }
}
