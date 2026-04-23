package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b0.g f12201u = new b0.g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f12202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12203b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f12204d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12205f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12206h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f12207q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f12208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h f12209t;

    public k(boolean z9) {
        b0.g gVar = f12201u;
        this.f12205f = 0;
        this.f12206h = 0;
        this.f12202a = gVar;
        this.f12203b = z9;
        this.f12207q = new j(z9);
    }

    public final j a(Object obj, boolean z9) {
        int iCompareTo;
        j jVar;
        j jVar2 = this.f12204d;
        b0.g gVar = f12201u;
        Comparator comparator = this.f12202a;
        if (jVar2 != null) {
            Comparable comparable = comparator == gVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = jVar2.f12197q;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return jVar2;
                }
                j jVar3 = iCompareTo < 0 ? jVar2.f12193b : jVar2.f12194d;
                if (jVar3 == null) {
                    break;
                }
                jVar2 = jVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z9) {
            return null;
        }
        j jVar4 = this.f12207q;
        if (jVar2 != null) {
            jVar = new j(this.f12203b, jVar2, obj, jVar4, jVar4.f12196h);
            if (iCompareTo < 0) {
                jVar2.f12193b = jVar;
            } else {
                jVar2.f12194d = jVar;
            }
            b(jVar2, true);
        } else {
            if (comparator == gVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            jVar = new j(this.f12203b, jVar2, obj, jVar4, jVar4.f12196h);
            this.f12204d = jVar;
        }
        this.f12205f++;
        this.f12206h++;
        return jVar;
    }

    public final void b(j jVar, boolean z9) {
        while (jVar != null) {
            j jVar2 = jVar.f12193b;
            j jVar3 = jVar.f12194d;
            int i10 = jVar2 != null ? jVar2.f12200u : 0;
            int i11 = jVar3 != null ? jVar3.f12200u : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                j jVar4 = jVar3.f12193b;
                j jVar5 = jVar3.f12194d;
                int i13 = (jVar4 != null ? jVar4.f12200u : 0) - (jVar5 != null ? jVar5.f12200u : 0);
                if (i13 == -1 || (i13 == 0 && !z9)) {
                    e(jVar);
                } else {
                    f(jVar3);
                    e(jVar);
                }
                if (z9) {
                    return;
                }
            } else if (i12 == 2) {
                j jVar6 = jVar2.f12193b;
                j jVar7 = jVar2.f12194d;
                int i14 = (jVar6 != null ? jVar6.f12200u : 0) - (jVar7 != null ? jVar7.f12200u : 0);
                if (i14 == 1 || (i14 == 0 && !z9)) {
                    f(jVar);
                } else {
                    e(jVar2);
                    f(jVar);
                }
                if (z9) {
                    return;
                }
            } else if (i12 == 0) {
                jVar.f12200u = i10 + 1;
                if (z9) {
                    return;
                }
            } else {
                jVar.f12200u = Math.max(i10, i11) + 1;
                if (!z9) {
                    return;
                }
            }
            jVar = jVar.f12192a;
        }
    }

    public final void c(j jVar, boolean z9) {
        j jVar2;
        j jVar3;
        int i10;
        if (z9) {
            j jVar4 = jVar.f12196h;
            jVar4.f12195f = jVar.f12195f;
            jVar.f12195f.f12196h = jVar4;
        }
        j jVar5 = jVar.f12193b;
        j jVar6 = jVar.f12194d;
        j jVar7 = jVar.f12192a;
        int i11 = 0;
        if (jVar5 == null || jVar6 == null) {
            if (jVar5 != null) {
                d(jVar, jVar5);
                jVar.f12193b = null;
            } else if (jVar6 != null) {
                d(jVar, jVar6);
                jVar.f12194d = null;
            } else {
                d(jVar, null);
            }
            b(jVar7, false);
            this.f12205f--;
            this.f12206h++;
            return;
        }
        if (jVar5.f12200u > jVar6.f12200u) {
            j jVar8 = jVar5.f12194d;
            while (true) {
                j jVar9 = jVar8;
                jVar3 = jVar5;
                jVar5 = jVar9;
                if (jVar5 == null) {
                    break;
                } else {
                    jVar8 = jVar5.f12194d;
                }
            }
        } else {
            j jVar10 = jVar6.f12193b;
            while (true) {
                jVar2 = jVar6;
                jVar6 = jVar10;
                if (jVar6 == null) {
                    break;
                } else {
                    jVar10 = jVar6.f12193b;
                }
            }
            jVar3 = jVar2;
        }
        c(jVar3, false);
        j jVar11 = jVar.f12193b;
        if (jVar11 != null) {
            i10 = jVar11.f12200u;
            jVar3.f12193b = jVar11;
            jVar11.f12192a = jVar3;
            jVar.f12193b = null;
        } else {
            i10 = 0;
        }
        j jVar12 = jVar.f12194d;
        if (jVar12 != null) {
            i11 = jVar12.f12200u;
            jVar3.f12194d = jVar12;
            jVar12.f12192a = jVar3;
            jVar.f12194d = null;
        }
        jVar3.f12200u = Math.max(i10, i11) + 1;
        d(jVar, jVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f12204d = null;
        this.f12205f = 0;
        this.f12206h++;
        j jVar = this.f12207q;
        jVar.f12196h = jVar;
        jVar.f12195f = jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        j jVarA = null;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return jVarA != null;
    }

    public final void d(j jVar, j jVar2) {
        j jVar3 = jVar.f12192a;
        jVar.f12192a = null;
        if (jVar2 != null) {
            jVar2.f12192a = jVar3;
        }
        if (jVar3 == null) {
            this.f12204d = jVar2;
        } else if (jVar3.f12193b == jVar) {
            jVar3.f12193b = jVar2;
        } else {
            jVar3.f12194d = jVar2;
        }
    }

    public final void e(j jVar) {
        j jVar2 = jVar.f12193b;
        j jVar3 = jVar.f12194d;
        j jVar4 = jVar3.f12193b;
        j jVar5 = jVar3.f12194d;
        jVar.f12194d = jVar4;
        if (jVar4 != null) {
            jVar4.f12192a = jVar;
        }
        d(jVar, jVar3);
        jVar3.f12193b = jVar;
        jVar.f12192a = jVar3;
        int iMax = Math.max(jVar2 != null ? jVar2.f12200u : 0, jVar4 != null ? jVar4.f12200u : 0) + 1;
        jVar.f12200u = iMax;
        jVar3.f12200u = Math.max(iMax, jVar5 != null ? jVar5.f12200u : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h hVar = this.f12208s;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f12208s = hVar2;
        return hVar2;
    }

    public final void f(j jVar) {
        j jVar2 = jVar.f12193b;
        j jVar3 = jVar.f12194d;
        j jVar4 = jVar2.f12193b;
        j jVar5 = jVar2.f12194d;
        jVar.f12193b = jVar5;
        if (jVar5 != null) {
            jVar5.f12192a = jVar;
        }
        d(jVar, jVar2);
        jVar2.f12194d = jVar;
        jVar.f12192a = jVar2;
        int iMax = Math.max(jVar3 != null ? jVar3.f12200u : 0, jVar5 != null ? jVar5.f12200u : 0) + 1;
        jVar.f12200u = iMax;
        jVar2.f12200u = Math.max(iMax, jVar4 != null ? jVar4.f12200u : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        j jVarA;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            return jVarA.f12199t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        h hVar = this.f12209t;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f12209t = hVar2;
        return hVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f12203b) {
            throw new NullPointerException("value == null");
        }
        j jVarA = a(obj, true);
        Object obj3 = jVarA.f12199t;
        jVarA.f12199t = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j jVarA;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            c(jVarA, true);
        }
        if (jVarA != null) {
            return jVarA.f12199t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12205f;
    }
}
