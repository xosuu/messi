package de.blinkt.openvpn.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionStatus implements Parcelable {
    public static final Parcelable.Creator<ConnectionStatus> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConnectionStatus f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConnectionStatus f12530b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConnectionStatus f12531d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectionStatus f12532f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConnectionStatus f12533h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ConnectionStatus f12534q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ConnectionStatus f12535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ConnectionStatus f12536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ConnectionStatus f12537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ConnectionStatus f12538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ConnectionStatus[] f12539w;

    static {
        ConnectionStatus connectionStatus = new ConnectionStatus("LEVEL_CONNECTED", 0);
        f12529a = connectionStatus;
        ConnectionStatus connectionStatus2 = new ConnectionStatus("LEVEL_VPNPAUSED", 1);
        f12530b = connectionStatus2;
        ConnectionStatus connectionStatus3 = new ConnectionStatus("LEVEL_CONNECTING_SERVER_REPLIED", 2);
        f12531d = connectionStatus3;
        ConnectionStatus connectionStatus4 = new ConnectionStatus("LEVEL_CONNECTING_NO_SERVER_REPLY_YET", 3);
        f12532f = connectionStatus4;
        ConnectionStatus connectionStatus5 = new ConnectionStatus("LEVEL_NONETWORK", 4);
        f12533h = connectionStatus5;
        ConnectionStatus connectionStatus6 = new ConnectionStatus("LEVEL_NOTCONNECTED", 5);
        f12534q = connectionStatus6;
        ConnectionStatus connectionStatus7 = new ConnectionStatus("LEVEL_START", 6);
        f12535s = connectionStatus7;
        ConnectionStatus connectionStatus8 = new ConnectionStatus("LEVEL_AUTH_FAILED", 7);
        f12536t = connectionStatus8;
        ConnectionStatus connectionStatus9 = new ConnectionStatus("LEVEL_WAITING_FOR_USER_INPUT", 8);
        f12537u = connectionStatus9;
        ConnectionStatus connectionStatus10 = new ConnectionStatus("UNKNOWN_LEVEL", 9);
        f12538v = connectionStatus10;
        f12539w = new ConnectionStatus[]{connectionStatus, connectionStatus2, connectionStatus3, connectionStatus4, connectionStatus5, connectionStatus6, connectionStatus7, connectionStatus8, connectionStatus9, connectionStatus10};
        CREATOR = new j4.b(5);
    }

    public static ConnectionStatus valueOf(String str) {
        return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
    }

    public static ConnectionStatus[] values() {
        return (ConnectionStatus[]) f12539w.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
