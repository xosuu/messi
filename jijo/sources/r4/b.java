package r4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import b5.d;
import com.google.android.material.button.MaterialButton;
import d5.f;
import d5.g;
import d5.j;
import d5.u;
import g4.a0;
import java.util.WeakHashMap;
import o0.e0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f16509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f16510v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f16511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f16512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f16519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f16520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f16521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f16522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f16523m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16527q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayerDrawable f16529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16530t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16524n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16525o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16526p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16528r = true;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f16509u = true;
        f16510v = i10 <= 22;
    }

    public b(MaterialButton materialButton, j jVar) {
        this.f16511a = materialButton;
        this.f16512b = jVar;
    }

    public final u a() {
        LayerDrawable layerDrawable = this.f16529s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f16529s.getNumberOfLayers() > 2 ? (u) this.f16529s.getDrawable(2) : (u) this.f16529s.getDrawable(1);
    }

    public final g b(boolean z9) {
        LayerDrawable layerDrawable = this.f16529s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f16509u ? (g) ((LayerDrawable) ((InsetDrawable) this.f16529s.getDrawable(0)).getDrawable()).getDrawable(!z9 ? 1 : 0) : (g) this.f16529s.getDrawable(!z9 ? 1 : 0);
    }

    public final void c(j jVar) {
        this.f16512b = jVar;
        if (!f16510v || this.f16525o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(jVar);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(jVar);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(jVar);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        MaterialButton materialButton = this.f16511a;
        int iF = e0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = e0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        e0.k(materialButton, iF, paddingTop, iE, paddingBottom);
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = v0.f16075a;
        MaterialButton materialButton = this.f16511a;
        int iF = e0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = e0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f16515e;
        int i13 = this.f16516f;
        this.f16516f = i11;
        this.f16515e = i10;
        if (!this.f16525o) {
            e();
        }
        e0.k(materialButton, iF, (paddingTop + i10) - i12, iE, (paddingBottom + i11) - i13);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e() {
        Drawable insetDrawable;
        g gVar = new g(this.f16512b);
        MaterialButton materialButton = this.f16511a;
        gVar.j(materialButton.getContext());
        h0.b.h(gVar, this.f16520j);
        PorterDuff.Mode mode = this.f16519i;
        if (mode != null) {
            h0.b.i(gVar, mode);
        }
        float f10 = this.f16518h;
        ColorStateList colorStateList = this.f16521k;
        gVar.f12396a.f12385k = f10;
        gVar.invalidateSelf();
        f fVar = gVar.f12396a;
        if (fVar.f12378d != colorStateList) {
            fVar.f12378d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f16512b);
        gVar2.setTint(0);
        float f11 = this.f16518h;
        int i10 = this.f16524n ? a0.i(materialButton, R.attr.ho) : 0;
        gVar2.f12396a.f12385k = f11;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        f fVar2 = gVar2.f12396a;
        if (fVar2.f12378d != colorStateListValueOf) {
            fVar2.f12378d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        if (f16509u) {
            g gVar3 = new g(this.f16512b);
            this.f16523m = gVar3;
            h0.b.g(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(d.b(this.f16522l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f16513c, this.f16515e, this.f16514d, this.f16516f), this.f16523m);
            this.f16529s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            g gVar4 = new g(this.f16512b);
            b5.a aVar = new b5.a();
            aVar.f1332a = gVar4;
            aVar.f1333b = false;
            b5.b bVar = new b5.b(aVar);
            this.f16523m = bVar;
            h0.b.h(bVar, d.b(this.f16522l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f16523m});
            this.f16529s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f16513c, this.f16515e, this.f16514d, this.f16516f);
        }
        materialButton.setInternalBackground(insetDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.k(this.f16530t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f10 = this.f16518h;
            ColorStateList colorStateList = this.f16521k;
            gVarB.f12396a.f12385k = f10;
            gVarB.invalidateSelf();
            f fVar = gVarB.f12396a;
            if (fVar.f12378d != colorStateList) {
                fVar.f12378d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f11 = this.f16518h;
                int i10 = this.f16524n ? a0.i(this.f16511a, R.attr.ho) : 0;
                gVarB2.f12396a.f12385k = f11;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
                f fVar2 = gVarB2.f12396a;
                if (fVar2.f12378d != colorStateListValueOf) {
                    fVar2.f12378d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
