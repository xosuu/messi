package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class zzafl implements zzbj {
    public static final Parcelable.Creator<zzafl> CREATOR = new a2(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11405b;

    public zzafl(Parcel parcel) {
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11404a = string;
        this.f11405b = parcel.readString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.mi r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f11404a
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 4
            r4 = 3
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 1
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 3
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 4
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 2
            goto L41
        L40:
            r0 = -1
        L41:
            java.lang.String r1 = r6.f11405b
            if (r0 == 0) goto L5a
            if (r0 == r5) goto L57
            if (r0 == r2) goto L54
            if (r0 == r4) goto L51
            if (r0 == r3) goto L4e
            return
        L4e:
            r7.f6949e = r1
            return
        L51:
            r7.f6948d = r1
            return
        L54:
            r7.f6947c = r1
            return
        L57:
            r7.f6946b = r1
            return
        L5a:
            r7.f6945a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafl.a(com.google.android.gms.internal.ads.mi):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafl zzaflVar = (zzafl) obj;
            if (this.f11404a.equals(zzaflVar.f11404a) && this.f11405b.equals(zzaflVar.f11405b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11405b.hashCode() + ((this.f11404a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f11404a + "=" + this.f11405b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11404a);
        parcel.writeString(this.f11405b);
    }

    public zzafl(String str, String str2) {
        this.f11404a = tc1.u(str);
        this.f11405b = str2;
    }
}
