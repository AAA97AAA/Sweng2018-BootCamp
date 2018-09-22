package ch.epfl.sweng.bootcamp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
//
//package ch.epfl.sweng.bootcamp;
//
//        import android.os.Bundle;
//        import android.support.v7.app.AppCompatActivity;
//        import android.view.View;
//        import android.widget.Button;
//        import android.widget.EditText;
//        import android.widget.TextView;
//
//@SuppressWarnings("FieldCanBeLocal")
//public class MainActivity extends AppCompatActivity {
//
//    private EditText MainName;
//    private TextView GreetingMessage;
//    private Button MainGoButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        MainName = findViewById(R.id.mainName);
//        GreetingMessage = findViewById(R.id.greetingMessage);
//        MainGoButton = findViewById(R.id.mainGoButton);
//
//        MainGoButton.setOnClickListener(MainGoButtonListener);
//    }
//
//    private final View.OnClickListener  MainGoButtonListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            GreetingMessage.setText(getString(R.string.userMessage, MainName.getText()));
//        }
//
//    };
//}
//
