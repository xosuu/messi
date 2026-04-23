package androidx.fragment.app;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f719r;

    public a(j0 j0Var) {
        j0Var.C();
        v vVar = j0Var.f797p;
        if (vVar != null) {
            vVar.f914y.getClassLoader();
        }
        this.f702a = new ArrayList();
        this.f716o = false;
        this.f719r = -1;
        this.f717p = j0Var;
    }

    @Override // androidx.fragment.app.h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f708g) {
            return true;
        }
        j0 j0Var = this.f717p;
        if (j0Var.f785d == null) {
            j0Var.f785d = new ArrayList();
        }
        j0Var.f785d.add(this);
        return true;
    }

    public final void b(o0 o0Var) {
        this.f702a.add(o0Var);
        o0Var.f846c = this.f703b;
        o0Var.f847d = this.f704c;
        o0Var.f848e = this.f705d;
        o0Var.f849f = this.f706e;
    }

    public final void c(int i10) {
        if (this.f708g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            int size = this.f702a.size();
            for (int i11 = 0; i11 < size; i11++) {
                o0 o0Var = (o0) this.f702a.get(i11);
                s sVar = o0Var.f845b;
                if (sVar != null) {
                    sVar.D += i10;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(o0Var.f845b);
                        int i12 = o0Var.f845b.D;
                    }
                }
            }
        }
    }

    public final int d(boolean z9) {
        if (this.f718q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new z0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f718q = true;
        boolean z10 = this.f708g;
        j0 j0Var = this.f717p;
        if (z10) {
            this.f719r = j0Var.f790i.getAndIncrement();
        } else {
            this.f719r = -1;
        }
        j0Var.v(this, z9);
        return this.f719r;
    }

    public final void e(int i10, s sVar, String str, int i11) {
        Class<?> cls = sVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = sVar.K;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + sVar + ": was " + sVar.K + " now " + str);
            }
            sVar.K = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + sVar + " with tag " + str + " to container view with no id");
            }
            int i12 = sVar.I;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + sVar + ": was " + sVar.I + " now " + i10);
            }
            sVar.I = i10;
            sVar.J = i10;
        }
        b(new o0(i11, sVar));
        sVar.E = this.f717p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f709h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f719r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f718q);
            if (this.f707f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f707f));
            }
            if (this.f703b != 0 || this.f704c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f703b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f704c));
            }
            if (this.f705d != 0 || this.f706e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f705d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f706e));
            }
            if (this.f710i != 0 || this.f711j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f710i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f711j);
            }
            if (this.f712k != 0 || this.f713l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f712k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f713l);
            }
        }
        if (this.f702a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f702a.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) this.f702a.get(i10);
            switch (o0Var.f844a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + o0Var.f844a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o0Var.f845b);
            if (z9) {
                if (o0Var.f846c != 0 || o0Var.f847d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f846c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f847d));
                }
                if (o0Var.f848e != 0 || o0Var.f849f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f848e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f849f));
                }
            }
        }
    }

    public final void g() {
        int size = this.f702a.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) this.f702a.get(i10);
            s sVar = o0Var.f845b;
            if (sVar != null) {
                if (sVar.V != null) {
                    sVar.i().f863c = false;
                }
                int i11 = this.f707f;
                if (sVar.V != null || i11 != 0) {
                    sVar.i();
                    sVar.V.f868h = i11;
                }
                ArrayList arrayList = this.f714m;
                ArrayList arrayList2 = this.f715n;
                sVar.i();
                q qVar = sVar.V;
                qVar.f869i = arrayList;
                qVar.f870j = arrayList2;
            }
            int i12 = o0Var.f844a;
            j0 j0Var = this.f717p;
            switch (i12) {
                case 1:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.T(sVar, false);
                    j0Var.a(sVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + o0Var.f844a);
                case 3:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.O(sVar);
                    break;
                case 4:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.E(sVar);
                    break;
                case 5:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.T(sVar, false);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(sVar);
                    }
                    if (sVar.L) {
                        sVar.L = false;
                        sVar.W = !sVar.W;
                    }
                    break;
                case 6:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.g(sVar);
                    break;
                case 7:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.T(sVar, false);
                    j0Var.c(sVar);
                    break;
                case 8:
                    j0Var.V(sVar);
                    break;
                case 9:
                    j0Var.V(null);
                    break;
                case 10:
                    j0Var.U(sVar, o0Var.f851h);
                    break;
            }
        }
    }

    public final void h() {
        for (int size = this.f702a.size() - 1; size >= 0; size--) {
            o0 o0Var = (o0) this.f702a.get(size);
            s sVar = o0Var.f845b;
            if (sVar != null) {
                if (sVar.V != null) {
                    sVar.i().f863c = true;
                }
                int i10 = this.f707f;
                int i11 = i10 != 4097 ? i10 != 4099 ? i10 != 8194 ? 0 : 4097 : 4099 : 8194;
                if (sVar.V != null || i11 != 0) {
                    sVar.i();
                    sVar.V.f868h = i11;
                }
                ArrayList arrayList = this.f715n;
                ArrayList arrayList2 = this.f714m;
                sVar.i();
                q qVar = sVar.V;
                qVar.f869i = arrayList;
                qVar.f870j = arrayList2;
            }
            int i12 = o0Var.f844a;
            j0 j0Var = this.f717p;
            switch (i12) {
                case 1:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.T(sVar, true);
                    j0Var.O(sVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + o0Var.f844a);
                case 3:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.a(sVar);
                    break;
                case 4:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.getClass();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(sVar);
                    }
                    if (sVar.L) {
                        sVar.L = false;
                        sVar.W = !sVar.W;
                    }
                    break;
                case 5:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.T(sVar, true);
                    j0Var.E(sVar);
                    break;
                case 6:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.c(sVar);
                    break;
                case 7:
                    sVar.V(o0Var.f846c, o0Var.f847d, o0Var.f848e, o0Var.f849f);
                    j0Var.T(sVar, true);
                    j0Var.g(sVar);
                    break;
                case 8:
                    j0Var.V(null);
                    break;
                case 9:
                    j0Var.V(sVar);
                    break;
                case 10:
                    j0Var.U(sVar, o0Var.f850g);
                    break;
            }
        }
    }

    public final void i(s sVar) {
        j0 j0Var = sVar.E;
        if (j0Var == null || j0Var == this.f717p) {
            b(new o0(3, sVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + sVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f719r >= 0) {
            sb.append(" #");
            sb.append(this.f719r);
        }
        if (this.f709h != null) {
            sb.append(" ");
            sb.append(this.f709h);
        }
        sb.append("}");
        return sb.toString();
    }
}
