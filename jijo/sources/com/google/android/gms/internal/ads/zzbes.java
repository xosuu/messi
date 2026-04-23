package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbes extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbes> CREATOR = new a2(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11477b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11478d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11479f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11480h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzfk f11481q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f11485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11486w;

    public zzbes(int i10, boolean z9, int i11, boolean z10, int i12, zzfk zzfkVar, boolean z11, int i13, int i14, boolean z12, int i15) {
        this.f11476a = i10;
        this.f11477b = z9;
        this.f11478d = i11;
        this.f11479f = z10;
        this.f11480h = i12;
        this.f11481q = zzfkVar;
        this.f11482s = z11;
        this.f11483t = i13;
        this.f11485v = z12;
        this.f11484u = i14;
        this.f11486w = i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions b(com.google.android.gms.internal.ads.zzbes r5) {
        /*
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        Lc:
            r1 = 2
            int r2 = r5.f11476a
            if (r2 == r1) goto L45
            r3 = 3
            if (r2 == r3) goto L39
            r4 = 4
            if (r2 == r4) goto L18
            goto L4a
        L18:
            boolean r2 = r5.f11482s
            r0.setRequestCustomMuteThisAd(r2)
            int r2 = r5.f11483t
            r0.setMediaAspectRatio(r2)
            int r2 = r5.f11484u
            boolean r4 = r5.f11485v
            r0.enableCustomClickGestureDirection(r2, r4)
            r2 = 1
            int r4 = r5.f11486w
            if (r4 != 0) goto L30
        L2e:
            r1 = 1
            goto L36
        L30:
            if (r4 != r1) goto L34
            r1 = 3
            goto L36
        L34:
            if (r4 != r2) goto L2e
        L36:
            r0.zzi(r1)
        L39:
            com.google.android.gms.ads.internal.client.zzfk r1 = r5.f11481q
            if (r1 == 0) goto L45
            com.google.android.gms.ads.VideoOptions r2 = new com.google.android.gms.ads.VideoOptions
            r2.<init>(r1)
            r0.setVideoOptions(r2)
        L45:
            int r1 = r5.f11480h
            r0.setAdChoicesPlacement(r1)
        L4a:
            boolean r1 = r5.f11477b
            r0.setReturnUrlsForImageAssets(r1)
            boolean r5 = r5.f11479f
            r0.setRequestMultipleImages(r5)
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbes.b(com.google.android.gms.internal.ads.zzbes):com.google.android.gms.ads.nativead.NativeAdOptions");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11476a);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11477b ? 1 : 0);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11478d);
        g4.d0.v(parcel, 4, 4);
        parcel.writeInt(this.f11479f ? 1 : 0);
        g4.d0.v(parcel, 5, 4);
        parcel.writeInt(this.f11480h);
        g4.d0.n(parcel, 6, this.f11481q, i10);
        g4.d0.v(parcel, 7, 4);
        parcel.writeInt(this.f11482s ? 1 : 0);
        g4.d0.v(parcel, 8, 4);
        parcel.writeInt(this.f11483t);
        g4.d0.v(parcel, 9, 4);
        parcel.writeInt(this.f11484u);
        g4.d0.v(parcel, 10, 4);
        parcel.writeInt(this.f11485v ? 1 : 0);
        g4.d0.v(parcel, 11, 4);
        parcel.writeInt(this.f11486w);
        g4.d0.u(parcel, iT);
    }

    public zzbes(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfk(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
