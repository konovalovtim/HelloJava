package study.my.hellojava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setHelloJavaText(View view) {
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setBackgroundColor(getResources().getColor(R.color.txtcolor));
        helloTextView.setTextSize(23);
        helloTextView.setText("Hello Java!");
    }
}