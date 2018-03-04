package se2018project.rubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    // called when the user taps the login button
    public void login(View view) {
        Intent intent = new Intent(this, select_screen.class);
        EditText netid_input = (EditText)findViewById(R.id.netid_input);
        String netid = netid_input.getText().toString();
        EditText password_input = (EditText)findViewById(R.id.password_input);
        String password = password_input.getText().toString();

        // temporary login dummy data
        if(netid.equals("ajh193") && password.equals("password")) {
            Toast.makeText(getApplicationContext(), "Login successful.",
                    Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }

        // toast error notification for incorrect netid/password
        else {
            Toast.makeText(getApplicationContext(), "Invalid NetID or Password.",
                    Toast.LENGTH_SHORT).show();
        }
    }

}
