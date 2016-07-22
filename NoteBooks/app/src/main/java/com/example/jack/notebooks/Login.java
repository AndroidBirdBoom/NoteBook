/**
 * Author:Wang
 * 功能：首页 登录和注册
 */
package com.example.jack.notebooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jack on 2016/7/21.
 */
public class Login extends Activity implements View.OnClickListener {

    Button newButton,oldButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newButton = (Button) findViewById(R.id.zhuce_Btn);
        oldButton = (Button) findViewById(R.id.login_Btn);
        newButton.setOnClickListener(this);
        oldButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zhuce_Btn:

                break;
            case R.id.login_Btn:
                Intent loginActivity = new Intent(Login.this,mLogin.class);
                startActivity(loginActivity);
                break;
            default:
                break;
        }
    }
}
