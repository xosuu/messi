package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks0 implements rs0, pu0, db1, qd1, qx0, an1, xp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6384a;

    public /* synthetic */ ks0(nb1 nb1Var) {
        this.f6384a = nb1Var;
    }

    public static ks0 o(ex0 ex0Var) {
        return new ks0(new mx0(ex0Var));
    }

    @Override // com.google.android.gms.internal.ads.xp1
    public final wz0 S(int i10, ow owVar, int[] iArr) {
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < owVar.f7685a) {
            qp1 qp1Var = new qp1(i10, owVar, i11, (up1) this.f6384a, iArr[i11]);
            int i13 = i12 + 1;
            int length = objArrCopyOf.length;
            if (length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i13));
            }
            objArrCopyOf[i12] = qp1Var;
            i11++;
            i12 = i13;
        }
        return bz0.j(i12, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final ByteBuffer a(int i10) {
        int i11 = yn0.f10944a;
        return ((MediaCodec) this.f6384a).getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void b(int i10) {
        ((MediaCodec) this.f6384a).releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final ByteBuffer c(int i10) {
        int i11 = yn0.f10944a;
        return ((MediaCodec) this.f6384a).getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void d(int i10) {
        ((MediaCodec) this.f6384a).setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void e(Bundle bundle) {
        ((MediaCodec) this.f6384a).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final /* synthetic */ boolean f(hn1 hn1Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void g(int i10, de1 de1Var, long j10) {
        ((MediaCodec) this.f6384a).queueSecureInputBuffer(i10, 0, de1Var.f3640i, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void h(Surface surface) {
        ((MediaCodec) this.f6384a).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f6384a).dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                int i10 = yn0.f10944a;
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.qd1
    public final pd1 j(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            qd1 qd1Var = ((qd1[]) this.f6384a)[i10];
            if (qd1Var.n(cls)) {
                return qd1Var.j(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void k(int i10, long j10) {
        ((MediaCodec) this.f6384a).releaseOutputBuffer(i10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.pu0
    public final void l(View view, JSONObject jSONObject, ou0 ou0Var, boolean z9, boolean z10) {
        ArrayList arrayList = new ArrayList();
        hu0 hu0Var = hu0.f5402c;
        if (hu0Var != null) {
            Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(hu0Var.f5404b);
            int size = collectionUnmodifiableCollection.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionUnmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((yt0) it.next()).f11032c.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (true) {
                        if (view3 == null) {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z11 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z11) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view3.getAlpha() != 0.0f) {
                            Object parent = view3.getParent();
                            view3 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            ((wu0) ou0Var).a((View) arrayList.get(i11), (pu0) this.f6384a, jSONObject, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void m(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f6384a).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.qd1
    public final boolean n(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((qd1[]) this.f6384a)[i10].n(cls)) {
                return true;
            }
        }
        return false;
    }

    public final List p(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itF = ((px0) this.f6384a).f(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        return (dq1) this.f6384a;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final MediaFormat zzc() {
        return ((MediaCodec) this.f6384a).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void zzi() {
        ((MediaCodec) this.f6384a).flush();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void zzl() {
        ((MediaCodec) this.f6384a).release();
    }

    public /* synthetic */ ks0(Object obj) {
        this.f6384a = obj;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final int zza() {
        return ((MediaCodec) this.f6384a).dequeueInputBuffer(0L);
    }

    public /* synthetic */ ks0(MediaCodec mediaCodec) {
        this.f6384a = mediaCodec;
        int i10 = yn0.f10944a;
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            ((bt0) this.f6384a).zzi();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.db1
    public final Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        eb1 eb1Var = eb1.f3896b;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Object obj = this.f6384a;
            if (zHasNext) {
                try {
                    return ((nb1) obj).c(str, (Provider) it.next());
                } catch (Exception unused) {
                }
            } else {
                return ((nb1) obj).c(str, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pu0
    public final JSONObject zza(View view) {
        int currentModeType;
        JSONObject jSONObjectA = uu0.a(0, 0, 0, 0);
        UiModeManager uiModeManager = tp1.f9255w;
        int i10 = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : tc1.Q;
        int i11 = i10 - 1;
        if (i10 != 0) {
            try {
                jSONObjectA.put("noOutputDevice", i11 == 0);
            } catch (JSONException unused) {
                tp1.E();
            }
            return jSONObjectA;
        }
        throw null;
    }
}
