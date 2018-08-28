package com.example.yasir.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Yasir on 8/27/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new MondayFragment();
        }
        else
        {
            return new TuesdayFragment();
        }
    }
    @Override
    public int getCount() {
        return 2;
    }
}
