package vn.poly.androidcoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    TextView tv3;
    EditText tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                String t1 = tv1.getText().toString();
                String t2 = tv2.getText().toString();

                int min = Integer.parseInt(t1);
                int max = Integer.parseInt(t2);
                int number = random.nextInt(max - min +1) + min;
                tv3.setText("RANDOM: "+number);
            }
        });
    }

    public void anhxa() {
        btnClick = (Button) findViewById(R.id.btnClick);
        tv1 = (EditText) findViewById(R.id.tv1);
        tv2 = (EditText) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
    }
}