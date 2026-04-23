package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cv0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f3456e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.l f3459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3460d;

    public cv0(Context context, ExecutorService executorService, k4.l lVar, boolean z9) {
        this.f3457a = context;
        this.f3458b = executorService;
        this.f3459c = lVar;
        this.f3460d = z9;
    }

    public static cv0 a(Context context, ExecutorService executorService, boolean z9) {
        k4.e eVar = new k4.e();
        if (z9) {
            executorService.execute(new vh0(context, 12, eVar));
        } else {
            executorService.execute(new yd0(15, eVar));
        }
        return new cv0(context, executorService, eVar.f14669a, z9);
    }

    public final void b(int i10, long j10, Exception exc) {
        d(i10, j10, exc, null, null);
    }

    public final void c(int i10, long j10) {
        d(i10, j10, null, null, null);
    }

    public final k4.l d(int i10, long j10, Exception exc, String str, String str2) {
        int i11 = 0;
        if (!this.f3460d) {
            k4.l lVar = this.f3459c;
            Executor executor = this.f3458b;
            vq0 vq0Var = new vq0(7, i11);
            lVar.getClass();
            k4.l lVar2 = new k4.l();
            lVar.f14683b.e(new k4.g(executor, vq0Var, lVar2, 0));
            lVar.i();
            return lVar2;
        }
        Context context = this.f3457a;
        e8 e8VarA = i8.A();
        String packageName = context.getPackageName();
        e8VarA.d();
        i8.G((i8) e8VarA.f9462b, packageName);
        e8VarA.d();
        i8.B((i8) e8VarA.f9462b, j10);
        int i12 = f3456e;
        e8VarA.d();
        i8.H((i8) e8VarA.f9462b, i12);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            e8VarA.d();
            i8.C((i8) e8VarA.f9462b, string);
            String name = exc.getClass().getName();
            e8VarA.d();
            i8.D((i8) e8VarA.f9462b, name);
        }
        if (str2 != null) {
            e8VarA.d();
            i8.E((i8) e8VarA.f9462b, str2);
        }
        if (str != null) {
            e8VarA.d();
            i8.F((i8) e8VarA.f9462b, str);
        }
        k4.l lVar3 = this.f3459c;
        Executor executor2 = this.f3458b;
        gp0 gp0Var = new gp0(i10, 9, e8VarA);
        lVar3.getClass();
        k4.l lVar4 = new k4.l();
        lVar3.f14683b.e(new k4.g(executor2, gp0Var, lVar4, 0));
        lVar3.i();
        return lVar4;
    }
}
