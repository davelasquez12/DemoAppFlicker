package demo.demoapp;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
	private ViewPager mViewPager;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
		TabLayout tabLayout = (TabLayout) findViewById(R.id.main_activity_tab_layout);
		mViewPager = (ViewPager) findViewById(R.id.main_activity_view_pager);

		setSupportActionBar(toolbar);				//initializes and displays toolbar in activity
		setupViewPager(mViewPager);					//set up the view pager by adding the fragments and tab titles to it.
		tabLayout.setupWithViewPager(mViewPager);	//wire up the tab layout to work in sync with the view pager
	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.main_menu, menu);
		return true;
	}*/

	private void setupViewPager(ViewPager viewPager)
	{
		ViewPagerAdapter vpa = new ViewPagerAdapter(getSupportFragmentManager());

		//order is very important here; they correspond to the tab position from left to right
		vpa.addFragment(new SearchImagesFragment(), "Search");
		vpa.addFragment(new MyFavoritesFragment(), "My Favorites");
		viewPager.setAdapter(vpa);
	}

}
