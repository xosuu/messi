package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f14447a;

    public z(a0 a0Var) {
        this.f14447a = a0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "org.torproject.android.intent.action.STATUS")) {
            a0 a0Var = this.f14447a;
            Iterator it = a0Var.f14372b.iterator();
            while (it.hasNext()) {
                ((x) it.next()).getClass();
                StringBuilder sb = new StringBuilder();
                for (String str : intent.getExtras().keySet()) {
                    Object obj = intent.getExtras().get(str);
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    objArr[1] = obj == null ? "null" : obj.toString();
                    sb.append(String.format(locale, "%s - '%s'", objArr));
                }
                de.blinkt.openvpn.core.c.g("Got Orbot status: " + ((Object) sb));
            }
            String stringExtra = intent.getStringExtra("org.torproject.android.intent.extra.STATUS");
            if (!TextUtils.equals(stringExtra, "ON")) {
                if (TextUtils.equals(stringExtra, "STARTS_DISABLED")) {
                    Iterator it2 = a0Var.f14372b.iterator();
                    while (it2.hasNext()) {
                        ((x) it2.next()).getClass();
                        de.blinkt.openvpn.core.c.q("Orbot integration for external applications is disabled. Waiting %ds before connecting to the default port. Enable external app integration in Orbot or use Socks v5 config instead of Orbot to avoid this delay.");
                    }
                    return;
                }
                return;
            }
            int intExtra = intent.getIntExtra("org.torproject.android.intent.extra.SOCKS_PROXY_PORT", 9050);
            String stringExtra2 = intent.getStringExtra("org.torproject.android.intent.extra.SOCKS_PROXY_HOST");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "127.0.0.1";
            }
            for (x xVar : a0Var.f14372b) {
                y yVar = xVar.f14432a;
                yVar.f14433a.removeCallbacks(yVar.f14444x);
                yVar.g(3, stringExtra2, Integer.toString(intExtra), false);
                a0.b().c(xVar);
            }
        }
    }
}
