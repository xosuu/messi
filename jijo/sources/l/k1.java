package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f14895l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f14896m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14897a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14898b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14899c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14900d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14901e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f14902f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14903g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f14904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f14905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f14906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j1 f14907k;

    static {
        new ConcurrentHashMap();
    }

    public k1(TextView textView) {
        this.f14905i = textView;
        this.f14906j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f14907k = new i1();
        } else if (i10 >= 23) {
            this.f14907k = new h1();
        } else {
            this.f14907k = new j1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f14896m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f14898b) {
                if (this.f14905i.getMeasuredHeight() <= 0 || this.f14905i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f14907k.b(this.f14905i) ? 1048576 : (this.f14905i.getMeasuredWidth() - this.f14905i.getTotalPaddingLeft()) - this.f14905i.getTotalPaddingRight();
                int height = (this.f14905i.getHeight() - this.f14905i.getCompoundPaddingBottom()) - this.f14905i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f14895l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f14905i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f14898b = true;
        }
    }

    public final int c(RectF rectF) {
        int i10;
        StaticLayout staticLayoutA;
        CharSequence transformation;
        int length = this.f14902f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = length - 1;
        int i12 = 1;
        int i13 = 0;
        while (i12 <= i11) {
            int i14 = (i12 + i11) / 2;
            int i15 = this.f14902f[i14];
            TextView textView = this.f14905i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i16 = Build.VERSION.SDK_INT;
            int iB = e1.b(textView);
            TextPaint textPaint = this.f14904h;
            if (textPaint == null) {
                this.f14904h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f14904h.set(textView.getPaint());
            this.f14904h.setTextSize(i15);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (i16 >= 23) {
                i10 = iB;
                staticLayoutA = g1.a(text, alignment, iRound, iB, this.f14905i, this.f14904h, this.f14907k);
            } else {
                i10 = iB;
                staticLayoutA = e1.a(text, alignment, iRound, textView, this.f14904h);
            }
            if ((i10 == -1 || (staticLayoutA.getLineCount() <= i10 && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i17 = i14 + 1;
                i13 = i12;
                i12 = i17;
            } else {
                i13 = i14 - 1;
                i11 = i13;
            }
        }
        return this.f14902f[i13];
    }

    public final boolean f() {
        return j() && this.f14897a != 0;
    }

    public final void g(int i10, float f10) {
        Context context = this.f14906j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f14905i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = f1.a(textView);
            if (textView.getLayout() != null) {
                this.f14898b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f14897a == 1) {
            if (!this.f14903g || this.f14902f.length == 0) {
                int iFloor = ((int) Math.floor((this.f14901e - this.f14900d) / this.f14899c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f14899c) + this.f14900d);
                }
                this.f14902f = b(iArr);
            }
            this.f14898b = true;
        } else {
            this.f14898b = false;
        }
        return this.f14898b;
    }

    public final boolean i() {
        boolean z9 = this.f14902f.length > 0;
        this.f14903g = z9;
        if (z9) {
            this.f14897a = 1;
            this.f14900d = r0[0];
            this.f14901e = r0[r1 - 1];
            this.f14899c = -1.0f;
        }
        return z9;
    }

    public final boolean j() {
        return !(this.f14905i instanceof x);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f14897a = 1;
        this.f14900d = f10;
        this.f14901e = f11;
        this.f14899c = f12;
        this.f14903g = false;
    }
}
