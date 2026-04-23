package h5;

import android.os.Handler;
import android.view.View;
import f.s0;
import java.util.concurrent.Executors;
import team.dev.epro.apkcustom.dialogs.RequestBlock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14014b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f14013a = i10;
        this.f14014b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        int i10 = this.f14013a;
        Object obj = this.f14014b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                eVar.t(eVar.u());
                break;
            case 1:
                l lVar = (l) obj;
                lVar.f14036l = z9;
                lVar.q();
                if (!z9) {
                    lVar.t(false);
                    lVar.f14037m = false;
                }
                break;
            case 2:
                RequestBlock requestBlock = (RequestBlock) obj;
                if (z9) {
                    int i11 = RequestBlock.f17190b1;
                    requestBlock.getClass();
                } else if (!requestBlock.X.getText().toString().isEmpty()) {
                    requestBlock.M.setVisibility(8);
                    requestBlock.G0.setVisibility(0);
                    requestBlock.G0.setText("Rendering...");
                    Executors.newSingleThreadExecutor().execute(new s0(requestBlock, 8, new Handler(requestBlock.getMainLooper())));
                }
                break;
            case 3:
                t8.m mVar = (t8.m) obj;
                if (!z9) {
                    int i12 = t8.m.P0;
                    mVar.getClass();
                } else {
                    mVar.O0 = false;
                }
                break;
            default:
                t8.a0 a0Var = (t8.a0) obj;
                if (!z9) {
                    int i13 = t8.a0.Z0;
                    a0Var.getClass();
                } else {
                    a0Var.Y0 = false;
                }
                break;
        }
    }
}
