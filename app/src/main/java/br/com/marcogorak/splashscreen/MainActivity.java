package br.com.marcogorak.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private final int DURACAO_DA_TELA = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent it = new Intent(MainActivity.this, Login.class);
            MainActivity.this.startActivity(it);
            MainActivity.this.finish();
        }
        },DURACAO_DA_TELA);
    }
}
