package q8;

import android.widget.CompoundButton;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class o implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.q f16470b;

    static {
        NativeUtil.classesInit0(57);
    }

    public /* synthetic */ o(f.q qVar, int i10) {
        this.f16469a = i10;
        this.f16470b = qVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
