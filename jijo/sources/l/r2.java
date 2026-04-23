package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14988a;

    public /* synthetic */ r2(int i10) {
        this.f14988a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f14988a) {
            case 0:
                try {
                    return g.e.e(context, theme, context.getResources(), attributeSet, xmlResourceParser);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    x1.e eVar = new x1.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) r2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    h.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused3) {
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    x1.p pVar = new x1.p();
                    pVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return pVar;
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}
