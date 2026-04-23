package t4;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import x4.v;
import x4.w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends t.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16855b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj) {
        super(4);
        this.f16855b = i10;
        this.f16856d = obj;
    }

    @Override // t.a
    public final void k(int i10) {
        switch (this.f16855b) {
            case 0:
                break;
            default:
                w wVar = (w) this.f16856d;
                wVar.f18478d = true;
                v vVar = (v) wVar.f18479e.get();
                if (vVar != null) {
                    vVar.a();
                }
                break;
        }
    }

    @Override // t.a
    public final void l(Typeface typeface, boolean z9) {
        int i10 = this.f16855b;
        Object obj = this.f16856d;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                e eVar = chip.f11835h;
                chip.setText(eVar.P0 ? eVar.Q : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z9) {
                    w wVar = (w) obj;
                    wVar.f18478d = true;
                    v vVar = (v) wVar.f18479e.get();
                    if (vVar != null) {
                        vVar.a();
                    }
                    break;
                }
                break;
        }
    }
}
