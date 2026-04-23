package s8;

import android.widget.CompoundButton;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class h implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequestBlock f16758b;

    static {
        NativeUtil.classesInit0(101);
    }

    public /* synthetic */ h(RequestBlock requestBlock, int i10) {
        this.f16757a = i10;
        this.f16758b = requestBlock;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
