package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbah> CREATOR = new a2(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11467b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11468d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11469f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11470h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bundle f11471q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11475v;

    public zzbah(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z9, long j11, String str5, int i10) {
        this.f11466a = str;
        this.f11467b = j10;
        this.f11468d = str2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        this.f11469f = str3 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3;
        this.f11470h = str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4;
        this.f11471q = bundle == null ? new Bundle() : bundle;
        this.f11472s = z9;
        this.f11473t = j11;
        this.f11474u = str5;
        this.f11475v = i10;
    }

    public static zzbah b(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                zzm.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j10 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbah(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
        } catch (NullPointerException e10) {
            e = e10;
            zzm.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            zzm.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 2, this.f11466a);
        g4.d0.v(parcel, 3, 8);
        parcel.writeLong(this.f11467b);
        g4.d0.o(parcel, 4, this.f11468d);
        g4.d0.o(parcel, 5, this.f11469f);
        g4.d0.o(parcel, 6, this.f11470h);
        g4.d0.k(parcel, 7, this.f11471q);
        g4.d0.v(parcel, 8, 4);
        parcel.writeInt(this.f11472s ? 1 : 0);
        long j10 = this.f11473t;
        g4.d0.v(parcel, 9, 8);
        parcel.writeLong(j10);
        g4.d0.o(parcel, 10, this.f11474u);
        int i11 = this.f11475v;
        g4.d0.v(parcel, 11, 4);
        parcel.writeInt(i11);
        g4.d0.u(parcel, iT);
    }
}
