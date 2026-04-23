package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f603i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile l f604j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.c f606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f612h;

    public l(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f605a = reentrantReadWriteLock;
        this.f607c = 3;
        this.f610f = uVar.f600a;
        int i10 = uVar.f601b;
        this.f611g = i10;
        this.f612h = uVar.f602c;
        this.f608d = new Handler(Looper.getMainLooper());
        this.f606b = new s.c(0);
        g gVar = new g(9, this);
        this.f609e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f607c = 0;
            } catch (Throwable th) {
                this.f605a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            gVar.C();
        }
    }

    public static l a() {
        l lVar;
        synchronized (f603i) {
            try {
                lVar = f604j;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.f605a.readLock().lock();
        try {
            return this.f607c;
        } finally {
            this.f605a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f611g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f605a.writeLock().lock();
        try {
            if (this.f607c == 0) {
                return;
            }
            this.f607c = 0;
            this.f605a.writeLock().unlock();
            this.f609e.C();
        } finally {
            this.f605a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f605a.writeLock().lock();
        try {
            this.f607c = 2;
            arrayList.addAll(this.f606b);
            this.f606b.clear();
            this.f605a.writeLock().unlock();
            this.f608d.post(new b.d(arrayList, this.f607c, th));
        } catch (Throwable th2) {
            this.f605a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f605a.writeLock().lock();
        try {
            this.f607c = 1;
            arrayList.addAll(this.f606b);
            this.f606b.clear();
            this.f605a.writeLock().unlock();
            this.f608d.post(new b.d(this.f607c, arrayList));
        } catch (Throwable th) {
            this.f605a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i10, int i11, CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        b7.u.a("start should be <= than end", i10 <= i11);
        if (charSequence == null) {
            return null;
        }
        b7.u.a("start should be < than charSequence length", i10 <= charSequence.length());
        b7.u.a("end should be < than charSequence length", i11 <= charSequence.length());
        return (charSequence.length() == 0 || i10 == i11) ? charSequence : this.f609e.D(charSequence, i10, i11, false);
    }

    public final void g(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f605a.writeLock().lock();
        try {
            if (this.f607c == 1 || this.f607c == 2) {
                this.f608d.post(new b.d(jVar, this.f607c));
            } else {
                this.f606b.add(jVar);
            }
            this.f605a.writeLock().unlock();
        } catch (Throwable th) {
            this.f605a.writeLock().unlock();
            throw th;
        }
    }
}
