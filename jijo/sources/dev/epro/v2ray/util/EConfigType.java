package dev.epro.v2ray.util;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public enum EConfigType {
    VMESS(1),
    CUSTOM(2),
    SHADOWSOCKS(3),
    SOCKS(4);

    int value;

    static {
        NativeUtil.classesInit0(130);
    }

    EConfigType(int i10) {
        this.value = i10;
    }

    public static native EConfigType fromInt(int i10);

    public static native EConfigType valueOf(String str);

    public static native EConfigType[] values();

    public native int getValue();
}
