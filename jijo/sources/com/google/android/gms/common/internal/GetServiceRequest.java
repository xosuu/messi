package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f4.b;
import v3.e0;
import v3.i;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2493b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2494d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2495f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IBinder f2496h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Scope[] f2497q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f2498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Account f2499t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Feature[] f2500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Feature[] f2501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2504y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f2505z;
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new a(26);
    public static final Scope[] A = new Scope[0];
    public static final Feature[] B = new Feature[0];

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z9, int i13, boolean z10, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? A : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = B;
        Feature[] featureArr4 = featureArr == null ? featureArr3 : featureArr;
        featureArr3 = featureArr2 != null ? featureArr2 : featureArr3;
        this.f2492a = i10;
        this.f2493b = i11;
        this.f2494d = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f2495f = "com.google.android.gms";
        } else {
            this.f2495f = str;
        }
        if (i10 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i14 = v3.a.f17714b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface e0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (e0Var != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        e0 e0Var2 = (e0) e0Var;
                        Parcel parcelM = e0Var2.m(e0Var2.t(), 2);
                        Account account3 = (Account) b.a(parcelM, Account.CREATOR);
                        parcelM.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f2496h = iBinder;
            account2 = account;
        }
        this.f2499t = account2;
        this.f2497q = scopeArr2;
        this.f2498s = bundle2;
        this.f2500u = featureArr4;
        this.f2501v = featureArr3;
        this.f2502w = z9;
        this.f2503x = i13;
        this.f2504y = z10;
        this.f2505z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }
}
