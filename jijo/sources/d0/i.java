package d0;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final File f12290b = new File("/");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f12291d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f12292a;

    public static h a(Context context, String str) {
        h hVarB;
        HashMap map = f12291d;
        synchronized (map) {
            try {
                hVarB = (h) map.get(str);
                if (hVarB == null) {
                    try {
                        try {
                            hVarB = b(context, str);
                            map.put(str, hVarB);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVarB;
    }

    public static h b(Context context, String str) throws XmlPullParserException, IOException {
        h hVar = new h(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, NotificationCompat.FLAG_HIGH_PRIORITY);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(g1.a.q("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return hVar;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f12290b;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = f.f12287a;
                    File[] fileArrB = b.b(context, null);
                    if (fileArrB.length > 0) {
                        externalStorageDirectory = fileArrB[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = f.f12287a;
                    File[] fileArrA = b.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrA2 = g.a(context);
                    if (fileArrA2.length > 0) {
                        externalStorageDirectory = fileArrA2[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        hVar.f12289b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e10);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap map = f12291d;
        synchronized (map) {
            map.remove(str);
        }
        this.f12292a = a(context, str);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i10;
        h hVar = this.f12292a;
        hVar.getClass();
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) hVar.f12289b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (!canonicalFile.getPath().startsWith(file.getPath())) {
                throw new SecurityException("Resolved path jumped beyond configured root");
            }
            if ("r".equals(str)) {
                i10 = 268435456;
            } else if ("w".equals(str) || "wt".equals(str)) {
                i10 = 738197504;
            } else if ("wa".equals(str)) {
                i10 = 704643072;
            } else if ("rw".equals(str)) {
                i10 = 939524096;
            } else {
                if (!"rwt".equals(str)) {
                    throw new IllegalArgumentException(g1.a.q("Invalid mode: ", str));
                }
                i10 = 1006632960;
            }
            return ParcelFileDescriptor.open(canonicalFile, i10);
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
