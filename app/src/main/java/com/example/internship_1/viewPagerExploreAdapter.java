package com.example.internship_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerExploreAdapter extends FragmentPagerAdapter{
    public viewPagerExploreAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
      if(position==0)
      {
          return new personal();
      }
      else if(position==1)
      {
          return new Business_fragment();
      }
      else{
          return new Merchant_fragment();
      }
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return  "personal";
        }
        else if(position==1)
        {
            return  "Business";
        }
        else{
            return  "Merchant";
        }
    }
}
