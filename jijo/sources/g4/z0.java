package g4;

import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f13837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f13839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f13840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f13841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f13842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f13843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u0 f13844h;

    public z0(Application application, Handler handler, b0 b0Var, g gVar, l lVar, w0 w0Var, b1 b1Var, u0 u0Var) {
        this.f13837a = application;
        this.f13838b = handler;
        this.f13839c = b0Var;
        this.f13840d = gVar;
        this.f13841e = lVar;
        this.f13842f = w0Var;
        this.f13843g = b1Var;
        this.f13844h = u0Var;
    }

    public final y a(jt jtVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f13837a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), StandardStringDigester.MESSAGE_CHARSET);
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) jtVar.f6072a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    f0.d dVar = (f0.d) jtVar.f6073b;
                    if (dVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i10 = dVar.f13014b;
                        if (i10 != 1) {
                            jsonWriter.name("os_type");
                            int i11 = i10 - 1;
                            if (i11 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i11 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) dVar.f13015c;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) dVar.f13016d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) jtVar.f6074c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) jtVar.f6075d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) jtVar.f6076e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    j2.h hVar = (j2.h) jtVar.f6077f;
                    if (hVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) hVar.f14297a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) hVar.f14298b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = (Double) hVar.f14299d;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<v> list = (List) hVar.f14300f;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (v vVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = vVar.f13801a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = vVar.f13802b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = vVar.f13803c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = vVar.f13804d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    t tVar = (t) jtVar.f6078g;
                    if (tVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = tVar.f13793a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = tVar.f13794b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = tVar.f13795c;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    w wVar = (w) jtVar.f6079h;
                    if (wVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = wVar.f13810a;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = (List) jtVar.f6080i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int iOrdinal = ((u) it.next()).ordinal();
                            if (iOrdinal == 0) {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            } else if (iOrdinal == 1) {
                                jsonWriter.value("ALWAYS_SHOW");
                            } else if (iOrdinal == 2) {
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                            } else if (iOrdinal == 3) {
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            } else if (iOrdinal == 4) {
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        y yVarD = y.d(new JsonReader(new StringReader(headerField)));
                        yVarD.f13819c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return yVarD;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardStringDigester.MESSAGE_CHARSET));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            y yVarD2 = y.d(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return yVarD2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e10) {
            throw new zzg(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new zzg(2, "Error making request.", e11);
        }
    }
}
