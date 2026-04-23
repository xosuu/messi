package z0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d5.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f20663s;

    public i(TextView textView) {
        this.f20663s = new h(textView);
    }

    @Override // d5.e
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        return (l.f604j != null) ^ true ? inputFilterArr : this.f20663s.h(inputFilterArr);
    }

    @Override // d5.e
    public final boolean n() {
        return this.f20663s.f20662u;
    }

    @Override // d5.e
    public final void q(boolean z9) {
        if (!(l.f604j != null)) {
            return;
        }
        this.f20663s.q(z9);
    }

    @Override // d5.e
    public final void t(boolean z9) {
        boolean z10 = !(l.f604j != null);
        h hVar = this.f20663s;
        if (z10) {
            hVar.f20662u = z9;
        } else {
            hVar.t(z9);
        }
    }

    @Override // d5.e
    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return (l.f604j != null) ^ true ? transformationMethod : this.f20663s.x(transformationMethod);
    }
}
