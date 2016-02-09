package com.righttreepa.righttreepa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class GCMShowMessage extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcmshow_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        context = this;

        //Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Navigation icon and click action
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });


        //Get intent message and set for display
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyGcmListenerService.extra_message);
        String title = intent.getStringExtra(MyGcmListenerService.extra_title);
        String subtitle = intent.getStringExtra(MyGcmListenerService.extra_subtitle);

        //activity title

        getSupportActionBar().setTitle(title);


        //subtitle
        TextView subtitle_text = (TextView) findViewById(R.id.title_text);
        subtitle_text.setText(subtitle);
        //message
        TextView message_text = (TextView) findViewById(R.id.message_text);
        message_text.setText(message);






    }

}
