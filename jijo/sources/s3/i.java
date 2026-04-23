package s3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f16697b = cVar;
        this.f16696a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i10 = d.f16686a;
        c cVar = this.f16697b;
        Context context = this.f16696a;
        int iC = cVar.c(context, i10);
        AtomicBoolean atomicBoolean = f.f16689a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = cVar.b(iC, context, "n");
            cVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, f4.c.f13089a | 134217728));
        }
    }
}
