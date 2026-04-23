package s1;

import android.content.Context;
import android.os.Build;
import java.io.File;
import l.b0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16671b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f16672d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16673f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f16674h = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f16675q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16676s;

    public e(Context context, String str, b0 b0Var, boolean z9) {
        this.f16670a = context;
        this.f16671b = str;
        this.f16672d = b0Var;
        this.f16673f = z9;
    }

    public final d a() {
        d dVar;
        synchronized (this.f16674h) {
            try {
                if (this.f16675q == null) {
                    b[] bVarArr = new b[1];
                    if (Build.VERSION.SDK_INT < 23 || this.f16671b == null || !this.f16673f) {
                        this.f16675q = new d(this.f16670a, this.f16671b, bVarArr, this.f16672d);
                    } else {
                        this.f16675q = new d(this.f16670a, new File(this.f16670a.getNoBackupFilesDir(), this.f16671b).getAbsolutePath(), bVarArr, this.f16672d);
                    }
                    this.f16675q.setWriteAheadLoggingEnabled(this.f16676s);
                }
                dVar = this.f16675q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // r1.d
    public final String getDatabaseName() {
        return this.f16671b;
    }

    @Override // r1.d
    public final void setWriteAheadLoggingEnabled(boolean z9) {
        synchronized (this.f16674h) {
            try {
                d dVar = this.f16675q;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z9);
                }
                this.f16676s = z9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r1.d
    public final r1.a y() {
        return a().c();
    }
}
