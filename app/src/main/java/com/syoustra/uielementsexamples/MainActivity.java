package com.syoustra.uielementsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


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
 *
 *
 *
 *
 *
 *
 * **/



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
