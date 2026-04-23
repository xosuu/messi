package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.fb1;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import y5.a;
import y5.b;

/* JADX INFO: loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap f12262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumMap f12263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f12264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f12265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f12266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f12267f;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(b.class);
        f12262a = enumMap;
        enumMap.put(b.f20465a, 0);
        enumMap.put(b.f20466b, 1);
        EnumMap enumMap2 = new EnumMap(a.class);
        f12263b = enumMap2;
        a aVar = a.f20459a;
        enumMap2.put(aVar, 0);
        a aVar2 = a.f20460b;
        enumMap2.put(aVar2, 1);
        a aVar3 = a.f20461d;
        enumMap2.put(aVar3, 2);
        a aVar4 = a.f20462f;
        enumMap2.put(aVar4, 3);
        a aVar5 = a.f20463h;
        enumMap2.put(aVar5, 4);
        f12264c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f12265d = new HashSet();
        f12266e = null;
        f12267f = true;
        new HashMap();
    }

    public MMKV(long j10) {
        this.nativeHandle = j10;
    }

    public static void a() {
        synchronized (f12265d) {
            f12267f = true;
        }
    }

    private native long actualSize(long j10);

    private native String[] allKeys(long j10, boolean z9);

    public static void b(Context context, String str) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            synchronized (f12265d) {
                f12267f = false;
            }
        } else {
            a();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        System.loadLibrary("mmkv");
        jniInitialize(str, absolutePath, 4, false);
        f12266e = str;
    }

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    public static MMKV c(String str, String str2) {
        if (f12266e == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        long mMKVWithID = getMMKVWithID(str, 2, str2, null, 0L);
        if (mMKVWithID == 0) {
            throw new RuntimeException(fb1.i("Fail to create an MMKV instance [", str, "] in JNI"));
        }
        if (!f12267f) {
            return new MMKV(mMKVWithID);
        }
        HashSet hashSet = f12265d;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(mMKVWithID))) {
                    if (!checkProcessMode(mMKVWithID)) {
                        throw new IllegalArgumentException(("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!");
                    }
                    hashSet.add(Long.valueOf(mMKVWithID));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(mMKVWithID);
    }

    private static native boolean checkProcessMode(long j10);

    private native boolean containsKey(long j10, String str);

    private native long count(long j10, boolean z9);

    private static native long createNB(int i10);

    public static void d(String str) {
        a aVar = a.f20460b;
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r1.length - 1];
        Integer num = (Integer) f12263b.get(aVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private native boolean decodeBool(long j10, String str, boolean z9);

    private native byte[] decodeBytes(long j10, String str);

    private native double decodeDouble(long j10, String str, double d10);

    private native float decodeFloat(long j10, String str, float f10);

    private native int decodeInt(long j10, String str, int i10);

    private native long decodeLong(long j10, String str, long j11);

    private native String decodeString(long j10, String str, String str2);

    private native String[] decodeStringSet(long j10, String str);

    private static native void destroyNB(long j10, int i10);

    private native boolean encodeBool(long j10, String str, boolean z9);

    private native boolean encodeBool_2(long j10, String str, boolean z9, int i10);

    private native boolean encodeBytes(long j10, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j10, String str, byte[] bArr, int i10);

    private native boolean encodeDouble(long j10, String str, double d10);

    private native boolean encodeDouble_2(long j10, String str, double d10, int i10);

    private native boolean encodeFloat(long j10, String str, float f10);

    private native boolean encodeFloat_2(long j10, String str, float f10, int i10);

    private native boolean encodeInt(long j10, String str, int i10);

    private native boolean encodeInt_2(long j10, String str, int i10, int i11);

    private native boolean encodeLong(long j10, String str, long j11);

    private native boolean encodeLong_2(long j10, String str, long j11, int i10);

    private native boolean encodeSet(long j10, String str, String[] strArr);

    private native boolean encodeSet_2(long j10, String str, String[] strArr, int i10);

    private native boolean encodeString(long j10, String str, String str2);

    private native boolean encodeString_2(long j10, String str, String str2, int i10);

    private static native long getDefaultMMKV(int i10, String str);

    private static native long getMMKVWithAshmemFD(String str, int i10, int i11, String str2);

    private static native long getMMKVWithID(String str, int i10, String str2, String str3, long j10);

    private static native long getMMKVWithIDAndSize(String str, int i10, int i11, String str2);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i10, boolean z9);

    private static void mmkvLogImp(int i10, String str, int i11, String str2, String str3) {
        f12264c[i10].ordinal();
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        b bVar = b.f20465a;
        d("Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f12262a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        b bVar = b.f20465a;
        d("Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f12262a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j10, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z9, boolean z10);

    private static native void setLogLevel(int i10);

    private static native void setWantsContentChangeNotify(boolean z9);

    private native void sync(boolean z9);

    private native long totalSize(long j10);

    private native int valueSize(long j10, String str, boolean z9);

    public static native String version();

    private native int writeValueToNB(long j10, String str, long j11, int i10);

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i10);

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z9) {
        return decodeBool(this.nativeHandle, str, z9);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return decodeFloat(this.nativeHandle, str, f10);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        return decodeInt(this.nativeHandle, str, i10);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        return decodeLong(this.nativeHandle, str, j10);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet == null) {
            return set;
        }
        try {
            Set set2 = (Set) HashSet.class.newInstance();
            set2.addAll(Arrays.asList(strArrDecodeStringSet));
            return set2;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z9) {
        encodeBool(this.nativeHandle, str, z9);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        encodeFloat(this.nativeHandle, str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        encodeInt(this.nativeHandle, str, i10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        encodeLong(this.nativeHandle, str, j10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
        return this;
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        removeValueForKey(this.nativeHandle, str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }
}
