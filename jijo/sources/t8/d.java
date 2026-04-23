package t8;

import android.widget.CompoundButton;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f17049b;

    static {
        NativeUtil.classesInit0(181);
    }

    public /* synthetic */ d(m mVar, int i10) {
        this.f17048a = i10;
        this.f17049b = mVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
