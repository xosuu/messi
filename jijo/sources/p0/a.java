package p0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16178c;

    public a(int i10, g gVar, int i11) {
        this.f16176a = i10;
        this.f16177b = gVar;
        this.f16178c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f16176a);
        this.f16177b.f16195a.performAction(this.f16178c, bundle);
    }
}
