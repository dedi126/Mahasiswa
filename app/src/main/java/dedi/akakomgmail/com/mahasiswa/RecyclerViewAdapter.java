package dedi.akakomgmail.com.mahasiswa;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> rvData;

    RecyclerViewAdapter(ArrayList<String> inputData) {
        rvData = inputData;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView Example;
        TextView Descripsi;

        ViewHolder(View v) {
            super(v);
            Example = v.findViewById(R.id.dexample);
            Descripsi = v.findViewById(R.id.ddes);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent, false);
        return new ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Example.setText(rvData.get(position));
        holder.Descripsi.setText("Urutan Deskripsi " + position);
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}