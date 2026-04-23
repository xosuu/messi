package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public abstract class yu0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xq f11038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok0 f11039b;

    public yu0(ok0 ok0Var) {
        this.f11039b = ok0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        xq xqVar = this.f11038a;
        if (xqVar != null) {
            xqVar.f10633h = null;
            yu0 yu0Var = (yu0) ((ArrayDeque) xqVar.f10632f).poll();
            xqVar.f10633h = yu0Var;
            if (yu0Var != null) {
                yu0Var.executeOnExecutor((ThreadPoolExecutor) xqVar.f10631d, new Object[0]);
            }
        }
    }
}
