package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.PackageName;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PackageName f16750b;

    static {
        NativeUtil.classesInit0(104);
    }

    public /* synthetic */ e(PackageName packageName, int i10) {
        this.f16749a = i10;
        this.f16750b = packageName;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
