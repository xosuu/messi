package q8;

import android.widget.RadioGroup;
import team.dev.epro.apkcustom.activities.SimpleMaker;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class n implements RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SimpleMaker f16468a;

    static {
        NativeUtil.classesInit0(55);
    }

    public n(SimpleMaker simpleMaker) {
        this.f16468a = simpleMaker;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final native void onCheckedChanged(RadioGroup radioGroup, int i10);
}
