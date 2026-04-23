package t8;

import android.widget.CompoundButton;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class r implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f17086b;

    static {
        NativeUtil.classesInit0(151);
    }

    public /* synthetic */ r(a0 a0Var, int i10) {
        this.f17085a = i10;
        this.f17086b = a0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
