package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b7.u;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new android.support.v4.media.a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f112d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f113f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f114h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f115q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bundle f120w;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f122b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f123d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bundle f124f;

        public CustomAction(Parcel parcel) {
            this.f121a = parcel.readString();
            this.f122b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f123d = parcel.readInt();
            this.f124f = parcel.readBundle(u.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f122b) + ", mIcon=" + this.f123d + ", mExtras=" + this.f124f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f121a);
            TextUtils.writeToParcel(this.f122b, parcel, i10);
            parcel.writeInt(this.f123d);
            parcel.writeBundle(this.f124f);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f110a = parcel.readInt();
        this.f111b = parcel.readLong();
        this.f113f = parcel.readFloat();
        this.f117t = parcel.readLong();
        this.f112d = parcel.readLong();
        this.f114h = parcel.readLong();
        this.f116s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f118u = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f119v = parcel.readLong();
        this.f120w = parcel.readBundle(u.class.getClassLoader());
        this.f115q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f110a + ", position=" + this.f111b + ", buffered position=" + this.f112d + ", speed=" + this.f113f + ", updated=" + this.f117t + ", actions=" + this.f114h + ", error code=" + this.f115q + ", error message=" + this.f116s + ", custom actions=" + this.f118u + ", active item id=" + this.f119v + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f110a);
        parcel.writeLong(this.f111b);
        parcel.writeFloat(this.f113f);
        parcel.writeLong(this.f117t);
        parcel.writeLong(this.f112d);
        parcel.writeLong(this.f114h);
        TextUtils.writeToParcel(this.f116s, parcel, i10);
        parcel.writeTypedList(this.f118u);
        parcel.writeLong(this.f119v);
        parcel.writeBundle(this.f120w);
        parcel.writeInt(this.f115q);
    }
}
