package d6;

import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f12477a;

    static {
        String[] strArr = new String[101];
        f12477a = strArr;
        strArr[1] = "SSH_MSG_DISCONNECT";
        strArr[2] = "SSH_MSG_IGNORE";
        strArr[3] = "SSH_MSG_UNIMPLEMENTED";
        strArr[4] = "SSH_MSG_DEBUG";
        strArr[5] = "SSH_MSG_SERVICE_REQUEST";
        strArr[6] = "SSH_MSG_SERVICE_ACCEPT";
        strArr[20] = "SSH_MSG_KEXINIT";
        strArr[21] = "SSH_MSG_NEWKEYS";
        strArr[30] = "SSH_MSG_KEXDH_INIT";
        strArr[31] = "SSH_MSG_KEXDH_REPLY/SSH_MSG_KEX_DH_GEX_GROUP";
        strArr[32] = "SSH_MSG_KEX_DH_GEX_INIT";
        strArr[33] = "SSH_MSG_KEX_DH_GEX_REPLY";
        strArr[34] = "SSH_MSG_KEX_DH_GEX_REQUEST";
        strArr[50] = "SSH_MSG_USERAUTH_REQUEST";
        strArr[51] = "SSH_MSG_USERAUTH_FAILURE";
        strArr[52] = "SSH_MSG_USERAUTH_SUCCESS";
        strArr[53] = "SSH_MSG_USERAUTH_BANNER";
        strArr[60] = "SSH_MSG_USERAUTH_INFO_REQUEST";
        strArr[61] = "SSH_MSG_USERAUTH_INFO_RESPONSE";
        strArr[80] = "SSH_MSG_GLOBAL_REQUEST";
        strArr[81] = "SSH_MSG_REQUEST_SUCCESS";
        strArr[82] = "SSH_MSG_REQUEST_FAILURE";
        strArr[90] = "SSH_MSG_CHANNEL_OPEN";
        strArr[91] = "SSH_MSG_CHANNEL_OPEN_CONFIRMATION";
        strArr[92] = "SSH_MSG_CHANNEL_OPEN_FAILURE";
        strArr[93] = "SSH_MSG_CHANNEL_WINDOW_ADJUST";
        strArr[94] = "SSH_MSG_CHANNEL_DATA";
        strArr[95] = "SSH_MSG_CHANNEL_EXTENDED_DATA";
        strArr[96] = "SSH_MSG_CHANNEL_EOF";
        strArr[97] = "SSH_MSG_CHANNEL_CLOSE";
        strArr[98] = "SSH_MSG_CHANNEL_REQUEST";
        strArr[99] = "SSH_MSG_CHANNEL_SUCCESS";
        strArr[100] = "SSH_MSG_CHANNEL_FAILURE";
    }

    public static final String a(int i10) {
        String str = (i10 < 0 || i10 >= 101) ? null : f12477a[i10];
        return str == null ? fb1.g("UNKNOWN MSG ", i10) : str;
    }
}
