package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import e.a;
import g4.d0;
import k.b;
import k.c;
import k.e0;
import k.n;
import k.o;
import k.r;
import l.m;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements e0, View.OnClickListener, m {
    public boolean A;
    public final int B;
    public int C;
    public final int D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f206v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f209y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f210z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f210z = n();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f12596c, 0, 0);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.C = -1;
        setSaveEnabled(false);
    }

    @Override // l.m
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.m
    public final boolean b() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f204t.getIcon() == null;
    }

    @Override // k.e0
    public final void c(r rVar) {
        this.f204t = rVar;
        setIcon(rVar.getIcon());
        setTitle(rVar.getTitleCondensed());
        setId(rVar.f14588a);
        setVisibility(rVar.isVisible() ? 0 : 8);
        setEnabled(rVar.isEnabled());
        if (rVar.hasSubMenu() && this.f208x == null) {
            this.f208x = new b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.e0
    public r getItemData() {
        return this.f204t;
    }

    public final boolean n() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f207w;
        if (nVar != null) {
            nVar.a(this.f204t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f210z = n();
        p();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z9 = !TextUtils.isEmpty(getText());
        if (z9 && (i12 = this.C) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.B;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (z9 || this.f206v == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f206v.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f204t.hasSubMenu() && (bVar = this.f208x) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f205u);
        if (this.f206v != null && ((this.f204t.f14612y & 4) != 4 || (!this.f210z && !this.A))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        setText(z11 ? this.f205u : null);
        CharSequence charSequence = this.f204t.f14604q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f204t.f14592e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f204t.f14605r;
        if (TextUtils.isEmpty(charSequence2)) {
            d0.j(this, z11 ? null : this.f204t.f14592e);
        } else {
            d0.j(this, charSequence2);
        }
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.A != z9) {
            this.A = z9;
            r rVar = this.f204t;
            if (rVar != null) {
                o oVar = rVar.f14601n;
                oVar.f14569k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f206v = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.D;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        p();
    }

    public void setItemInvoker(n nVar) {
        this.f207w = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.C = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(c cVar) {
        this.f209y = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f205u = charSequence;
        p();
    }
}
