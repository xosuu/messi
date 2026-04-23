package t8;

import android.widget.CompoundButton;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class f implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f17053b;

    static {
        NativeUtil.classesInit0(184);
    }

    public /* synthetic */ f(m mVar, int i10) {
        this.f17052a = i10;
        this.f17053b = mVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
