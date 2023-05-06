package com.letronghieu.custombottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AHBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);

        // Create items
        AHBottomNavigationItem itemHome = new AHBottomNavigationItem(R.string.home, R.drawable.baseline_home_black_24dp, R.color.yellow);
        AHBottomNavigationItem itemFavorite = new AHBottomNavigationItem(R.string.favorite, R.drawable.baseline_favorite_black_24dp, R.color.red);
        AHBottomNavigationItem itemMyPage = new AHBottomNavigationItem(R.string.mypage, R.drawable.baseline_contacts_black_24dp, R.color.blue);

// Add items
        bottomNavigation.addItem(itemHome);
        bottomNavigation.addItem(itemFavorite);
        bottomNavigation.addItem(itemMyPage);

        //Setcolor
        bottomNavigation.setColored(false);
        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.yellow));
        bottomNavigation.setAccentColor(getResources().getColor(R.color.black));
        bottomNavigation.setInactiveColor(getResources().getColor(R.color.white));
        //Notification
        AHNotification notification = new AHNotification.Builder()
                .setText("1")
                .setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red))
                .setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white))
                .build();
        bottomNavigation.setNotification(notification, 1);
        //setTitleState
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE_FORCE);
    }
}