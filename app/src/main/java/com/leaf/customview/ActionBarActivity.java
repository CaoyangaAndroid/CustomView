package com.leaf.customview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leaf.customview.view.TagsLayout;

public class ActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        TagsLayout imageViewGroup = (TagsLayout) findViewById(R.id.image_layout);
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        String[] string={"从我写代码那天起，我就没有打算写代码","从我写代码那天起","我就没有打算写代码","没打算","写代码"};
        for (int i = 0; i < 5; i++) {
            TextView textView = new TextView(this);
            textView.setText(string[i]);
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundResource(R.drawable.bule_background);
            imageViewGroup.addView(textView, lp);
        }
    }
}
