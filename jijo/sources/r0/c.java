package r0;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.activity.result.ActivityResult;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import j6.n;
import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executors;
import o0.v0;
import t8.a0;
import t8.m;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.activities.GeneratedConfig;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import team.dev.epro.apkcustom.sockets.udp.UDPService;
import team.dev.epro.apkcustom.widgets.SystemNative;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p0.d, androidx.activity.result.a, g9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16488b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f16487a = i10;
        this.f16488b = obj;
    }

    public final boolean a(m2.f fVar, int i10, Bundle bundle) {
        View view = (View) this.f16488b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((g) fVar.f15701b).h();
                InputContentInfo inputContentInfoB = n.b(((g) fVar.f15701b).f());
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfoB);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipData clipData = new ClipData(((g) fVar.f15701b).getDescription(), new ClipData.Item(((g) fVar.f15701b).g()));
        o0.e dVar = i11 >= 31 ? new o0.d(clipData, 2) : new o0.f(clipData, 2);
        dVar.c(((g) fVar.f15701b).n());
        dVar.b(bundle);
        return v0.m(view, dVar.a()) == null;
    }

    @Override // androidx.activity.result.a
    public final void b(Object obj) {
        Intent intent;
        String string;
        int i10;
        String str;
        String strConcat;
        int i11 = this.f16487a;
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        Object obj2 = this.f16488b;
        switch (i11) {
            case 2:
                MainActivity mainActivity = (MainActivity) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                a9.b bVar = MainActivity.N0;
                mainActivity.getClass();
                if (activityResult.f172a == -1 && (intent = activityResult.f173b) != null && intent.getExtras() != null && (string = intent.getExtras().getString("url")) != null) {
                    if (intent.getAction().equals("shortUrl")) {
                        try {
                            i10 = Integer.parseInt(intent.getExtras().getString("reqTimes"));
                        } catch (Exception unused) {
                            i10 = 5;
                        }
                        if (string.startsWith("http://")) {
                            strConcat = string.replace("http://", "https://");
                        } else if (string.startsWith("https://")) {
                            str = string;
                            ProgressDialog progressDialog = new ProgressDialog(mainActivity, R.style.hc);
                            progressDialog.setCancelable(false);
                            progressDialog.setMessage("Generating ShortUrl...");
                            progressDialog.show();
                            Executors.newSingleThreadExecutor().execute(new p8.f(mainActivity, progressDialog, str, new Handler(mainActivity.getMainLooper()), i10));
                        } else {
                            strConcat = "https://".concat(string);
                        }
                        str = strConcat;
                        ProgressDialog progressDialog2 = new ProgressDialog(mainActivity, R.style.hc);
                        progressDialog2.setCancelable(false);
                        progressDialog2.setMessage("Generating ShortUrl...");
                        progressDialog2.show();
                        Executors.newSingleThreadExecutor().execute(new p8.f(mainActivity, progressDialog2, str, new Handler(mainActivity.getMainLooper()), i10));
                    } else {
                        File file = new File(mainActivity.getCacheDir(), "webview");
                        fb1.s(App.f17100w.f17415a, "isCloudCfg", true);
                        fb1.z(App.f17100w.f17415a, "contentCloudConfig", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "ip_ssh", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "ip_ssh_", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "ip_ssh_nocfg", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "cfgVPN", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "generateCfgVPN", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "user", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "user_nocfg", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "pass", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.z(App.f17100w.f17415a, "your_password", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        fb1.s(App.f17100w.f17415a, "isReset", false);
                        App.f17099v.f17108h = null;
                        App.f17100w.f17415a.edit().putLong("sizeFile", 0L).apply();
                        App.f17100w.f17415a.edit().putLong("lastModif", 0L).apply();
                        App app = App.f17099v;
                        app.f17107f = null;
                        app.f17106d = null;
                        app.f17105b = null;
                        if (App.f17100w.f17415a.getBoolean("mainFragment", true)) {
                            m mVar = mainActivity.O;
                            if (mVar != null) {
                                mVar.h0();
                                mainActivity.O.j0();
                                mainActivity.O.g0();
                                mainActivity.O.l0();
                                mainActivity.O.k0();
                                mainActivity.O.i0();
                                mainActivity.O.Z();
                            }
                        } else {
                            a0 a0Var = mainActivity.P;
                            if (a0Var != null) {
                                a0Var.g0();
                                mainActivity.P.h0();
                                mainActivity.P.b0();
                            }
                        }
                        ProgressDialog progressDialog3 = new ProgressDialog(mainActivity, R.style.hc);
                        progressDialog3.setCancelable(false);
                        progressDialog3.setMessage("Loading...");
                        progressDialog3.show();
                        App.f17100w.f17415a.edit().putString(new String(App.f17101x.z(0)), file.getPath()).apply();
                        App.f17100w.f17415a.edit().putString("uri_path", file.getPath()).apply();
                        Executors.newSingleThreadExecutor().execute(new p8.c(mainActivity, string, file, new Handler(mainActivity.getMainLooper()), progressDialog3, 1));
                    }
                    break;
                }
                break;
            case 3:
                GeneratedConfig generatedConfig = (GeneratedConfig) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                int i12 = GeneratedConfig.T;
                generatedConfig.getClass();
                if (activityResult2.f172a == -1) {
                    Intent intent2 = activityResult2.f173b;
                    if (intent2 == null) {
                        GeneratedConfig.w(team.dev.epro.apkcustom.widgets.a.f17391d, generatedConfig.getString(R.string.h8));
                    } else {
                        Uri data = intent2.getData();
                        String str3 = generatedConfig.R;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(generatedConfig.getContentResolver().openOutputStream(data)));
                            bufferedWriter.write(str2);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            GeneratedConfig.w(team.dev.epro.apkcustom.widgets.a.f17393f, String.format(generatedConfig.getString(R.string.xs), z3.a.A(generatedConfig, data)));
                            generatedConfig.finish();
                        } catch (Exception unused2) {
                            GeneratedConfig.w(team.dev.epro.apkcustom.widgets.a.f17391d, generatedConfig.getString(R.string.h8));
                            return;
                        }
                    }
                }
                break;
            case 4:
            default:
                m mVar2 = (m) obj2;
                int i13 = m.P0;
                mVar2.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    App.f17101x.d(-3355444, "You can grant notification permission from app setting");
                }
                if (mVar2.f17075u0.isChecked()) {
                    mVar2.p0();
                } else if (mVar2.f17076v0.isChecked()) {
                    mVar2.r0();
                } else if (mVar2.f17077w0.isChecked()) {
                    mVar2.q0();
                } else {
                    mVar2.o0();
                }
                break;
            case 5:
                RequestBlock requestBlock = (RequestBlock) obj2;
                ActivityResult activityResult3 = (ActivityResult) obj;
                int i14 = RequestBlock.f17190b1;
                requestBlock.getClass();
                if (activityResult3.f172a == -1) {
                    Intent intent3 = activityResult3.f173b;
                    if (intent3 == null) {
                        RequestBlock.F(team.dev.epro.apkcustom.widgets.a.f17391d, requestBlock.getString(R.string.h8) + " (intent null)");
                    } else {
                        Uri data2 = intent3.getData();
                        String str4 = requestBlock.K0;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        try {
                            StringBuilder sb = new StringBuilder();
                            String strAbc = SystemNative.abc(str2, 0, 6);
                            for (int i15 = 0; i15 < strAbc.length(); i15++) {
                                char cCharAt = strAbc.charAt(i15);
                                char[] cArr = requestBlock.Z0;
                                sb.append((char) (cCharAt ^ cArr[i15 % cArr.length]));
                            }
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(requestBlock.getContentResolver().openOutputStream(data2)));
                            bufferedWriter2.write(sb.toString());
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                            RequestBlock.F(team.dev.epro.apkcustom.widgets.a.f17393f, String.format(requestBlock.getString(R.string.xs), z3.a.A(requestBlock, data2)));
                            requestBlock.finish();
                        } catch (Exception e10) {
                            RequestBlock.F(team.dev.epro.apkcustom.widgets.a.f17391d, requestBlock.getString(R.string.h8) + " (writeInFile - " + e10.getMessage() + ")");
                            return;
                        }
                    }
                }
                break;
        }
    }

    public final void c(String str) {
        int i10 = this.f16487a;
        Object obj = this.f16488b;
        switch (i10) {
            case 7:
                int i11 = v8.g.f17941q;
                ((v8.g) obj).a(str);
                break;
            case 8:
                UDPService uDPService = (UDPService) ((m3.a) obj).f15739b;
                if (!uDPService.B && !uDPService.f17334s.isInterrupted()) {
                    if (str.contains("Connected")) {
                        String string = uDPService.getString(R.string.bl);
                        fb1.v(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), new StringBuilder("["), "] UDP Connected", string);
                        if (!App.f17100w.f17415a.getBoolean("keep_vpnservice", true)) {
                            UDPService.a(uDPService);
                        } else {
                            uDPService.f17328a.sendEmptyMessage(1);
                        }
                    } else if (str.contains("Retrying")) {
                        String string2 = uDPService.getString(R.string.bl);
                        fb1.v(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), new StringBuilder("["), "] UDP Retry Connecting...", string2);
                        uDPService.f17328a.sendEmptyMessage(3);
                    } else if (str.contains("Failed to")) {
                        int iIndexOf = str.indexOf("[0m");
                        String strReplace = str.substring(str.indexOf("[31m") + 4).replace("[ERROR]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("[0m", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("[", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        int i12 = iIndexOf + 3;
                        String strReplace2 = strReplace.substring(strReplace.lastIndexOf(":") + 1).trim().replace(str.substring(i12), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        String string3 = uDPService.getString(R.string.bl);
                        StringBuilder sb = new StringBuilder("[");
                        g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
                        sb.append(team.dev.epro.apkcustom.widgets.a.f17390c);
                        sb.append(">");
                        sb.append(str.substring(i12));
                        sb.append(" [");
                        sb.append(strReplace2.trim());
                        sb.append("]</font>");
                        u.r(string3, sb.toString());
                    }
                    break;
                }
                break;
            default:
                int i13 = v8.g.f17941q;
                ((v8.g) obj).a(str);
                break;
        }
    }
}
