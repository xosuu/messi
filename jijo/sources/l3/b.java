package l3;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import de.blinkt.openvpn.LaunchVPN;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15176b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f15175a = i10;
        this.f15176b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f15175a;
        Object obj = this.f15176b;
        switch (i11) {
            case 0:
                zzu.zzp();
                zzt.zzU(((c) obj).f15177a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
            default:
                ((LaunchVPN) obj).finish();
                break;
        }
    }
}
