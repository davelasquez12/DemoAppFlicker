package demo.demoapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
		TabLayout tabLayout = (TabLayout) findViewById(R.id.main_activity_tab_layout);
		ViewPager viewPager = (ViewPager) findViewById(R.id.main_activity_view_pager);

		setSupportActionBar(toolbar);
		setupViewPager(viewPager);
		tabLayout.setupWithViewPager(viewPager);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.main_menu, menu);

		return true;
	}

	private void setupViewPager(ViewPager viewPager)
	{
		
	}

}
