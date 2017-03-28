package yeseul.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    EditText edit_first, edit_second;
    TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_first = (EditText) findViewById(R.id.edit_first);
        edit_second = (EditText) findViewById(R.id.edit_second);
        Button but_plus = (Button) findViewById(R.id.but_plus);
        Button but_minus = (Button) findViewById(R.id.but_minus);
        Button but_multiply = (Button) findViewById(R.id.but_multiply);
        Button but_division = (Button) findViewById(R.id.but_division);
        text_result = (TextView) findViewById(R.id.text_result);
        but_plus.setOnClickListener(butHandler);
        but_minus.setOnClickListener(butHandler);
        but_multiply.setOnClickListener(butHandler);
        but_division.setOnClickListener(butHandler);

        /*but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                text_result.setText("계산 결과 : " + (num1 + num2 +""));
            }
        });
        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                text_result.setText("계산 결과 : " + (num1 - num2 +""));
            }
        });
        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                text_result.setText("계산 결과 : " + (num1 * num2 + ""));
            }
        });
        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                text_result.setText("계산 결과 : " + (num1 / num2 + ""));
            }
        });*/
    }//end oncreat

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(edit_first.getText().toString());
            int num2 = Integer.parseInt(edit_second.getText().toString());
            int result = 0;


            switch (v.getId()) {
                case R.id.but_plus:
                    result = num1 + num2;
                    break;
                case R.id.but_minus:
                    result = num1 - num2;
                    break;
                case R.id.but_multiply:
                    result = num1 * num2;
                    break;
                case R.id.but_division:
                    result = num1 / num2;
                    break;
            }

            text_result.setText(result + "");
            //""을 붙여서 문자열로 변환해줌*/
        }

    /*@Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(edit_first.getText().toString());
        int num2 = Integer.parseInt(edit_second.getText().toString());
        int result = 0;


        switch(v.getId()){
            case R.id.but_plus:
                result = num1 + num2;
                break;
            case R.id.but_minus:
                result = num1 - num2;
                break;
            case R.id.but_multiply:
                result = num1 * num2;
                break;
            case R.id.but_division:
                result = num1 / num2;
                break;
        }

        text_result.setText(result+"");
        //""을 붙여서 문자열로 변환해줌*/
    };
}

