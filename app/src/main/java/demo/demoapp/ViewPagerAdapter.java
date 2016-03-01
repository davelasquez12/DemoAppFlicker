package demo.demoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class ViewPagerAdapter extends FragmentPagerAdapter
{
	final List<Fragment> mFragmentList = new ArrayList<>();
	final List<String> mPageTitles = new ArrayList<>();

	public ViewPagerAdapter(FragmentManager fm)
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int position)
	{
		return mFragmentList.get(position);
	}

	@Override
	public int getCount()
	{
		return mFragmentList.size();
	}

	@Override
	public CharSequence getPageTitle(int position)
	{
		return mPageTitles.get(position);
	}

	public void addFragment(Fragment fragment, String pageTitle)
	{
		if(fragment != null)
		{
			mFragmentList.add(fragment);
			mPageTitles.add(pageTitle);
		}
	}
}
