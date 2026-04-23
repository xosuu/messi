package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.internal.ads.ur0;
import e.a;
import java.util.WeakHashMap;
import k.e0;
import k.r;
import o0.d0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements e0, AbsListView.SelectionBoundsAdjuster {
    public final boolean A;
    public LayoutInflater B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f214b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f215d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f216f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CheckBox f217h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f218q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f225y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Drawable f226z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ur0 ur0VarK = ur0.K(getContext(), attributeSet, a.f12612s, R.attr.t5);
        this.f222v = ur0VarK.y(5);
        this.f223w = ur0VarK.D(1, -1);
        this.f225y = ur0VarK.u(7, false);
        this.f224x = context;
        this.f226z = ur0VarK.y(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.ki, 0);
        this.A = typedArrayObtainStyledAttributes.hasValue(0);
        ur0VarK.M();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.B == null) {
            this.B = LayoutInflater.from(getContext());
        }
        return this.B;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.f219s;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f220t;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f220t.getLayoutParams();
        rect.top = this.f220t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    @Override // k.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(k.r r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(k.r):void");
    }

    @Override // k.e0
    public r getItemData() {
        return this.f213a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(this, this.f222v);
        TextView textView = (TextView) findViewById(R.id.x0);
        this.f216f = textView;
        int i10 = this.f223w;
        if (i10 != -1) {
            textView.setTextAppearance(this.f224x, i10);
        }
        this.f218q = (TextView) findViewById(R.id.tj);
        ImageView imageView = (ImageView) findViewById(R.id.uy);
        this.f219s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f226z);
        }
        this.f220t = (ImageView) findViewById(R.id.jv);
        this.f221u = (LinearLayout) findViewById(R.id.fx);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f214b != null && this.f225y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f214b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        View view;
        if (!z9 && this.f215d == null && this.f217h == null) {
            return;
        }
        if ((this.f213a.f14611x & 4) != 0) {
            if (this.f215d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.r, (ViewGroup) this, false);
                this.f215d = radioButton;
                LinearLayout linearLayout = this.f221u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f215d;
            view = this.f217h;
        } else {
            if (this.f217h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.o, (ViewGroup) this, false);
                this.f217h = checkBox;
                LinearLayout linearLayout2 = this.f221u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f217h;
            view = this.f215d;
        }
        if (z9) {
            compoundButton.setChecked(this.f213a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f217h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f215d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z9) {
        CompoundButton compoundButton;
        if ((this.f213a.f14611x & 4) != 0) {
            if (this.f215d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.r, (ViewGroup) this, false);
                this.f215d = radioButton;
                LinearLayout linearLayout = this.f221u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f215d;
        } else {
            if (this.f217h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.o, (ViewGroup) this, false);
                this.f217h = checkBox;
                LinearLayout linearLayout2 = this.f221u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f217h;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.C = z9;
        this.f225y = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.f220t;
        if (imageView != null) {
            imageView.setVisibility((this.A || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f213a.f14601n.getClass();
        boolean z9 = this.C;
        if (z9 || this.f225y) {
            ImageView imageView = this.f214b;
            if (imageView == null && drawable == null && !this.f225y) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.p, (ViewGroup) this, false);
                this.f214b = imageView2;
                LinearLayout linearLayout = this.f221u;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f225y) {
                this.f214b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f214b;
            if (!z9) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f214b.getVisibility() != 0) {
                this.f214b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f216f.getVisibility() != 8) {
                this.f216f.setVisibility(8);
            }
        } else {
            this.f216f.setText(charSequence);
            if (this.f216f.getVisibility() != 0) {
                this.f216f.setVisibility(0);
            }
        }
    }
}
