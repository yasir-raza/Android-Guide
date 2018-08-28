package com.example.yasir.tabpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Yasir on 8/27/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] {"TAB 1","TAB 2","TAB 3","TAB 4"};
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            {
                return new Tab1Fragment();
            }
            case 1:
            {
                return new Tab2Fragment();
            }
            case 2:
            {
                return new Tab3Fragment();
            }
            case 3:
            {
                return new Tab4Fragment();
            }

            default:
            {
                return null;
            }
        }
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
