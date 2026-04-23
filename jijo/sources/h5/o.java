package h5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0.d0;
import o0.e0;
import o0.g0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class o extends LinearLayout {
    public static final /* synthetic */ int I = 0;
    public View.OnLongClickListener A;
    public CharSequence B;
    public final AppCompatTextView C;
    public boolean D;
    public EditText E;
    public final AccessibilityManager F;
    public p0.d G;
    public final m H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f14045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f14046b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f14047d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f14048f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14049h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View.OnLongClickListener f14050q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CheckableImageButton f14051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.activity.result.h f14052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f14054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f14055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f14056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView.ScaleType f14058z;

    public o(TextInputLayout textInputLayout, ur0 ur0Var) {
        CharSequence charSequenceG;
        super(textInputLayout.getContext());
        this.f14053u = 0;
        this.f14054v = new LinkedHashSet();
        this.H = new m(this);
        n nVar = new n(this);
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f14045a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f14046b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(R.id.we, layoutInflaterFrom, this);
        this.f14047d = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(R.id.wd, layoutInflaterFrom, frameLayout);
        this.f14051s = checkableImageButtonA2;
        androidx.activity.result.h hVar = new androidx.activity.result.h();
        hVar.f200d = new SparseArray();
        hVar.f201f = this;
        hVar.f198a = ur0Var.D(26, 0);
        hVar.f199b = ur0Var.D(50, 0);
        this.f14052t = hVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.C = appCompatTextView;
        if (ur0Var.H(36)) {
            this.f14048f = tp1.h(getContext(), ur0Var, 36);
        }
        if (ur0Var.H(37)) {
            this.f14049h = en1.y(ur0Var.B(37, -1), null);
        }
        if (ur0Var.H(35)) {
            h(ur0Var.y(35));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.hl));
        WeakHashMap weakHashMap = v0.f16075a;
        d0.s(checkableImageButtonA, 2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!ur0Var.H(51)) {
            if (ur0Var.H(30)) {
                this.f14055w = tp1.h(getContext(), ur0Var, 30);
            }
            if (ur0Var.H(31)) {
                this.f14056x = en1.y(ur0Var.B(31, -1), null);
            }
        }
        if (ur0Var.H(28)) {
            f(ur0Var.B(28, 0));
            if (ur0Var.H(25) && checkableImageButtonA2.getContentDescription() != (charSequenceG = ur0Var.G(25))) {
                checkableImageButtonA2.setContentDescription(charSequenceG);
            }
            checkableImageButtonA2.setCheckable(ur0Var.u(24, true));
        } else if (ur0Var.H(51)) {
            if (ur0Var.H(52)) {
                this.f14055w = tp1.h(getContext(), ur0Var, 52);
            }
            if (ur0Var.H(53)) {
                this.f14056x = en1.y(ur0Var.B(53, -1), null);
            }
            f(ur0Var.u(51, false) ? 1 : 0);
            CharSequence charSequenceG2 = ur0Var.G(49);
            if (checkableImageButtonA2.getContentDescription() != charSequenceG2) {
                checkableImageButtonA2.setContentDescription(charSequenceG2);
            }
        }
        int iX = ur0Var.x(27, getResources().getDimensionPixelSize(R.dimen.ra));
        if (iX < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iX != this.f14057y) {
            this.f14057y = iX;
            checkableImageButtonA2.setMinimumWidth(iX);
            checkableImageButtonA2.setMinimumHeight(iX);
            checkableImageButtonA.setMinimumWidth(iX);
            checkableImageButtonA.setMinimumHeight(iX);
        }
        if (ur0Var.H(29)) {
            ImageView.ScaleType scaleTypeI = en1.i(ur0Var.B(29, -1));
            this.f14058z = scaleTypeI;
            checkableImageButtonA2.setScaleType(scaleTypeI);
            checkableImageButtonA.setScaleType(scaleTypeI);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.wl);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        g0.f(appCompatTextView, 1);
        g4.z.B(appCompatTextView, ur0Var.D(70, 0));
        if (ur0Var.H(71)) {
            appCompatTextView.setTextColor(ur0Var.v(71));
        }
        CharSequence charSequenceG3 = ur0Var.G(69);
        this.B = TextUtils.isEmpty(charSequenceG3) ? null : charSequenceG3;
        appCompatTextView.setText(charSequenceG3);
        m();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f12003o0.add(nVar);
        if (textInputLayout.f11992f != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new k.f(2, this));
    }

    public final CheckableImageButton a(int i10, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.bg, viewGroup, false);
        checkableImageButton.setId(i10);
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(b5.c.b(checkableImageButton.getContext(), (int) en1.n(checkableImageButton.getContext(), 4)));
        }
        if (tp1.l(getContext())) {
            o0.m.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final p b() {
        int i10 = this.f14053u;
        androidx.activity.result.h hVar = this.f14052t;
        SparseArray sparseArray = (SparseArray) hVar.f200d;
        p fVar = (p) sparseArray.get(i10);
        if (fVar == null) {
            if (i10 != -1) {
                int i11 = 1;
                if (i10 == 0) {
                    fVar = new f((o) hVar.f201f, i11);
                } else if (i10 == 1) {
                    fVar = new v((o) hVar.f201f, hVar.f199b);
                } else if (i10 == 2) {
                    fVar = new e((o) hVar.f201f);
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException(fb1.g("Invalid end icon mode: ", i10));
                    }
                    fVar = new l((o) hVar.f201f);
                }
            } else {
                fVar = new f((o) hVar.f201f, 0);
            }
            sparseArray.append(i10, fVar);
        }
        return fVar;
    }

    public final boolean c() {
        return this.f14046b.getVisibility() == 0 && this.f14051s.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f14047d.getVisibility() == 0;
    }

    public final void e(boolean z9) {
        boolean z10;
        boolean zIsActivated;
        boolean zIsChecked;
        p pVarB = b();
        boolean zK = pVarB.k();
        CheckableImageButton checkableImageButton = this.f14051s;
        boolean z11 = true;
        if (!zK || (zIsChecked = checkableImageButton.isChecked()) == pVarB.l()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z10 = true;
        }
        if (!(pVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == pVarB.j()) {
            z11 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z9 || z11) {
            en1.B(this.f14045a, checkableImageButton, this.f14055w);
        }
    }

    public final void f(int i10) {
        if (this.f14053u == i10) {
            return;
        }
        p pVarB = b();
        p0.d dVar = this.G;
        AccessibilityManager accessibilityManager = this.F;
        if (dVar != null && accessibilityManager != null) {
            p0.c.b(accessibilityManager, dVar);
        }
        this.G = null;
        pVarB.s();
        this.f14053u = i10;
        Iterator it = this.f14054v.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        g(i10 != 0);
        p pVarB2 = b();
        int iD = this.f14052t.f198a;
        if (iD == 0) {
            iD = pVarB2.d();
        }
        Drawable drawableG = iD != 0 ? p7.q.g(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f14051s;
        checkableImageButton.setImageDrawable(drawableG);
        TextInputLayout textInputLayout = this.f14045a;
        if (drawableG != null) {
            en1.b(textInputLayout, checkableImageButton, this.f14055w, this.f14056x);
            en1.B(textInputLayout, checkableImageButton, this.f14055w);
        }
        int iC = pVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(pVarB2.k());
        if (!pVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        pVarB2.r();
        p0.d dVarH = pVarB2.h();
        this.G = dVarH;
        if (dVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = v0.f16075a;
            if (g0.b(this)) {
                p0.c.a(accessibilityManager, this.G);
            }
        }
        View.OnClickListener onClickListenerF = pVarB2.f();
        View.OnLongClickListener onLongClickListener = this.A;
        checkableImageButton.setOnClickListener(onClickListenerF);
        en1.G(checkableImageButton, onLongClickListener);
        EditText editText = this.E;
        if (editText != null) {
            pVarB2.m(editText);
            i(pVarB2);
        }
        en1.b(textInputLayout, checkableImageButton, this.f14055w, this.f14056x);
        e(true);
    }

    public final void g(boolean z9) {
        if (c() != z9) {
            this.f14051s.setVisibility(z9 ? 0 : 8);
            j();
            l();
            this.f14045a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f14047d;
        checkableImageButton.setImageDrawable(drawable);
        k();
        en1.b(this.f14045a, checkableImageButton, this.f14048f, this.f14049h);
    }

    public final void i(p pVar) {
        if (this.E == null) {
            return;
        }
        if (pVar.e() != null) {
            this.E.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f14051s.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void j() {
        this.f14046b.setVisibility((this.f14051s.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.B == null || this.D) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f14047d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f14045a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f12014v.f14085q && textInputLayout.m()) ? 0 : 8);
        j();
        l();
        if (this.f14053u != 0) {
            return;
        }
        textInputLayout.p();
    }

    public final void l() {
        int iE;
        TextInputLayout textInputLayout = this.f14045a;
        if (textInputLayout.f11992f == null) {
            return;
        }
        if (c() || d()) {
            iE = 0;
        } else {
            EditText editText = textInputLayout.f11992f;
            WeakHashMap weakHashMap = v0.f16075a;
            iE = e0.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.nd);
        int paddingTop = textInputLayout.f11992f.getPaddingTop();
        int paddingBottom = textInputLayout.f11992f.getPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f16075a;
        e0.k(this.C, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    public final void m() {
        AppCompatTextView appCompatTextView = this.C;
        int visibility = appCompatTextView.getVisibility();
        int i10 = (this.B == null || this.D) ? 8 : 0;
        if (visibility != i10) {
            b().p(i10 == 0);
        }
        j();
        appCompatTextView.setVisibility(i10);
        this.f14045a.p();
    }
}
