package j4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import l.j;
import org.json.JSONException;
import u3.y;
import v3.g;
import v3.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements i4.c {
    public final boolean G;
    public final g H;
    public final Bundle I;
    public final Integer J;

    public a(Context context, Looper looper, g gVar, Bundle bundle, t3.f fVar, t3.g gVar2) {
        super(context, looper, 44, gVar, fVar, gVar2);
        this.G = true;
        this.H = gVar;
        this.I = bundle;
        this.J = gVar.f17771h;
    }

    @Override // i4.c
    public final void b(e eVar) {
        GoogleSignInAccount googleSignInAccountB;
        if (eVar == null) {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
        try {
            Account account = this.H.f17764a;
            if (account == null) {
                account = new Account(v3.f.DEFAULT_ACCOUNT, "com.google");
            }
            if (v3.f.DEFAULT_ACCOUNT.equals(account.name)) {
                r3.a aVarA = r3.a.a(getContext());
                String strB = aVarA.b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strB)) {
                    StringBuilder sb = new StringBuilder(20 + String.valueOf(strB).length());
                    sb.append("googleSignInAccount:");
                    sb.append(strB);
                    String strB2 = aVarA.b(sb.toString());
                    if (strB2 != null) {
                        try {
                            googleSignInAccountB = GoogleSignInAccount.b(strB2);
                        } catch (JSONException unused) {
                            googleSignInAccountB = null;
                        }
                    }
                }
                googleSignInAccountB = null;
            } else {
                googleSignInAccountB = null;
            }
            Integer num = this.J;
            z3.a.l(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountB);
            f fVar = (f) getService();
            zai zaiVar = new zai(1, zatVar);
            fVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(fVar.f12714b);
            int i10 = e4.b.f12715a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(eVar.asBinder());
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    fVar.f12713a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            } catch (RemoteException unused2) {
            }
        } catch (RemoteException unused3) {
            y yVar = (y) eVar;
            yVar.f17632b.post(new j(yVar, 17, new zak(1, new ConnectionResult(8, null), null)));
        }
    }

    @Override // i4.c
    public final void c() {
        connect(new m2.f(23, this));
    }

    @Override // v3.f
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // v3.f
    public final Bundle f() {
        g gVar = this.H;
        boolean zEquals = getContext().getPackageName().equals(gVar.f17768e);
        Bundle bundle = this.I;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", gVar.f17768e);
        }
        return bundle;
    }

    @Override // v3.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // v3.f
    public final String h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // v3.f
    public final String i() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // v3.f, t3.c
    public final boolean requiresSignIn() {
        return this.G;
    }
}
