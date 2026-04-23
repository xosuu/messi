package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.sf;
import java.util.ArrayList;
import java.util.HashMap;
import org.joda.time.DateTimeConstants;
import w.e;
import w.h;
import x.n;
import z.b;
import z.c;
import z.d;
import z.f;
import z.m;
import z.o;
import z.q;
import z.r;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static r D;
    public final n A;
    public int B;
    public int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f413b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f414d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f415f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f416h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f417q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseArray f425z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f412a = new SparseArray();
        this.f413b = new ArrayList(4);
        this.f414d = new e();
        this.f415f = 0;
        this.f416h = 0;
        this.f417q = Integer.MAX_VALUE;
        this.f418s = Integer.MAX_VALUE;
        this.f419t = true;
        this.f420u = 257;
        this.f421v = null;
        this.f422w = null;
        this.f423x = -1;
        this.f424y = new HashMap();
        this.f425z = new SparseArray();
        this.A = new n(this, this);
        this.B = 0;
        this.C = 0;
        i(attributeSet, 0);
    }

    public static d g() {
        d dVar = new d(-2, -2);
        dVar.f20484a = -1;
        dVar.f20486b = -1;
        dVar.f20488c = -1.0f;
        dVar.f20490d = true;
        dVar.f20492e = -1;
        dVar.f20494f = -1;
        dVar.f20496g = -1;
        dVar.f20498h = -1;
        dVar.f20500i = -1;
        dVar.f20502j = -1;
        dVar.f20504k = -1;
        dVar.f20506l = -1;
        dVar.f20508m = -1;
        dVar.f20510n = -1;
        dVar.f20512o = -1;
        dVar.f20514p = -1;
        dVar.f20516q = 0;
        dVar.f20517r = 0.0f;
        dVar.f20518s = -1;
        dVar.f20519t = -1;
        dVar.f20520u = -1;
        dVar.f20521v = -1;
        dVar.f20522w = Integer.MIN_VALUE;
        dVar.f20523x = Integer.MIN_VALUE;
        dVar.f20524y = Integer.MIN_VALUE;
        dVar.f20525z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f20485a0 = true;
        dVar.f20487b0 = true;
        dVar.f20489c0 = false;
        dVar.f20491d0 = false;
        dVar.f20493e0 = false;
        dVar.f20495f0 = -1;
        dVar.f20497g0 = -1;
        dVar.f20499h0 = -1;
        dVar.f20501i0 = -1;
        dVar.f20503j0 = Integer.MIN_VALUE;
        dVar.f20505k0 = Integer.MIN_VALUE;
        dVar.f20507l0 = 0.5f;
        dVar.f20515p0 = new w.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static r getSharedValues() {
        if (D == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            D = rVar;
        }
        return D;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f413b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f419t = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f20484a = -1;
        dVar.f20486b = -1;
        dVar.f20488c = -1.0f;
        dVar.f20490d = true;
        dVar.f20492e = -1;
        dVar.f20494f = -1;
        dVar.f20496g = -1;
        dVar.f20498h = -1;
        dVar.f20500i = -1;
        dVar.f20502j = -1;
        dVar.f20504k = -1;
        dVar.f20506l = -1;
        dVar.f20508m = -1;
        dVar.f20510n = -1;
        dVar.f20512o = -1;
        dVar.f20514p = -1;
        dVar.f20516q = 0;
        dVar.f20517r = 0.0f;
        dVar.f20518s = -1;
        dVar.f20519t = -1;
        dVar.f20520u = -1;
        dVar.f20521v = -1;
        dVar.f20522w = Integer.MIN_VALUE;
        dVar.f20523x = Integer.MIN_VALUE;
        dVar.f20524y = Integer.MIN_VALUE;
        dVar.f20525z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f20485a0 = true;
        dVar.f20487b0 = true;
        dVar.f20489c0 = false;
        dVar.f20491d0 = false;
        dVar.f20493e0 = false;
        dVar.f20495f0 = -1;
        dVar.f20497g0 = -1;
        dVar.f20499h0 = -1;
        dVar.f20501i0 = -1;
        dVar.f20503j0 = Integer.MIN_VALUE;
        dVar.f20505k0 = Integer.MIN_VALUE;
        dVar.f20507l0 = 0.5f;
        dVar.f20515p0 = new w.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f20633b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = c.f20483a.get(index);
            switch (i11) {
                case 1:
                    dVar.V = typedArrayObtainStyledAttributes.getInt(index, dVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20514p);
                    dVar.f20514p = resourceId;
                    if (resourceId == -1) {
                        dVar.f20514p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    dVar.f20516q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f20516q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, dVar.f20517r) % 360.0f;
                    dVar.f20517r = f10;
                    if (f10 < 0.0f) {
                        dVar.f20517r = (360.0f - f10) % 360.0f;
                    }
                    break;
                case 5:
                    dVar.f20484a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f20484a);
                    break;
                case 6:
                    dVar.f20486b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f20486b);
                    break;
                case 7:
                    dVar.f20488c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f20488c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20492e);
                    dVar.f20492e = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f20492e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20494f);
                    dVar.f20494f = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f20494f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20496g);
                    dVar.f20496g = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f20496g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20498h);
                    dVar.f20498h = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f20498h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20500i);
                    dVar.f20500i = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.f20500i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20502j);
                    dVar.f20502j = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f20502j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20504k);
                    dVar.f20504k = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f20504k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20506l);
                    dVar.f20506l = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f20506l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20508m);
                    dVar.f20508m = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f20508m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20518s);
                    dVar.f20518s = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f20518s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20519t);
                    dVar.f20519t = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f20519t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20520u);
                    dVar.f20520u = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f20520u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20521v);
                    dVar.f20521v = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f20521v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case sf.zzm /* 21 */:
                    dVar.f20522w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f20522w);
                    break;
                case 22:
                    dVar.f20523x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f20523x);
                    break;
                case 23:
                    dVar.f20524y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f20524y);
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    dVar.f20525z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f20525z);
                    break;
                case 25:
                    dVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.A);
                    break;
                case 26:
                    dVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.B);
                    break;
                case 27:
                    dVar.W = typedArrayObtainStyledAttributes.getBoolean(index, dVar.W);
                    break;
                case 28:
                    dVar.X = typedArrayObtainStyledAttributes.getBoolean(index, dVar.X);
                    break;
                case 29:
                    dVar.E = typedArrayObtainStyledAttributes.getFloat(index, dVar.E);
                    break;
                case 30:
                    dVar.F = typedArrayObtainStyledAttributes.getFloat(index, dVar.F);
                    break;
                case 31:
                    dVar.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                    dVar.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        dVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.N) == -2) {
                            dVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        dVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.P) == -2) {
                            dVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    dVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.R));
                    dVar.L = 2;
                    break;
                case 36:
                    try {
                        dVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.O) == -2) {
                            dVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        dVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.Q) == -2) {
                            dVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    dVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.S));
                    dVar.M = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            m.h(dVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dVar.H = typedArrayObtainStyledAttributes.getFloat(index, dVar.H);
                            break;
                        case 46:
                            dVar.I = typedArrayObtainStyledAttributes.getFloat(index, dVar.I);
                            break;
                        case 47:
                            dVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.T);
                            break;
                        case 50:
                            dVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.U);
                            break;
                        case 51:
                            dVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20510n);
                            dVar.f20510n = resourceId15;
                            if (resourceId15 == -1) {
                                dVar.f20510n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f20512o);
                            dVar.f20512o = resourceId16;
                            if (resourceId16 == -1) {
                                dVar.f20512o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            dVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.D);
                            break;
                        case 55:
                            dVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.C);
                            break;
                        default:
                            switch (i11) {
                                case NotificationCompat.FLAG_FOREGROUND_SERVICE /* 64 */:
                                    m.g(dVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    m.g(dVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dVar.Z = typedArrayObtainStyledAttributes.getInt(index, dVar.Z);
                                    break;
                                case 67:
                                    dVar.f20490d = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f20490d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f418s;
    }

    public int getMaxWidth() {
        return this.f417q;
    }

    public int getMinHeight() {
        return this.f416h;
    }

    public int getMinWidth() {
        return this.f415f;
    }

    public int getOptimizationLevel() {
        return this.f414d.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f414d;
        if (eVar.f18000j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f18000j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f18000j = "parent";
            }
        }
        if (eVar.f17997h0 == null) {
            eVar.f17997h0 = eVar.f18000j;
        }
        for (w.d dVar : eVar.f18070q0) {
            View view = (View) dVar.f17993f0;
            if (view != null) {
                if (dVar.f18000j == null && (id = view.getId()) != -1) {
                    dVar.f18000j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f17997h0 == null) {
                    dVar.f17997h0 = dVar.f18000j;
                }
            }
        }
        eVar.o(sb);
        return sb.toString();
    }

    public final w.d h(View view) {
        if (view == this) {
            return this.f414d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f20515p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f20515p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i10) {
        e eVar = this.f414d;
        eVar.f17993f0 = this;
        n nVar = this.A;
        eVar.f18027u0 = nVar;
        eVar.f18025s0.f18230h = nVar;
        this.f412a.put(getId(), this);
        this.f421v = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f20633b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f415f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f415f);
                } else if (index == 17) {
                    this.f416h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f416h);
                } else if (index == 14) {
                    this.f417q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f417q);
                } else if (index == 15) {
                    this.f418s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f418s);
                } else if (index == 113) {
                    this.f420u = typedArrayObtainStyledAttributes.getInt(index, this.f420u);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f422w = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.f421v = mVar;
                        mVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f421v = null;
                    }
                    this.f423x = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f420u;
        u.d.f17468p = eVar.X(512);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r11) {
        /*
            r10 = this;
            z.f r0 = new z.f
            android.content.Context r1 = r10.getContext()
            r0.<init>()
            r2 = -1
            r0.f20531a = r2
            r0.f20532b = r2
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r0.f20534d = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r0.f20535e = r3
            r3 = 0
            r0.f20536f = r3
            r0.f20533c = r10
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r11 = r4.getXml(r11)
            int r4 = r11.getEventType()     // Catch: java.lang.Throwable -> La8
        L2d:
            r5 = 1
            if (r4 == r5) goto La8
            if (r4 == 0) goto La0
            r6 = 2
            if (r4 == r6) goto L37
            goto La3
        L37:
            java.lang.String r4 = r11.getName()     // Catch: java.lang.Throwable -> La8
            int r7 = r4.hashCode()     // Catch: java.lang.Throwable -> La8
            r8 = 4
            r9 = 3
            switch(r7) {
                case -1349929691: goto L6c;
                case 80204913: goto L62;
                case 1382829617: goto L59;
                case 1657696882: goto L4f;
                case 1901439077: goto L45;
                default: goto L44;
            }     // Catch: java.lang.Throwable -> La8
        L44:
            goto L76
        L45:
            java.lang.String r5 = "Variant"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L76
            r5 = 3
            goto L77
        L4f:
            java.lang.String r5 = "layoutDescription"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L76
            r5 = 0
            goto L77
        L59:
            java.lang.String r7 = "StateSet"
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L76
            goto L77
        L62:
            java.lang.String r5 = "State"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L76
            r5 = 2
            goto L77
        L6c:
            java.lang.String r5 = "ConstraintSet"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L76
            r5 = 4
            goto L77
        L76:
            r5 = -1
        L77:
            if (r5 == r6) goto L91
            if (r5 == r9) goto L82
            if (r5 == r8) goto L7e
            goto La3
        L7e:
            r0.a(r1, r11)     // Catch: java.lang.Throwable -> La8
            goto La3
        L82:
            z.e r4 = new z.e     // Catch: java.lang.Throwable -> La8
            r4.<init>(r1, r11)     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto La3
            java.lang.Object r5 = r3.f200d     // Catch: java.lang.Throwable -> La8
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> La8
            r5.add(r4)     // Catch: java.lang.Throwable -> La8
            goto La3
        L91:
            androidx.activity.result.h r3 = new androidx.activity.result.h     // Catch: java.lang.Throwable -> La8
            r3.<init>(r1, r11)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r4 = r0.f20534d     // Catch: java.lang.Throwable -> La8
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> La8
            int r5 = r3.f198a     // Catch: java.lang.Throwable -> La8
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> La8
            goto La3
        La0:
            r11.getName()     // Catch: java.lang.Throwable -> La8
        La3:
            int r4 = r11.next()     // Catch: java.lang.Throwable -> La8
            goto L2d
        La8:
            r10.f422w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(w.e r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(w.e, int, int, int):void");
    }

    public final void l(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f424y == null) {
                this.f424y = new HashMap();
            }
            int iIndexOf = str.indexOf("/");
            if (iIndexOf != -1) {
                str = str.substring(iIndexOf + 1);
            }
            this.f424y.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void m(w.d dVar, d dVar2, SparseArray sparseArray, int i10, int i11) {
        View view = (View) this.f412a.get(i10);
        w.d dVar3 = (w.d) sparseArray.get(i10);
        if (dVar3 == null || view == null || !(view.getLayoutParams() instanceof d)) {
            return;
        }
        dVar2.f20489c0 = true;
        if (i11 == 6) {
            d dVar4 = (d) view.getLayoutParams();
            dVar4.f20489c0 = true;
            dVar4.f20515p0.E = true;
        }
        dVar.j(6).b(dVar3.j(i11), dVar2.D, dVar2.C, true);
        dVar.E = true;
        dVar.j(3).j();
        dVar.j(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            d dVar = (d) childAt.getLayoutParams();
            w.d dVar2 = dVar.f20515p0;
            if (childAt.getVisibility() != 8 || dVar.f20491d0 || dVar.f20493e0 || zIsInEditMode) {
                int iS = dVar2.s();
                int iT = dVar2.t();
                childAt.layout(iS, iT, dVar2.r() + iS, dVar2.l() + iT);
            }
        }
        ArrayList arrayList = this.f413b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((b) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        w.d dVarH = h(view);
        if ((view instanceof o) && !(dVarH instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f20515p0 = hVar;
            dVar.f20491d0 = true;
            hVar.T(dVar.V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.i();
            ((d) view.getLayoutParams()).f20493e0 = true;
            ArrayList arrayList = this.f413b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f412a.put(view.getId(), view);
        this.f419t = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f412a.remove(view.getId());
        w.d dVarH = h(view);
        this.f414d.f18070q0.remove(dVarH);
        dVarH.D();
        this.f413b.remove(view);
        this.f419t = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f419t = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.f421v = mVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id = getId();
        SparseArray sparseArray = this.f412a;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f418s) {
            return;
        }
        this.f418s = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f417q) {
            return;
        }
        this.f417q = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f416h) {
            return;
        }
        this.f416h = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f415f) {
            return;
        }
        this.f415f = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(z.n nVar) {
        f fVar = this.f422w;
        if (fVar != null) {
            fVar.f20536f = nVar;
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f420u = i10;
        e eVar = this.f414d;
        eVar.D0 = i10;
        u.d.f17468p = eVar.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f412a = new SparseArray();
        this.f413b = new ArrayList(4);
        this.f414d = new e();
        this.f415f = 0;
        this.f416h = 0;
        this.f417q = Integer.MAX_VALUE;
        this.f418s = Integer.MAX_VALUE;
        this.f419t = true;
        this.f420u = 257;
        this.f421v = null;
        this.f422w = null;
        this.f423x = -1;
        this.f424y = new HashMap();
        this.f425z = new SparseArray();
        this.A = new n(this, this);
        this.B = 0;
        this.C = 0;
        i(attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f20484a = -1;
        dVar.f20486b = -1;
        dVar.f20488c = -1.0f;
        dVar.f20490d = true;
        dVar.f20492e = -1;
        dVar.f20494f = -1;
        dVar.f20496g = -1;
        dVar.f20498h = -1;
        dVar.f20500i = -1;
        dVar.f20502j = -1;
        dVar.f20504k = -1;
        dVar.f20506l = -1;
        dVar.f20508m = -1;
        dVar.f20510n = -1;
        dVar.f20512o = -1;
        dVar.f20514p = -1;
        dVar.f20516q = 0;
        dVar.f20517r = 0.0f;
        dVar.f20518s = -1;
        dVar.f20519t = -1;
        dVar.f20520u = -1;
        dVar.f20521v = -1;
        dVar.f20522w = Integer.MIN_VALUE;
        dVar.f20523x = Integer.MIN_VALUE;
        dVar.f20524y = Integer.MIN_VALUE;
        dVar.f20525z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f20485a0 = true;
        dVar.f20487b0 = true;
        dVar.f20489c0 = false;
        dVar.f20491d0 = false;
        dVar.f20493e0 = false;
        dVar.f20495f0 = -1;
        dVar.f20497g0 = -1;
        dVar.f20499h0 = -1;
        dVar.f20501i0 = -1;
        dVar.f20503j0 = Integer.MIN_VALUE;
        dVar.f20505k0 = Integer.MIN_VALUE;
        dVar.f20507l0 = 0.5f;
        dVar.f20515p0 = new w.d();
        return dVar;
    }
}
