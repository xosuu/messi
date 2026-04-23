package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20631a;

    public o(Context context) {
        super(context);
        this.f20631a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z9) {
        this.f20631a = z9;
    }

    public void setGuidelineBegin(int i10) {
        d dVar = (d) getLayoutParams();
        if (this.f20631a && dVar.f20484a == i10) {
            return;
        }
        dVar.f20484a = i10;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i10) {
        d dVar = (d) getLayoutParams();
        if (this.f20631a && dVar.f20486b == i10) {
            return;
        }
        dVar.f20486b = i10;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        if (this.f20631a && dVar.f20488c == f10) {
            return;
        }
        dVar.f20488c = f10;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
