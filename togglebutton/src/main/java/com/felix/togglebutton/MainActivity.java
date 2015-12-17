package com.felix.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity{

    private ToggleButton tb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件
        tb = (ToggleButton)findViewById(R.id.toggleButton);
        tv = (TextView)findViewById(R.id.textView);

        /**
         * 给当前tb控件设置监听器
         */
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /**
                 * 当tb被点击的时候，当前的方法会执行
                 * buttonView 代表被点击的控件本身
                 * isChecked 代表被点击的控件的状态
                 */
                tv.setText(isChecked?R.string.yesMatch:R.string.noMatch);
            }
        });
    }
}
