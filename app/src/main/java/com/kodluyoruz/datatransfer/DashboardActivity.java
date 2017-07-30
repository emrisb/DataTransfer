package com.kodluyoruz.datatransfer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity implements MenuListFragment.OnFragmentInteractionListener {

    private TextView txtAnaMenu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtAnaMenu = (TextView) findViewById(R.id.activity_dashboard_txtAnaMenu);

    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onFragmentInteraction(String name) {
        txtAnaMenu.setText(name);
    }
}
