package com.example.android.quiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class
second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void Checkanswers(View V) {
        CheckBox rightanswer1 = (CheckBox) findViewById(R.id.ask1a);
        boolean firstanswer = rightanswer1.isChecked();

        CheckBox rightanswer2 = (CheckBox) findViewById(R.id.ask2a);
        boolean secondanswer = rightanswer2.isChecked();

        CheckBox rightanswer3 = (CheckBox) findViewById(R.id.ask3a);
        boolean thirdanswer = rightanswer3.isChecked();

        CheckBox rightanswer4 = (CheckBox) findViewById(R.id.ask4a);
        boolean fourthanswer = rightanswer4.isChecked();

        CheckBox rightanswer5 = (CheckBox) findViewById(R.id.ask5a);
        boolean fiveanswer = rightanswer5.isChecked();

        CheckBox rightanswer6 = (CheckBox) findViewById(R.id.ask6a);
        boolean sixanswer = rightanswer6.isChecked();

        CheckBox rightanswer7 = (CheckBox) findViewById(R.id.ask7c);
        boolean sevenanswer = rightanswer7.isChecked();

        CheckBox rightanswer = (CheckBox) findViewById(R.id.ask8b);
        boolean eightanswer = rightanswer.isChecked();

        CheckBox rightanswer9 = (CheckBox) findViewById(R.id.ask9b);
        boolean nineanswer = rightanswer9.isChecked();

        CheckBox rightanswer10 = (CheckBox) findViewById(R.id.ask10a);
        boolean tenanswer = rightanswer10.isChecked();

        CheckBox rightanswer11 = (CheckBox) findViewById(R.id.ask11a);
        boolean elevenanswer = rightanswer11.isChecked();

        CheckBox rightanswer12 = (CheckBox) findViewById(R.id.ask12b);
        boolean twelveanswer = rightanswer12.isChecked();

        CheckBox rightanswer13 = (CheckBox) findViewById(R.id.ask13c);
        boolean thirteenanswer = rightanswer13.isChecked();


        int rechne = calculate(firstanswer, secondanswer, thirdanswer, fourthanswer, fiveanswer, sixanswer, sevenanswer, eightanswer, nineanswer, tenanswer, elevenanswer, twelveanswer, thirteenanswer);

        String hello = message(rechne, firstanswer, secondanswer, thirdanswer, fourthanswer, fiveanswer, sixanswer, sevenanswer, eightanswer, nineanswer, tenanswer, elevenanswer, twelveanswer, thirteenanswer);

        Toast.makeText(this, hello, Toast.LENGTH_LONG).show();

    }

    private String message(int rechne, boolean firstanswer, boolean secondanswer, boolean thirdanswer, boolean fourthanswer, boolean fiveanswer, boolean sixanswer, boolean sevenanswer, boolean eightanswer, boolean nineanswer, boolean tenanswer, boolean elevenanswer, boolean twelveanswer, boolean thirteenanswer) {
        String hello = "Hello T1";
        hello += "\nYou got: " + rechne + "/13";

        return hello;

    }

    private int calculate(boolean firstanswer, boolean secondanswer, boolean thirdanswer, boolean fourthanswer, boolean fiveanswer, boolean sixanswer, boolean sevenanswer, boolean eightanswer, boolean nineanswer, boolean tenanswer, boolean elevenanswer, boolean twelveanswer, boolean thirteenanswer) {
        int rechne = 0;

        if (firstanswer) {
            rechne = rechne + 1;
        }
        if (secondanswer) {
            rechne = rechne + 1;
        }
        if (thirdanswer) {
            rechne = rechne + 1;
        }
        if (fourthanswer) {
            rechne = rechne + 1;
        }
        if (fiveanswer) {
            rechne = rechne + 1;
        }

        if (sixanswer) {
            rechne = rechne + 1;
        }

        if (sevenanswer) {
            rechne = rechne + 1;
        }
        if (eightanswer) {
            rechne = rechne + 1;
        }
        if (nineanswer) {
            rechne = rechne + 1;
        }
        if (tenanswer) {
            rechne = rechne + 1;
        }
        if (elevenanswer) {
            rechne = rechne + 1;
        }

        if (twelveanswer) {
            rechne = rechne + 1;
        }

        if (thirteenanswer) {
            rechne = rechne + 1;

        } else

            Toast.makeText(this, "Ohh..try again..", Toast.LENGTH_LONG).show();

        return rechne;
    }
}



