package b3;

import android.graphics.Rect;
import android.text.format.DateFormat;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Calendar;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends v0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Calendar f1274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f1275s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, l lVar2) {
        super(lVar2);
        this.f1275s = lVar;
        this.f1273q = new Rect();
        this.f1274r = Calendar.getInstance();
    }

    @Override // v0.b
    public final void m(ArrayList arrayList) {
        for (int i10 = 1; i10 <= this.f1275s.G; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // v0.b
    public final boolean q(int i10, int i11) {
        if (i11 != 16) {
            return false;
        }
        this.f1275s.d(i10);
        return true;
    }

    @Override // v0.b
    public final void r(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentDescription(x(i10));
    }

    @Override // v0.b
    public final void t(int i10, p0.g gVar) {
        i iVar = this.f1275s;
        iVar.getClass();
        int i11 = i.f1276a0;
        int i12 = iVar.f1291z;
        int i13 = iVar.f1290y;
        int i14 = iVar.F;
        int i15 = i13 / i14;
        int iA = iVar.a() + (i10 - 1);
        int i16 = iA / i14;
        int i17 = (iA % i14) * i15;
        int i18 = (i16 * i12) + i11;
        Rect rect = this.f1273q;
        rect.set(i17, i18, i15 + i17, i12 + i18);
        gVar.i(x(i10));
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        accessibilityNodeInfo.setBoundsInParent(rect);
        gVar.a(16);
        if (i10 == iVar.B) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    public final CharSequence x(int i10) {
        i iVar = this.f1275s;
        int i11 = iVar.f1289x;
        int i12 = iVar.f1288w;
        Calendar calendar = this.f1274r;
        calendar.set(i11, i12, i10);
        CharSequence charSequence = DateFormat.format("dd MMMM yyyy", calendar.getTimeInMillis());
        return i10 == iVar.B ? iVar.getContext().getString(R.string.kt, charSequence) : charSequence;
    }
}
