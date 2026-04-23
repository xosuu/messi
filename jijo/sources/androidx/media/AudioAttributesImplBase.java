package androidx.media;

import com.google.android.gms.internal.ads.fb1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1022a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1023b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1024c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1025d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1023b != audioAttributesImplBase.f1023b) {
            return false;
        }
        int i11 = this.f1024c;
        int i12 = audioAttributesImplBase.f1024c;
        int i13 = audioAttributesImplBase.f1025d;
        if (i13 == -1) {
            int i14 = audioAttributesImplBase.f1022a;
            int i15 = AudioAttributesCompat.f1018b;
            if ((i12 & 1) != 1) {
                i10 = 4;
                if ((i12 & 4) != 4) {
                    switch (i14) {
                        case 2:
                            i10 = 0;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 2;
                            break;
                        case 11:
                            i10 = 10;
                            break;
                        case 12:
                        default:
                            i10 = 3;
                            break;
                        case 13:
                            i10 = 1;
                            break;
                    }
                } else {
                    i10 = 6;
                }
            } else {
                i10 = 7;
            }
        } else {
            i10 = i13;
        }
        if (i10 == 6) {
            i12 |= 4;
        } else if (i10 == 7) {
            i12 |= 1;
        }
        return i11 == (i12 & 273) && this.f1022a == audioAttributesImplBase.f1022a && this.f1025d == i13;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1023b), Integer.valueOf(this.f1024c), Integer.valueOf(this.f1022a), Integer.valueOf(this.f1025d)});
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1025d != -1) {
            sb.append(" stream=");
            sb.append(this.f1025d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i10 = this.f1022a;
        int i11 = AudioAttributesCompat.f1018b;
        switch (i10) {
            case 0:
                strG = "USAGE_UNKNOWN";
                break;
            case 1:
                strG = "USAGE_MEDIA";
                break;
            case 2:
                strG = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strG = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strG = "USAGE_ALARM";
                break;
            case 5:
                strG = "USAGE_NOTIFICATION";
                break;
            case 6:
                strG = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strG = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strG = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strG = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strG = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strG = "USAGE_GAME";
                break;
            case 15:
            default:
                strG = fb1.g("unknown usage ", i10);
                break;
            case 16:
                strG = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strG);
        sb.append(" content=");
        sb.append(this.f1023b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1024c).toUpperCase());
        return sb.toString();
    }
}
