package p8;

import android.view.View;
import android.widget.EditText;
import com.google.android.gms.ads.RequestConfiguration;
import t8.a0;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f16338b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16339d;

    public /* synthetic */ i(MainActivity mainActivity, EditText editText, int i10) {
        this.f16337a = i10;
        this.f16339d = mainActivity;
        this.f16338b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f16337a;
        MainActivity mainActivity = this.f16339d;
        EditText editText = this.f16338b;
        switch (i10) {
            case 0:
                if (!editText.getText().toString().trim().isEmpty()) {
                    mainActivity.f17138z0.dismiss();
                } else {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, Crypt.a(Crypt.xrc("J>jOjhJ;;Oh<Ail@<o\u001cn>Kf9LkoNlm\u001ei<M=cNf8Nnb\u001dg;OhcM<cAgj\u0019fiL;nM<o\u001d")));
                }
                break;
            default:
                editText.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                if (App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di")), true)) {
                    t8.m mVar = mainActivity.O;
                    if (mVar != null) {
                        mVar.h0();
                        mainActivity.O.j0();
                        mainActivity.O.g0();
                        mainActivity.O.l0();
                        mainActivity.O.k0();
                        mainActivity.O.i0();
                        mainActivity.O.Z();
                    }
                } else {
                    a0 a0Var = mainActivity.P;
                    if (a0Var != null) {
                        a0Var.g0();
                        mainActivity.P.h0();
                        mainActivity.P.b0();
                    }
                }
                App.f17101x.o0();
                mainActivity.H.h();
                mainActivity.x(true);
                mainActivity.f17138z0.dismiss();
                break;
        }
    }
}
