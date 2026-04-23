package b3;

import android.view.View;
import android.widget.CheckBox;
import java.util.Calendar;
import java.util.Locale;
import team.dev.epro.apkcustom.dialogs.RequestBlock;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1254b;

    public /* synthetic */ b(d dVar, int i10) {
        this.f1253a = i10;
        this.f1254b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f1253a;
        d dVar = this.f1254b;
        switch (i10) {
            case 0:
                dVar.P0.b();
                x4.a aVar = dVar.f1258y0;
                if (aVar != null) {
                    Calendar calendar = dVar.f1257x0;
                    int i11 = calendar.get(1);
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    ((s8.h) aVar.f18391b).f16758b.f17200i0.setChecked(true);
                    CheckBox checkBox = ((s8.h) aVar.f18391b).f16758b.f17200i0;
                    StringBuilder sb = new StringBuilder("Expired ");
                    Locale locale = Locale.US;
                    sb.append(String.format(locale, "%02d", Integer.valueOf(i13)));
                    sb.append("/");
                    int i14 = i12 + 1;
                    sb.append(String.format(locale, "%02d", Integer.valueOf(i14)));
                    sb.append("/");
                    sb.append(i11);
                    sb.append(" 23:59");
                    checkBox.setText(sb.toString());
                    ((s8.h) aVar.f18391b).f16758b.U0 = i11 + "-" + String.format(locale, "%02d", Integer.valueOf(i14)) + "-" + String.format(locale, "%02d", Integer.valueOf(i13)) + " 23:59";
                    if (!((s8.h) aVar.f18391b).f16758b.f17197f0.isChecked()) {
                        ((s8.h) aVar.f18391b).f16758b.f17198g0.setChecked(true);
                    }
                    RequestBlock requestBlock = ((s8.h) aVar.f18391b).f16758b;
                    requestBlock.getClass();
                    e3.j jVar = new e3.j();
                    jVar.f12710x0 = new s8.g(requestBlock, i13, i12, i11);
                    jVar.d0(requestBlock.A.d(), "timePickerDialogFragment");
                }
                dVar.Z(false, false);
                break;
            default:
                dVar.P0.b();
                dVar.Z(false, false);
                break;
        }
    }
}
