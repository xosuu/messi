package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class vb1 implements rd1 {
    protected int zzq;

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(List list, dd1 dd1Var) {
        Charset charset = ed1.f3910a;
        list.getClass();
        if (list instanceof hd1) {
            List listZza = ((hd1) list).zza();
            fb1.t(dd1Var);
            dd1Var.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ec1) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                ec1.q(0, bArr, bArr.length);
                throw null;
            }
            return;
        }
        if (list instanceof xd1) {
            dd1Var.addAll(list);
            return;
        }
        if ((dd1Var instanceof ArrayList) && (list instanceof Collection)) {
            ((ArrayList) dd1Var).ensureCapacity(list.size() + dd1Var.size());
        }
        int size = dd1Var.size();
        for (Object obj : list) {
            if (obj == null) {
                String strH = fb1.h("Element at index ", dd1Var.size() - size, " is null.");
                int size2 = dd1Var.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(strH);
                    }
                    dd1Var.remove(size2);
                }
            } else {
                dd1Var.add(obj);
            }
        }
    }

    public abstract int a(ge1 ge1Var);

    public final cc1 b() {
        try {
            int iA = ((wc1) this).a(null);
            cc1 cc1Var = ec1.f3903b;
            byte[] bArr = new byte[iA];
            Logger logger = mc1.f6900d;
            kc1 kc1Var = new kc1(bArr, iA);
            ((wc1) this).w(kc1Var);
            if (kc1Var.M0() == 0) {
                return new cc1(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(e("ByteString"), e10);
        }
    }

    public final byte[] d() {
        try {
            int iA = ((wc1) this).a(null);
            byte[] bArr = new byte[iA];
            Logger logger = mc1.f6900d;
            kc1 kc1Var = new kc1(bArr, iA);
            ((wc1) this).w(kc1Var);
            if (kc1Var.M0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(e("byte array"), e10);
        }
    }

    public final String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }
}
