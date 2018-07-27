package com.example.shm_msi.saphny_shm.View;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by SHM-MSI on 2018/7/17.
 */

public class BaseFragment extends Fragment{
    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }
}
