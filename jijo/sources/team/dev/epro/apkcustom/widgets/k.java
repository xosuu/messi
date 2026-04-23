package team.dev.epro.apkcustom.widgets;

import com.google.gson.p;
import com.google.gson.q;
import dev.epro.v2ray.model.transport.StreamSettingsObject;
import dev.epro.v2ray.util.V2rayNGUtils;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.j f17444a;

    static {
        NativeUtil.classesInit0(203);
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.b(new q() { // from class: team.dev.epro.apkcustom.widgets.V2RayUtils$1
            static {
                NativeUtil.classesInit0(122);
            }

            @Override // com.google.gson.q
            public final native p a(Object obj);
        });
        kVar.f12250j = true;
        f17444a = kVar.a();
    }

    public static native String a(String str);

    public static native StreamSettingsObject b(V2rayNGUtils v2rayNGUtils);
}
