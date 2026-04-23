package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f14975g;

    public q(View view) {
        this.f14969a = 0;
        this.f14970b = -1;
        this.f14971c = view;
        this.f14972d = v.a();
    }

    public static q d(Context context, int i10) {
        b7.u.a("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, l4.a.f15202o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListG = tp1.g(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListG2 = tp1.g(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListG3 = tp1.g(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        d5.j jVarA = d5.j.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new d5.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new q(colorStateListG, colorStateListG2, colorStateListG3, dimensionPixelSize, jVarA, rect);
    }

    public final boolean a() throws IOException {
        boolean z9;
        if (((DataInputStream) this.f14971c).read() != 5) {
            throw new IOException("Unsupported protocol");
        }
        int i10 = ((DataInputStream) this.f14971c).read();
        byte[] bArr = new byte[i10];
        ((DataInputStream) this.f14971c).readFully(bArr);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                z9 = false;
                break;
            }
            if (bArr[i11] == 0) {
                z9 = true;
                break;
            }
            i11++;
        }
        byte[] bArr2 = new byte[2];
        bArr2[0] = 5;
        if (z9) {
            bArr2[1] = 0;
        } else {
            bArr2[1] = -1;
        }
        ((DataOutputStream) this.f14972d).write(bArr2);
        return z9;
    }

    public final void b() {
        Drawable background = ((View) this.f14971c).getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((q3) this.f14973e) != null) {
                if (((q3) this.f14975g) == null) {
                    this.f14975g = new q3(0);
                }
                q3 q3Var = (q3) this.f14975g;
                q3Var.f14980c = null;
                q3Var.f14979b = false;
                q3Var.f14981d = null;
                q3Var.f14978a = false;
                View view = (View) this.f14971c;
                WeakHashMap weakHashMap = o0.v0.f16075a;
                ColorStateList colorStateListG = o0.j0.g(view);
                if (colorStateListG != null) {
                    q3Var.f14979b = true;
                    q3Var.f14980c = colorStateListG;
                }
                PorterDuff.Mode modeH = o0.j0.h((View) this.f14971c);
                if (modeH != null) {
                    q3Var.f14978a = true;
                    q3Var.f14981d = modeH;
                }
                if (q3Var.f14979b || q3Var.f14978a) {
                    v.e(background, q3Var, ((View) this.f14971c).getDrawableState());
                    return;
                }
            }
            q3 q3Var2 = (q3) this.f14974f;
            if (q3Var2 != null) {
                v.e(background, q3Var2, ((View) this.f14971c).getDrawableState());
                return;
            }
            q3 q3Var3 = (q3) this.f14973e;
            if (q3Var3 != null) {
                v.e(background, q3Var3, ((View) this.f14971c).getDrawableState());
            }
        }
    }

    public q c() {
        Object obj = this.f14974f;
        ArrayList arrayList = (ArrayList) obj;
        int size = ((ArrayList) obj).size();
        v5.k[] kVarArr = new v5.k[size];
        for (int i10 = 0; i10 < size; i10++) {
            kVarArr[i10] = ((v5.j) ((v5.k) arrayList.get(i10))).clone();
        }
        return new q(kVarArr);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f14969a) {
            case 3:
                return c();
            default:
                return super.clone();
        }
    }

    public final ColorStateList e() {
        Object obj = this.f14974f;
        if (((q3) obj) != null) {
            return (ColorStateList) ((q3) obj).f14980c;
        }
        return null;
    }

    public final PorterDuff.Mode f() {
        Object obj = this.f14974f;
        if (((q3) obj) != null) {
            return (PorterDuff.Mode) ((q3) obj).f14981d;
        }
        return null;
    }

    public Object g(float f10) {
        int i10 = this.f14970b;
        if (i10 == 2) {
            Interpolator interpolator = (Interpolator) this.f14973e;
            if (interpolator != null) {
                f10 = interpolator.getInterpolation(f10);
            }
            return ((v5.s) this.f14975g).c(f10, Float.valueOf(((v5.j) ((v5.k) this.f14971c)).f17834h), Float.valueOf(((v5.j) ((v5.k) this.f14972d)).f17834h));
        }
        int i11 = 1;
        if (f10 <= 0.0f) {
            v5.k kVar = (v5.k) ((ArrayList) this.f14974f).get(1);
            Interpolator interpolator2 = kVar.f17837d;
            if (interpolator2 != null) {
                f10 = interpolator2.getInterpolation(f10);
            }
            v5.k kVar2 = (v5.k) this.f14971c;
            float f11 = kVar2.f17835a;
            return ((v5.s) this.f14975g).c((f10 - f11) / (kVar.f17835a - f11), Float.valueOf(((v5.j) kVar2).f17834h), Float.valueOf(((v5.j) kVar).f17834h));
        }
        if (f10 >= 1.0f) {
            v5.k kVar3 = (v5.k) ((ArrayList) this.f14974f).get(i10 - 2);
            Interpolator interpolator3 = ((v5.k) this.f14972d).f17837d;
            if (interpolator3 != null) {
                f10 = interpolator3.getInterpolation(f10);
            }
            float f12 = kVar3.f17835a;
            return ((v5.s) this.f14975g).c((f10 - f12) / (((v5.k) this.f14972d).f17835a - f12), Float.valueOf(((v5.j) kVar3).f17834h), Float.valueOf(((v5.j) ((v5.k) this.f14972d)).f17834h));
        }
        v5.k kVar4 = (v5.k) this.f14971c;
        while (i11 < this.f14970b) {
            v5.k kVar5 = (v5.k) ((ArrayList) this.f14974f).get(i11);
            if (f10 < kVar5.f17835a) {
                Interpolator interpolator4 = kVar5.f17837d;
                if (interpolator4 != null) {
                    f10 = interpolator4.getInterpolation(f10);
                }
                float f13 = kVar4.f17835a;
                return ((v5.s) this.f14975g).c((f10 - f13) / (kVar5.f17835a - f13), Float.valueOf(((v5.j) kVar4).f17834h), Float.valueOf(((v5.j) kVar5).f17834h));
            }
            i11++;
            kVar4 = kVar5;
        }
        return Float.valueOf(((v5.j) ((v5.k) this.f14972d)).f17834h);
    }

    public final void h(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListI;
        Context context = ((View) this.f14971c).getContext();
        int[] iArr = e.a.B;
        ur0 ur0VarK = ur0.K(context, attributeSet, iArr, i10);
        View view = (View) this.f14971c;
        o0.v0.p(view, view.getContext(), iArr, attributeSet, (TypedArray) ur0VarK.f9601d, i10);
        try {
            if (ur0VarK.H(0)) {
                this.f14970b = ur0VarK.D(0, -1);
                v vVar = (v) this.f14972d;
                Context context2 = ((View) this.f14971c).getContext();
                int i11 = this.f14970b;
                synchronized (vVar) {
                    colorStateListI = vVar.f15031a.i(context2, i11);
                }
                if (colorStateListI != null) {
                    m(colorStateListI);
                }
            }
            if (ur0VarK.H(1)) {
                o0.v0.s((View) this.f14971c, ur0VarK.v(1));
            }
            if (ur0VarK.H(2)) {
                View view2 = (View) this.f14971c;
                PorterDuff.Mode modeC = r1.c(ur0VarK.B(2, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                o0.j0.r(view2, modeC);
                if (i12 == 21) {
                    Drawable background = view2.getBackground();
                    boolean z9 = (o0.j0.g(view2) == null && o0.j0.h(view2) == null) ? false : true;
                    if (background != null && z9) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        o0.d0.q(view2, background);
                    }
                }
            }
            ur0VarK.M();
        } catch (Throwable th) {
            ur0VarK.M();
            throw th;
        }
    }

    public final void i() {
        this.f14970b = -1;
        m(null);
        b();
    }

    public final void j(int i10) {
        ColorStateList colorStateListI;
        this.f14970b = i10;
        v vVar = (v) this.f14972d;
        if (vVar != null) {
            Context context = ((View) this.f14971c).getContext();
            synchronized (vVar) {
                colorStateListI = vVar.f15031a.i(context, i10);
            }
        } else {
            colorStateListI = null;
        }
        m(colorStateListI);
        b();
    }

    public final boolean k() throws IOException {
        if (((DataInputStream) this.f14971c).read() != 5) {
            throw new IOException("Unsupported protocol");
        }
        int i10 = ((DataInputStream) this.f14971c).read();
        r7.a aVar = i10 == 1 ? r7.a.CONNECT : i10 == 2 ? r7.a.BIND : null;
        this.f14973e = aVar;
        boolean z9 = false;
        boolean z10 = aVar != null;
        if (((DataInputStream) this.f14971c).read() != 0) {
            z10 = false;
        }
        int i11 = ((DataInputStream) this.f14971c).read();
        if (i11 == 1) {
            byte[] bArr = new byte[4];
            ((DataInputStream) this.f14971c).readFully(bArr);
            this.f14974f = InetAddress.getByAddress(bArr);
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    byte[] bArr2 = new byte[16];
                    ((DataInputStream) this.f14971c).readFully(bArr2);
                    this.f14974f = InetAddress.getByAddress(bArr2);
                }
                this.f14970b = (((DataInputStream) this.f14971c).read() << 8) | ((DataInputStream) this.f14971c).read();
                return z9;
            }
            byte[] bArr3 = new byte[((DataInputStream) this.f14971c).read()];
            ((DataInputStream) this.f14971c).readFully(bArr3);
            this.f14975g = Charset.forName(StandardStringDigester.DIGEST_CHARSET).newDecoder().decode(ByteBuffer.wrap(bArr3)).toString();
        }
        z9 = z10;
        this.f14970b = (((DataInputStream) this.f14971c).read() << 8) | ((DataInputStream) this.f14971c).read();
        return z9;
    }

    public final void l(int i10) throws IOException {
        ((DataOutputStream) this.f14972d).write(new byte[]{5, a0.a(i10), 0, 1, 0, 0, 0, 0, 0, 0});
    }

    public final void m(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((q3) this.f14973e) == null) {
                this.f14973e = new q3(0);
            }
            Object obj = this.f14973e;
            ((q3) obj).f14980c = colorStateList;
            ((q3) obj).f14979b = true;
        } else {
            this.f14973e = null;
        }
        b();
    }

    public final void n(ColorStateList colorStateList) {
        if (((q3) this.f14974f) == null) {
            this.f14974f = new q3(0);
        }
        q3 q3Var = (q3) this.f14974f;
        q3Var.f14980c = colorStateList;
        q3Var.f14979b = true;
        b();
    }

    public final void o(PorterDuff.Mode mode) {
        if (((q3) this.f14974f) == null) {
            this.f14974f = new q3(0);
        }
        q3 q3Var = (q3) this.f14974f;
        q3Var.f14981d = mode;
        q3Var.f14978a = true;
        b();
    }

    public final String toString() {
        switch (this.f14969a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f14971c) + ", mProviderPackage: " + ((String) this.f14972d) + ", mQuery: " + ((String) this.f14973e) + ", mCertificates:");
                for (int i10 = 0; i10 < ((List) this.f14974f).size(); i10++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f14974f).get(i10);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f14970b);
                return sb.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                String string = " ";
                for (int i12 = 0; i12 < this.f14970b; i12++) {
                    StringBuilder sbS = g1.a.s(string);
                    sbS.append(Float.valueOf(((v5.j) ((v5.k) ((ArrayList) this.f14974f).get(i12))).f17834h));
                    sbS.append("  ");
                    string = sbS.toString();
                }
                return string;
        }
    }

    public q(x8.b bVar, String str, int i10, String str2, String str3) {
        this.f14969a = 5;
        this.f14974f = bVar;
        this.f14971c = str;
        this.f14970b = i10;
        this.f14972d = str2;
        this.f14973e = str3;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            this.f14975g = new x8.a(this);
        } else if (iOrdinal == 1) {
            this.f14975g = new x4.a(11, this);
        } else {
            if (iOrdinal == 2) {
                this.f14975g = new f5.b(9, this);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public q(v5.k[] kVarArr) {
        this.f14969a = 3;
        this.f14970b = kVarArr.length;
        ArrayList arrayList = new ArrayList();
        this.f14974f = arrayList;
        arrayList.addAll(Arrays.asList(kVarArr));
        this.f14971c = (v5.k) ((ArrayList) this.f14974f).get(0);
        v5.k kVar = (v5.k) ((ArrayList) this.f14974f).get(this.f14970b - 1);
        this.f14972d = kVar;
        this.f14973e = kVar.f17837d;
    }

    public q(String str, String str2, String str3, List list) {
        this.f14969a = 1;
        str.getClass();
        this.f14971c = str;
        str2.getClass();
        this.f14972d = str2;
        this.f14973e = str3;
        list.getClass();
        this.f14974f = list;
        this.f14970b = 0;
        this.f14975g = str + "-" + str2 + "-" + str3;
    }

    public q(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, d5.j jVar, Rect rect) {
        this.f14969a = 2;
        b7.u.b(rect.left);
        b7.u.b(rect.top);
        b7.u.b(rect.right);
        b7.u.b(rect.bottom);
        this.f14971c = rect;
        this.f14972d = colorStateList2;
        this.f14973e = colorStateList;
        this.f14974f = colorStateList3;
        this.f14970b = i10;
        this.f14975g = jVar;
    }

    public q(InputStream inputStream, OutputStream outputStream) {
        this.f14969a = 4;
        this.f14970b = -1;
        this.f14971c = new DataInputStream(inputStream);
        this.f14972d = new DataOutputStream(outputStream);
    }
}
