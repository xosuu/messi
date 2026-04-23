package androidx.lifecycle;

import com.google.android.gms.internal.ads.ur0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends u6.e implements t6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f966b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.fragment.app.w wVar) {
        super(0);
        this.f966b = wVar;
    }

    @Override // t6.a
    public final Object a() {
        o0 o0Var = this.f966b;
        g4.a0.f(o0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        u6.j.f17662a.getClass();
        Class clsA = new u6.b(i0.class).a();
        g4.a0.d(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new c1.f(clsA));
        Object[] array = arrayList.toArray(new c1.f[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c1.f[] fVarArr = (c1.f[]) array;
        return (i0) new ur0(o0Var, new c1.c((c1.f[]) Arrays.copyOf(fVarArr, fVarArr.length))).t(i0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
