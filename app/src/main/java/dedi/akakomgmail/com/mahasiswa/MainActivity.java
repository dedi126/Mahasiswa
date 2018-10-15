package dedi.akakomgmail.com.mahasiswa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.dinput){
            startActivity(new Intent(this, InputActivity.class));
        } else if (item.getItemId() == R.id.drv) {
            startActivity(new Intent(this, RycyclerActivity.class));
        } else if (item.getItemId() == R.id.dabaout) {
            startActivity(new Intent(this, AboutActivity.class));
        }
        return true;
    }
}