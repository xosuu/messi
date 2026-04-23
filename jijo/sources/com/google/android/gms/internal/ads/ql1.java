package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f8220g;

    public ql1(int i10) {
        this.f8214a = 1;
        this.f8215b = 0L;
        this.f8216c = 0L;
        this.f8217d = 0L;
        this.f8218e = 512;
        this.f8219f = Long.MAX_VALUE;
        this.f8220g = new u7.a(Math.min(642, 11));
    }

    public final y7.a a(x7.d dVar) {
        if (dVar.f18550u == null) {
            dVar.f18550u = new x7.d(dVar);
        }
        x7.d dVar2 = dVar.f18550u;
        synchronized (this) {
            y7.a aVar = (y7.a) ((LinkedHashMap) this.f8220g).get(dVar2);
            if (aVar == null) {
                this.f8215b++;
            } else {
                x7.d dVar3 = aVar.f20468a;
                long j10 = dVar3.f18549t;
                if (j10 < 0) {
                    dVar3.f18549t = Long.MAX_VALUE;
                    Iterator it = dVar3.f18541l.iterator();
                    while (it.hasNext()) {
                        dVar3.f18549t = Math.min(dVar3.f18549t, ((f8.y) it.next()).f13526e);
                    }
                    j10 = dVar3.f18549t;
                }
                if ((Math.min(j10, this.f8219f) * 1000) + dVar3.f18546q >= System.currentTimeMillis()) {
                    this.f8217d++;
                    return aVar;
                }
                this.f8215b++;
                this.f8216c++;
                ((LinkedHashMap) this.f8220g).remove(dVar2);
            }
            return null;
        }
    }

    public final void b(int i10) {
        this.f8218e = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f8217d = 0L;
            this.f8219f = -1L;
            this.f8215b = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f8216c = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f8216c = j10;
    }

    public final String toString() {
        switch (this.f8214a) {
            case 1:
                return "LRUCache{usage=" + ((LinkedHashMap) this.f8220g).size() + "/" + this.f8218e + ", hits=" + this.f8217d + ", misses=" + this.f8215b + ", expires=" + this.f8216c + "}";
            default:
                return super.toString();
        }
    }

    public ql1(AudioTrack audioTrack) {
        this.f8214a = 0;
        this.f8220g = new x6(audioTrack);
        b(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ql1(Object obj) {
        this(0);
        this.f8214a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ql1() {
        this((Object) null);
        this.f8214a = 1;
    }
}
