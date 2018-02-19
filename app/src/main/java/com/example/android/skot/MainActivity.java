package com.example.android.skot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //I wasn't able yet to understand how to launch the facebook intent in facebook app, so it works only in a web browser
    public void facebook(View view) {
        Intent facebook = new Intent(Intent.ACTION_VIEW);
        facebook.setData(Uri.parse("https://www.facebook.com/" + getString(R.string.facebook_page)));
        if (facebook.resolveActivity(getPackageManager()) != null) {
            startActivity(facebook);
        }
    }

    public void youTube(View view) {
        Intent youTube = new Intent(Intent.ACTION_VIEW);
        youTube.setData((Uri.parse(getString(R.string.youtube_page))));
        if (youTube.resolveActivity(getPackageManager()) != null) {
            startActivity(youTube);
        }
    }

    public void googleMap(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW);
        map.setData(Uri.parse("http://maps.google.com/maps?" + getString(R.string.map_route)));
        if (map.resolveActivity(getPackageManager()) != null) {
            startActivity(map);
        }
    }

    public void email(View view) {
        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse("mailto:" + getString(R.string.email_address)));
        if (email.resolveActivity(getPackageManager()) !=null) {
            startActivity(email);
        }
    }

    public void phone(View view) {
        Intent phone = new Intent(Intent.ACTION_DIAL);
        phone.setData(Uri.parse("tel:" + getString(R.string.phone_number)));
        if (phone.resolveActivity(getPackageManager()) !=null) {
            startActivity(phone);
        }
    }
}
