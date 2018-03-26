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
    public void login_button(View view) {
        Intent intent = new Intent(this, route_select.class);
        EditText netid_input = findViewById(R.id.netid_input);
        String netid = netid_input.getText().toString();
        EditText password_input = findViewById(R.id.password_input);
        String password = password_input.getText().toString();

        // TODO temporary login dummy data until firebase integration
        if(true) {
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

    // called when the user taps the forgot password button
    public void forgot_button(View view) {

        // TODO add password reset link

    }

}
