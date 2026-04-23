package t8;

import android.view.View;
import android.widget.AdapterView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f17023a;

    static {
        NativeUtil.classesInit0(169);
    }

    public a(c cVar) {
        this.f17023a = cVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final native boolean onItemLongClick(AdapterView adapterView, View view, int i10, long j10);
}
