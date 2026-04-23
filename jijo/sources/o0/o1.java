package o0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o1 extends n1 {
    public o1(t1 t1Var, WindowInsets windowInsets) {
        super(t1Var, windowInsets);
    }

    @Override // o0.r1
    public t1 a() {
        return t1.h(this.f16047c.consumeDisplayCutout(), null);
    }

    @Override // o0.r1
    public j e() {
        DisplayCutout displayCutout = this.f16047c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // o0.m1, o0.r1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Objects.equals(this.f16047c, o1Var.f16047c) && Objects.equals(this.f16051g, o1Var.f16051g);
    }

    @Override // o0.r1
    public int hashCode() {
        return this.f16047c.hashCode();
    }
}
