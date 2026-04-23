package androidx.core.app;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(int i10, int i11, int i12) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, i12);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void j() {
    }
}
