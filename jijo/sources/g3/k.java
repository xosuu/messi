package g3;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.google.android.gms.internal.ads.sf;

/* JADX INFO: loaded from: classes.dex */
public final class k extends TextView {
    public static final PorterDuffXfermode E = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    public Animation A;
    public boolean B;
    public boolean C;
    public GestureDetector D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13664b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13665d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13666f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f13667h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13668q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FloatingActionButton f13675y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Animation f13676z;

    @TargetApi(sf.zzm)
    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    private void setShadow(FloatingActionButton floatingActionButton) {
        this.f13666f = floatingActionButton.getShadowColor();
        this.f13663a = floatingActionButton.getShadowRadius();
        this.f13664b = floatingActionButton.getShadowXOffset();
        this.f13665d = floatingActionButton.getShadowYOffset();
        this.f13668q = floatingActionButton.f();
    }

    public final RippleDrawable a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, b(this.f13672v));
        stateListDrawable.addState(new int[0], b(this.f13671u));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f13673w}), stateListDrawable, null);
        setOutlineProvider(new a(this, 1));
        setClipToOutline(true);
        this.f13667h = rippleDrawable;
        return rippleDrawable;
    }

    public final ShapeDrawable b(int i10) {
        float f10 = this.f13674x;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    public final void c() {
        if (this.B) {
            this.f13667h = getBackground();
        }
        Drawable drawable = this.f13667h;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{R.attr.state_pressed});
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
    }

    public final void d() {
        if (this.B) {
            this.f13667h = getBackground();
        }
        Drawable drawable = this.f13667h;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[0]);
            rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
    }

    public final void e() {
        LayerDrawable layerDrawable;
        if (this.f13668q) {
            layerDrawable = new LayerDrawable(new Drawable[]{new j(this), a()});
            layerDrawable.setLayerInset(1, Math.abs(this.f13664b) + this.f13663a, Math.abs(this.f13665d) + this.f13663a, Math.abs(this.f13664b) + this.f13663a, Math.abs(this.f13665d) + this.f13663a);
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{a()});
        }
        setBackgroundCompat(layerDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iAbs;
        super.onMeasure(i10, i11);
        if (this.f13669s == 0) {
            this.f13669s = getMeasuredWidth();
        }
        int measuredWidth = getMeasuredWidth();
        int iAbs2 = 0;
        if (this.f13668q) {
            iAbs = Math.abs(this.f13664b) + this.f13663a;
        } else {
            iAbs = 0;
        }
        int i12 = iAbs + measuredWidth;
        if (this.f13670t == 0) {
            this.f13670t = getMeasuredHeight();
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f13668q) {
            iAbs2 = Math.abs(this.f13665d) + this.f13663a;
        }
        setMeasuredDimension(i12, measuredHeight + iAbs2);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FloatingActionButton floatingActionButton = this.f13675y;
        if (floatingActionButton == null || floatingActionButton.getOnClickListener() == null || !this.f13675y.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            d();
            this.f13675y.i();
        }
        this.D.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setCornerRadius(int i10) {
        this.f13674x = i10;
    }

    public void setFab(FloatingActionButton floatingActionButton) {
        this.f13675y = floatingActionButton;
        setShadow(floatingActionButton);
    }

    public void setHandleVisibilityChanges(boolean z9) {
        this.C = z9;
    }

    public void setHideAnimation(Animation animation) {
        this.A = animation;
    }

    public void setShowAnimation(Animation animation) {
        this.f13676z = animation;
    }

    public void setShowShadow(boolean z9) {
        this.f13668q = z9;
    }

    public void setUsingStyle(boolean z9) {
        this.B = z9;
    }
}
