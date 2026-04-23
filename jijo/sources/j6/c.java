package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Handler;
import com.google.android.gms.internal.ads.en1;
import java.util.Iterator;
import java.util.LinkedList;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver implements f0, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14378b;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NetworkInfo f14384t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14379d = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14380f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14381h = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14382q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.activity.e f14383s = new androidx.activity.e(27, this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedList f14385u = new LinkedList();

    public c(y yVar) {
        this.f14378b = yVar;
        yVar.f14442v = this;
        this.f14377a = new Handler();
    }

    public final int a() {
        if (this.f14381h == 3) {
            return 2;
        }
        if (this.f14380f == 3) {
            return 3;
        }
        return this.f14379d == 3 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r17) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.b(android.content.Context):void");
    }

    public final boolean c() {
        return this.f14380f == 1 && this.f14381h == 1 && this.f14379d == 1;
    }

    public final void d(boolean z9) {
        m mVar = this.f14378b;
        if (z9) {
            this.f14381h = 3;
            ((y) mVar).c(a());
            return;
        }
        boolean zC = c();
        this.f14381h = 1;
        if (!c() || zC) {
            ((y) mVar).c(a());
            return;
        }
        y yVar = (y) mVar;
        if (yVar.f14439s) {
            yVar.f14439s = false;
            System.currentTimeMillis();
            yVar.b("hold release\n");
            yVar.b("bytecount 2\n");
            yVar.b("state on\n");
        }
        yVar.f14441u = 1;
    }

    @Override // j6.f0
    public final void m(long j10, long j11, long j12, long j13) {
        if (this.f14380f != 2) {
            return;
        }
        LinkedList linkedList = this.f14385u;
        linkedList.add(new b(System.currentTimeMillis(), j12 + j13));
        while (((b) linkedList.getFirst()).f14374a <= System.currentTimeMillis() - 60000) {
            linkedList.removeFirst();
        }
        Iterator it = linkedList.iterator();
        long j14 = 0;
        while (it.hasNext()) {
            j14 += ((b) it.next()).f14375b;
        }
        if (j14 < 65536) {
            this.f14380f = 3;
            de.blinkt.openvpn.core.c.k(R.string.ux, "64 kB", 60);
            ((y) this.f14378b).c(a());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPreferencesP = en1.p(context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            b(context);
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (sharedPreferencesP.getBoolean("screenoff", false)) {
                h6.d dVar = c0.f14387c;
                if (dVar != null && !dVar.S) {
                    de.blinkt.openvpn.core.c.h(R.string.uw);
                }
                this.f14380f = 2;
                this.f14385u.add(new b(System.currentTimeMillis(), 65536L));
                if (this.f14379d == 3 || this.f14381h == 3) {
                    this.f14380f = 3;
                    return;
                }
                return;
            }
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            boolean zC = c();
            this.f14380f = 1;
            this.f14377a.removeCallbacks(this.f14383s);
            boolean zC2 = c();
            m mVar = this.f14378b;
            if (zC2 == zC) {
                if (c()) {
                    return;
                }
                ((y) mVar).c(a());
                return;
            }
            y yVar = (y) mVar;
            if (yVar.f14439s) {
                yVar.f14439s = false;
                System.currentTimeMillis();
                yVar.b("hold release\n");
                yVar.b("bytecount 2\n");
                yVar.b("state on\n");
            }
            yVar.f14441u = 1;
        }
    }
}
