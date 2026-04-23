package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f81b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f82d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f83f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap f84h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Uri f85q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f86s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f87t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f88u;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f80a = str;
        this.f81b = charSequence;
        this.f82d = charSequence2;
        this.f83f = charSequence3;
        this.f84h = bitmap;
        this.f85q = uri;
        this.f86s = bundle;
        this.f87t = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f81b) + ", " + ((Object) this.f82d) + ", " + ((Object) this.f83f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        Object objBuild = this.f88u;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f80a);
            builder.setTitle(this.f81b);
            builder.setSubtitle(this.f82d);
            builder.setDescription(this.f83f);
            builder.setIconBitmap(this.f84h);
            builder.setIconUri(this.f85q);
            Uri uri = this.f87t;
            Bundle bundle = this.f86s;
            if (i11 < 23 && uri != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (i11 >= 23) {
                builder.setMediaUri(uri);
            }
            objBuild = builder.build();
            this.f88u = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i10);
    }
}
