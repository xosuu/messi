package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new android.support.v4.media.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f179b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f180d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f181f;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f178a = intentSender;
        this.f179b = intent;
        this.f180d = i10;
        this.f181f = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f178a, i10);
        parcel.writeParcelable(this.f179b, i10);
        parcel.writeInt(this.f180d);
        parcel.writeInt(this.f181f);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f178a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f179b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f180d = parcel.readInt();
        this.f181f = parcel.readInt();
    }
}
