/**
 * Anthor :Wang
 * 功能：用户登录界面
 */
package com.example.jack.notebooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Jack on 2016/7/21.
 */
public class mLogin extends Activity implements View.OnClickListener {

    private Button loginButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginbtn);
        loginButton = (Button) findViewById(R.id.button_login);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent zhujiemian = new Intent(mLogin.this,MainActivity.class);
        startActivity(zhujiemian);
    }
}
