package com.example.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onButtonClick(final View view) {
        new DialogFrag().show(getSupportFragmentManager(),null);

        final Snackbar snackbar=Snackbar.make(view,"hy",Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("close", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             snackbar.dismiss();
            }

        });
        snackbar.show();

    }

}

