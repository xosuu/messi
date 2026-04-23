package p2;

import android.os.ParcelFileDescriptor;
import ca.psiphon.PsiphonTunnel;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f16227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16228b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16229d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16230f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f16231h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f16232q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f16233s;

    public a(ParcelFileDescriptor parcelFileDescriptor, int i10, String str, String str2, String str3, String str4, boolean z9) {
        this.f16227a = parcelFileDescriptor;
        this.f16228b = i10;
        this.f16229d = str;
        this.f16230f = str2;
        this.f16231h = str3;
        this.f16232q = str4;
        this.f16233s = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PsiphonTunnel.runTun2Socks(this.f16227a.detachFd(), this.f16228b, this.f16229d, this.f16230f, this.f16231h, this.f16232q, this.f16233s ? 1 : 0);
    }
}
