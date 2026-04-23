package h5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.e0;
import o0.g0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f14072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f14073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f14074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f14075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f14076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f14077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f14079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f14080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f14081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f14084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatTextView f14086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f14087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f14090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f14091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatTextView f14093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14094z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f14075g = context;
        this.f14076h = textInputLayout;
        this.f14081m = context.getResources().getDimensionPixelSize(R.dimen.do_res_0x7f0700a2);
        this.f14069a = g4.a0.w(context, R.attr.wz, 217);
        this.f14070b = g4.a0.w(context, R.attr.wv, 167);
        this.f14071c = g4.a0.w(context, R.attr.wz, 167);
        this.f14072d = g4.a0.x(context, R.attr.x4, m4.a.f15743d);
        LinearInterpolator linearInterpolator = m4.a.f15740a;
        this.f14073e = g4.a0.x(context, R.attr.x4, linearInterpolator);
        this.f14074f = g4.a0.x(context, R.attr.x7, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        if (this.f14077i == null && this.f14079k == null) {
            Context context = this.f14075g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f14077i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f14077i;
            TextInputLayout textInputLayout = this.f14076h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f14079k = new FrameLayout(context);
            this.f14077i.addView(this.f14079k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f14079k.setVisibility(0);
            this.f14079k.addView(textView);
        } else {
            this.f14077i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f14077i.setVisibility(0);
        this.f14078j++;
    }

    public final void b() {
        if (this.f14077i != null) {
            TextInputLayout textInputLayout = this.f14076h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f14075g;
                boolean zL = tp1.l(context);
                LinearLayout linearLayout = this.f14077i;
                WeakHashMap weakHashMap = v0.f16075a;
                int iF = e0.f(editText);
                if (zL) {
                    iF = context.getResources().getDimensionPixelSize(R.dimen.nb);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.na);
                if (zL) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.nc);
                }
                int iE = e0.e(editText);
                if (zL) {
                    iE = context.getResources().getDimensionPixelSize(R.dimen.nb);
                }
                e0.k(linearLayout, iF, dimensionPixelSize, iE, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f14080l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z9, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z9) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z10 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i13 = this.f14071c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f14070b : i13);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f14073e : this.f14074f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f14081m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f14069a);
            objectAnimatorOfFloat2.setInterpolator(this.f14072d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f14086r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f14093y;
    }

    public final void f() {
        this.f14084p = null;
        c();
        if (this.f14082n == 1) {
            if (!this.f14092x || TextUtils.isEmpty(this.f14091w)) {
                this.f14083o = 0;
            } else {
                this.f14083o = 2;
            }
        }
        i(this.f14082n, this.f14083o, h(this.f14086r, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f14077i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f14079k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f14078j - 1;
        this.f14078j = i11;
        LinearLayout linearLayout2 = this.f14077i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f16075a;
        TextInputLayout textInputLayout = this.f14076h;
        return g0.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f14083o == this.f14082n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i10, int i11, boolean z9) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f14080l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f14092x, this.f14093y, 2, i10, i11);
            d(arrayList, this.f14085q, this.f14086r, 1, i10, i11);
            g4.a0.t(animatorSet, arrayList);
            animatorSet.addListener(new q(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f14082n = i11;
        }
        TextInputLayout textInputLayout = this.f14076h;
        textInputLayout.q();
        textInputLayout.t(z9, false);
        textInputLayout.w();
    }
}
