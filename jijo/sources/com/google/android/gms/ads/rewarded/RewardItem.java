package com.google.android.gms.ads.rewarded;

import c2.n;

/* JADX INFO: loaded from: classes.dex */
public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD;

    static {
        int i10 = 0;
        DEFAULT_REWARD = new n(i10, i10);
    }

    int getAmount();

    String getType();
}
