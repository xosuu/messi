package h5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f14031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f14032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f14033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f14034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r0.c f14035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f14040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f14041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f14042r;

    public l(o oVar) {
        super(oVar);
        int i10 = 1;
        this.f14033i = new b(i10, this);
        this.f14034j = new c(i10, this);
        this.f14035k = new r0.c(i10, this);
        this.f14039o = Long.MAX_VALUE;
        this.f14030f = g4.a0.w(oVar.getContext(), R.attr.wy, 67);
        this.f14029e = g4.a0.w(oVar.getContext(), R.attr.wy, 50);
        this.f14031g = g4.a0.x(oVar.getContext(), R.attr.x7, m4.a.f15740a);
    }

    @Override // h5.p
    public final void a() {
        if (this.f14040p.isTouchExplorationEnabled() && this.f14032h.getInputType() != 0 && !this.f14062d.hasFocus()) {
            this.f14032h.dismissDropDown();
        }
        this.f14032h.post(new androidx.activity.b(8, this));
    }

    @Override // h5.p
    public final int c() {
        return R.string.hx;
    }

    @Override // h5.p
    public final int d() {
        return R.drawable.hd;
    }

    @Override // h5.p
    public final View.OnFocusChangeListener e() {
        return this.f14034j;
    }

    @Override // h5.p
    public final View.OnClickListener f() {
        return this.f14033i;
    }

    @Override // h5.p
    public final p0.d h() {
        return this.f14035k;
    }

    @Override // h5.p
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // h5.p
    public final boolean j() {
        return this.f14036l;
    }

    @Override // h5.p
    public final boolean l() {
        return this.f14038n;
    }

    @Override // h5.p
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f14032h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: h5.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = this.f14027a;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - lVar.f14039o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        lVar.f14037m = false;
                    }
                    lVar.u();
                    lVar.f14037m = true;
                    lVar.f14039o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f14032h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: h5.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.f14028a;
                lVar.f14037m = true;
                lVar.f14039o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.f14032h.setThreshold(0);
        TextInputLayout textInputLayout = this.f14059a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f14040p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = v0.f16075a;
            d0.s(this.f14062d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // h5.p
    public final void n(p0.g gVar) {
        if (this.f14032h.getInputType() == 0) {
            gVar.g(Spinner.class.getName());
        }
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        if (i10 < 26) {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                return;
            }
        } else if (!accessibilityNodeInfo.isShowingHintText()) {
            return;
        }
        gVar.j(null);
    }

    @Override // h5.p
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f14040p.isEnabled() && this.f14032h.getInputType() == 0) {
            u();
            this.f14037m = true;
            this.f14039o = System.currentTimeMillis();
        }
    }

    @Override // h5.p
    public final void r() {
        int i10 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f14031g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f14030f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, i10));
        this.f14042r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f14029e);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, i10));
        this.f14041q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new l.d(7, this));
        this.f14040p = (AccessibilityManager) this.f14061c.getSystemService("accessibility");
    }

    @Override // h5.p
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f14032h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f14032h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z9) {
        if (this.f14038n != z9) {
            this.f14038n = z9;
            this.f14042r.cancel();
            this.f14041q.start();
        }
    }

    public final void u() {
        if (this.f14032h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14039o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f14037m = false;
        }
        if (this.f14037m) {
            this.f14037m = false;
            return;
        }
        t(!this.f14038n);
        if (!this.f14038n) {
            this.f14032h.dismissDropDown();
        } else {
            this.f14032h.requestFocus();
            this.f14032h.showDropDown();
        }
    }
}
