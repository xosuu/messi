package h5;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f14010d;

    public a0(TextInputLayout textInputLayout) {
        this.f14010d = textInputLayout;
    }

    @Override // o0.c
    public final void d(View view, p0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f14010d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z9 = !zIsEmpty;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(hint);
        boolean z12 = !textInputLayout.D0;
        boolean z13 = !TextUtils.isEmpty(error);
        if (!z13 && TextUtils.isEmpty(counterOverflowDescription)) {
            z10 = false;
        }
        String string = z11 ? hint.toString() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        w wVar = textInputLayout.f11986b;
        AppCompatTextView appCompatTextView = wVar.f14109b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(wVar.f14111f);
        }
        if (z9) {
            gVar.l(text);
        } else if (!TextUtils.isEmpty(string)) {
            gVar.l(string);
            if (z12 && placeholderText != null) {
                gVar.l(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                gVar.j(string);
            } else {
                if (z9) {
                    string = ((Object) text) + ", " + string;
                }
                gVar.l(string);
            }
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                gVar.f(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            accessibilityNodeInfo.setError(z13 ? error : counterOverflowDescription);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f12014v.f14093y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f11989d.b().n(gVar);
    }

    @Override // o0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f14010d.f11989d.b().o(accessibilityEvent);
    }
}
