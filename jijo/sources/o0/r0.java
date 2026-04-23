package o0;

import android.view.ContentInfo;
import android.view.View;
import com.google.android.gms.internal.ads.rk1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo contentInfoO = hVar.f16026a.o();
        Objects.requireNonNull(contentInfoO);
        ContentInfo contentInfoM = rk1.m(contentInfoO);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM ? hVar : new h(new k.q(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, u uVar) {
        if (uVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new s0(uVar));
        }
    }
}
