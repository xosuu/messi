package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class cy extends MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f3465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f3467c;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f3467c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3466b = applicationContext;
        this.f3465a = context instanceof Activity ? (Activity) context : null;
        this.f3467c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f3465a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f3466b.startActivity(intent);
        }
    }
}
