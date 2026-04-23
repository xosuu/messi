package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonIOException;
import com.google.gson.j;
import com.google.gson.x;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Method f12145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Field f12146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f12148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f12149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r5.a f12150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f12151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f12152m;

    public e(String str, String str2, boolean z9, boolean z10, boolean z11, Method method, Field field, boolean z12, x xVar, j jVar, r5.a aVar, boolean z13, boolean z14) {
        this.f12144e = z11;
        this.f12145f = method;
        this.f12146g = field;
        this.f12147h = z12;
        this.f12148i = xVar;
        this.f12149j = jVar;
        this.f12150k = aVar;
        this.f12151l = z13;
        this.f12152m = z14;
        this.f12140a = str;
        this.f12141b = str2;
        this.f12142c = z9;
        this.f12143d = z10;
    }

    public final void a(s5.b bVar, Object obj) {
        Object objInvoke;
        if (this.f12142c) {
            boolean z9 = this.f12144e;
            Field field = this.f12146g;
            Method method = this.f12145f;
            if (z9) {
                if (method == null) {
                    ReflectiveTypeAdapterFactory.b(obj, field);
                } else {
                    ReflectiveTypeAdapterFactory.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e10) {
                    throw new JsonIOException(fb1.i("Accessor ", q5.c.c(method, false), " threw exception"), e10.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.E(this.f12140a);
            boolean z10 = this.f12147h;
            x typeAdapterRuntimeTypeWrapper = this.f12148i;
            if (!z10) {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.f12149j, typeAdapterRuntimeTypeWrapper, this.f12150k.f16537b);
            }
            typeAdapterRuntimeTypeWrapper.c(bVar, objInvoke);
        }
    }
}
