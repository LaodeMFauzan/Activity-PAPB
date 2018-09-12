package papb.learn.fauzan.activitypapb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText _panjang;
    private EditText _lebar;
    private TextView _luas;
    private Button _btHitung;
    private double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("onCreate","Create everything");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        _panjang =  findViewById(R.id.Panjang_text);
        _lebar = findViewById(R.id.Lebar_text);
        _luas =  findViewById(R.id.Luas_text);
        _btHitung =  findViewById(R.id.button);
        _btHitung.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","Ini onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","Coba onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","Try onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","This is onPause");
    }

    @Override
    protected void onDestroy() {
        Log.d("statusnya","Destroyjalan");
        super.onDestroy();
    }


    @Override
    protected void onStop() {
        Log.d("onStop","this onStop");
        super.onStop();
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
