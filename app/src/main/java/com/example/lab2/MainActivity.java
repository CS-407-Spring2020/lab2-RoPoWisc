package com.example.lab2;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbtnPressed(View view) {

        EditText txtFieldDemo = (EditText) findViewById(R.id.txtFieldDemo);
        String str = txtFieldDemo.getText().toString();
        //Toast.makeText(MainActivity.this, txtFieldDemo.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);


    }
}
