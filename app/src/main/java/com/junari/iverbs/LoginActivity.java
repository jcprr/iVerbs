package com.junari.iverbs;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class LoginActivity extends Activity {

    private static final int REQST_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ListView l= (ListView)this.findViewById(R.id.listView);

        ArrayList<UserItem> Users= new ArrayList<>();

        UserItem u1= new UserItem();
        u1.setIcon(R.mipmap.face1);
        u1.setTitle("Julio Palacios Reyes");

        UserItem u2= new UserItem();
        u2.setIcon(R.mipmap.face2);
        u2.setTitle("Ricardo Muñozurio");

        UserItem u3= new UserItem();
        u3.setIcon(R.mipmap.face3);
        u3.setTitle("Sandovas Pepe Luis");

        UserItem u4= new UserItem();
        u4.setIcon(R.mipmap.face1);
        u4.setTitle("Luiyi Contrerone$");


        Users.add(u1);
        Users.add(u2);
        Users.add(u3);
        Users.add(u4);


        l.setAdapter( new MyUserAdapter(this,Users));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnLogin(View view)
    {
        startActivityForResult(new Intent(this,MenuActivity.class),REQST_CODE);

    }

}
