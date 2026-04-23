package ca.psiphon;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.a0;
import org.jasypt.digest.StandardStringDigester;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.c;
import p2.d;
import p2.e;
import p2.g;
import p2.h;
import psi.Psi;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class PsiphonTunnel {
    private static final String DEFAULT_PRIMARY_DNS_SERVER = "8.8.4.4";
    private static final String DEFAULT_SECONDARY_DNS_SERVER = "8.8.8.8";
    private static final int UDPGW_SERVER_PORT = 7300;
    private static final int VPN_INTERFACE_MTU = 1500;
    private static final String VPN_INTERFACE_NETMASK = "255.255.255.0";
    private static PsiphonTunnel mPsiphonTunnel;
    private AtomicReference<String> mActiveNetworkDNSServers;
    private final d mHostService;
    private final g mNetworkMonitor;
    private h mPrivateAddress;
    private final boolean mShouldRouteThroughTunnelAutomatically;
    private Thread mTun2SocksThread;
    private String UDPGW_SERVER = "127.0.0.1:" + Integer.toString(UDPGW_SERVER_PORT);
    private AtomicBoolean mVpnMode = new AtomicBoolean(false);
    private AtomicReference<ParcelFileDescriptor> mTunFd = new AtomicReference<>();
    private AtomicInteger mLocalSocksProxyPort = new AtomicInteger(0);
    private AtomicBoolean mRoutingThroughTunnel = new AtomicBoolean(false);
    private AtomicBoolean mIsWaitingForNetworkConnectivity = new AtomicBoolean(false);
    private AtomicReference<String> mClientPlatformPrefix = new AtomicReference<>(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    private AtomicReference<String> mClientPlatformSuffix = new AtomicReference<>(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    private AtomicReference<String> mActiveNetworkType = new AtomicReference<>(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);

    public static class Exception extends java.lang.Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public Exception(String str, Throwable th) {
            StringBuilder sbK = a0.k(str, ": ");
            sbK.append(th.getMessage());
            super(sbK.toString());
        }
    }

    private PsiphonTunnel(d dVar, boolean z9) {
        this.mHostService = dVar;
        this.mShouldRouteThroughTunnelAutomatically = z9;
        AtomicReference<String> atomicReference = new AtomicReference<>(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.mActiveNetworkDNSServers = atomicReference;
        this.mNetworkMonitor = new g(new a(this), this.mActiveNetworkType, atomicReference, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    public String bindToDevice(long j10) throws Exception {
        PsiphonVPNService psiphonVPNService = (PsiphonVPNService) this.mHostService;
        psiphonVPNService.getClass();
        if (psiphonVPNService.protect((int) j10)) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        throw new Exception("protect socket failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String buildPsiphonConfig(Context context, c cVar, String str, String str2, String str3, boolean z9, Integer num) throws Exception, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("DataRootDirectory")) {
            File fileDefaultDataRootDirectory = defaultDataRootDirectory(context);
            if (!fileDefaultDataRootDirectory.exists() && !fileDefaultDataRootDirectory.mkdir()) {
                throw new Exception("failed to create data root directory: " + fileDefaultDataRootDirectory.getPath());
            }
            jSONObject.put("DataRootDirectory", defaultDataRootDirectory(context));
        }
        if (!jSONObject.has("DataStoreDirectory")) {
            jSONObject.put("MigrateDataStoreDirectory", context.getFilesDir());
        }
        if (!jSONObject.has("RemoteServerListDownloadFilename")) {
            jSONObject.put("MigrateRemoteServerListDownloadFilename", new File(context.getFilesDir(), "remote_server_list").getAbsolutePath());
        }
        jSONObject.put("MigrateObfuscatedServerListDownloadDirectory", new File(context.getFilesDir(), "osl").getAbsolutePath());
        jSONObject.put("TunnelPoolSize", 1);
        if (!jSONObject.has("EstablishTunnelTimeoutSeconds")) {
            jSONObject.put("EstablishTunnelTimeoutSeconds", 0);
        }
        if (!jSONObject.has("TunnelWholeDevice")) {
            jSONObject.put("TunnelWholeDevice", z9 ? 1 : 0);
        }
        jSONObject.put("EmitBytesTransferred", true);
        if (num.intValue() != 0 && (!jSONObject.has("LocalSocksProxyPort") || jSONObject.getInt("LocalSocksProxyPort") == 0)) {
            jSONObject.put("LocalSocksProxyPort", num);
        }
        jSONObject.put("DeviceRegion", getDeviceRegion(context));
        StringBuilder sb = new StringBuilder();
        if (str2.length() > 0) {
            sb.append(str2);
        }
        sb.append("Android_");
        sb.append(Build.VERSION.RELEASE);
        sb.append("_com.psiphon3.subscription_playstore");
        if (str3.length() > 0) {
            sb.append(str3);
        }
        jSONObject.put("ClientPlatform", sb.toString().replaceAll("[^\\w\\-\\.]", "_"));
        return jSONObject.toString();
    }

    private static File defaultDataRootDirectory(Context context) {
        return context.getFileStreamPath("ca.psiphon.PsiphonTunnel.tunnel-core");
    }

    private static native int disableUdpGwKeepalive();

    private static native int enableUdpGwKeepalive();

    private static Collection<InetAddress> getActiveNetworkDNSServerAddresses(Context context, boolean z9) throws Exception {
        ArrayList arrayList = new ArrayList();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            throw new Exception("getActiveNetworkDNSServerAddresses failed", new Throwable("couldn't get ConnectivityManager system service"));
        }
        try {
            Class.forName("android.net.LinkProperties");
            Object objInvoke = ConnectivityManager.class.getMethod("getActiveLinkProperties", new Class[0]).invoke(connectivityManager, new Object[0]);
            if (objInvoke != null) {
                Iterator<InetAddress> it = ((LinkProperties) objInvoke).getDnsServers().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addCapability(12);
        if (z9) {
            builderAddCapability.addCapability(15);
        }
        NetworkRequest networkRequestBuild = builderAddCapability.build();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            p2.b bVar = new p2.b(arrayList, countDownLatch);
            connectivityManager.registerNetworkCallback(networkRequestBuild, bVar);
            countDownLatch.await(1L, TimeUnit.SECONDS);
            connectivityManager.unregisterNetworkCallback(bVar);
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        } catch (RuntimeException unused3) {
        }
        return arrayList;
    }

    private static Collection<String> getActiveNetworkDNSServers(Context context, boolean z9) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<InetAddress> it = getActiveNetworkDNSServerAddresses(context, z9).iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            if (string.startsWith("/")) {
                string = string.substring(1);
            }
            arrayList.add(string);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("no active network DNS resolver");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDNSServers(Context context, c cVar) {
        String str = this.mActiveNetworkDNSServers.get();
        if (str != RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) {
            return str;
        }
        try {
            return a0.j(getActiveNetworkDNSServers(context, this.mVpnMode.get()));
        } catch (Exception e10) {
            ((PsiphonVPNService) cVar).k("failed to get active network DNS resolver: " + e10.getMessage());
            return str;
        }
    }

    public static String getDefaultUpgradeDownloadFilePath(Context context) {
        return Psi.upgradeDownloadFilePath(defaultDataRootDirectory(context).getAbsolutePath());
    }

    private static String getDeviceRegion(Context context) {
        Locale locale;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String country = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso == null) {
                simCountryIso = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (simCountryIso.length() != 0 || telephonyManager.getPhoneType() == 2) {
                country = simCountryIso;
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    country = networkCountryIso;
                }
            }
        }
        if (country.length() == 0 && (locale = Locale.getDefault()) != null) {
            country = locale.getCountry();
        }
        return country.toUpperCase(Locale.US);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getNetworkID(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
                return "UNKNOWN";
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    return "MOBILE-" + telephonyManager.getNetworkOperator();
                }
            } catch (java.lang.Exception unused2) {
            }
            return "MOBILE";
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                return "WIFI";
            }
            String bssid = connectionInfo.getBSSID();
            if (bssid.equals("02:00:00:00:00:00")) {
                bssid = String.valueOf(connectionInfo.getIpAddress());
            }
            return "WIFI-" + bssid;
        } catch (java.lang.Exception unused3) {
            return "WIFI";
        }
    }

    public static String getUpgradeDownloadFilePath(String str) {
        return Psi.upgradeDownloadFilePath(str);
    }

    private void handlePsiphonNotice(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("noticeType");
            if (string.equals("Tunnels")) {
                int i10 = jSONObject.getJSONObject("data").getInt("count");
                if (i10 == 0) {
                    ((PsiphonVPNService) this.mHostService).getString(R.string.bl);
                } else if (i10 == 1) {
                    if (isVpnMode() && this.mShouldRouteThroughTunnelAutomatically) {
                        routeThroughTunnel();
                    }
                    ((PsiphonVPNService) this.mHostService).j();
                }
            } else {
                int i11 = 0;
                if (string.equals("AvailableEgressRegions")) {
                    JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("regions");
                    ArrayList arrayList = new ArrayList();
                    while (i11 < jSONArray.length()) {
                        arrayList.add(jSONArray.getString(i11));
                        i11++;
                    }
                    ((PsiphonVPNService) this.mHostService).h(arrayList);
                } else if (string.equals("SocksProxyPortInUse")) {
                    d dVar = this.mHostService;
                    int i12 = jSONObject.getJSONObject("data").getInt("port");
                    ((PsiphonVPNService) dVar).getString(R.string.bl);
                    Integer.toString(i12);
                } else if (string.equals("HttpProxyPortInUse")) {
                    d dVar2 = this.mHostService;
                    int i13 = jSONObject.getJSONObject("data").getInt("port");
                    ((PsiphonVPNService) dVar2).getString(R.string.bl);
                    Integer.toString(i13);
                } else if (string.equals("ListeningSocksProxyPort")) {
                    int i14 = jSONObject.getJSONObject("data").getInt("port");
                    setLocalSocksProxyPort(i14);
                    ((PsiphonVPNService) this.mHostService).getString(R.string.bl);
                    Integer.toString(i14);
                } else if (string.equals("ListeningHttpProxyPort")) {
                    int i15 = jSONObject.getJSONObject("data").getInt("port");
                    ((PsiphonVPNService) this.mHostService).getString(R.string.bl);
                    Integer.toString(i15);
                } else {
                    if (string.equals("UpstreamProxyError")) {
                        ((PsiphonVPNService) this.mHostService).m(jSONObject.getJSONObject("data").getString("message"));
                        return;
                    }
                    if (string.equals("ClientUpgradeDownloaded")) {
                        d dVar3 = this.mHostService;
                        jSONObject.getJSONObject("data").getString("filename");
                        ((PsiphonVPNService) dVar3).getString(R.string.bl);
                    } else if (string.equals("ClientIsLatestVersion")) {
                        this.mHostService.getClass();
                    } else if (string.equals("Homepage")) {
                        d dVar4 = this.mHostService;
                        jSONObject.getJSONObject("data").getString("url");
                        ((PsiphonVPNService) dVar4).getString(R.string.bl);
                    } else if (string.equals("ClientRegion")) {
                        d dVar5 = this.mHostService;
                        jSONObject.getJSONObject("data").getString("region");
                        ((PsiphonVPNService) dVar5).getString(R.string.bl);
                    } else {
                        if (string.equals("ClientAddress")) {
                            d dVar6 = this.mHostService;
                            jSONObject.getJSONObject("data").getString("address");
                            ((PsiphonVPNService) dVar6).getString(R.string.bl);
                            return;
                        }
                        if (string.equals("SplitTunnelRegions")) {
                            JSONArray jSONArray2 = jSONObject.getJSONObject("data").getJSONArray("regions");
                            ArrayList arrayList2 = new ArrayList();
                            while (i11 < jSONArray2.length()) {
                                arrayList2.add(jSONArray2.getString(i11));
                                i11++;
                            }
                            ((PsiphonVPNService) this.mHostService).getString(R.string.bl);
                            Objects.toString(arrayList2);
                        } else {
                            if (string.equals("Untunneled")) {
                                d dVar7 = this.mHostService;
                                jSONObject.getJSONObject("data").getString("address");
                                ((PsiphonVPNService) dVar7).getString(R.string.bl);
                                return;
                            }
                            if (string.equals("BytesTransferred")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                                d dVar8 = this.mHostService;
                                jSONObject2.getLong("sent");
                                jSONObject2.getLong("received");
                                ((PsiphonVPNService) dVar8).i();
                                return;
                            }
                            if (string.equals("ActiveAuthorizationIDs")) {
                                JSONArray jSONArray3 = jSONObject.getJSONObject("data").getJSONArray("IDs");
                                ArrayList<String> arrayList3 = new ArrayList();
                                while (i11 < jSONArray3.length()) {
                                    arrayList3.add(jSONArray3.getString(i11));
                                    i11++;
                                }
                                PsiphonVPNService psiphonVPNService = (PsiphonVPNService) this.mHostService;
                                psiphonVPNService.getClass();
                                for (String str2 : arrayList3) {
                                    psiphonVPNService.getString(R.string.bl);
                                }
                            } else if (string.equals("TrafficRateLimits")) {
                                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                                ((PsiphonVPNService) this.mHostService).l(jSONObject3.getLong("upstreamBytesPerSecond"), jSONObject3.getLong("downstreamBytesPerSecond"));
                            } else if (string.equals("Exiting")) {
                                this.mHostService.getClass();
                            } else if (string.equals("ActiveTunnel")) {
                                if (isVpnMode()) {
                                    if (jSONObject.getJSONObject("data").getBoolean("isTCS")) {
                                        disableUdpGwKeepalive();
                                    } else {
                                        enableUdpGwKeepalive();
                                    }
                                }
                            } else if (string.equals("ApplicationParameter")) {
                                d dVar9 = this.mHostService;
                                jSONObject.getJSONObject("data").getString("key");
                                jSONObject.getJSONObject("data").get("value");
                                dVar9.getClass();
                            } else if (string.equals("ServerAlert")) {
                                JSONArray jSONArray4 = jSONObject.getJSONObject("data").getJSONArray("actionURLs");
                                ArrayList arrayList4 = new ArrayList();
                                while (i11 < jSONArray4.length()) {
                                    arrayList4.add(jSONArray4.getString(i11));
                                    i11++;
                                }
                                d dVar10 = this.mHostService;
                                jSONObject.getJSONObject("data").getString("reason");
                                jSONObject.getJSONObject("data").getString("subject");
                                dVar10.getClass();
                            }
                        }
                    }
                }
            }
            ((PsiphonVPNService) this.mHostService).k(string + ": " + jSONObject.getJSONObject("data").toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long hasIPv6Route(Context context, c cVar) {
        try {
        } catch (Exception e10) {
            ((PsiphonVPNService) cVar).k("failed to check IPv6 route: " + e10.getMessage());
        }
        return hasIPv6Route(context) ? 1L : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long hasNetworkConnectivity() {
        ((PsiphonVPNService) this.mHostService).getClass();
        boolean zHasNetworkConnectivity = hasNetworkConnectivity(App.f17099v);
        boolean andSet = this.mIsWaitingForNetworkConnectivity.getAndSet(!zHasNetworkConnectivity);
        if (!zHasNetworkConnectivity && !andSet) {
            ((PsiphonVPNService) this.mHostService).getString(R.string.bl);
        } else if (zHasNetworkConnectivity && andSet) {
            ((PsiphonVPNService) this.mHostService).getString(R.string.bl);
        }
        return zHasNetworkConnectivity ? 1L : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String iPv6Synthesize(String str) {
        return str;
    }

    private boolean isVpnMode() {
        return this.mVpnMode.get();
    }

    private String loadPsiphonConfig(Context context) {
        d dVar = this.mHostService;
        String strB = ((PsiphonVPNService) dVar).b();
        if (strB == null) {
            strB = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return buildPsiphonConfig(context, dVar, strB, this.mClientPlatformPrefix.get(), this.mClientPlatformSuffix.get(), isVpnMode(), Integer.valueOf(this.mLocalSocksProxyPort.get()));
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        StringBuilder sbL = a0.l("tun2socks: ", str, "(", str2, "): ");
        sbL.append(str3);
        ((PsiphonVPNService) mPsiphonTunnel.mHostService).k(sbL.toString());
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(d dVar) {
        return newPsiphonTunnelImpl(dVar, true);
    }

    private static PsiphonTunnel newPsiphonTunnelImpl(d dVar, boolean z9) {
        PsiphonTunnel psiphonTunnel = mPsiphonTunnel;
        if (psiphonTunnel != null) {
            psiphonTunnel.stop();
        }
        PsiphonTunnel psiphonTunnel2 = new PsiphonTunnel(dVar, z9);
        mPsiphonTunnel = psiphonTunnel2;
        return psiphonTunnel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notice(String str) {
        handlePsiphonNotice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int runTun2Socks(int i10, int i11, String str, String str2, String str3, String str4, int i12);

    private static h selectPrivateAddress() throws Exception {
        HashMap map = new HashMap();
        map.put("10", new h(8, "10.0.0.1", "10.0.0.0", "10.0.0.2"));
        map.put("172", new h(12, "172.16.0.1", "172.16.0.0", "172.16.0.2"));
        map.put("192", new h(16, "192.168.0.1", "192.168.0.0", "192.168.0.2"));
        map.put("169", new h(24, "169.254.1.1", "169.254.1.0", "169.254.1.2"));
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                throw new Exception("no network interfaces found");
            }
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (inetAddress instanceof Inet4Address) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.startsWith("10.")) {
                            map.remove("10");
                        } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo("172.16") >= 0 && hostAddress.substring(0, 6).compareTo("172.31") <= 0) {
                            map.remove("172");
                        } else if (hostAddress.startsWith("192.168")) {
                            map.remove("192");
                        }
                    }
                }
            }
            if (map.size() > 0) {
                return (h) map.values().iterator().next();
            }
            throw new Exception("no private address available");
        } catch (SocketException e10) {
            throw new Exception("selectPrivateAddress failed", e10);
        }
    }

    private void setLocalSocksProxyPort(int i10) {
        this.mLocalSocksProxyPort.set(i10);
    }

    private static String setupTrustedCertificates(Context context, c cVar) throws Throwable {
        PrintStream printStream;
        Throwable th;
        try {
            File file = new File(context.getDir("PsiphonCAStore", 0), "certs.dat");
            file.delete();
            try {
                printStream = new PrintStream(new FileOutputStream(file));
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                    keyStore.load(null, null);
                    Enumeration<String> enumerationAliases = keyStore.aliases();
                    while (enumerationAliases.hasMoreElements()) {
                        String str = new String(Base64.encode(((X509Certificate) keyStore.getCertificate(enumerationAliases.nextElement())).getEncoded(), 2), StandardStringDigester.MESSAGE_CHARSET);
                        int i10 = 0;
                        while (i10 < str.length()) {
                            int i11 = i10 + 64;
                            str.substring(i10, Math.min(i11, str.length()));
                            i10 = i11;
                        }
                    }
                    ((PsiphonVPNService) cVar).k("prepared PsiphonCAStore");
                    String absolutePath = file.getAbsolutePath();
                    printStream.close();
                    return absolutePath;
                } catch (Throwable th2) {
                    th = th2;
                    if (printStream == null) {
                        throw th;
                    }
                    printStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                printStream = null;
                th = th3;
            }
        } catch (IOException e10) {
            throw new Exception("copy AndroidCAStore failed", e10);
        } catch (KeyStoreException e11) {
            throw new Exception("copy AndroidCAStore failed", e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new Exception("copy AndroidCAStore failed", e12);
        } catch (CertificateException e13) {
            throw new Exception("copy AndroidCAStore failed", e13);
        }
    }

    @TargetApi(14)
    private ParcelFileDescriptor startDummyVpn(VpnService.Builder builder) throws Exception {
        h hVarSelectPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            try {
                try {
                    try {
                        Locale.setDefault(new Locale("en"));
                        String str = hVarSelectPrivateAddress.f16248d;
                        int i10 = hVarSelectPrivateAddress.f16247c;
                        return builder.setSession(((PsiphonVPNService) this.mHostService).getString(R.string.bm)).setMtu(VPN_INTERFACE_MTU).addAddress(hVarSelectPrivateAddress.f16245a, i10).addRoute(hVarSelectPrivateAddress.f16246b, i10).establish();
                    } catch (SecurityException e10) {
                        throw new Exception("startDummyVpn failed", e10);
                    }
                } catch (IllegalStateException e11) {
                    throw new Exception("startDummyVpn failed", e11);
                }
            } catch (IllegalArgumentException e12) {
                throw new Exception("startDummyVpn failed", e12);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void startPsiphon(String str) throws Exception {
        stopPsiphon();
        this.mIsWaitingForNetworkConnectivity.set(false);
        ((PsiphonVPNService) this.mHostService).k("starting Psiphon library");
        try {
            ((PsiphonVPNService) this.mHostService).getClass();
            Psi.start(loadPsiphonConfig(App.f17099v), str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new b(this, this), isVpnMode(), false, true);
            g gVar = this.mNetworkMonitor;
            ((PsiphonVPNService) this.mHostService).getClass();
            App app = App.f17099v;
            gVar.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) app.getSystemService("connectivity");
            if (connectivityManager != null) {
                gVar.f16241b = new e(gVar, connectivityManager);
                try {
                    NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addCapability(12);
                    if (mPsiphonTunnel.mVpnMode.get()) {
                        builderAddCapability.addCapability(15);
                    } else {
                        builderAddCapability.removeCapability(15);
                    }
                    connectivityManager.requestNetwork(builderAddCapability.build(), gVar.f16241b);
                } catch (RuntimeException unused) {
                    gVar.f16241b = null;
                }
            }
            ((PsiphonVPNService) this.mHostService).k("Psiphon library started");
        } catch (java.lang.Exception e10) {
            throw new Exception("failed to start Psiphon library", e10);
        }
    }

    @TargetApi(12)
    private void startTun2Socks(ParcelFileDescriptor parcelFileDescriptor, int i10, String str, String str2, String str3, String str4, boolean z9) {
        if (this.mTun2SocksThread != null) {
            return;
        }
        Thread thread = new Thread(new p2.a(parcelFileDescriptor, i10, str, str2, str3, str4, z9));
        this.mTun2SocksThread = thread;
        thread.start();
        ((PsiphonVPNService) this.mHostService).k("tun2socks started");
    }

    @TargetApi(14)
    private boolean startVpn() {
        this.mVpnMode.set(true);
        this.mPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            try {
                try {
                    try {
                        Locale.setDefault(new Locale("en"));
                        String str = this.mPrivateAddress.f16248d;
                        VpnService.Builder mtu = ((PsiphonVPNService) this.mHostService).f().setSession(((PsiphonVPNService) this.mHostService).getString(R.string.bm)).setMtu(VPN_INTERFACE_MTU);
                        h hVar = this.mPrivateAddress;
                        VpnService.Builder builderAddAddress = mtu.addAddress(hVar.f16245a, hVar.f16247c);
                        h hVar2 = this.mPrivateAddress;
                        ParcelFileDescriptor parcelFileDescriptorEstablish = builderAddAddress.addRoute(hVar2.f16246b, hVar2.f16247c).establish();
                        if (parcelFileDescriptorEstablish == null) {
                            return false;
                        }
                        this.mTunFd.set(parcelFileDescriptorEstablish);
                        this.mRoutingThroughTunnel.set(false);
                        ((PsiphonVPNService) this.mHostService).k("VPN established");
                        return true;
                    } catch (SecurityException e10) {
                        throw new Exception("startVpn failed", e10);
                    }
                } catch (IllegalStateException e11) {
                    throw new Exception("startVpn failed", e11);
                }
            } catch (IllegalArgumentException e12) {
                throw new Exception("startVpn failed", e12);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void stopPsiphon() {
        ConnectivityManager connectivityManager;
        ((PsiphonVPNService) this.mHostService).k("stopping Psiphon library");
        g gVar = this.mNetworkMonitor;
        ((PsiphonVPNService) this.mHostService).getClass();
        App app = App.f17099v;
        if (gVar.f16241b != null && (connectivityManager = (ConnectivityManager) app.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(gVar.f16241b);
            } catch (RuntimeException unused) {
            }
            gVar.f16241b = null;
        }
        Psi.stop();
        ((PsiphonVPNService) this.mHostService).k("Psiphon library stopped");
    }

    private void stopTun2Socks() {
        if (this.mTun2SocksThread != null) {
            try {
                terminateTun2Socks();
                this.mTun2SocksThread.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.mTun2SocksThread = null;
            ((PsiphonVPNService) this.mHostService).k("tun2socks stopped");
        }
    }

    private void stopVpn() {
        stopTun2Socks();
        ParcelFileDescriptor andSet = this.mTunFd.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (IOException unused) {
            }
        }
        this.mRoutingThroughTunnel.set(false);
    }

    private static native int terminateTun2Socks();

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public String exportExchangePayload() {
        return Psi.exportExchangePayload();
    }

    public boolean importExchangePayload(String str) {
        return Psi.importExchangePayload(str);
    }

    public synchronized void reconnectPsiphon() {
        Psi.reconnectTunnel();
    }

    public synchronized void restartPsiphon() {
        stopPsiphon();
        startPsiphon(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public void routeThroughTunnel() {
        ParcelFileDescriptor andSet;
        if (this.mRoutingThroughTunnel.compareAndSet(false, true) && (andSet = this.mTunFd.getAndSet(null)) != null) {
            startTun2Socks(andSet, VPN_INTERFACE_MTU, this.mPrivateAddress.f16248d, VPN_INTERFACE_NETMASK, "127.0.0.1:" + Integer.toString(this.mLocalSocksProxyPort.get()), this.UDPGW_SERVER, true);
            ((PsiphonVPNService) this.mHostService).k("routing through tunnel");
        }
    }

    public void setClientPlatformAffixes(String str, String str2) {
        this.mClientPlatformPrefix.set(str);
        this.mClientPlatformSuffix.set(str2);
    }

    public void setVpnMode() {
        this.mVpnMode.set(true);
    }

    public synchronized boolean startRouting(String str) {
        this.UDPGW_SERVER = str;
        ((PsiphonVPNService) this.mHostService).getClass();
        System.loadLibrary("socks2tun");
        return startVpn();
    }

    public synchronized void startTunneling(String str) {
        startPsiphon(str);
    }

    public synchronized void stop() {
        stopVpn();
        stopPsiphon();
        this.mVpnMode.set(false);
        this.mLocalSocksProxyPort.set(0);
    }

    public void writeRuntimeProfiles(String str, int i10, int i11) {
        Psi.writeRuntimeProfiles(str, i10, i11);
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(d dVar, boolean z9) {
        return newPsiphonTunnelImpl(dVar, z9);
    }

    private static boolean hasIPv6Route(Context context) throws Exception {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp() && !networkInterface.isLoopback() && !networkInterface.isPointToPoint()) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        if ((inetAddress instanceof Inet6Address) && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && !inetAddress.isMulticastAddress()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (SocketException e10) {
            throw new Exception("hasIPv6Route failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }
}
