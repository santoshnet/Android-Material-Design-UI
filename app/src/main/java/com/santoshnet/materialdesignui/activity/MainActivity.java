package com.santoshnet.materialdesignui.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.santoshnet.materialdesignui.R;
import com.santoshnet.materialdesignui.adapter.DrawerItemCustomAdapter;
import com.santoshnet.materialdesignui.fagment.AlertDiaogFragment;
import com.santoshnet.materialdesignui.fagment.ButtonFragment;
import com.santoshnet.materialdesignui.fagment.DialogFragment;
import com.santoshnet.materialdesignui.fagment.EditTextFragment;
import com.santoshnet.materialdesignui.fagment.LogInFragment;
import com.santoshnet.materialdesignui.fagment.RegisterFragment;
import com.santoshnet.materialdesignui.fagment.SplashScreenFragment;
import com.santoshnet.materialdesignui.model.NavDrawerModel;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    android.support.v7.app.ActionBarDrawerToggle mDrawerToggle;
    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTitle = mDrawerTitle = getTitle();
        mNavigationDrawerItemTitles = getResources().getStringArray(R.array.navigation_drawer_items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        setupToolbar();

        NavDrawerModel[] drawerItem = new NavDrawerModel[7];

        drawerItem[0] = new NavDrawerModel(R.drawable.ic_pages_black_24dp, "SplashScreen");
        drawerItem[1] = new NavDrawerModel(R.drawable.ic_text_fields_black_24dp, "EditText");
        drawerItem[2] = new NavDrawerModel(R.drawable.ic_poll_black_24dp, "Button");
        drawerItem[3] = new NavDrawerModel(R.drawable.ic_library_books_black_24dp, "DialogBox");
        drawerItem[4] = new NavDrawerModel(R.drawable.ic_error_black_24dp, "AlertBox");
        drawerItem[5] = new NavDrawerModel(R.drawable.login, "LogIn");
        drawerItem[6] = new NavDrawerModel(R.drawable.register, "Register");

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);

        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.list_view_item_row, drawerItem);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        setupDrawerToggle();

        if (savedInstanceState == null) {
            selectItem(0);
        }


    }

    private void selectItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new SplashScreenFragment();

                break;
            case 1:
                fragment = new EditTextFragment();
                break;
            case 2:
                fragment = new ButtonFragment();
                //startActivity(new Intent(getApplicationContext(), Register2Activity.class));
                break;
            case 3:
                fragment = new DialogFragment();
                break;
            case 4:
                fragment = new AlertDiaogFragment();
                break;
            case 5:
                fragment = new LogInFragment();
                break;
            case 6:
                fragment = new RegisterFragment();
                break;

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            setTitle(mNavigationDrawerItemTitles[position]);
            mDrawerLayout.closeDrawer(GravityCompat.START);

        } else {
            Log.e("MainActivity", "Error in creating fragment");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    void setupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }

    void setupDrawerToggle() {
        mDrawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);
        //This is necessary to change the icon of the Drawer Toggle upon state change.
        mDrawerToggle.syncState();
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }

    }

}
