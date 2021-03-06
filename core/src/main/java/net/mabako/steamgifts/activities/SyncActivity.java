package net.mabako.steamgifts.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.mabako.steamgifts.core.R;
import net.mabako.steamgifts.fragments.SyncFragment;

public class SyncActivity extends CommonActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_one_fragment);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.navigation_sync);
        loadFragment(R.id.fragment_container, new SyncFragment(), "sync");
    }
}
