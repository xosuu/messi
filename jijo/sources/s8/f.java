package s8;

import android.widget.CompoundButton;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequestBlock f16752b;

    static {
        NativeUtil.classesInit0(98);
    }

    public /* synthetic */ f(RequestBlock requestBlock, int i10) {
        this.f16751a = i10;
        this.f16752b = requestBlock;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
