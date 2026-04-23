package com.google.android.gms.internal.ads;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kd1 {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i10) {
        return new JobInfo.TriggerContentUri(uri, i10);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern d() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e(int i10, int i11) {
        return new MediaCodec.CryptoInfo.Pattern(i10, i11);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ void l() {
    }
}
