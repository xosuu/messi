package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class ln extends pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.f f6671a;

    public ln(m2.f fVar) {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
        this.f6671a = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.os.Parcel] */
    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        ?? EmptyMap;
        long jLongValue;
        m2.f fVar = this.f6671a;
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                h4.r rVar = (h4.r) fVar.f15701b;
                rVar.getClass();
                rVar.b(new h4.l(rVar, bundle, new h4.b(), 1));
                parcel2.writeNoException();
                break;
            case 2:
                Bundle bundle2 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                h4.r rVar2 = (h4.r) fVar.f15701b;
                rVar2.getClass();
                h4.b bVar = new h4.b();
                rVar2.b(new h4.l(rVar2, bundle2, bVar, 1));
                Bundle bundleT = bVar.t(5000L);
                parcel2.writeNoException();
                qb.d(parcel2, bundleT);
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                h4.r rVar3 = (h4.r) fVar.f15701b;
                rVar3.getClass();
                rVar3.b(new h4.n(rVar3, string, string2, bundle3));
                parcel2.writeNoException();
                break;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                Object objA0 = aVarT != null ? a4.b.a0(aVarT) : null;
                h4.r rVar4 = (h4.r) fVar.f15701b;
                rVar4.getClass();
                rVar4.b(new h4.k(rVar4, string3, string4, objA0));
                parcel2.writeNoException();
                break;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ClassLoader classLoader = qb.f8146a;
                boolean z9 = parcel.readInt() != 0;
                qb.b(parcel);
                h4.r rVar5 = (h4.r) fVar.f15701b;
                rVar5.getClass();
                h4.b bVar2 = new h4.b();
                rVar5.b(new h4.k(rVar5, string5, string6, z9, bVar2));
                Bundle bundleT2 = bVar2.t(5000L);
                if (bundleT2 == null || bundleT2.size() == 0) {
                    EmptyMap = Collections.emptyMap();
                } else {
                    EmptyMap = new HashMap(bundleT2.size());
                    for (String str : bundleT2.keySet()) {
                        Object obj = bundleT2.get(str);
                        if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                            EmptyMap.put(str, obj);
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeMap(EmptyMap);
                break;
            case 6:
                String string7 = parcel.readString();
                qb.b(parcel);
                h4.r rVar6 = (h4.r) fVar.f15701b;
                rVar6.getClass();
                h4.b bVar3 = new h4.b();
                rVar6.b(new h4.l(rVar6, string7, bVar3, 2));
                Integer num = (Integer) h4.b.u1(Integer.class, bVar3.t(10000L));
                int iIntValue = num == null ? 25 : num.intValue();
                parcel2.writeNoException();
                parcel2.writeInt(iIntValue);
                break;
            case 7:
                Bundle bundle4 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                h4.r rVar7 = (h4.r) fVar.f15701b;
                rVar7.getClass();
                rVar7.b(new h4.f(rVar7, bundle4, 0));
                parcel2.writeNoException();
                break;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                h4.r rVar8 = (h4.r) fVar.f15701b;
                rVar8.getClass();
                rVar8.b(new h4.g(rVar8, string8, string9, bundle5, 0));
                parcel2.writeNoException();
                break;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                qb.b(parcel);
                h4.r rVar9 = (h4.r) fVar.f15701b;
                rVar9.getClass();
                h4.b bVar4 = new h4.b();
                rVar9.b(new h4.g(rVar9, string10, string11, bVar4, 1));
                List listEmptyList = (List) h4.b.u1(List.class, bVar4.t(5000L));
                if (listEmptyList == null) {
                    listEmptyList = Collections.emptyList();
                }
                parcel2.writeNoException();
                parcel2.writeList(listEmptyList);
                break;
            case 10:
                h4.r rVar10 = (h4.r) fVar.f15701b;
                rVar10.getClass();
                h4.b bVar5 = new h4.b();
                rVar10.b(new h4.j(rVar10, bVar5, 1));
                String str2 = (String) h4.b.u1(String.class, bVar5.t(50L));
                parcel2.writeNoException();
                parcel2.writeString(str2);
                break;
            case 11:
                h4.r rVar11 = (h4.r) fVar.f15701b;
                rVar11.getClass();
                h4.b bVar6 = new h4.b();
                rVar11.b(new h4.j(rVar11, bVar6, 0));
                String str3 = (String) h4.b.u1(String.class, bVar6.t(500L));
                parcel2.writeNoException();
                parcel2.writeString(str3);
                break;
            case 12:
                h4.r rVar12 = (h4.r) fVar.f15701b;
                rVar12.getClass();
                h4.b bVar7 = new h4.b();
                rVar12.b(new h4.j(rVar12, bVar7, 2));
                Long l9 = (Long) h4.b.u1(Long.class, bVar7.t(500L));
                if (l9 == null) {
                    long jNanoTime = System.nanoTime();
                    rVar12.f14001b.getClass();
                    long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
                    int i11 = rVar12.f14004e + 1;
                    rVar12.f14004e = i11;
                    jLongValue = jNextLong + ((long) i11);
                } else {
                    jLongValue = l9.longValue();
                }
                parcel2.writeNoException();
                parcel2.writeLong(jLongValue);
                break;
            case 13:
                String string12 = parcel.readString();
                qb.b(parcel);
                h4.r rVar13 = (h4.r) fVar.f15701b;
                rVar13.getClass();
                rVar13.b(new h4.i(rVar13, string12, 0));
                parcel2.writeNoException();
                break;
            case 14:
                String string13 = parcel.readString();
                qb.b(parcel);
                h4.r rVar14 = (h4.r) fVar.f15701b;
                rVar14.getClass();
                rVar14.b(new h4.i(rVar14, string13, 1));
                parcel2.writeNoException();
                break;
            case 15:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                qb.b(parcel);
                Activity activity = aVarT2 != null ? (Activity) a4.b.a0(aVarT2) : null;
                h4.r rVar15 = (h4.r) fVar.f15701b;
                rVar15.getClass();
                rVar15.b(new h4.g(rVar15, activity, string14, string15));
                parcel2.writeNoException();
                break;
            case 16:
                h4.r rVar16 = (h4.r) fVar.f15701b;
                rVar16.getClass();
                h4.b bVar8 = new h4.b();
                rVar16.b(new h4.j(rVar16, bVar8, 3));
                String str4 = (String) h4.b.u1(String.class, bVar8.t(500L));
                parcel2.writeNoException();
                parcel2.writeString(str4);
                break;
            case 17:
                h4.r rVar17 = (h4.r) fVar.f15701b;
                rVar17.getClass();
                h4.b bVar9 = new h4.b();
                rVar17.b(new h4.j(rVar17, bVar9, 4));
                String str5 = (String) h4.b.u1(String.class, bVar9.t(500L));
                parcel2.writeNoException();
                parcel2.writeString(str5);
                break;
            case 18:
                String str6 = ((h4.r) fVar.f15701b).f14006g;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                break;
            case 19:
                Bundle bundle6 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                h4.r rVar18 = (h4.r) fVar.f15701b;
                rVar18.getClass();
                rVar18.b(new h4.f(rVar18, bundle6, 1));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
