package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.s;
import j4.b;

/* JADX INFO: loaded from: classes.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new b(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16368b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16369d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16370f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16371h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f16372q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f16375u;

    public AppSettingsDialog(Parcel parcel) {
        this.f16367a = parcel.readInt();
        this.f16368b = parcel.readString();
        this.f16369d = parcel.readString();
        this.f16370f = parcel.readString();
        this.f16371h = parcel.readString();
        this.f16372q = parcel.readInt();
        this.f16373s = parcel.readInt();
    }

    public final void b(Object obj) {
        this.f16374t = obj;
        if (obj instanceof Activity) {
            this.f16375u = (Activity) obj;
        } else if (obj instanceof s) {
            this.f16375u = ((s) obj).l();
        } else {
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16367a);
        parcel.writeString(this.f16368b);
        parcel.writeString(this.f16369d);
        parcel.writeString(this.f16370f);
        parcel.writeString(this.f16371h);
        parcel.writeInt(this.f16372q);
        parcel.writeInt(this.f16373s);
    }

    public AppSettingsDialog(Object obj, String str, String str2, String str3, String str4, int i10) {
        b(obj);
        this.f16367a = -1;
        this.f16368b = str;
        this.f16369d = str2;
        this.f16370f = str3;
        this.f16371h = str4;
        this.f16372q = i10;
        this.f16373s = 0;
    }
}
