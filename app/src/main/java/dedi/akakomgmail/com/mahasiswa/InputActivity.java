package dedi.akakomgmail.com.mahasiswa;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    TextView daftar;
    EditText nama, nim;
    RadioGroup jur;
    CheckBox coding, tidur, makan;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        daftar = findViewById(R.id.ddaftar);
        nama = findViewById(R.id.dnama);
        nim = findViewById(R.id.dnim);
        jur = findViewById(R.id.djur);
        coding = findViewById(R.id.dcoding);
        tidur = findViewById(R.id.dtidur);
        makan = findViewById(R.id.dmakan);
        simpan = findViewById(R.id.dsimpan);

        simpan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String inputnama = String.valueOf(nama.getText().toString());
                String inputnim = String.valueOf(nim.getText().toString());

                int jurusan = jur.getCheckedRadioButtonId();
                RadioButton jur = findViewById(jurusan);
                String inputjur = String.valueOf(jur.getText().toString());

                if (!coding.isChecked() && !tidur.isChecked() && !makan.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Hobi Belum Dipilih", Toast.LENGTH_SHORT).show();
                } else {
                    String a = "";
                    if (coding.isChecked()) a += "Coding ";
                    String b = "";
                    if (tidur.isChecked()) b += "Tidur ";
                    String c = "";
                    if (makan.isChecked()) {
                        c += "Makan ";
                    }

                    daftar.setText("\n" +
                            "NAMA\t\t\t\t\t: " + inputnama + "\n\n" +
                            "NIM\t\t\t\t\t\t: " + inputnim + "\n\n" +
                            "JURUSAN\t\t\t: " + inputjur + "\n\n" +
                            "HOBI\t\t\t\t\t: " + a + "" + b + "" + c);
                }
            }
        });
    }
}