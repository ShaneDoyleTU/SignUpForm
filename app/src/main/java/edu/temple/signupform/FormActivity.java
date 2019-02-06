package edu.temple.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    String pass = "Hello ";
    String fail1 = "All elements must be filled.";
    String fail2 = "Password and password confirmation must match.";
    protected Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        /*EditText textUsername = (EditText) findViewById(R.id.textUsername);
        EditText textEmailAddress = (EditText) findViewById(R.id.textEmailAddress);
        EditText textPassword = (EditText)  findViewById(R.id.textPassword);
        EditText textPasswordConfirm = (EditText)  findViewById(R.id.textPasswordConfirm);*/
        saveButton = (Button)findViewById(R.id.saveButton);
        /*boolean test1 = textUsername.getText().toString().trim().length()==0;
        boolean test2 = textEmailAddress.getText().toString().trim().length()==0;
        boolean test3 = textPassword.getText().toString().trim().length()==0;
        boolean test4 = textPasswordConfirm.getText().toString().trim().length()==0;
        boolean test5 = (textPassword.getText().toString()!=textPasswordConfirm.getText().toString());*/
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textUsername = (EditText) findViewById(R.id.textUsername);
                EditText textEmailAddress = (EditText) findViewById(R.id.textEmailAddress);
                EditText textPassword = (EditText)  findViewById(R.id.textPassword);
                EditText textPasswordConfirm = (EditText)  findViewById(R.id.textPasswordConfirm);
                boolean test1 = textUsername.getText().toString().trim().length()==0;
                boolean test2 = textEmailAddress.getText().toString().trim().length()==0;
                boolean test3 = textPassword.getText().toString().trim().length()==0;
                boolean test4 = textPasswordConfirm.getText().toString().trim().length()==0;
                boolean test5 = (!textPassword.getText().toString().equals(textPasswordConfirm.getText().toString()));
                System.out.println(textPassword.getText().toString());
                if (test1||test2||test3||test4){
                    Toast.makeText(FormActivity.this, "All elements must be filled.", Toast.LENGTH_SHORT).show();
                }
                else if(test5){
                    Toast.makeText(FormActivity.this, "Password and password confirmation must match.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(FormActivity.this, "Hello "+textUsername.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
