package harsh.com.task_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Task4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);

    }

    public void nextScreen(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle extras = new Bundle();
        EditText editText = (EditText) findViewById(R.id.name);
        String message = editText.getText().toString();
        extras.putString("name", message);
        EditText editText2 = (EditText) findViewById(R.id.age);
        String message2 = editText2.getText().toString();
        extras.putString("age", message2);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
