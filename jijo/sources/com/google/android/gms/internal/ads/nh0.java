package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7265b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7266d;

    public /* synthetic */ nh0(Object obj, int i10, Object obj2) {
        this.f7264a = i10;
        this.f7265b = obj;
        this.f7266d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f7264a;
        Object obj = this.f7265b;
        Object obj2 = this.f7266d;
        switch (i11) {
            case 0:
                qh0 qh0Var = (qh0) obj;
                zzm zzmVar = (zzm) obj2;
                qh0Var.f8184q.a(qh0Var.f8185s);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                qh0Var.y1(map, qh0Var.f8185s, "rtsdc");
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            case 1:
                qh0 qh0Var2 = (qh0) obj;
                zzm zzmVar2 = (zzm) obj2;
                qh0Var2.f8184q.a(qh0Var2.f8185s);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                qh0Var2.y1(map2, qh0Var2.f8185s, "dialog_click");
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
                break;
            default:
                ((JsPromptResult) obj).confirm(((EditText) obj2).getText().toString());
                break;
        }
    }
}
