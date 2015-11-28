package com.example.gaurav.hforce;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;

/**
 * Created by GAURAV on 28-Nov-15.
 */
public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Intent intent=null;

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Paytm:
                if (checked)
                    // Paytm
                    intent = new Intent(ListActivity.this, SuccessActivity.class);
                    startActivity(intent);
                    break;
            case R.id.Citrus:
                if (checked)
                    // Citrus
                    intent = new Intent(ListActivity.this, SuccessActivity.class);
                    startActivity(intent);
                    break;
            case R.id.PayU:
                if (checked)
                    // PayU
                    intent = new Intent(ListActivity.this, SuccessActivity.class);
                    startActivity(intent);
                    break;
        }
    }


}
