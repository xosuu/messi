package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import com.google.android.gms.internal.ads.fb1;
import g1.a;
import g4.a0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import q1.b;
import q1.f;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1113a;

    public Recreator(f fVar) {
        a0.f(fVar, "owner");
        this.f1113a = fVar;
    }

    @Override // androidx.lifecycle.o
    public final void a(q qVar, k kVar) {
        if (kVar != k.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        qVar.h().b(this);
        f fVar = this.f1113a;
        Bundle bundleA = fVar.a().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                a0.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        a0.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((i) ((b) objNewInstance)).a(fVar);
                    } catch (Exception e10) {
                        throw new RuntimeException(a.q("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(fb1.i("Class ", str, " wasn't found"), e12);
            }
        }
    }
}
