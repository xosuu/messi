package h5;

import com.google.android.gms.internal.ads.en1;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(o oVar, int i10) {
        super(oVar);
        this.f14026e = i10;
    }

    @Override // h5.p
    public final void r() {
        switch (this.f14026e) {
            case 0:
                o oVar = this.f14060b;
                oVar.A = null;
                CheckableImageButton checkableImageButton = oVar.f14051s;
                checkableImageButton.setOnLongClickListener(null);
                en1.G(checkableImageButton, null);
                break;
        }
    }
}
