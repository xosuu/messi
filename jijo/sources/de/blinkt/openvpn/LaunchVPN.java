package de.blinkt.openvpn;

import android.app.Activity;
import android.os.Bundle;
import h6.d;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class LaunchVPN extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12528b = false;

    static {
        NativeUtil.classesInit0(216);
    }

    public final native void a(String str);

    @Override // android.app.Activity
    public final native void onCreate(Bundle bundle);
}
