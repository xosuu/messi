package b7;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.en1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f1455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f1457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f1459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v3.k f1461i = new v3.k("CLOSED_EMPTY", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v3.k f1462j = new v3.k("COMPLETING_ALREADY", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v3.k f1463k = new v3.k("COMPLETING_WAITING_CHILDREN", 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v3.k f1464l = new v3.k("COMPLETING_RETRY", 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v3.k f1465m = new v3.k("TOO_LATE_TO_CANCEL", 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v3.k f1466n = new v3.k("SEALED", 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d0 f1467o = new d0(false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d0 f1468p = new d0(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Boolean f1469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static h9.a f1470r;

    public static final String A(n6.e eVar) {
        Object objM;
        if (eVar instanceof d7.e) {
            return eVar.toString();
        }
        try {
            objM = eVar + '@' + m(eVar);
        } catch (Throwable th) {
            objM = en1.m(th);
        }
        if (l6.c.a(objM) != null) {
            objM = eVar.getClass().getName() + '@' + m(eVar);
        }
        return (String) objM;
    }

    public static void B(View view, String str) {
        if (view == null || str == null) {
            return;
        }
        view.announceForAccessibility(str);
    }

    public static boolean C(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    public static void a(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int d(m1.b1 b1Var, m1.a0 a0Var, View view, View view2, m1.p0 p0Var, boolean z9) {
        if (p0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return Math.abs(m1.p0.D(view) - m1.p0.D(view2)) + 1;
        }
        return Math.min(a0Var.g(), a0Var.b(view2) - a0Var.d(view));
    }

    public static int e(m1.b1 b1Var, m1.a0 a0Var, View view, View view2, m1.p0 p0Var, boolean z9, boolean z10) {
        if (p0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (b1Var.b() - Math.max(m1.p0.D(view), m1.p0.D(view2))) - 1) : Math.max(0, Math.min(m1.p0.D(view), m1.p0.D(view2)));
        if (z9) {
            return Math.round((iMax * (Math.abs(a0Var.b(view2) - a0Var.d(view)) / (Math.abs(m1.p0.D(view) - m1.p0.D(view2)) + 1))) + (a0Var.f() - a0Var.d(view)));
        }
        return iMax;
    }

    public static int f(m1.b1 b1Var, m1.a0 a0Var, View view, View view2, m1.p0 p0Var, boolean z9) {
        if (p0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return b1Var.b();
        }
        return (int) (((a0Var.b(view2) - a0Var.d(view)) / (Math.abs(m1.p0.D(view) - m1.p0.D(view2)) + 1)) * b1Var.b());
    }

    public static void g(String str, String str2) {
        h9.a aVar = f1470r;
        if (aVar != null) {
            aVar.a(3, str, str2);
        }
    }

    public static void h(String str, String str2) {
        h9.a aVar = f1470r;
        if (aVar != null) {
            aVar.a(6, str, str2);
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static x.o j(w.d dVar, int i10, ArrayList arrayList, x.o oVar) {
        int i11;
        int i12 = i10 == 0 ? dVar.f18009n0 : dVar.f18011o0;
        if (i12 != -1 && (oVar == null || i12 != oVar.f18261b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                x.o oVar2 = (x.o) arrayList.get(i13);
                if (oVar2.f18261b == i12) {
                    if (oVar != null) {
                        oVar.c(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i12 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof w.j) {
                w.j jVar = (w.j) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= jVar.f18068r0) {
                        i11 = -1;
                        break;
                    }
                    w.d dVar2 = jVar.f18067q0[i14];
                    if ((i10 == 0 && (i11 = dVar2.f18009n0) != -1) || (i10 == 1 && (i11 = dVar2.f18011o0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        x.o oVar3 = (x.o) arrayList.get(i15);
                        if (oVar3.f18261b == i11) {
                            oVar = oVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new x.o();
                oVar.f18260a = new ArrayList();
                oVar.f18263d = null;
                oVar.f18264e = -1;
                int i16 = x.o.f18259f;
                x.o.f18259f = i16 + 1;
                oVar.f18261b = i16;
                oVar.f18262c = i10;
            }
            arrayList.add(oVar);
        }
        ArrayList arrayList2 = oVar.f18260a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof w.h) {
                w.h hVar = (w.h) dVar;
                hVar.f18064t0.c(hVar.f18065u0 == 0 ? 1 : 0, oVar, arrayList);
            }
            int i17 = oVar.f18261b;
            if (i10 == 0) {
                dVar.f18009n0 = i17;
                dVar.I.c(i10, oVar, arrayList);
                dVar.K.c(i10, oVar, arrayList);
            } else {
                dVar.f18011o0 = i17;
                dVar.J.c(i10, oVar, arrayList);
                dVar.M.c(i10, oVar, arrayList);
                dVar.L.c(i10, oVar, arrayList);
            }
            dVar.P.c(i10, oVar, arrayList);
        }
        return oVar;
    }

    public static void k(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1456d) {
            try {
                f1455c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f1456d = true;
        }
        Class cls = f1455c;
        if (cls == null) {
            return;
        }
        if (!f1458f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1457e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f1458f = true;
        }
        Field field = f1457e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            f.v0.a(longSparseArray);
        }
    }

    public static int l(int i10, int i11) {
        switch (i10) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return ((i11 % 4 != 0 || i11 % 100 == 0) && i11 % 400 != 0) ? 28 : 29;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static f0.d n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        f0.d dVarA;
        if (q(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new f0.d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVarA = f0.d.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception unused) {
                dVarA = null;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return new f0.d((Shader) null, (ColorStateList) null, 0);
    }

    public static String o(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i10) {
        if (q(xmlResourceParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static v5.l p(View view, float f10, float f11) {
        v5.j jVar = new v5.j(0.0f, 1.0f);
        v5.j jVar2 = new v5.j(0.275f, f10);
        v5.j jVar3 = new v5.j(0.69f, f11);
        v5.j jVar4 = new v5.j(1.0f, 1.0f);
        v5.r rVarE = v5.r.e("scaleX", jVar, jVar2, jVar3, jVar4);
        v5.r rVarE2 = v5.r.e("scaleY", jVar, jVar2, jVar3, jVar4);
        Object objE = view;
        if (x5.a.C) {
            objE = x5.a.e(view);
        }
        v5.l lVarO = v5.l.o(objE, rVarE, rVarE2);
        lVarO.p(544L);
        return lVarO;
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void r(String str, String str2) {
        h9.a aVar = f1470r;
        if (aVar != null) {
            aVar.a(4, str, str2);
        }
    }

    public static boolean s() {
        if (f1469q == null) {
            try {
                Class.forName("android.Manifest");
                f1469q = Boolean.TRUE;
            } catch (Exception unused) {
                f1469q = Boolean.FALSE;
            }
        }
        return f1469q.booleanValue();
    }

    public static boolean t(String str) {
        b2.b bVar = b2.n.f1248a;
        Set<b2.f> setUnmodifiableSet = Collections.unmodifiableSet(b2.c.f1239c);
        HashSet hashSet = new HashSet();
        for (b2.f fVar : setUnmodifiableSet) {
            if (((b2.c) fVar).f1240a.equals(str)) {
                hashSet.add(fVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b2.c cVar = (b2.c) ((b2.f) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    public static TypedArray v(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static f0.f w(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c0.a.f1493b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    z(xmlResourceParser);
                }
                return new f0.i(new l.q(string, string2, string3, y(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c0.a.f1494c);
                        int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z9 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                        int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i13);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            z(xmlResourceParser);
                        }
                        arrayList.add(new f0.h(i10, i12, resourceId2, string6, string5, z9));
                    } else {
                        z(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new f0.g((f0.h[]) arrayList.toArray(new f0.h[0]));
            }
        } else {
            z(xmlResourceParser);
        }
        return null;
    }

    public static boolean x(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static List y(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (f0.e.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void z(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
