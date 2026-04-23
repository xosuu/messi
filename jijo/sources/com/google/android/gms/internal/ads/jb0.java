package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends pb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ei, bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f5881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.ads.internal.client.zzdq f5882b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i90 f5883d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5884f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5885h;

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        k90 k90Var;
        com.google.android.gms.ads.internal.client.zzdq zzdqVar = null;
        niVarA = null;
        niVarA = null;
        ni niVarA = null;
        dm cmVar = null;
        if (i10 == 3) {
            z3.a.j("#008 Must be called on the main UI thread.");
            if (this.f5884f) {
                zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzdqVar = this.f5882b;
            }
            parcel2.writeNoException();
            qb.e(parcel2, zzdqVar);
            return true;
        }
        if (i10 == 4) {
            z3.a.j("#008 Must be called on the main UI thread.");
            w1();
            i90 i90Var = this.f5883d;
            if (i90Var != null) {
                i90Var.v();
            }
            this.f5883d = null;
            this.f5881a = null;
            this.f5882b = null;
            this.f5884f = true;
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            a4.a aVarT = a4.b.t(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                cmVar = iInterfaceQueryLocalInterface instanceof dm ? (dm) iInterfaceQueryLocalInterface : new cm(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            }
            qb.b(parcel);
            u1(aVarT, cmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
            qb.b(parcel);
            z3.a.j("#008 Must be called on the main UI thread.");
            u1(aVarT2, new ib0("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        z3.a.j("#008 Must be called on the main UI thread.");
        if (this.f5884f) {
            zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
        } else {
            i90 i90Var2 = this.f5883d;
            if (i90Var2 != null && (k90Var = i90Var2.C) != null) {
                niVarA = k90Var.a();
            }
        }
        parcel2.writeNoException();
        qb.e(parcel2, niVarA);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        v1();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        v1();
    }

    public final void u1(a4.a aVar, dm dmVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        z3.a.j("#008 Must be called on the main UI thread.");
        if (this.f5884f) {
            zzm.zzg("Instream ad can not be shown after destroy().");
            try {
                dmVar.zze(2);
                return;
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
                return;
            }
        }
        View view = this.f5881a;
        if (view == null || this.f5882b == null) {
            zzm.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                dmVar.zze(0);
                return;
            } catch (RemoteException e11) {
                zzm.zzl("#007 Could not call remote method.", e11);
                return;
            }
        }
        if (this.f5885h) {
            zzm.zzg("Instream ad should not be used again.");
            try {
                dmVar.zze(1);
                return;
            } catch (RemoteException e12) {
                zzm.zzl("#007 Could not call remote method.", e12);
                return;
            }
        }
        this.f5885h = true;
        w1();
        ((ViewGroup) a4.b.a0(aVar)).addView(this.f5881a, new ViewGroup.LayoutParams(-1, -1));
        zzu.zzx();
        xu xuVar = new xu(this.f5881a, this);
        View view2 = (View) ((WeakReference) xuVar.f7565a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            xuVar.J0(viewTreeObserver);
        }
        zzu.zzx();
        yu yuVar = new yu(this.f5881a, this);
        View view3 = (View) ((WeakReference) yuVar.f7565a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            yuVar.J0(viewTreeObserver3);
        }
        v1();
        try {
            dmVar.zzf();
        } catch (RemoteException e13) {
            zzm.zzl("#007 Could not call remote method.", e13);
        }
    }

    public final void v1() {
        View view;
        i90 i90Var = this.f5883d;
        if (i90Var == null || (view = this.f5881a) == null) {
            return;
        }
        i90Var.b(view, Collections.emptyMap(), Collections.emptyMap(), i90.m(this.f5881a));
    }

    public final void w1() {
        View view = this.f5881a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f5881a);
        }
    }
}
