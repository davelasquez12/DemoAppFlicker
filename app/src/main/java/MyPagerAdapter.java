import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 3/4/2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter
{
    private List<Fragment> mFragmentList = new ArrayList();
    private List<String> mTabTitle = new ArrayList();

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String tabTitle)
    {
        mFragmentList.add(fragment);
        mTabTitle.add(tabTitle);
    }
}
