package s8;

import android.view.View;
import android.widget.AdapterView;
import team.dev.epro.apkcustom.dialogs.GroupSort;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSort f16748b;

    static {
        NativeUtil.classesInit0(106);
    }

    public /* synthetic */ d(GroupSort groupSort, int i10) {
        this.f16747a = i10;
        this.f16748b = groupSort;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onItemSelected(AdapterView adapterView, View view, int i10, long j10);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onNothingSelected(AdapterView adapterView);
}
