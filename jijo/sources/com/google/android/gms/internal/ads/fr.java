package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class fr extends pb {
    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        zzu.zzo().i("FlagsAccessedBeforeInitialized", new er("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
