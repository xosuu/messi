package dev.epro.v2ray.util;

import android.util.Pair;
import com.google.gson.j;
import java.net.URI;
import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class Utility {
    static {
        NativeUtil.classesInit0(29);
    }

    public static native Map<String, String> DecodeQuery(URI uri, Map<String, String> map);

    public static native String editOutbound(j jVar, String str, String str2, String str3, Integer num, boolean z9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10);

    public static native String editOutbound(j jVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9);

    public static native String editSlowDnsV2ray(j jVar, String str);

    public static native String editTransport(j jVar, String str, String str2, String str3, String str4, String str5, String str6);

    public static native String editTransport(j jVar, String str, String str2, boolean z9, boolean z10, String str3, String str4, String str5, String str6, String str7, String str8);

    public static native Pair<String, String> getAddrV2ray(j jVar, String str);

    public static native Boolean getMux(j jVar, String str);

    public static native Pair<String, String> getNetworkSecurity(j jVar, String str);

    public static native String getProtoV2ray(j jVar, String str);

    public static native String getTransGrpc(j jVar, String str);

    public static native Pair<String, String> getTransHttp(j jVar, String str);

    public static native Pair<String, String> getTransKcp(j jVar, String str);

    public static native String getTransQuic(j jVar, String str);

    public static native Pair<String, Boolean> getTransTls(j jVar, String str);

    public static native Pair<String, String> getTransWs(j jVar, String str, boolean z9, String str2);

    public static native Pair<String, String> getVarHttp(j jVar, String str);

    public static native Pair<String, String> getVarSocks(j jVar, String str);

    public static native Pair<String, String> getVarSs(j jVar, String str);

    public static native String getVarTrojan(j jVar, String str);

    public static native String getVarVless(j jVar, String str);

    public static native String getVarVmess(j jVar, String str);

    public static native boolean isJSONValid(j jVar, String str);

    public static native String sensorOutbound(j jVar, String str, boolean z9);

    public static native String sensorTransport(j jVar, String str, boolean z9);
}
