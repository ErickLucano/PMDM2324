package ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.pmdm2324.R;

import java.util.function.Consumer;

public class u2a2Propineitor extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btDelete,btClear,btCalcular;
    TextView TxtResultado,TxtPropina;

    RadioButton rbExcelente,rbBien,rbMal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2a2_propineitor);

        bt0 = findViewById(R.id.u2a2bt0);
        bt1 = findViewById(R.id.u2a2bt1);
        bt2 = findViewById(R.id.u2a2bt2);
        bt3 = findViewById(R.id.u2a2bt3);
        bt4 = findViewById(R.id.u2a2bt4);
        bt5 = findViewById(R.id.u2a2bt5);
        bt6 = findViewById(R.id.u2a2bt6);
        bt7 = findViewById(R.id.u2a2bt7);
        bt8 = findViewById(R.id.u2a2bt8);
        bt9 = findViewById(R.id.u2a2bt9);
        btDelete= findViewById(R.id.u2a2btDelete);
        btClear=findViewById(R.id.u2a2btClear);
        btCalcular=findViewById(R.id.u2a2BtCalcular);
        rbExcelente=findViewById(R.id.u2a2RbExcelente);
        rbBien=findViewById(R.id.u2a2RbBien);
        rbMal=findViewById(R.id.u2a2RbMal);
        TxtResultado=findViewById(R.id.u2a2TxtResultado);


         manejador = (View pulsar) -> {
            Button boton = (Button) pulsar;
            if (pulsar == btClear) {
                TxtResultado.setText("");
            } else if (pulsar == btDelete) {
                String numeroActual = TxtResultado.getText().toString();
                String cadenaFinal = numeroActual.substring(0, (numeroActual.length() - 1));
            } else {
                TxtResultado.append(boton.getText());
            }
        };
         bt0.setOnClickListener(manejador);
         bt1.setOnClickListener(manejador);
         bt2.setOnClickListener(manejador);
        bt3.setOnClickListener(manejador);
        bt4.setOnClickListener(manejador);
        bt5.setOnClickListener(manejador);
        bt6.setOnClickListener(manejador);
        bt7.setOnClickListener(manejador);
        bt8.setOnClickListener(manejador);
        bt9.setOnClickListener(manejador);
        btClear.setOnClickListener(manejador);
        btDelete.setOnClickListener(manejador);
        btCalcular.setOnClickListener(manejador);




    }
}