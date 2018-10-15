package dedi.akakomgmail.com.mahasiswa;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RycyclerActivity extends AppCompatActivity {
    private RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rycycler);
        dataSet = new ArrayList<>();
        initDataset();

        RecyclerView rvView;
        rvView = this.findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        rvView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(dataSet);
        rvView.setAdapter(adapter);
    }

    private void initDataset() {

        dataSet.add("Dedi Setiawan");
        dataSet.add("Setiawan");
        dataSet.add("Dedi");
        dataSet.add("Setiawan");
        dataSet.add("Dedi");
    }
}