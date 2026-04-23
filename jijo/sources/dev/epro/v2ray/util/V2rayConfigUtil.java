package dev.epro.v2ray.util;

import android.content.Context;
import android.util.Pair;
import com.google.gson.j;
import com.google.gson.o;
import dev.epro.v2ray.bean.outbounds.stream.StreamSettingsBean;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.json.JSONObject;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class V2rayConfigUtil {
    public static volatile String DNS_AGENT = "1.1.1.1";
    public static final String DNS_DIRECT = "223.5.5.5";
    public static volatile String PREF_CURR_CONFIG_DOMAIN = "";
    public static volatile LinkedHashSet<String> PREF_CURR_CONFIG_OUTBOUND_TAGS = null;
    public static volatile boolean PREF_LOCAL_DNS_ENABLED = false;
    public static final String SOCKS_PROTOCOL = "socks://";
    public static final String SS_PROTOCOL = "ss://";
    public static final String TAG_AGENT = "proxy";
    public static final String TAG_BLOCKED = "block";
    public static final String TAG_DIRECT = "direct";
    public static volatile String TYPE_PROTOCOL = null;
    public static final String VMESS_PROTOCOL = "vmess://";
    static boolean isProxySharing;
    static boolean isSniffingEnable;
    private static String jsonStr;
    private static o requestObj;

    /* JADX INFO: renamed from: dev.epro.v2ray.util.V2rayConfigUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$dev$epro$v2ray$util$EConfigType;

        static {
            int[] iArr = new int[EConfigType.values().length];
            $SwitchMap$dev$epro$v2ray$util$EConfigType = iArr;
            try {
                iArr[EConfigType.VMESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$dev$epro$v2ray$util$EConfigType[EConfigType.SHADOWSOCKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$dev$epro$v2ray$util$EConfigType[EConfigType.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        NativeUtil.classesInit0(178);
        PREF_CURR_CONFIG_OUTBOUND_TAGS = new LinkedHashSet<>();
        isProxySharing = false;
        isSniffingEnable = true;
        jsonStr = "{\"version\":\"1.1\",\"method\":\"GET\",\"path\":[\"/\"],\"headers\":{\"User-Agent\":[\"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.75 Safari/537.36\",\"Mozilla/5.0 (iPhone; CPU iPhone OS 10_0_2 like Mac OS X) AppleWebKit/601.1 (KHTML, like Gecko) CriOS/53.0.2785.109 Mobile/14A456 Safari/601.1.46\"],\"Accept-Encoding\":[\"gzip, deflate\"],\"Connection\":[\"keep-alive\"],\"Pragma\":\"no-cache\"}}";
        requestObj = (o) new j().b(o.class, jsonStr);
    }

    private static native VmessBean ResolveVmess4Kitsunebi(String str);

    private static native StreamSettingsBean boundStreamSettings(VmessBean vmessBean);

    private static native boolean customLocalDns(V2rayConfig v2rayConfig);

    private static native boolean customRemoteDns(V2rayConfig v2rayConfig);

    public static native Result getV2rayConfig(Context context, VmessBean vmessBean, String str);

    private static native Result getV2rayConfigType1(Context context, VmessBean vmessBean);

    private static native Result getV2rayConfigType2(String str);

    public static native VmessBean importConfig(String str, String str2);

    private static native boolean inbounds(V2rayConfig v2rayConfig);

    public static native boolean isValidConfig(String str);

    private static native boolean outbounds(VmessBean vmessBean, V2rayConfig v2rayConfig);

    private static native Pair<String, String> parseDomainNameAndTag(JSONObject jSONObject);

    public static native void parseDomainNameAndTag(String str);

    public static native void parseTypeProtocol(String str);

    private static native String readTextFromAssets(Context context, String str);

    private static native boolean routing(V2rayConfig v2rayConfig);

    private static native void routingGeo(String str, String str2, String str3, V2rayConfig v2rayConfig);

    private static native void routingUserRule(String str, String str2, V2rayConfig v2rayConfig);

    private static native VmessBean tryParseNewVmess(String str);

    private static native int upgradeConfigVersion(VmessBean vmessBean);

    private static native ArrayList<String> userRule2Domian(String str);
}
