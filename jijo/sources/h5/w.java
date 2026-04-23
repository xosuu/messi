package h5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o0.e0;
import o0.g0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class w extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f14109b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f14110d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f14111f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f14112h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f14113q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f14115t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnLongClickListener f14116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14117v;

    public w(TextInputLayout textInputLayout, ur0 ur0Var) {
        CharSequence charSequenceG;
        super(textInputLayout.getContext());
        this.f14108a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.bh, (ViewGroup) this, false);
        this.f14111f = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(b5.c.b(checkableImageButton.getContext(), (int) en1.n(checkableImageButton.getContext(), 4)));
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f14109b = appCompatTextView;
        if (tp1.l(getContext())) {
            o0.m.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f14116u;
        checkableImageButton.setOnClickListener(null);
        en1.G(checkableImageButton, onLongClickListener);
        this.f14116u = null;
        checkableImageButton.setOnLongClickListener(null);
        en1.G(checkableImageButton, null);
        if (ur0Var.H(67)) {
            this.f14112h = tp1.h(getContext(), ur0Var, 67);
        }
        if (ur0Var.H(68)) {
            this.f14113q = en1.y(ur0Var.B(68, -1), null);
        }
        if (ur0Var.H(64)) {
            a(ur0Var.y(64));
            if (ur0Var.H(63) && checkableImageButton.getContentDescription() != (charSequenceG = ur0Var.G(63))) {
                checkableImageButton.setContentDescription(charSequenceG);
            }
            checkableImageButton.setCheckable(ur0Var.u(62, true));
        }
        int iX = ur0Var.x(65, getResources().getDimensionPixelSize(R.dimen.ra));
        if (iX < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iX != this.f14114s) {
            this.f14114s = iX;
            checkableImageButton.setMinimumWidth(iX);
            checkableImageButton.setMinimumHeight(iX);
        }
        if (ur0Var.H(66)) {
            ImageView.ScaleType scaleTypeI = en1.i(ur0Var.B(66, -1));
            this.f14115t = scaleTypeI;
            checkableImageButton.setScaleType(scaleTypeI);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.wk);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = v0.f16075a;
        g0.f(appCompatTextView, 1);
        g4.z.B(appCompatTextView, ur0Var.D(58, 0));
        if (ur0Var.H(59)) {
            appCompatTextView.setTextColor(ur0Var.v(59));
        }
        CharSequence charSequenceG2 = ur0Var.G(57);
        this.f14110d = TextUtils.isEmpty(charSequenceG2) ? null : charSequenceG2;
        appCompatTextView.setText(charSequenceG2);
        d();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f14111f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f14112h;
            PorterDuff.Mode mode = this.f14113q;
            TextInputLayout textInputLayout = this.f14108a;
            en1.b(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            en1.B(textInputLayout, checkableImageButton, this.f14112h);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f14116u;
        checkableImageButton.setOnClickListener(null);
        en1.G(checkableImageButton, onLongClickListener);
        this.f14116u = null;
        checkableImageButton.setOnLongClickListener(null);
        en1.G(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z9) {
        CheckableImageButton checkableImageButton = this.f14111f;
        if ((checkableImageButton.getVisibility() == 0) != z9) {
            checkableImageButton.setVisibility(z9 ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() {
        int iF;
        EditText editText = this.f14108a.f11992f;
        if (editText == null) {
            return;
        }
        if (this.f14111f.getVisibility() == 0) {
            iF = 0;
        } else {
            WeakHashMap weakHashMap = v0.f16075a;
            iF = e0.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.nd);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f16075a;
        e0.k(this.f14109b, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i10 = (this.f14110d == null || this.f14117v) ? 8 : 0;
        setVisibility((this.f14111f.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f14109b.setVisibility(i10);
        this.f14108a.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
