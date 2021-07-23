package com.example.shm_msi.saphny_shm.Utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by SHM-MSI on 2018/7/25.
 */

public class GlideImageLoader extends ImageLoader {
  @Override
  public void displayImage(Context context, Object path, ImageView imageView) {

    Glide.with(context).load(path).into(imageView);

  }
}
