package j3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.uh;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzce f14348a;

    static {
        zzce zzccVar = null;
        try {
            Object objNewInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
                }
            } else {
                zzm.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzm.zzj("Failed to instantiate ClientApi class.");
        }
        f14348a = zzccVar;
    }

    public abstract Object a();

    public abstract Object b(zzce zzceVar);

    public abstract Object c();

    public final Object d(Context context, boolean z9) {
        boolean z10;
        Object objC;
        Object objB;
        if (!z9) {
            zzay.zzb();
            if (!zzf.zzt(context, 12451000)) {
                zzm.zze("Google Play Services is not available.");
                z9 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(b4.d.a(context, ModuleDescriptor.MODULE_ID) <= b4.d.d(context, ModuleDescriptor.MODULE_ID, false));
        eg.a(context);
        if (((Boolean) gh.f4915a.k()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) gh.f4916b.k()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z9 | z12;
            z10 = false;
        }
        zzce zzceVar = f14348a;
        Object objB2 = null;
        if (z11) {
            if (zzceVar != null) {
                try {
                    objB = b(zzceVar);
                } catch (RemoteException e10) {
                    zzm.zzk("Cannot invoke local loader using ClientApi class.", e10);
                    objB = null;
                }
                if (objB == null && !z10) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e11) {
                        zzm.zzk("Cannot invoke remote loader.", e11);
                    }
                    objB = objB2;
                }
            } else {
                zzm.zzj("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e12) {
                zzm.zzk("Cannot invoke remote loader.", e12);
                objC = null;
            }
            if (objC == null) {
                if (zzay.zze().nextInt(((Long) uh.f9479a.k()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().zzo(context, zzay.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            if (objC == null) {
                if (zzceVar != null) {
                    try {
                        objB2 = b(zzceVar);
                    } catch (RemoteException e13) {
                        zzm.zzk("Cannot invoke local loader using ClientApi class.", e13);
                    }
                } else {
                    zzm.zzj("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}
