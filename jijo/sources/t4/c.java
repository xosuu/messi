package t4;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p0.f;
import p0.g;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends v0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f16857q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f16857q = chip;
    }

    @Override // v0.b
    public final void m(ArrayList arrayList) {
        boolean z9 = false;
        arrayList.add(0);
        Rect rect = Chip.I;
        Chip chip = this.f16857q;
        if (chip.d()) {
            e eVar = chip.f11835h;
            if (eVar != null && eVar.W) {
                z9 = true;
            }
            if (!z9 || chip.f11838t == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // v0.b
    public final boolean q(int i10, int i11) {
        boolean z9 = false;
        if (i11 == 16) {
            Chip chip = this.f16857q;
            if (i10 == 0) {
                return chip.performClick();
            }
            if (i10 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f11838t;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z9 = true;
                }
                if (chip.E) {
                    chip.D.w(1, 1);
                }
            }
        }
        return z9;
    }

    @Override // v0.b
    public final void s(g gVar) {
        Chip chip = this.f16857q;
        boolean zE = chip.e();
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        accessibilityNodeInfo.setCheckable(zE);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.g(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            gVar.l(text);
        } else {
            gVar.i(text);
        }
    }

    @Override // v0.b
    public final void t(int i10, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        CharSequence charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (i10 != 1) {
            gVar.i(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            accessibilityNodeInfo.setBoundsInParent(Chip.I);
            return;
        }
        Chip chip = this.f16857q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            gVar.i(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            objArr[0] = charSequence;
            gVar.i(context.getString(R.string.nf, objArr).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        gVar.b(f.f16182g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // v0.b
    public final void u(int i10, boolean z9) {
        if (i10 == 1) {
            Chip chip = this.f16857q;
            chip.f11843y = z9;
            chip.refreshDrawableState();
        }
    }

    public final int x(float f10, float f11) {
        Rect rect = Chip.I;
        Chip chip = this.f16857q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
    }
}
