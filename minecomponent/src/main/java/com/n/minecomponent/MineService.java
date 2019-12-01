package com.n.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.n.componentlib.IMineService;

public class MineService  implements IMineService {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent();
        intent.setClass(context,MineActivity.class);
        context.startActivity(intent);
    }
}
