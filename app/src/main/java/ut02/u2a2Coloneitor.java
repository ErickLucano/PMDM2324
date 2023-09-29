package ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.pmdm2324.R;


public class u2a2Coloneitor extends AppCompatActivity {
Button btMostrar;
TextView txtMuestra;

SeekBar sbBarra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2a2_coloneitor);

        btMostrar= findViewById(R.id.u2a2Btmostrar);
        txtMuestra= findViewById(R.id.u2a2Txtmuestra);
        sbBarra=findViewById(R.id.u2a2SbBarra);

        btMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               txtMuestra.setText((Integer.toString(sbBarra.getProgress())));
            }
        });
        /*
        btMostrar.setOnClickListener((View v) ->{

            CUERPO DEL METODO
        } );
        */



    }
}