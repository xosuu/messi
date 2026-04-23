package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.Cloud;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cloud f16742b;

    static {
        NativeUtil.classesInit0(95);
    }

    public /* synthetic */ a(Cloud cloud, int i10) {
        this.f16741a = i10;
        this.f16742b = cloud;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
