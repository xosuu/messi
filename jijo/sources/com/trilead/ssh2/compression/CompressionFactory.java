package com.trilead.ssh2.compression;

import com.google.android.gms.ads.RequestConfiguration;
import g1.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompressionFactory {
    private static List<CompressorEntry> compressors;

    public static class CompressorEntry {
        String compressorClass;
        String type;

        private CompressorEntry(String str, String str2) {
            this.type = str;
            this.compressorClass = str2;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        compressors = arrayList;
        arrayList.add(new CompressorEntry("zlib", "com.trilead.ssh2.compression.Zlib"));
        compressors.add(new CompressorEntry("zlib@openssh.com", "com.trilead.ssh2.compression.ZlibOpenSSH"));
        compressors.add(new CompressorEntry("none", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    private CompressionFactory() {
    }

    public static void addCompressor(String str, String str2) {
        compressors.add(new CompressorEntry(str, str2));
    }

    public static void checkCompressorList(String[] strArr) {
        for (String str : strArr) {
            getEntry(str);
        }
    }

    public static ICompressor createCompressor(String str) {
        try {
            CompressorEntry entry = getEntry(str);
            if (RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(entry.compressorClass)) {
                return null;
            }
            return (ICompressor) Class.forName(entry.compressorClass).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            throw new IllegalArgumentException(a.q("Cannot instantiate ", str));
        }
    }

    public static String[] getDefaultCompressorList() {
        String[] strArr = new String[compressors.size()];
        for (int i10 = 0; i10 < compressors.size(); i10++) {
            strArr[i10] = compressors.get(i10).type;
        }
        return strArr;
    }

    private static CompressorEntry getEntry(String str) {
        for (CompressorEntry compressorEntry : compressors) {
            if (compressorEntry.type.equals(str)) {
                return compressorEntry;
            }
        }
        throw new IllegalArgumentException(a.q("Unknown algorithm ", str));
    }
}
