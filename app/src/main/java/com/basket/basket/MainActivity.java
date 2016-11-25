package com.basket.basket;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import com.basket.basket.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int a_points = 0;
    int b_points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void a_plus3(View view) {
        if (a_points>999){
            display_a (999);
        }
        else {
            a_points = a_points + 3;
            display_a(a_points);
        }
    }

    public void a_plus2(View view) {
        if (a_points>999){
            display_a (999);
        }
        else {
            a_points = a_points + 2;
            display_a(a_points);
        }
    }

    public void a_plus1(View view) {
        if (a_points>999){
            display_a (999);
        }
        else {
            a_points = a_points + 1;
            display_a(a_points);
        }
    }

    public void b_plus3(View view) {
        if (b_points>999){
            display_b(999);
        }
        else {
            b_points = b_points + 3;
            display_b(b_points);
        }
    }

    public void b_plus2(View view) {
        if (b_points>999){
            display_b(999);
        }
        else {
            b_points = b_points + 2;
            display_b(b_points);
        }
    }

    public void b_plus1(View view) {
        if (b_points>999){
            display_b(999);
        }
        else{
            b_points = b_points + 1;
            display_b(b_points);
        }

    }
    public void reset(View view) {
        a_points = 0;
        b_points = 0;
        display_a(a_points);
        display_b(b_points);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_a(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.point_a);
        quantityTextView.setText("" + number);
    }
    private void display_b(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.point_b);
        quantityTextView.setText("" + number);
    }

}