package de.blinkt.openvpn.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.util.Pair;
import f.k;
import j6.f0;
import j6.g0;
import j6.h0;
import j6.t;
import j6.u;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class OpenVPNStatusService extends Service implements g0, f0, h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RemoteCallbackList f12560a = new RemoteCallbackList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12561b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u f12562d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f12563f;

    static {
        t tVar = new t();
        tVar.attachInterface(tVar, "de.blinkt.openvpn.core.IServiceStatus");
        f12561b = tVar;
        f12563f = new k(0);
    }

    @Override // j6.h0
    public final void a0(String str) {
        f12563f.obtainMessage(103, str).sendToTarget();
    }

    @Override // j6.g0
    public final void b(LogItem logItem) {
        f12563f.obtainMessage(100, logItem).sendToTarget();
    }

    @Override // j6.f0
    public final void m(long j10, long j11, long j12, long j13) {
        f12563f.obtainMessage(102, Pair.create(Long.valueOf(j10), Long.valueOf(j11))).sendToTarget();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return f12561b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        LinkedList linkedList = c.f12574a;
        synchronized (c.class) {
            c.f12575b.add(this);
        }
        c.a(this);
        c.b(this);
        k kVar = f12563f;
        kVar.getClass();
        kVar.f12887b = new WeakReference(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        LinkedList linkedList = c.f12574a;
        synchronized (c.class) {
            c.f12575b.remove(this);
        }
        c.s(this);
        c.t(this);
        f12560a.kill();
    }

    @Override // j6.h0
    public final void t(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent) {
        u uVar = new u();
        uVar.f14417a = str;
        uVar.f14421e = i10;
        uVar.f14418b = str2;
        uVar.f14419c = connectionStatus;
        uVar.f14420d = intent;
        f12562d = uVar;
        f12563f.obtainMessage(101, uVar).sendToTarget();
    }
}
