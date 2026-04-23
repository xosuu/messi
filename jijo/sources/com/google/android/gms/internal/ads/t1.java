package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends oe1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9027b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f9028d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f9029f;

    public static Serializable K0(int i10, ik0 ik0Var) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(ik0Var.C()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(ik0Var.v() == 1);
        }
        if (i10 == 2) {
            return L0(ik0Var);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return M0(ik0Var);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(ik0Var.C())).doubleValue());
                ik0Var.j(2);
                return date;
            }
            int iY = ik0Var.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i11 = 0; i11 < iY; i11++) {
                Serializable serializableK0 = K0(ik0Var.v(), ik0Var);
                if (serializableK0 != null) {
                    arrayList.add(serializableK0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strL0 = L0(ik0Var);
            int iV = ik0Var.v();
            if (iV == 9) {
                return map;
            }
            Serializable serializableK02 = K0(iV, ik0Var);
            if (serializableK02 != null) {
                map.put(strL0, serializableK02);
            }
        }
    }

    public static String L0(ik0 ik0Var) {
        int iZ = ik0Var.z();
        int i10 = ik0Var.f5634b;
        ik0Var.j(iZ);
        return new String(ik0Var.f5633a, i10, iZ);
    }

    public static HashMap M0(ik0 ik0Var) {
        int iY = ik0Var.y();
        HashMap map = new HashMap(iY);
        for (int i10 = 0; i10 < iY; i10++) {
            String strL0 = L0(ik0Var);
            Serializable serializableK0 = K0(ik0Var.v(), ik0Var);
            if (serializableK0 != null) {
                map.put(strL0, serializableK0);
            }
        }
        return map;
    }

    public final boolean J0(long j10, ik0 ik0Var) {
        if (ik0Var.v() == 2 && "onMetaData".equals(L0(ik0Var)) && ik0Var.n() != 0 && ik0Var.v() == 8) {
            HashMap mapM0 = M0(ik0Var);
            Object obj = mapM0.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f9027b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapM0.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f9028d = new long[size];
                    this.f9029f = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f9028d = new long[0];
                            this.f9029f = new long[0];
                            break;
                        }
                        this.f9028d[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f9029f[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }
}
