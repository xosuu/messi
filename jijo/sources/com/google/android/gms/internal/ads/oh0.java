package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh0 f7578b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzm f7579d;

    public /* synthetic */ oh0(qh0 qh0Var, zzm zzmVar, int i10) {
        this.f7577a = i10;
        this.f7578b = qh0Var;
        this.f7579d = zzmVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f7577a;
        zzm zzmVar = this.f7579d;
        qh0 qh0Var = this.f7578b;
        switch (i10) {
            case 0:
                qh0Var.f8184q.a(qh0Var.f8185s);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                qh0Var.y1(map, qh0Var.f8185s, "rtsdc");
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            default:
                qh0Var.f8184q.a(qh0Var.f8185s);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                qh0Var.y1(map2, qh0Var.f8185s, "dialog_click");
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
        }
    }
}
