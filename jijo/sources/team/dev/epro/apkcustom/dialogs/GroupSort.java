package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zg0;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class GroupSort extends q implements View.OnClickListener {
    public LinearLayout G;
    public TextView H;
    public Spinner I;
    public Spinner J;
    public Spinner K;
    public Spinner L;
    public ImageView M;
    public zg0 N;
    public String[] O;
    public ArrayAdapter P;
    public ArrayAdapter Q;

    static {
        NativeUtil.classesInit0(117);
    }

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
