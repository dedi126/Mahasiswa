package dedi.akakomgmail.com.mahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RycyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rycycler);

        recyclerView = findViewById(R.id.drv);

        images = new int[]{R.drawable.gakakom, R.drawable.siakad};

        placeNames = new String[]{"STMIK AKAKOM", "Portal Akdemik"};

        placeGuide = new String[]{"https://www.akakom.ac.id/", "https://siakad.akakom.ac.id/"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(RycyclerActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(RycyclerActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapter);
    }
}