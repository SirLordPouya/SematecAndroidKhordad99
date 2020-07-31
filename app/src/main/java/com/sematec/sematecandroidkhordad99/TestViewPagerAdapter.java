package com.sematec.sematecandroidkhordad99;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TestViewPagerAdapter extends FragmentStateAdapter {


    public TestViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                TestFragment fragment = new TestFragment();
                return fragment;
            case 1:
                TestFragmentRed fragmentRed = new TestFragmentRed();
                return fragmentRed;
            default:
                TestFragment fragment1 = new TestFragment();
                return fragment1;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
