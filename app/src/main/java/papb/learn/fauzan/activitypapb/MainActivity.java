package papb.learn.fauzan.activitypapb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText _panjang;
    private EditText _lebar;
    private TextView _luas;
    private Button _btHitung;
    private double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        _panjang =  findViewById(R.id.Panjang_text);
        _lebar = findViewById(R.id.Lebar_text);
        _luas =  findViewById(R.id.Luas_text);
        _btHitung =  findViewById(R.id.button);
        _btHitung.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("statusnya","Destroyjalan");
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.button) {
            double p = Double.parseDouble(_panjang.getText().toString().trim());
            double l = Double.parseDouble(_lebar.getText().toString().trim());
            hasil = p * l;
            _luas.setText(String.valueOf(hasil));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("luas",_luas.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        _luas.setText(savedInstanceState.getString("luas"));
    }
}
