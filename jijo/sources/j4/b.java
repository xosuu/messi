package j4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.android.material.badge.BadgeState$State;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.TrafficHistory;
import g4.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import pub.devrel.easypermissions.AppSettingsDialog;
import team.dev.epro.apkcustom.models.VPNServer;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14354a;

    public /* synthetic */ b(int i10) {
        this.f14354a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = 0;
        ArrayList arrayListG = null;
        ConnectionResult connectionResult = null;
        zat zatVar = null;
        switch (this.f14354a) {
            case 0:
                int iH = z.H(parcel);
                Intent intent = null;
                int iT2 = 0;
                while (parcel.dataPosition() < iH) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iT = z.t(parcel, i10);
                    } else if (c10 == 2) {
                        iT2 = z.t(parcel, i10);
                    } else if (c10 != 3) {
                        z.F(parcel, i10);
                    } else {
                        intent = (Intent) z.d(parcel, i10, Intent.CREATOR);
                    }
                }
                z.i(parcel, iH);
                return new zaa(iT, iT2, intent);
            case 1:
                int iH2 = z.H(parcel);
                String strE = null;
                while (parcel.dataPosition() < iH2) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        arrayListG = z.g(parcel, i11);
                    } else if (c11 != 2) {
                        z.F(parcel, i11);
                    } else {
                        strE = z.e(parcel, i11);
                    }
                }
                z.i(parcel, iH2);
                return new zag(strE, arrayListG);
            case 2:
                int iH3 = z.H(parcel);
                while (parcel.dataPosition() < iH3) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iT = z.t(parcel, i12);
                    } else if (c12 != 2) {
                        z.F(parcel, i12);
                    } else {
                        zatVar = (zat) z.d(parcel, i12, zat.CREATOR);
                    }
                }
                z.i(parcel, iH3);
                return new zai(iT, zatVar);
            case 3:
                int iH4 = z.H(parcel);
                zav zavVar = null;
                while (parcel.dataPosition() < iH4) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        iT = z.t(parcel, i13);
                    } else if (c13 == 2) {
                        connectionResult = (ConnectionResult) z.d(parcel, i13, ConnectionResult.CREATOR);
                    } else if (c13 != 3) {
                        z.F(parcel, i13);
                    } else {
                        zavVar = (zav) z.d(parcel, i13, zav.CREATOR);
                    }
                }
                z.i(parcel, iH4);
                return new zak(iT, connectionResult, zavVar);
            case 4:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.f11739f = 255;
                badgeState$State.f11740h = -2;
                badgeState$State.f11741q = -2;
                badgeState$State.f11747x = Boolean.TRUE;
                badgeState$State.f11736a = parcel.readInt();
                badgeState$State.f11737b = (Integer) parcel.readSerializable();
                badgeState$State.f11738d = (Integer) parcel.readSerializable();
                badgeState$State.f11739f = parcel.readInt();
                badgeState$State.f11740h = parcel.readInt();
                badgeState$State.f11741q = parcel.readInt();
                badgeState$State.f11743t = parcel.readString();
                badgeState$State.f11744u = parcel.readInt();
                badgeState$State.f11746w = (Integer) parcel.readSerializable();
                badgeState$State.f11748y = (Integer) parcel.readSerializable();
                badgeState$State.f11749z = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.C = (Integer) parcel.readSerializable();
                badgeState$State.D = (Integer) parcel.readSerializable();
                badgeState$State.f11747x = (Boolean) parcel.readSerializable();
                badgeState$State.f11742s = (Locale) parcel.readSerializable();
                return badgeState$State;
            case 5:
                return ConnectionStatus.values()[parcel.readInt()];
            case 6:
                LogItem logItem = new LogItem();
                logItem.f12540a = null;
                logItem.f12541b = null;
                logItem.f12543f = 1;
                logItem.f12544h = System.currentTimeMillis();
                logItem.f12545q = -1;
                logItem.f12540a = parcel.readArray(Object.class.getClassLoader());
                logItem.f12541b = parcel.readString();
                logItem.f12542d = parcel.readInt();
                logItem.f12543f = fb1.a(parcel.readInt());
                logItem.f12545q = parcel.readInt();
                logItem.f12544h = parcel.readLong();
                return logItem;
            case 7:
                TrafficHistory trafficHistory = new TrafficHistory();
                LinkedList linkedList = new LinkedList();
                trafficHistory.f12564a = linkedList;
                LinkedList linkedList2 = new LinkedList();
                trafficHistory.f12565b = linkedList2;
                LinkedList linkedList3 = new LinkedList();
                trafficHistory.f12566d = linkedList3;
                parcel.readList(linkedList, TrafficHistory.class.getClassLoader());
                parcel.readList(linkedList2, TrafficHistory.class.getClassLoader());
                parcel.readList(linkedList3, TrafficHistory.class.getClassLoader());
                trafficHistory.f12567f = (TrafficHistory.TrafficDatapoint) parcel.readParcelable(TrafficHistory.class.getClassLoader());
                trafficHistory.f12568h = (TrafficHistory.TrafficDatapoint) parcel.readParcelable(TrafficHistory.class.getClassLoader());
                return trafficHistory;
            case 8:
                return new AppSettingsDialog(parcel);
            default:
                return new VPNServer(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f14354a) {
            case 0:
                return new zaa[i10];
            case 1:
                return new zag[i10];
            case 2:
                return new zai[i10];
            case 3:
                return new zak[i10];
            case 4:
                return new BadgeState$State[i10];
            case 5:
                return new ConnectionStatus[i10];
            case 6:
                return new LogItem[i10];
            case 7:
                return new TrafficHistory[i10];
            case 8:
                return new AppSettingsDialog[i10];
            default:
                return new VPNServer[i10];
        }
    }
}
