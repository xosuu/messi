package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.ur0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class x3 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f15068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f15071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f15072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f15073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f15075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f15076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f15077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f15078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.b f15080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f15081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f15082o;

    public x3(Toolbar toolbar, boolean z9) {
        Drawable drawable;
        this.f15081n = 0;
        this.f15068a = toolbar;
        this.f15075h = toolbar.getTitle();
        this.f15076i = toolbar.getSubtitle();
        this.f15074g = this.f15075h != null;
        this.f15073f = toolbar.getNavigationIcon();
        ur0 ur0VarK = ur0.K(toolbar.getContext(), null, e.a.f12594a, R.attr.h);
        int i10 = 15;
        this.f15082o = ur0VarK.y(15);
        if (z9) {
            CharSequence charSequenceG = ur0VarK.G(27);
            if (!TextUtils.isEmpty(charSequenceG)) {
                this.f15074g = true;
                this.f15075h = charSequenceG;
                if ((this.f15069b & 8) != 0) {
                    Toolbar toolbar2 = this.f15068a;
                    toolbar2.setTitle(charSequenceG);
                    if (this.f15074g) {
                        o0.v0.r(toolbar2.getRootView(), charSequenceG);
                    }
                }
            }
            CharSequence charSequenceG2 = ur0VarK.G(25);
            if (!TextUtils.isEmpty(charSequenceG2)) {
                this.f15076i = charSequenceG2;
                if ((this.f15069b & 8) != 0) {
                    toolbar.setSubtitle(charSequenceG2);
                }
            }
            Drawable drawableY = ur0VarK.y(20);
            if (drawableY != null) {
                this.f15072e = drawableY;
                d();
            }
            Drawable drawableY2 = ur0VarK.y(17);
            if (drawableY2 != null) {
                this.f15071d = drawableY2;
                d();
            }
            if (this.f15073f == null && (drawable = this.f15082o) != null) {
                this.f15073f = drawable;
                int i11 = this.f15069b & 4;
                Toolbar toolbar3 = this.f15068a;
                if (i11 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(ur0VarK.B(10, 0));
            int iD = ur0VarK.D(9, 0);
            if (iD != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iD, (ViewGroup) toolbar, false);
                View view = this.f15070c;
                if (view != null && (this.f15069b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f15070c = viewInflate;
                if (viewInflate != null && (this.f15069b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f15069b | 16);
            }
            int layoutDimension = ((TypedArray) ur0VarK.f9601d).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int iW = ur0VarK.w(7, -1);
            int iW2 = ur0VarK.w(3, -1);
            if (iW >= 0 || iW2 >= 0) {
                int iMax = Math.max(iW, 0);
                int iMax2 = Math.max(iW2, 0);
                toolbar.d();
                toolbar.F.a(iMax, iMax2);
            }
            int iD2 = ur0VarK.D(28, 0);
            if (iD2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f363x = iD2;
                AppCompatTextView appCompatTextView = toolbar.f345b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, iD2);
                }
            }
            int iD3 = ur0VarK.D(26, 0);
            if (iD3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f364y = iD3;
                AppCompatTextView appCompatTextView2 = toolbar.f348d;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, iD3);
                }
            }
            int iD4 = ur0VarK.D(22, 0);
            if (iD4 != 0) {
                toolbar.setPopupTheme(iD4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f15082o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f15069b = i10;
        }
        ur0VarK.M();
        if (R.string.w != this.f15081n) {
            this.f15081n = R.string.w;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.f15081n);
            }
        }
        this.f15077j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f15069b ^ i10;
        this.f15069b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    c();
                }
                int i12 = this.f15069b & 4;
                Toolbar toolbar = this.f15068a;
                if (i12 != 0) {
                    Drawable drawable = this.f15073f;
                    if (drawable == null) {
                        drawable = this.f15082o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                d();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f15068a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f15075h);
                    toolbar2.setSubtitle(this.f15076i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f15070c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b(int i10) {
        this.f15077j = i10 == 0 ? null : this.f15068a.getContext().getString(i10);
        c();
    }

    public final void c() {
        if ((this.f15069b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f15077j);
            Toolbar toolbar = this.f15068a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f15081n);
            } else {
                toolbar.setNavigationContentDescription(this.f15077j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i10 = this.f15069b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f15072e) == null) {
            drawable = this.f15071d;
        }
        this.f15068a.setLogo(drawable);
    }
}
