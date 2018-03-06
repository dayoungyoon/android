package com.example.jejuuniversity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.example.jejuuniversity.bus.AFragment;
import com.example.jejuuniversity.bus.BFragment;

public class BusActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        PagerSlidingTabStrip tabs =(PagerSlidingTabStrip)findViewById(R.id.tabs);
        tabs.setShouldExpand(true);
        ViewPager pager =(ViewPager)findViewById(R.id.pager);
        pager.setOffscreenPageLimit(2);
        pager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));
        tabs.setViewPager(pager);
    }
    public class SampleFragmentPagerAdapter extends FragmentPagerAdapter{

        final int PAGE_COUNT=2;

        private String tabTitles[]=new String[]{"A노선","B노선"};
        public SampleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return new AFragment();

            }
            else
                return new BFragment();
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }
    }
}
