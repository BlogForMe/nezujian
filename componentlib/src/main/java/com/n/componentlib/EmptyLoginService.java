package com.n.componentlib;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class EmptyLoginService implements  ILoginService {
    @Override
    public void launch(Context context) {

    }

    @Override
    public Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
