package com.example.shm_msi.saphny_shm.Utils;

import java.lang.reflect.Field;

import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by SHM-MSI on 2018/7/17.
 */

public class BottomNavigationViewHelper {
  public static void disableShiftMode(BottomNavigationView view) {
    BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
    try {
      Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
      shiftingMode.setAccessible(true);
      shiftingMode.setBoolean(menuView, false);
      shiftingMode.setAccessible(false);
      for (int i = 0; i < menuView.getChildCount(); i++) {
        BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
        //noinspection RestrictedApi
        item.setShifting(false);
        // set once again checked value, so view will be updated
        //noinspection RestrictedApi
        item.setChecked(item.getItemData().isChecked());
      }
    } catch (NoSuchFieldException e) {
      Log.e("BNVHelper", "Unable to get shift mode field", e);
    } catch (IllegalAccessException e) {
      Log.e("BNVHelper", "Unable to change value of shift mode", e);
    }
  }
}

