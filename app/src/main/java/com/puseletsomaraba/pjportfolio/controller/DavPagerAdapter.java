package com.puseletsomaraba.pjportfolio.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.puseletsomaraba.pjportfolio.views.AboutFragment;
import com.puseletsomaraba.pjportfolio.views.ContactFragment;
import com.puseletsomaraba.pjportfolio.views.SkillsFragment;
import com.puseletsomaraba.pjportfolio.views.WorkFragment;

public class DavPagerAdapter extends FragmentPagerAdapter {


    public DavPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new AboutFragment();
            case 1:return new WorkFragment();
            case 2:return new SkillsFragment();
            case 3:return new ContactFragment();


        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:return "ABOUT";
            case 1:return "WORK";
            case 2:return "SKILLS";
            case 3:return "CONTACT";



        }
        return null;
    }
}
