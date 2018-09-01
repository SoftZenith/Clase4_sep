package mx.edu.ittepic.clase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Alumno extends AppCompatActivity {

    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        String nombreAlumno = getIntent().getStringExtra("nombre");
        String contrasenaAlumno = getIntent().getStringExtra("contrasena");

        nombre = findViewById(R.id.txtNombreL);
        nombre.setText(nombreAlumno);

    }
}
