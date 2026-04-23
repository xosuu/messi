package o0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.gms.internal.ads.fb1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f16015c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f16016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16017b;

    public c() {
        this(f16015c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f16016a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.fragment.app.k b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f16016a, view);
        if (accessibilityNodeProviderA != null) {
            return new androidx.fragment.app.k(accessibilityNodeProviderA);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f16016a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, p0.g gVar) {
        this.f16016a.onInitializeAccessibilityNodeInfo(view, gVar.f16195a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f16016a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f16016a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean zB;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.v5);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listEmptyList.size()) {
                break;
            }
            p0.f fVar = (p0.f) listEmptyList.get(i11);
            if (fVar.a() == i10) {
                p0.t tVar = fVar.f16193d;
                if (tVar != null) {
                    Class cls = fVar.f16192c;
                    if (cls != null) {
                        try {
                            fb1.t(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception unused) {
                        }
                    }
                    zB = tVar.f(view);
                }
            } else {
                i11++;
            }
        }
        zB = false;
        if (!zB) {
            zB = b.b(this.f16016a, view, i10, bundle);
        }
        if (zB || i10 != R.id.u || bundle == null) {
            return zB;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.v6);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i13 = 0;
            while (true) {
                if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z9 = true;
                    break;
                }
                i13++;
            }
        }
        return z9;
    }

    public void h(View view, int i10) {
        this.f16016a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f16016a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f16016a = accessibilityDelegate;
        this.f16017b = new a(this);
    }
}
