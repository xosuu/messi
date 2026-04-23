package com.google.android.gms.ads;

import a4.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.hq;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hq f1860a;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzh(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                if (!hqVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            hq hqVar2 = this.f1860a;
            if (hqVar2 != null) {
                hqVar2.zzi();
            }
        } catch (RemoteException e11) {
            zzm.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzk(new b(configuration));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hq hqVarZzo = zzay.zza().zzo(this);
        this.f1860a = hqVarZzo;
        if (hqVarZzo == null) {
            zzm.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            hqVarZzo.zzl(bundle);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzm();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzo();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzq();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzr();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzs(bundle);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzt();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzu();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            hq hqVar = this.f1860a;
            if (hqVar != null) {
                hqVar.zzv();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        hq hqVar = this.f1860a;
        if (hqVar != null) {
            try {
                hqVar.zzx();
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        hq hqVar = this.f1860a;
        if (hqVar != null) {
            try {
                hqVar.zzx();
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        hq hqVar = this.f1860a;
        if (hqVar != null) {
            try {
                hqVar.zzx();
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
