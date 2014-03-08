package com.danielme.blog.android.popupmenu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.PopupMenu.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * 
 * @author danielme.com
 * 
 */
public class MainActivity  extends ActionBarActivity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void menuOne(View view)
	{
		showPopupMenu(view, R.menu.menu1);
	}

	public void menuTwo(View view)
	{
		showPopupMenu(view, R.menu.menu2);
	}

	private void showPopupMenu(View view, int menu)
	{
		PopupMenu popupMenu = new PopupMenu(this, view);
		popupMenu.getMenuInflater().inflate(menu, popupMenu.getMenu());	
		popupMenu.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item)
			{
				Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
				return true;
			}
		});
		//dont forget to show the menu ;)
		popupMenu.show();
	}

}