package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = k0.m.f14637a;
            k0.l.a("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f604j != null) {
                l.a().c();
            }
            k0.l.b();
        } catch (Throwable th) {
            int i11 = k0.m.f14637a;
            k0.l.b();
            throw th;
        }
    }
}
