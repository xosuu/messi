package t8;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.github.clans.fab.FloatingActionButton;
import de.blinkt.openvpn.core.LogItem;
import j6.g0;
import team.dev.epro.apkcustom.widgets.logger.LogView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.fragment.app.s implements g0, Handler.Callback {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f17043l0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public b f17044h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public LogView f17045i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public FloatingActionButton f17046j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Handler f17047k0;

    static {
        NativeUtil.classesInit0(183);
    }

    @Override // androidx.fragment.app.s
    public final native void A(Bundle bundle);

    @Override // androidx.fragment.app.s
    public final native void B(Menu menu, MenuInflater menuInflater);

    @Override // androidx.fragment.app.s
    public final native View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.s
    public final native void D();

    @Override // androidx.fragment.app.s
    public final native void F();

    @Override // androidx.fragment.app.s
    public final native boolean H(MenuItem menuItem);

    @Override // androidx.fragment.app.s
    public final native void J();

    @Override // j6.g0
    public final native void b(LogItem logItem);

    @Override // android.os.Handler.Callback
    public final native boolean handleMessage(Message message);

    @Override // androidx.fragment.app.s
    public final native void z(Context context);
}
