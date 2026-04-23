package h5;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f14119b;

    public /* synthetic */ z(TextInputLayout textInputLayout, int i10) {
        this.f14118a = i10;
        this.f14119b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14118a;
        TextInputLayout textInputLayout = this.f14119b;
        switch (i10) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.f11989d.f14051s;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.f11992f.requestLayout();
                break;
        }
    }
}
