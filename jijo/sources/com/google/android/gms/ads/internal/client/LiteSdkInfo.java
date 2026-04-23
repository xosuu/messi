package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public rn getAdapterCreator() {
        return new pn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 242402000, "23.3.0");
    }
}
