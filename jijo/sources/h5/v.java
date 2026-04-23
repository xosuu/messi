package h5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f14106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f14107g;

    public v(o oVar, int i10) {
        super(oVar);
        this.f14105e = R.drawable.dq;
        this.f14107g = new b(2, this);
        if (i10 != 0) {
            this.f14105e = i10;
        }
    }

    @Override // h5.p
    public final void b() {
        q();
    }

    @Override // h5.p
    public final int c() {
        return R.string.rc;
    }

    @Override // h5.p
    public final int d() {
        return this.f14105e;
    }

    @Override // h5.p
    public final View.OnClickListener f() {
        return this.f14107g;
    }

    @Override // h5.p
    public final boolean k() {
        return true;
    }

    @Override // h5.p
    public final boolean l() {
        EditText editText = this.f14106f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // h5.p
    public final void m(EditText editText) {
        this.f14106f = editText;
        q();
    }

    @Override // h5.p
    public final void r() {
        EditText editText = this.f14106f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f14106f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // h5.p
    public final void s() {
        EditText editText = this.f14106f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
