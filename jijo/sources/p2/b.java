package p2;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f16235b;

    public b(ArrayList arrayList, CountDownLatch countDownLatch) {
        this.f16234a = arrayList;
        this.f16235b = countDownLatch;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f16234a.addAll(linkProperties.getDnsServers());
        this.f16235b.countDown();
    }
}
