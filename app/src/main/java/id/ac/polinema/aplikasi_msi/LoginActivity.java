package id.ac.polinema.aplikasi_msi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import id.ac.polinema.aplikasi_msi.Model.Session;

public class LoginActivity extends AppCompatActivity {
    public EditText usernameInput, passwordInput, confirmInput;
    public String usernameValue, passValue, confirmValue;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username);
        passwordInput = findViewById(R.id.pass);
        confirmInput = findViewById(R.id.confirm);

        session = Application.getSession();
    }

        public void handleLogin (View view){
            usernameValue = usernameInput.getText().toString();
            passValue = passwordInput.getText().toString();
            confirmValue = confirmInput.getText().toString();

            if (usernameInput.equals("")){
                usernameInput.setError("Isi data");
            } else if (passwordInput.equals("")) {
                passwordInput.setError("Isi data");
            } else if (passwordInput!=confirmInput){
                confirmInput.setError("Password harus sama");
            } else {
                boolean success = session.validate(usernameValue, passValue, confirmValue);
                if (success) {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Snackbar.make(view, "Authentication Failed", Snackbar.LENGTH_SHORT).show();
                }
            }
        }
    }
