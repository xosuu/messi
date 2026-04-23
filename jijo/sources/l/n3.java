package l;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends androidx.emoji2.text.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14940a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f14941b;

    public n3(EditText editText) {
        this.f14941b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.j
    public final void a() {
        switch (this.f14940a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f14941b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.j
    public final void b() {
        WeakReference weakReference = this.f14941b;
        switch (this.f14940a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
            default:
                z0.j.a((EditText) weakReference.get(), 1);
                break;
        }
    }

    public n3(SwitchCompat switchCompat) {
        this.f14941b = new WeakReference(switchCompat);
    }
}
