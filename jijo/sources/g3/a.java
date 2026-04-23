package g3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13636b;

    public /* synthetic */ a(View view, int i10) {
        this.f13635a = i10;
        this.f13636b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f13635a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 1:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            default:
                t4.e eVar = ((Chip) this.f13636b).f11835h;
                if (eVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    eVar.getOutline(outline);
                }
                break;
        }
    }
}
