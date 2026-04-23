package h5;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f14019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f14020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f14021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f14022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f14023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f14024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f14025m;

    public e(o oVar) {
        super(oVar);
        int i10 = 0;
        this.f14022j = new b(i10, this);
        this.f14023k = new c(i10, this);
        this.f14017e = g4.a0.w(oVar.getContext(), R.attr.wy, 100);
        this.f14018f = g4.a0.w(oVar.getContext(), R.attr.wy, 150);
        this.f14019g = g4.a0.x(oVar.getContext(), R.attr.x7, m4.a.f15740a);
        this.f14020h = g4.a0.x(oVar.getContext(), R.attr.x5, m4.a.f15743d);
    }

    @Override // h5.p
    public final void a() {
        if (this.f14060b.B != null) {
            return;
        }
        t(u());
    }

    @Override // h5.p
    public final int c() {
        return R.string.du;
    }

    @Override // h5.p
    public final int d() {
        return R.drawable.hg;
    }

    @Override // h5.p
    public final View.OnFocusChangeListener e() {
        return this.f14023k;
    }

    @Override // h5.p
    public final View.OnClickListener f() {
        return this.f14022j;
    }

    @Override // h5.p
    public final View.OnFocusChangeListener g() {
        return this.f14023k;
    }

    @Override // h5.p
    public final void m(EditText editText) {
        this.f14021i = editText;
        this.f14059a.setEndIconVisible(u());
    }

    @Override // h5.p
    public final void p(boolean z9) {
        if (this.f14060b.B == null) {
            return;
        }
        t(z9);
    }

    @Override // h5.p
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f14020h);
        valueAnimatorOfFloat.setDuration(this.f14018f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f14019g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f14017e;
        valueAnimatorOfFloat2.setDuration(i10);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14024l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f14024l.addListener(new d(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new a(this, 1));
        this.f14025m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new d(this, 1));
    }

    @Override // h5.p
    public final void s() {
        EditText editText = this.f14021i;
        if (editText != null) {
            editText.post(new androidx.activity.b(7, this));
        }
    }

    public final void t(boolean z9) {
        boolean z10 = this.f14060b.c() == z9;
        if (z9 && !this.f14024l.isRunning()) {
            this.f14025m.cancel();
            this.f14024l.start();
            if (z10) {
                this.f14024l.end();
                return;
            }
            return;
        }
        if (z9) {
            return;
        }
        this.f14024l.cancel();
        this.f14025m.start();
        if (z10) {
            this.f14025m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f14021i;
        return editText != null && (editText.hasFocus() || this.f14062d.hasFocus()) && this.f14021i.getText().length() > 0;
    }
}
