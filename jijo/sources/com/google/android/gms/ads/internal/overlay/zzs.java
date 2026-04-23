package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.eg;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageButton f2085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzae f2086b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzs(android.content.Context r6, com.google.android.gms.ads.internal.overlay.zzr r7, com.google.android.gms.ads.internal.overlay.zzae r8) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzs.<init>(android.content.Context, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.ads.internal.overlay.zzae):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzae zzaeVar = this.f2086b;
        if (zzaeVar != null) {
            zzaeVar.zzj();
        }
    }

    public final void zzb(boolean z9) {
        ImageButton imageButton = this.f2085a;
        if (!z9) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) zzba.zzc().a(eg.T0)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }
}
