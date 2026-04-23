package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20469a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20475g;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f20470b = aVar.f20470b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f20635d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        int i10 = 0;
        boolean z9 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z9 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i10 = 3;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i10 = 4;
            } else {
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i10 = 2;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i10 = 1;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i10 = 5;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i10 = 8;
                }
                i10 = 7;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.f20470b = i10;
            aVar.f20469a = z9;
            aVar.b(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (u.h.b(this.f20470b)) {
            case 0:
            case 7:
                this.f20471c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f20472d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f20475g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f20473e = (String) obj;
                break;
            case 5:
                this.f20474f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f20472d = ((Float) obj).floatValue();
                break;
        }
    }
}
