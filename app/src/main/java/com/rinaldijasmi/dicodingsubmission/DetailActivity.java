package com.rinaldijasmi.dicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_LOGO = "extra_logo";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";

    private ImageView logo;
    private TextView title;
    private TextView desc;
    int photos;
    String titles, descs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        logo = findViewById(R.id.logodetail);
        title = findViewById(R.id.titledetail);
        desc = findViewById(R.id.descdetail);

        photos = getIntent().getIntExtra(EXTRA_LOGO, 0);
        titles = getIntent().getStringExtra(EXTRA_NAME);
        descs = getIntent().getStringExtra(EXTRA_DETAIL);

        logo.setImageResource(photos);
        title.setText(titles);
        desc.setText(descs);
    }
}
