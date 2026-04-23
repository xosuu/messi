package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import b7.u;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13039a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f13040b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13041c = new Object();

    public static void a(m mVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f13041c) {
            try {
                WeakHashMap weakHashMap = f13040b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(mVar, sparseArray);
                }
                sparseArray.append(i10, new l(colorStateList, mVar.f13031a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i10, TypedValue typedValue, int i11, q7.b bVar, boolean z9, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            s.f fVar = g0.g.f13609b;
            Typeface typeface = (Typeface) fVar.a(g0.g.b(resources, i10, string, i12, i11));
            if (typeface != null) {
                if (bVar != null) {
                    bVar.d(typeface);
                }
                typefaceA = typeface;
            } else if (!z10) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        f fVarW = u.w(resources.getXml(i10), resources);
                        if (fVarW != null) {
                            typefaceA = g0.g.a(context, fVarW, resources, i10, string, typedValue.assetCookie, i11, bVar, z9);
                        } else if (bVar != null) {
                            bVar.c(-3);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        Typeface typefaceV = g0.g.f13608a.v(context, resources, i10, string, i11);
                        if (typefaceV != null) {
                            fVar.b(g0.g.b(resources, i10, string, i13, i11), typefaceV);
                        }
                        if (bVar != null) {
                            if (typefaceV != null) {
                                bVar.d(typefaceV);
                            } else {
                                bVar.c(-3);
                            }
                        }
                        typefaceA = typefaceV;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (bVar != null) {
                        bVar.c(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.c(-3);
        }
        if (typefaceA != null || bVar != null || z10) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}
