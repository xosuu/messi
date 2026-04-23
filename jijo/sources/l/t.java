package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f14996b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f14997c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14998d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14999e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f15001g;

    public /* synthetic */ t(TextView textView, int i10) {
        this.f14995a = i10;
        this.f15001g = textView;
    }

    public final void a() {
        TextView textView = this.f15001g;
        Drawable drawableK = g4.z.k((CompoundButton) textView);
        if (drawableK != null) {
            if (this.f14998d || this.f14999e) {
                Drawable drawableMutate = g4.z.I(drawableK).mutate();
                if (this.f14998d) {
                    h0.b.h(drawableMutate, this.f14996b);
                }
                if (this.f14999e) {
                    h0.b.i(drawableMutate, this.f14997c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f15001g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f14998d || this.f14999e) {
                Drawable drawableMutate = g4.z.I(checkMarkDrawable).mutate();
                if (this.f14998d) {
                    h0.b.h(drawableMutate, this.f14996b);
                }
                if (this.f14999e) {
                    h0.b.i(drawableMutate, this.f14997c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i10) {
        ur0 ur0VarK;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i11 = this.f14995a;
        TextView textView = this.f15001g;
        switch (i11) {
            case 0:
                CheckedTextView checkedTextView = (CheckedTextView) textView;
                Context context = checkedTextView.getContext();
                int[] iArr = e.a.f12605l;
                ur0VarK = ur0.K(context, attributeSet, iArr, i10);
                o0.v0.p(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) ur0VarK.f9601d, i10);
                try {
                    if (ur0VarK.H(1) && (iD2 = ur0VarK.D(1, 0)) != 0) {
                        try {
                            ((CheckedTextView) textView).setCheckMarkDrawable(p7.q.g(((CheckedTextView) textView).getContext(), iD2));
                        } catch (Resources.NotFoundException unused) {
                            if (ur0VarK.H(0)) {
                                ((CheckedTextView) textView).setCheckMarkDrawable(p7.q.g(((CheckedTextView) textView).getContext(), iD));
                            }
                        }
                        break;
                    } else if (ur0VarK.H(0) && (iD = ur0VarK.D(0, 0)) != 0) {
                        ((CheckedTextView) textView).setCheckMarkDrawable(p7.q.g(((CheckedTextView) textView).getContext(), iD));
                    }
                    if (ur0VarK.H(2)) {
                        ((CheckedTextView) textView).setCheckMarkTintList(ur0VarK.v(2));
                    }
                    if (ur0VarK.H(3)) {
                        ((CheckedTextView) textView).setCheckMarkTintMode(r1.c(ur0VarK.B(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                }
            default:
                CompoundButton compoundButton = (CompoundButton) textView;
                Context context2 = compoundButton.getContext();
                int[] iArr2 = e.a.f12606m;
                ur0VarK = ur0.K(context2, attributeSet, iArr2, i10);
                o0.v0.p(compoundButton, compoundButton.getContext(), iArr2, attributeSet, (TypedArray) ur0VarK.f9601d, i10);
                try {
                    if (ur0VarK.H(1) && (iD4 = ur0VarK.D(1, 0)) != 0) {
                        try {
                            ((CompoundButton) textView).setButtonDrawable(p7.q.g(((CompoundButton) textView).getContext(), iD4));
                        } catch (Resources.NotFoundException unused2) {
                            if (ur0VarK.H(0)) {
                                ((CompoundButton) textView).setButtonDrawable(p7.q.g(((CompoundButton) textView).getContext(), iD3));
                            }
                        }
                        break;
                    } else if (ur0VarK.H(0) && (iD3 = ur0VarK.D(0, 0)) != 0) {
                        ((CompoundButton) textView).setButtonDrawable(p7.q.g(((CompoundButton) textView).getContext(), iD3));
                    }
                    if (ur0VarK.H(2)) {
                        s0.b.c((CompoundButton) textView, ur0VarK.v(2));
                    }
                    if (ur0VarK.H(3)) {
                        s0.b.d((CompoundButton) textView, r1.c(ur0VarK.B(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                }
        }
    }
}
