package edu.washington.zubinc.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private int count;

    public MainActivity(){
        count = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bigGoButton = (Button)findViewById(R.id.biggobutton);
        bigGoButton.setOnClickListener(new View.OnClickListener(){
            public void OnClick(View v){
                bigGoButton.text
            }
        });
    }
}
