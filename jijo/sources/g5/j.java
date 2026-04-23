package g5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.ads.en1;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.tabs.TabLayout;
import g4.z;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o0.d0;
import o0.e0;
import o0.l0;
import o0.m;
import o0.v0;
import o0.x;
import p7.q;
import s0.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends LinearLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f13868x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f13869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13870b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f13871d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f13872f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o4.a f13873h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f13874q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f13875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f13876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f13877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabLayout f13879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        this.f13879w = tabLayout;
        this.f13878v = 2;
        f(context);
        int i10 = tabLayout.f11968h;
        WeakHashMap weakHashMap = v0.f16075a;
        e0.k(this, i10, tabLayout.f11973q, tabLayout.f11974s, tabLayout.f11975t);
        setGravity(17);
        setOrientation(!tabLayout.P ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 11;
        m2.f fVar = i11 >= 24 ? new m2.f(i12, x.b(context2, 1002)) : new m2.f(i12, null);
        if (i11 >= 24) {
            l0.d(this, k3.d.e((PointerIcon) fVar.f15701b));
        }
    }

    private o4.a getBadge() {
        return this.f13873h;
    }

    private o4.a getOrCreateBadge() {
        if (this.f13873h == null) {
            this.f13873h = new o4.a(getContext());
        }
        c();
        o4.a aVar = this.f13873h;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.f13873h == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        o4.a aVar = this.f13873h;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.e(view, null);
        WeakReference weakReference = aVar.f16104y;
        if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
            WeakReference weakReference2 = aVar.f16104y;
            (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
        this.f13872f = view;
    }

    public final void b() {
        if (this.f13873h != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f13872f;
            if (view != null) {
                o4.a aVar = this.f13873h;
                if (aVar != null) {
                    WeakReference weakReference = aVar.f16104y;
                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = aVar.f16104y;
                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f13872f = null;
            }
        }
    }

    public final void c() {
        g gVar;
        if (this.f13873h != null) {
            if (this.f13874q != null) {
                b();
                return;
            }
            ImageView imageView = this.f13871d;
            if (imageView != null && (gVar = this.f13869a) != null && gVar.f13855a != null) {
                if (this.f13872f == imageView) {
                    d(imageView);
                    return;
                } else {
                    b();
                    a(this.f13871d);
                    return;
                }
            }
            TextView textView = this.f13870b;
            if (textView == null || this.f13869a == null) {
                b();
            } else if (this.f13872f == textView) {
                d(textView);
            } else {
                b();
                a(this.f13870b);
            }
        }
    }

    public final void d(View view) {
        o4.a aVar = this.f13873h;
        if (aVar == null || view != this.f13872f) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.e(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13877u;
        if (drawable != null && drawable.isStateful() && this.f13877u.setState(drawableState)) {
            invalidate();
            this.f13879w.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r3 = this;
            r3.g()
            g5.g r0 = r3.f13869a
            if (r0 == 0) goto L20
            com.google.android.material.tabs.TabLayout r1 = r0.f13860f
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L20
            int r0 = r0.f13858d
            if (r1 != r0) goto L20
            r0 = 1
            goto L21
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Tab not attached to a TabLayout"
            r0.<init>(r1)
            throw r0
        L20:
            r0 = 0
        L21:
            r3.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.j.e():void");
    }

    public final void f(Context context) {
        TabLayout tabLayout = this.f13879w;
        int i10 = tabLayout.F;
        if (i10 != 0) {
            Drawable drawableG = q.g(context, i10);
            this.f13877u = drawableG;
            if (drawableG != null && drawableG.isStateful()) {
                this.f13877u.setState(getDrawableState());
            }
        } else {
            this.f13877u = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable rippleDrawable = gradientDrawable;
        if (tabLayout.f11981z != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.f11981z;
            int iA = b5.d.a(colorStateList, b5.d.f1337c);
            int[] iArr = b5.d.f1336b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{b5.d.f1338d, iArr, StateSet.NOTHING}, new int[]{iA, b5.d.a(colorStateList, iArr), b5.d.a(colorStateList, b5.d.f1335a)});
            boolean z9 = tabLayout.T;
            GradientDrawable gradientDrawable3 = gradientDrawable;
            if (z9) {
                gradientDrawable3 = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable3, z9 ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(this, rippleDrawable);
        tabLayout.invalidate();
    }

    public final void g() {
        int i10;
        ViewParent parent;
        g gVar = this.f13869a;
        View view = gVar != null ? gVar.f13859e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f13874q;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f13874q);
                }
                addView(view);
            }
            this.f13874q = view;
            TextView textView = this.f13870b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f13871d;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f13871d.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f13875s = textView2;
            if (textView2 != null) {
                this.f13878v = n.b(textView2);
            }
            this.f13876t = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f13874q;
            if (view3 != null) {
                removeView(view3);
                this.f13874q = null;
            }
            this.f13875s = null;
            this.f13876t = null;
        }
        if (this.f13874q == null) {
            if (this.f13871d == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(xyz.easypro.httpcustom.R.layout.b8, (ViewGroup) this, false);
                this.f13871d = imageView2;
                addView(imageView2, 0);
            }
            if (this.f13870b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(xyz.easypro.httpcustom.R.layout.b9, (ViewGroup) this, false);
                this.f13870b = textView3;
                addView(textView3);
                this.f13878v = n.b(this.f13870b);
            }
            TextView textView4 = this.f13870b;
            TabLayout tabLayout = this.f13879w;
            z.B(textView4, tabLayout.f11976u);
            if (!isSelected() || (i10 = tabLayout.f11978w) == -1) {
                z.B(this.f13870b, tabLayout.f11977v);
            } else {
                z.B(this.f13870b, i10);
            }
            ColorStateList colorStateList = tabLayout.f11979x;
            if (colorStateList != null) {
                this.f13870b.setTextColor(colorStateList);
            }
            h(this.f13870b, this.f13871d, true);
            c();
            ImageView imageView3 = this.f13871d;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new i(this, imageView3));
            }
            TextView textView5 = this.f13870b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new i(this, textView5));
            }
        } else {
            TextView textView6 = this.f13875s;
            if (textView6 != null || this.f13876t != null) {
                h(textView6, this.f13876t, false);
            }
        }
        if (gVar == null || TextUtils.isEmpty(gVar.f13857c)) {
            return;
        }
        setContentDescription(gVar.f13857c);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f13870b, this.f13871d, this.f13874q};
        int iMax = 0;
        int iMin = 0;
        boolean z9 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                iMin = z9 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z9 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z9 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f13870b, this.f13871d, this.f13874q};
        int iMax = 0;
        int iMin = 0;
        boolean z9 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                iMin = z9 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z9 ? Math.max(iMax, view.getRight()) : view.getRight();
                z9 = true;
            }
        }
        return iMax - iMin;
    }

    public g getTab() {
        return this.f13869a;
    }

    public final void h(TextView textView, ImageView imageView, boolean z9) {
        Drawable drawable;
        g gVar = this.f13869a;
        Drawable drawableMutate = (gVar == null || (drawable = gVar.f13855a) == null) ? null : z.I(drawable).mutate();
        TabLayout tabLayout = this.f13879w;
        if (drawableMutate != null) {
            h0.b.h(drawableMutate, tabLayout.f11980y);
            PorterDuff.Mode mode = tabLayout.C;
            if (mode != null) {
                h0.b.i(drawableMutate, mode);
            }
        }
        g gVar2 = this.f13869a;
        CharSequence charSequence = gVar2 != null ? gVar2.f13856b : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z11) {
                this.f13869a.getClass();
            } else {
                z10 = false;
            }
            textView.setText(z11 ? charSequence : null);
            textView.setVisibility(z10 ? 0 : 8);
            if (z11) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z9 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iN = (z10 && imageView.getVisibility() == 0) ? (int) en1.n(getContext(), 8) : 0;
            if (tabLayout.P) {
                if (iN != m.b(marginLayoutParams)) {
                    m.g(marginLayoutParams, iN);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iN != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iN;
                m.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        g gVar3 = this.f13869a;
        CharSequence charSequence2 = gVar3 != null ? gVar3.f13857c : null;
        if (Build.VERSION.SDK_INT > 23) {
            if (!z11) {
                charSequence = charSequence2;
            }
            g4.d0.j(this, charSequence);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o4.a aVar = this.f13873h;
        if (aVar != null && aVar.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) contentDescription);
            sb.append(", ");
            o4.a aVar2 = this.f13873h;
            Object quantityString = null;
            if (aVar2.isVisible()) {
                boolean zD = aVar2.d();
                o4.b bVar = aVar2.f16096h;
                if (!zD) {
                    quantityString = bVar.f16106b.f11743t;
                } else if (bVar.f16106b.f11744u != 0 && (context = (Context) aVar2.f16092a.get()) != null) {
                    int iC = aVar2.c();
                    int i10 = aVar2.f16099t;
                    BadgeState$State badgeState$State = bVar.f16106b;
                    quantityString = iC <= i10 ? context.getResources().getQuantityString(badgeState$State.f11744u, aVar2.c(), Integer.valueOf(aVar2.c())) : context.getString(badgeState$State.f11745v, Integer.valueOf(i10));
                }
            }
            sb.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) androidx.fragment.app.k.f(0, 1, this.f13869a.f13858d, 1, false, isSelected()).f808a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) p0.f.f16182g.f16190a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(xyz.easypro.httpcustom.R.string.ku));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        TabLayout tabLayout = this.f13879w;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.G, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f13870b != null) {
            float f10 = tabLayout.D;
            int i12 = this.f13878v;
            ImageView imageView = this.f13871d;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f13870b;
                if (textView != null && textView.getLineCount() > 1) {
                    f10 = tabLayout.E;
                }
            } else {
                i12 = 1;
            }
            float textSize = this.f13870b.getTextSize();
            int lineCount = this.f13870b.getLineCount();
            int iB = n.b(this.f13870b);
            if (f10 != textSize || (iB >= 0 && i12 != iB)) {
                if (tabLayout.O == 1 && f10 > textSize && lineCount == 1) {
                    Layout layout = this.f13870b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f13870b.setTextSize(0, f10);
                this.f13870b.setMaxLines(i12);
                super.onMeasure(i10, i11);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f13869a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        g gVar = this.f13869a;
        TabLayout tabLayout = gVar.f13860f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.f(gVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        isSelected();
        super.setSelected(z9);
        TextView textView = this.f13870b;
        if (textView != null) {
            textView.setSelected(z9);
        }
        ImageView imageView = this.f13871d;
        if (imageView != null) {
            imageView.setSelected(z9);
        }
        View view = this.f13874q;
        if (view != null) {
            view.setSelected(z9);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.f13869a) {
            this.f13869a = gVar;
            e();
        }
    }
}
