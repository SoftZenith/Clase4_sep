package mx.edu.ittepic.clase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Maestro extends AppCompatActivity {

    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maestro);

        String nombreMaestro = getIntent().getStringExtra("nombre");
        String contrasenaMaestro = getIntent().getStringExtra("contrasena");

        nombre = findViewById(R.id.txtNombre);
        nombre.setText(nombreMaestro);

    }
}
