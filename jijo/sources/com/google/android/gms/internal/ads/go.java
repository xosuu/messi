package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class go implements MediationAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5007g;

    public go(Date date, int i10, HashSet hashSet, Location location, boolean z9, int i11, boolean z10) {
        this.f5005e = date;
        this.f5001a = i10;
        this.f5006f = hashSet;
        this.f5007g = location;
        this.f5003c = z9;
        this.f5002b = i11;
        this.f5004d = z10;
    }

    public final go a() {
        Object obj = this.f5006f;
        go goVar = ((go) obj) != this ? (go) obj : null;
        Object obj2 = this.f5007g;
        ((go) obj2).f5006f = (go) obj;
        ((go) this.f5006f).f5007g = (go) obj2;
        this.f5006f = null;
        this.f5007g = null;
        return goVar;
    }

    public final void b(go goVar) {
        goVar.f5007g = this;
        goVar.f5006f = (go) this.f5006f;
        ((go) this.f5006f).f5007g = goVar;
        this.f5006f = goVar;
    }

    public final go c() {
        this.f5003c = true;
        return new go((byte[]) this.f5005e, this.f5001a, this.f5002b);
    }

    public final void d(go goVar, int i10) {
        if (!goVar.f5004d) {
            throw new IllegalArgumentException();
        }
        int i11 = goVar.f5002b;
        int i12 = i11 + i10;
        Object obj = goVar.f5005e;
        if (i12 > 8192) {
            if (goVar.f5003c) {
                throw new IllegalArgumentException();
            }
            int i13 = goVar.f5001a;
            if ((i11 + i10) - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy((byte[]) obj, i13, (byte[]) obj, 0, i11 - i13);
            goVar.f5002b -= goVar.f5001a;
            goVar.f5001a = 0;
        }
        System.arraycopy((byte[]) this.f5005e, this.f5001a, (byte[]) obj, goVar.f5002b, i10);
        goVar.f5002b += i10;
        this.f5001a += i10;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return (Date) this.f5005e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f5001a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return (Set) this.f5006f;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return (Location) this.f5007g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f5004d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f5003c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f5002b;
    }

    public go() {
        this.f5005e = new byte[8192];
        this.f5004d = true;
        this.f5003c = false;
    }

    public go(byte[] bArr, int i10, int i11) {
        this.f5005e = bArr;
        this.f5001a = i10;
        this.f5002b = i11;
        this.f5003c = true;
        this.f5004d = false;
    }
}
