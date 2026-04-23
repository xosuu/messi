package x1;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f18308a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f12 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fC = fb1.c(f12, f11, f10, f11);
        float fC2 = fb1.c(fPow4, fPow, f10, fPow);
        float fC3 = fb1.c(fPow5, fPow2, f10, fPow2);
        float fC4 = fb1.c(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fC2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fC3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fC4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fC * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
