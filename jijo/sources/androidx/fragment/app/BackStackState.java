package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f660b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f661d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f662f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f663h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f664q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f672z;

    public BackStackState(a aVar) {
        int size = aVar.f702a.size();
        this.f659a = new int[size * 5];
        if (!aVar.f708g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f660b = new ArrayList(size);
        this.f661d = new int[size];
        this.f662f = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = (o0) aVar.f702a.get(i11);
            int i12 = i10 + 1;
            this.f659a[i10] = o0Var.f844a;
            ArrayList arrayList = this.f660b;
            s sVar = o0Var.f845b;
            arrayList.add(sVar != null ? sVar.f892q : null);
            int[] iArr = this.f659a;
            iArr[i12] = o0Var.f846c;
            iArr[i10 + 2] = o0Var.f847d;
            int i13 = i10 + 4;
            iArr[i10 + 3] = o0Var.f848e;
            i10 += 5;
            iArr[i13] = o0Var.f849f;
            this.f661d[i11] = o0Var.f850g.ordinal();
            this.f662f[i11] = o0Var.f851h.ordinal();
        }
        this.f663h = aVar.f707f;
        this.f664q = aVar.f709h;
        this.f665s = aVar.f719r;
        this.f666t = aVar.f710i;
        this.f667u = aVar.f711j;
        this.f668v = aVar.f712k;
        this.f669w = aVar.f713l;
        this.f670x = aVar.f714m;
        this.f671y = aVar.f715n;
        this.f672z = aVar.f716o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f659a);
        parcel.writeStringList(this.f660b);
        parcel.writeIntArray(this.f661d);
        parcel.writeIntArray(this.f662f);
        parcel.writeInt(this.f663h);
        parcel.writeString(this.f664q);
        parcel.writeInt(this.f665s);
        parcel.writeInt(this.f666t);
        TextUtils.writeToParcel(this.f667u, parcel, 0);
        parcel.writeInt(this.f668v);
        TextUtils.writeToParcel(this.f669w, parcel, 0);
        parcel.writeStringList(this.f670x);
        parcel.writeStringList(this.f671y);
        parcel.writeInt(this.f672z ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f659a = parcel.createIntArray();
        this.f660b = parcel.createStringArrayList();
        this.f661d = parcel.createIntArray();
        this.f662f = parcel.createIntArray();
        this.f663h = parcel.readInt();
        this.f664q = parcel.readString();
        this.f665s = parcel.readInt();
        this.f666t = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f667u = (CharSequence) creator.createFromParcel(parcel);
        this.f668v = parcel.readInt();
        this.f669w = (CharSequence) creator.createFromParcel(parcel);
        this.f670x = parcel.createStringArrayList();
        this.f671y = parcel.createStringArrayList();
        this.f672z = parcel.readInt() != 0;
    }
}
