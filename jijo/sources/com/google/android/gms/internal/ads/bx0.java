package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class bx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ou f3124a = new ou("PhoneskyVerificationUtils", 3);

    public static boolean a(Context context) {
        String strEncodeToString;
        ou ouVar = f3124a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        ouVar.e("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            byte[] byteArray = signature.toByteArray();
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(byteArray);
                                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                            } catch (NoSuchAlgorithmException unused) {
                                strEncodeToString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            arrayList.add(strEncodeToString);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                                String str = Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                }
                            }
                            return true;
                        }
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ", ");
                            }
                        }
                        objArr[0] = sb.toString();
                        ouVar.e(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    ouVar.e("Play Store package is not found.", new Object[0]);
                }
            } else {
                ouVar.e("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            ouVar.e("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
