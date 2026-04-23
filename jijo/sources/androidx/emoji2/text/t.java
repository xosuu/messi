package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import com.google.android.gms.internal.ads.gp0;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l.q f639b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d5.e f640d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f641f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f642h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Executor f643q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ThreadPoolExecutor f644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b4.f f645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0.a f646u;

    public t(Context context, l.q qVar) {
        d5.e eVar = u.f647d;
        this.f641f = new Object();
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.f638a = context.getApplicationContext();
        this.f639b = qVar;
        this.f640d = eVar;
    }

    @Override // androidx.emoji2.text.k
    public final void a(b4.f fVar) {
        synchronized (this.f641f) {
            this.f645t = fVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f641f) {
            try {
                this.f645t = null;
                t0.a aVar = this.f646u;
                if (aVar != null) {
                    d5.e eVar = this.f640d;
                    Context context = this.f638a;
                    eVar.getClass();
                    context.getContentResolver().unregisterContentObserver(aVar);
                    this.f646u = null;
                }
                Handler handler = this.f642h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f642h = null;
                ThreadPoolExecutor threadPoolExecutor = this.f644s;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f643q = null;
                this.f644s = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f641f) {
            try {
                if (this.f645t == null) {
                    return;
                }
                if (this.f643q == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f644s = threadPoolExecutor;
                    this.f643q = threadPoolExecutor;
                }
                final int i10 = 0;
                this.f643q.execute(new Runnable(this) { // from class: androidx.emoji2.text.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f637b;

                    {
                        this.f637b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                t tVar = this.f637b;
                                synchronized (tVar.f641f) {
                                    try {
                                        if (tVar.f645t == null) {
                                            return;
                                        }
                                        try {
                                            l0.i iVarD = tVar.d();
                                            int i11 = iVarD.f15118e;
                                            if (i11 == 2) {
                                                synchronized (tVar.f641f) {
                                                }
                                            }
                                            if (i11 != 0) {
                                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                                            }
                                            try {
                                                int i12 = k0.m.f14637a;
                                                k0.l.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                d5.e eVar = tVar.f640d;
                                                Context context = tVar.f638a;
                                                eVar.getClass();
                                                Typeface typefaceT = g0.g.f13608a.t(context, new l0.i[]{iVarD}, 0);
                                                MappedByteBuffer mappedByteBufferP = z3.a.P(tVar.f638a, iVarD.f15114a);
                                                if (mappedByteBufferP == null || typefaceT == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    k0.l.a("EmojiCompat.MetadataRepo.create");
                                                    j2.h hVar = new j2.h(typefaceT, q7.b.o(mappedByteBufferP));
                                                    k0.l.b();
                                                    k0.l.b();
                                                    synchronized (tVar.f641f) {
                                                        try {
                                                            b4.f fVar = tVar.f645t;
                                                            if (fVar != null) {
                                                                fVar.D(hVar);
                                                            }
                                                        } finally {
                                                        }
                                                        break;
                                                    }
                                                    tVar.b();
                                                    return;
                                                } finally {
                                                    int i13 = k0.m.f14637a;
                                                    k0.l.b();
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        } catch (Throwable th2) {
                                            synchronized (tVar.f641f) {
                                                try {
                                                    b4.f fVar2 = tVar.f645t;
                                                    if (fVar2 != null) {
                                                        fVar2.B(th2);
                                                    }
                                                    tVar.b();
                                                    return;
                                                } finally {
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            default:
                                this.f637b.c();
                                return;
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l0.i d() throws Throwable {
        try {
            d5.e eVar = this.f640d;
            Context context = this.f638a;
            l.q qVar = this.f639b;
            eVar.getClass();
            gp0 gp0VarA = l0.d.a(context, qVar);
            if (gp0VarA.f5025b != 0) {
                throw new RuntimeException(l.a0.h(new StringBuilder("fetchFonts failed ("), gp0VarA.f5025b, ")"));
            }
            l0.i[] iVarArr = (l0.i[]) gp0VarA.f5026d;
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
