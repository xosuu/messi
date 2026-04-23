package i9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f14215c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f14216d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14217e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14218f;

    static {
        NativeUtil.classesInit0(140);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context) {
        this.f14213a = (Activity) context;
        this.f14214b = (a) context;
    }

    public final native void a(ArrayList arrayList, String str, int i10);
}
