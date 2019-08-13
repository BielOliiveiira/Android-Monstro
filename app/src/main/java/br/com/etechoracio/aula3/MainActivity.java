package br.com.etechoracio.aula3;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private Dialog toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onProcessar(View view){
        Toast Processar = makeText(this, "Olá Hóracio", LENGTH_LONG);
        Processar.show();
    }
}
