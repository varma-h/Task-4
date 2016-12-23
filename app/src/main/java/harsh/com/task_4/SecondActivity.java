package harsh.com.task_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tx,tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("name");
        String age = extras.getString("age");
        tx = (TextView) findViewById(R.id.n);
        tx.setText(name);
        tx2 = (TextView) findViewById(R.id.a);
        tx2.setText(age);
    }
}
