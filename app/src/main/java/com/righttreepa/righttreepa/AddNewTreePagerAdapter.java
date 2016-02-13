package com.righttreepa.righttreepa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.ViewGroup;

/**
 * Created by mina on 2/9/16.
 */
public class AddNewTreePagerAdapter extends FragmentPagerAdapter {

    SparseArray<Fragment> registeredFragments = new SparseArray<Fragment>();
    private String tabTitles[] =
            new String[]{"General", "Photos", "Location", "Categories", "Sub-Categories", "Submit"};

    public AddNewTreePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AddNewTreeTab0();
            case 1:
                return new AddNewTreeTab1();
            case 2:
                return new AddNewTreeTab2();
            case 3:
                return new AddNewTreeTab3();
            case 4:
                return new AddNewTreeTab4();
            case 5:
                return new AddNewTreeTab5();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    public Fragment getActiveFragment(FragmentManager fragmentManager, int position,
                                      ViewPager container) {
        String name = makeFragmentName(container.getId(), position);

        final Fragment fragmentByTag =  fragmentManager.findFragmentByTag(name);
        return fragmentByTag;
    }

    private static String makeFragmentName(int viewId, int index) {
        return "android:switcher:" + viewId + ":" + index;
    }
}
