package com.islarf6546.gmail.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GreenScreenActivity extends AppCompatActivity  implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_screen);

        btn = (Button)findViewById(R.id.toggle_button_back);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())  {
            case(R.id.toggle_button_back):  {
                this.finish();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_green_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
