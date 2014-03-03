package training.rotate4x;

import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Context;
import android.widget.TextView;


public class Rotate4x extends ActionBarActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stdPortraitOnClick(View v) {
        Settings.System.putInt(getContentResolver(), Settings.System.USER_ROTATION, m_lockedInOrientation);
    }

    public void stdLandscapeOnClick(View v) {
// do something when the button is clicked
        Settings.System.putInt(getContentResolver(), Settings.System.USER_ROTATION, 3 );
    }
    public void rvsPortraitOnClick(View v) {
// do something when the button is clicked
        Settings.System.putInt(getContentResolver(), Settings.System.USER_ROTATION, 2 );
    }
    public void rvsLandscapeOnClick(View v) {
// do something when the button is clicked
        Settings.System.putInt(getContentResolver(), Settings.System.USER_ROTATION, 1 );
    }


}

