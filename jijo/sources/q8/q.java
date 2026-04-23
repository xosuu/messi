package q8;

import android.view.View;
import android.widget.AdapterView;
import team.dev.epro.apkcustom.activities.V2raySettings;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class q implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2raySettings f16473b;

    static {
        NativeUtil.classesInit0(69);
    }

    public /* synthetic */ q(V2raySettings v2raySettings, int i10) {
        this.f16472a = i10;
        this.f16473b = v2raySettings;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onItemSelected(AdapterView adapterView, View view, int i10, long j10);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onNothingSelected(AdapterView adapterView);
}
