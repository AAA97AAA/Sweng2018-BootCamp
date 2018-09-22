package ch.epfl.sweng.bootcamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText MainName;
    private TextView GreetingMessage;
    private Button MainGoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MainName = (EditText) findViewById(R.id.mainName);
        GreetingMessage = (TextView) findViewById(R.id.greetingMessage);
        MainGoButton = (Button) findViewById(R.id.mainGoButton);

        MainGoButton.setOnClickListener(MainGoButtonListener);
    }

    private View.OnClickListener  MainGoButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            GreetingMessage.setText("Hello " + MainName.getText() + "!");
        }

    };
}
