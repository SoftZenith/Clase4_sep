package mx.edu.ittepic.clase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtContrasena;
    CheckBox chkMaestro;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtContrasena = findViewById(R.id.txtContrasena);
        chkMaestro = findViewById(R.id.chkMaestro);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkMaestro.isChecked()){
                    //Mandar a pagina para maestro
                    Intent i = new Intent(getApplicationContext(), Maestro.class);
                    startActivity(i);
                }else{
                    //Mandar a pagina para alumno
                    Intent i = new Intent(getApplicationContext(), Alumno.class);
                    startActivity(i);
                }
            }
        });

    }

}
