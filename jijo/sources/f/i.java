package f;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class i implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12848b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12849d;

    public /* synthetic */ i(Object obj, int i10, Object obj2) {
        this.f12847a = i10;
        this.f12849d = obj;
        this.f12848b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        int i11 = this.f12847a;
        Object obj = this.f12849d;
        switch (i11) {
            case 0:
                j jVar = (j) obj;
                DialogInterface.OnClickListener onClickListener = jVar.f12866p;
                m mVar = (m) this.f12848b;
                onClickListener.onClick(mVar.f12918b, i10);
                if (!jVar.f12868r) {
                    mVar.f12918b.dismiss();
                }
                break;
            default:
                l.r0 r0Var = (l.r0) obj;
                r0Var.T.setSelection(i10);
                androidx.appcompat.widget.c cVar = r0Var.T;
                if (cVar.getOnItemClickListener() != null) {
                    cVar.performItemClick(view, i10, r0Var.Q.getItemId(i10));
                }
                r0Var.dismiss();
                break;
        }
    }
}
