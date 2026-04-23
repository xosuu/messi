package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi1 implements qe0, bn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7585b;

    public /* synthetic */ oi1(int i10, Object obj) {
        this.f7584a = i10;
        this.f7585b = obj;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void a(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f7585b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void b(Bundle bundle) {
        ((MediaCodec) this.f7585b).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void c(int i10, de1 de1Var, long j10) {
        ((MediaCodec) this.f7585b).queueSecureInputBuffer(i10, 0, de1Var.f3640i, j10, 0);
    }

    public final void d(dk1 dk1Var) {
        Object obj = this.f7585b;
        for (gq1 gq1Var : (CopyOnWriteArrayList) obj) {
            if (gq1Var.f5035b == dk1Var) {
                gq1Var.f5036c = true;
                ((CopyOnWriteArrayList) obj).remove(gq1Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        int i10 = this.f7584a;
        Object obj2 = this.f7585b;
        switch (i10) {
            case 0:
                int i11 = ui1.V;
                ((dk1) obj).O((fk) obj2);
                break;
            default:
                ((dk1) obj).H((e10) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzh() {
    }

    public oi1() {
        this.f7584a = 4;
        this.f7585b = new CopyOnWriteArrayList();
    }
}
