package team.dev.epro.apkcustom.models;

import android.os.Parcel;
import android.os.Parcelable;
import j4.b;

/* JADX INFO: loaded from: classes.dex */
public class VPNServer implements Parcelable {
    public static final Parcelable.Creator<VPNServer> CREATOR = new b(9);
    private String configData;
    private String countryLong;
    private String countryShort;
    private String hostName;
    private String ip;
    private String logType;
    private String message;
    private String numVpnSessions;
    private String operator;
    private String ping;
    private String proto;
    private String score;
    private String speed;
    private String totalTraffic;
    private String totalUsers;
    private String uptime;

    public VPNServer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.hostName = str;
        this.ip = str2;
        this.score = str3;
        this.ping = str4;
        this.speed = str5;
        this.countryLong = str6;
        this.countryShort = str7;
        this.numVpnSessions = str8;
        this.uptime = str9;
        this.totalUsers = str10;
        this.totalTraffic = str11;
        this.logType = str12;
        this.operator = str13;
        this.message = str14;
        this.configData = str15;
        this.proto = str16;
    }

    public final String b() {
        return this.configData;
    }

    public final String c() {
        return this.countryLong;
    }

    public final String d() {
        return this.countryShort;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.ip;
    }

    public final String f() {
        return this.proto;
    }

    public final String g() {
        return this.speed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.hostName);
        parcel.writeString(this.ip);
        parcel.writeString(this.score);
        parcel.writeString(this.ping);
        parcel.writeString(this.speed);
        parcel.writeString(this.countryLong);
        parcel.writeString(this.countryShort);
        parcel.writeString(this.numVpnSessions);
        parcel.writeString(this.uptime);
        parcel.writeString(this.totalUsers);
        parcel.writeString(this.totalTraffic);
        parcel.writeString(this.logType);
        parcel.writeString(this.operator);
        parcel.writeString(this.message);
        parcel.writeString(this.configData);
        parcel.writeString(this.proto);
    }

    public VPNServer(Parcel parcel) {
        this.hostName = parcel.readString();
        this.ip = parcel.readString();
        this.score = parcel.readString();
        this.ping = parcel.readString();
        this.speed = parcel.readString();
        this.countryLong = parcel.readString();
        this.countryShort = parcel.readString();
        this.numVpnSessions = parcel.readString();
        this.uptime = parcel.readString();
        this.totalUsers = parcel.readString();
        this.totalTraffic = parcel.readString();
        this.logType = parcel.readString();
        this.operator = parcel.readString();
        this.message = parcel.readString();
        this.configData = parcel.readString();
        this.proto = parcel.readString();
    }
}
