package p0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        g gVarC = this.f16198a.c(i10);
        if (gVarC == null) {
            return null;
        }
        return gVarC.f16195a;
    }
}
