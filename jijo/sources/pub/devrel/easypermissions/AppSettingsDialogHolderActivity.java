package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.gp0;
import f.n;
import f.q;
import java.util.Objects;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class AppSettingsDialogHolderActivity extends q implements DialogInterface.OnClickListener {
    public n G;
    public int H;

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        setResult(i11, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.H);
            startActivityForResult(data, 7534);
        } else {
            if (i10 != -2) {
                throw new IllegalStateException(fb1.g("Unknown button type: ", i10));
            }
            setResult(0);
            finish();
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            intent.toString();
            Objects.toString(intent.getExtras());
            appSettingsDialog = new AppSettingsDialog(this, TextUtils.isEmpty(null) ? getString(R.string.sm) : null, TextUtils.isEmpty(null) ? getString(R.string.yr) : null, TextUtils.isEmpty(null) ? getString(android.R.string.ok) : null, TextUtils.isEmpty(null) ? getString(android.R.string.cancel) : null, 16061);
        }
        appSettingsDialog.b(this);
        this.H = appSettingsDialog.f16373s;
        int i10 = appSettingsDialog.f16367a;
        gp0 gp0Var = i10 != -1 ? new gp0(appSettingsDialog.f16375u, i10) : new gp0(appSettingsDialog.f16375u);
        gp0Var.m();
        gp0Var.q(appSettingsDialog.f16369d);
        gp0Var.n(appSettingsDialog.f16368b);
        gp0Var.p(appSettingsDialog.f16370f, this);
        gp0Var.o(appSettingsDialog.f16371h, this);
        this.G = gp0Var.r();
    }

    @Override // f.q, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n nVar = this.G;
        if (nVar == null || !nVar.isShowing()) {
            return;
        }
        this.G.dismiss();
    }
}
