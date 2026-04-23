package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class hp implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ip f5362b;

    public /* synthetic */ hp(ip ipVar, int i10) {
        this.f5361a = i10;
        this.f5362b = ipVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f5361a;
        ip ipVar = this.f5362b;
        switch (i11) {
            case 0:
                ipVar.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", ipVar.f5665q);
                data.putExtra("eventLocation", ipVar.f5669v);
                data.putExtra("description", ipVar.f5668u);
                long j10 = ipVar.f5666s;
                if (j10 > -1) {
                    data.putExtra("beginTime", j10);
                }
                long j11 = ipVar.f5667t;
                if (j11 > -1) {
                    data.putExtra("endTime", j11);
                }
                data.setFlags(268435456);
                zzu.zzp();
                zzt.zzT(ipVar.f5664h, data);
                break;
            default:
                ipVar.h("Operation denied by user.");
                break;
        }
    }
}
