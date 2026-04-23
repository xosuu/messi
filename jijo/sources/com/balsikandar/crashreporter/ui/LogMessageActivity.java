package com.balsikandar.crashreporter.ui;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b4.f;
import d0.h;
import d0.i;
import f.q;
import g1.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class LogMessageActivity extends q {
    public TextView G;

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        BufferedReader bufferedReader;
        super.onCreate(bundle);
        setContentView(R.layout.a8);
        this.G = (TextView) findViewById(R.id.ci);
        Intent intent = getIntent();
        if (intent != null) {
            File file = new File(intent.getStringExtra("LogMessage"));
            StringBuilder sb = new StringBuilder();
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (IOException unused) {
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
                ((TextView) findViewById(R.id.ms)).setText(sb.toString());
            }
            bufferedReader.close();
            ((TextView) findViewById(R.id.ms)).setText(sb.toString());
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.x8);
        toolbar.setTitle(getString(R.string.f8));
        t(toolbar);
        r().I(true);
        TextView textView = this.G;
        StringBuilder sb2 = new StringBuilder("DEVICE INFORMATION:\n\nDEVICE.ID : ");
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        if (string == null || string.toLowerCase().equals("9774d56d682e549c")) {
            string = null;
        }
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        sb2.append(string);
        sb2.append("\nAPP : ");
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            StringBuilder sb3 = new StringBuilder();
            ApplicationInfo applicationInfo = getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            sb3.append(i10 == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i10));
            sb3.append(" (");
            sb3.append(packageInfo.packageName);
            sb3.append(")");
            sb2.append(sb3.toString());
            sb2.append("\nAPP.VERSION : ");
            try {
                sb2.append(getPackageManager().getPackageInfo(getPackageName(), 0).versionName + " (645)");
                sb2.append("\nTIMEZONE : ");
                sb2.append(TimeZone.getDefault().getID());
                sb2.append("\nVERSION.RELEASE : ");
                sb2.append(Build.VERSION.RELEASE);
                sb2.append("\nVERSION.INCREMENTAL : ");
                sb2.append(Build.VERSION.INCREMENTAL);
                sb2.append("\nVERSION.SDK.NUMBER : ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append("\nBOARD : ");
                sb2.append(Build.BOARD);
                sb2.append("\nBOOTLOADER : ");
                sb2.append(Build.BOOTLOADER);
                sb2.append("\nBRAND : ");
                sb2.append(Build.BRAND);
                sb2.append("\nCPU_ABI : ");
                sb2.append(Build.CPU_ABI);
                sb2.append("\nCPU_ABI2 : ");
                sb2.append(Build.CPU_ABI2);
                sb2.append("\nDISPLAY : ");
                sb2.append(Build.DISPLAY);
                sb2.append("\nFINGERPRINT : ");
                sb2.append(Build.FINGERPRINT);
                sb2.append("\nHARDWARE : ");
                sb2.append(Build.HARDWARE);
                sb2.append("\nHOST : ");
                sb2.append(Build.HOST);
                sb2.append("\nID : ");
                sb2.append(Build.ID);
                sb2.append("\nMANUFACTURER : ");
                sb2.append(Build.MANUFACTURER);
                sb2.append("\nMODEL : ");
                sb2.append(Build.MODEL);
                sb2.append("\nPRODUCT : ");
                sb2.append(Build.PRODUCT);
                sb2.append("\nSERIAL : ");
                sb2.append(Build.SERIAL);
                sb2.append("\nTAGS : ");
                sb2.append(Build.TAGS);
                sb2.append("\nTIME : ");
                sb2.append(Build.TIME);
                sb2.append("\nTYPE : ");
                sb2.append(Build.TYPE);
                sb2.append("\nUNKNOWN : unknown\nUSER : ");
                sb2.append(Build.USER);
                textView.setText(sb2.toString());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("Could not get package name: " + e10);
            }
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Could not get package name: " + e11);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.b, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent = getIntent();
        Map.Entry entry = null;
        String stringExtra = intent != null ? intent.getStringExtra("LogMessage") : null;
        if (menuItem.getItemId() == R.id.h1) {
            if (!TextUtils.isEmpty(stringExtra) && f.i(new File(stringExtra))) {
                finish();
            }
            return true;
        }
        if (menuItem.getItemId() != R.id.tg) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str = getPackageName() + ".CrashReporterInitProvider";
        File file = new File(stringExtra);
        h hVarA = i.a(this, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            for (Map.Entry entry2 : hVarA.f12289b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(a.q("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(hVarA.f12288a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.TEXT", this.G.getText().toString());
            intent2.putExtra("android.intent.extra.STREAM", uriBuild);
            startActivity(Intent.createChooser(intent2, "Share via"));
            return true;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
