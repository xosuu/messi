package h5;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class m extends x4.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f14043a;

    public m(o oVar) {
        this.f14043a = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f14043a.b().a();
    }

    @Override // x4.x, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f14043a.b().b();
    }
}
