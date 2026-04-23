package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f690b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f691d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f692f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f693h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f694q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f701y;

    public FragmentState(s sVar) {
        this.f689a = sVar.getClass().getName();
        this.f690b = sVar.f892q;
        this.f691d = sVar.f900z;
        this.f692f = sVar.I;
        this.f693h = sVar.J;
        this.f694q = sVar.K;
        this.f695s = sVar.N;
        this.f696t = sVar.f899y;
        this.f697u = sVar.M;
        this.f698v = sVar.f893s;
        this.f699w = sVar.L;
        this.f700x = sVar.Z.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("FragmentState{");
        sb.append(this.f689a);
        sb.append(" (");
        sb.append(this.f690b);
        sb.append(")}:");
        if (this.f691d) {
            sb.append(" fromLayout");
        }
        int i10 = this.f693h;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f694q;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f695s) {
            sb.append(" retainInstance");
        }
        if (this.f696t) {
            sb.append(" removing");
        }
        if (this.f697u) {
            sb.append(" detached");
        }
        if (this.f699w) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f689a);
        parcel.writeString(this.f690b);
        parcel.writeInt(this.f691d ? 1 : 0);
        parcel.writeInt(this.f692f);
        parcel.writeInt(this.f693h);
        parcel.writeString(this.f694q);
        parcel.writeInt(this.f695s ? 1 : 0);
        parcel.writeInt(this.f696t ? 1 : 0);
        parcel.writeInt(this.f697u ? 1 : 0);
        parcel.writeBundle(this.f698v);
        parcel.writeInt(this.f699w ? 1 : 0);
        parcel.writeBundle(this.f701y);
        parcel.writeInt(this.f700x);
    }

    public FragmentState(Parcel parcel) {
        this.f689a = parcel.readString();
        this.f690b = parcel.readString();
        this.f691d = parcel.readInt() != 0;
        this.f692f = parcel.readInt();
        this.f693h = parcel.readInt();
        this.f694q = parcel.readString();
        this.f695s = parcel.readInt() != 0;
        this.f696t = parcel.readInt() != 0;
        this.f697u = parcel.readInt() != 0;
        this.f698v = parcel.readBundle();
        this.f699w = parcel.readInt() != 0;
        this.f701y = parcel.readBundle();
        this.f700x = parcel.readInt();
    }
}
