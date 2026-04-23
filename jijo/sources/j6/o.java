package j6;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.internal.ads.en1;
import de.blinkt.openvpn.core.OpenVPNService;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Binder implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenVPNService f14403a;

    public o(OpenVPNService openVPNService) {
        this.f14403a = openVPNService;
        attachInterface(this, "de.blinkt.openvpn.core.IOpenVPNServiceInternal");
    }

    public static f m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof f)) {
            return (f) iInterfaceQueryLocalInterface;
        }
        e eVar = new e();
        eVar.f14392a = iBinder;
        return eVar;
    }

    @Override // j6.f
    public final boolean I(boolean z9) {
        return this.f14403a.I(z9);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 16777215) {
            return t(i10, parcel, parcel2, i11);
        }
        this.f14403a.onRevoke();
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean t(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
            return true;
        }
        int i12 = 0;
        OpenVPNService openVPNService = this.f14403a;
        switch (i10) {
            case 1:
                boolean zProtect = openVPNService.protect(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zProtect ? 1 : 0);
                return true;
            case 2:
                boolean z9 = parcel.readInt() != 0;
                c cVar = openVPNService.f12557x;
                if (cVar != null) {
                    cVar.d(z9);
                }
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zI = openVPNService.I(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 4:
                String string = parcel.readString();
                openVPNService.getClass();
                Set<String> stringSet = en1.p(openVPNService).getStringSet("allowed_apps", new HashSet());
                stringSet.add(string);
                SharedPreferences sharedPreferencesP = en1.p(openVPNService);
                SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
                editorEdit.putStringSet("allowed_apps", stringSet);
                editorEdit.putInt("counter", sharedPreferencesP.getInt("counter", 0) + 1);
                editorEdit.apply();
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                openVPNService.getClass();
                if (string2 == null) {
                    string2 = "xyz.easypro.httpcustom.ANYPACKAGE";
                }
                if (en1.p(openVPNService).getStringSet("allowed_apps", new HashSet()).contains(string2)) {
                    i12 = 1;
                } else {
                    Intent intent = new Intent(openVPNService, (Class<?>) i6.a.class);
                    intent.addFlags(268435456);
                    intent.putExtra("android.intent.extra.PACKAGE_NAME", string2);
                    openVPNService.startActivity(intent);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i12);
                return true;
            case 6:
                String string3 = parcel.readString();
                if (openVPNService.B != null) {
                    String strEncodeToString = Base64.encodeToString(string3.getBytes(Charset.forName(StandardStringDigester.MESSAGE_CHARSET)), 0);
                    y yVar = openVPNService.B;
                    yVar.getClass();
                    yVar.b("cr-response " + strEncodeToString + "\n");
                }
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }
}
