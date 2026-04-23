package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb0 implements wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fx f3247b;

    public /* synthetic */ cb0(fx fxVar, int i10) {
        this.f3246a = i10;
        this.f3247b = fxVar;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        int i10 = this.f3246a;
        fx fxVar = this.f3247b;
        switch (i10) {
            case 0:
                ix ixVarG = fxVar.g();
                Rect rect = vbVar.f9821d;
                ixVarG.y0(rect.left, rect.top);
                break;
            case 1:
                HashMap map = new HashMap();
                map.put("isVisible", true != vbVar.f9827j ? "0" : "1");
                fxVar.j("onAdVisibilityChanged", map);
                break;
            default:
                ix ixVarG2 = fxVar.g();
                Rect rect2 = vbVar.f9821d;
                ixVarG2.y0(rect2.left, rect2.top);
                break;
        }
    }
}
