package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class el1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f4237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f4238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ek0 f4239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el1(ek0 ek0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f4239c = ek0Var;
        this.f4237a = contentResolver;
        this.f4238b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        ek0 ek0Var = this.f4239c;
        ek0Var.b(bl1.b(ek0Var.f4212a, (ce1) ek0Var.f4220u, (fl1) ek0Var.f4219t));
    }
}
