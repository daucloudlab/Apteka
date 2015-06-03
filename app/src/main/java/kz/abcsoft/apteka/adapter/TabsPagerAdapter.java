package kz.abcsoft.apteka.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import kz.abcsoft.apteka.categoryfragments.Fragment1;
import kz.abcsoft.apteka.categoryfragments.Fragment2;
import kz.abcsoft.apteka.categoryfragments.Fragment3;


public class TabsPagerAdapter extends FragmentPagerAdapter {
    String [] tabsName = new String[] {
            "Лекарственные препараты",
            "Травы, фито чаи",
            "Добавки и витамины"
    } ;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabsName[position] ;
    }
}
