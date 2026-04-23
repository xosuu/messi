package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f745a;

    public c0(j0 j0Var) {
        this.f745a = j0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        m0 m0VarF;
        View view2;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        j0 j0Var = this.f745a;
        if (zEquals) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context, attributeSet);
            fragmentContainerView.f678f = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f5b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id = fragmentContainerView.getId();
            s sVarZ = j0Var.z(id);
            if (classAttribute != null && sVarZ == null) {
                if (id <= 0) {
                    throw new IllegalStateException(fb1.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                }
                f0 f0VarC = j0Var.C();
                context.getClassLoader();
                s sVarA = f0VarC.a(classAttribute);
                sVarA.Q = true;
                v vVar = sVarA.F;
                if ((vVar == null ? null : vVar.f913x) != null) {
                    sVarA.Q = true;
                }
                a aVar = new a(j0Var);
                aVar.f716o = true;
                sVarA.R = fragmentContainerView;
                aVar.e(fragmentContainerView.getId(), sVarA, string, 1);
                if (aVar.f708g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                j0 j0Var2 = aVar.f717p;
                if (j0Var2.f797p != null && !j0Var2.C) {
                    j0Var2.w(true);
                    aVar.a(j0Var2.E, j0Var2.F);
                    j0Var2.f783b = true;
                    try {
                        j0Var2.P(j0Var2.E, j0Var2.F);
                        j0Var2.d();
                        j0Var2.a0();
                        j0Var2.t();
                        j0Var2.f784c.f841b.values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        j0Var2.d();
                        throw th;
                    }
                }
            }
            for (m0 m0Var : j0Var.f784c.d()) {
                s sVar = m0Var.f836c;
                if (sVar.J == fragmentContainerView.getId() && (view2 = sVar.S) != null && view2.getParent() == null) {
                    sVar.R = fragmentContainerView;
                    m0Var.b();
                }
            }
            return fragmentContainerView;
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a1.a.f4a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes2.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
        String string2 = typedArrayObtainStyledAttributes2.getString(2);
        typedArrayObtainStyledAttributes2.recycle();
        if (attributeValue != null) {
            try {
                if (s.class.isAssignableFrom(f0.b(context.getClassLoader(), attributeValue))) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string2 == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    s sVarZ2 = resourceId != -1 ? j0Var.z(resourceId) : null;
                    if (sVarZ2 == null && string2 != null) {
                        sVarZ2 = j0Var.A(string2);
                    }
                    if (sVarZ2 == null && id2 != -1) {
                        sVarZ2 = j0Var.z(id2);
                    }
                    if (sVarZ2 == null) {
                        f0 f0VarC2 = j0Var.C();
                        context.getClassLoader();
                        sVarZ2 = f0VarC2.a(attributeValue);
                        sVarZ2.f900z = true;
                        sVarZ2.I = resourceId != 0 ? resourceId : id2;
                        sVarZ2.J = id2;
                        sVarZ2.K = string2;
                        sVarZ2.A = true;
                        sVarZ2.E = j0Var;
                        v vVar2 = j0Var.f797p;
                        sVarZ2.F = vVar2;
                        Context context2 = vVar2.f914y;
                        sVarZ2.Q = true;
                        if ((vVar2 != null ? vVar2.f913x : null) != null) {
                            sVarZ2.Q = true;
                        }
                        m0VarF = j0Var.a(sVarZ2);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            sVarZ2.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (sVarZ2.A) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        sVarZ2.A = true;
                        sVarZ2.E = j0Var;
                        v vVar3 = j0Var.f797p;
                        sVarZ2.F = vVar3;
                        Context context3 = vVar3.f914y;
                        sVarZ2.Q = true;
                        if ((vVar3 != null ? vVar3.f913x : null) != null) {
                            sVarZ2.Q = true;
                        }
                        m0VarF = j0Var.f(sVarZ2);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            sVarZ2.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    sVarZ2.R = (ViewGroup) view;
                    m0VarF.k();
                    m0VarF.j();
                    View view3 = sVarZ2.S;
                    if (view3 == null) {
                        throw new IllegalStateException(fb1.i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view3.setId(resourceId);
                    }
                    if (sVarZ2.S.getTag() == null) {
                        sVarZ2.S.setTag(string2);
                    }
                    sVarZ2.S.addOnAttachStateChangeListener(new b0(this, m0VarF));
                    return sVarZ2.S;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }
}
