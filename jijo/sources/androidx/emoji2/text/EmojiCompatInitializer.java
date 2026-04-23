package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements t1.b {
    @Override // t1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // t1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        u uVar = new u(new s3.g(context, 0));
        uVar.f601b = 1;
        if (l.f604j == null) {
            synchronized (l.f603i) {
                try {
                    if (l.f604j == null) {
                        l.f604j = new l(uVar);
                    }
                } finally {
                }
            }
        }
        d(context);
        return Boolean.TRUE;
    }

    public final void d(Context context) {
        Object objB;
        t1.a aVarC = t1.a.c(context);
        aVarC.getClass();
        synchronized (t1.a.f16815e) {
            try {
                objB = aVarC.f16816a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.s sVarH = ((androidx.lifecycle.q) objB).h();
        sVarH.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void onResume() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
                sVarH.b(this);
            }
        });
    }
}
