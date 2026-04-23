package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class u9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f9419c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile xv0 f9420d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Random f9421e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja f9422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f9423b;

    public u9(ja jaVar) {
        this.f9422a = jaVar;
        jaVar.f5851b.execute(new s9(1, this));
    }

    public final void a(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f9419c.block();
            if (!this.f9423b.booleanValue() || f9420d == null) {
                return;
            }
            e8 e8VarA = i8.A();
            String packageName = this.f9422a.f5850a.getPackageName();
            e8VarA.d();
            i8.G((i8) e8VarA.f9462b, packageName);
            e8VarA.d();
            i8.B((i8) e8VarA.f9462b, j10);
            if (str != null) {
                e8VarA.d();
                i8.E((i8) e8VarA.f9462b, str);
            }
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
            xv0 xv0Var = f9420d;
            byte[] bArrD = ((i8) e8VarA.b()).d();
            xv0Var.getClass();
            androidx.activity.result.h hVar = new androidx.activity.result.h();
            hVar.f201f = xv0Var;
            hVar.f200d = bArrD;
            hVar.f199b = i10;
            if (i11 != -1) {
                hVar.f198a = i11;
            }
            hVar.a();
        } catch (Exception unused) {
        }
    }
}
