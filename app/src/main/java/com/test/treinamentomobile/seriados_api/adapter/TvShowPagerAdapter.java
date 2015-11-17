package com.test.treinamentomobile.seriados_api.adapter;

/**
 * Created by treinamentomobile on 11/17/15.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.test.treinamentomobile.seriados_api.fragment.TvShowInfoFragment_;


public class TvShowPagerAdapter extends FragmentPagerAdapter {

    private static final CharSequence[] TITLE = {"Info"};
    private long tvShowId;

    public TvShowPagerAdapter(FragmentManager fm, long tvShowId) {
        super(fm);
        this.tvShowId = tvShowId;
    }

    @Override
    public int getCount() {
        return TITLE.length;
    }

    @Override
    public Fragment getItem(int position) {
        return TvShowInfoFragment_.builder().tvShowId(tvShowId).build();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }
}
