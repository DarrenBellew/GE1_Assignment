package com.islarf6546.gmail.databaselab;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data = {"Wash dishes", "Use a sponge", "0"};
        Cursor output;
        SampleDBManager dbM = new SampleDBManager(this);
        try {
            dbM.open();

            //System.out.println(output.getString(0));
            long i;
            Toast.makeText(getBaseContext(),
                    Long.toString(i = dbM.insertThis(data)) + " | Something", Toast.LENGTH_LONG).show();

            output = dbM.selectSomething("TaskList", i);

            Toast.makeText(getBaseContext(),

                    output.getString((Integer)i) + " | Something", Toast.LENGTH_LONG).show();
        }
        catch(SQLException e)  {
            System.out.println("SQL thing Exception");
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
