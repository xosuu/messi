package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import androidx.activity.result.c;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import f.q;
import java.util.List;
import r8.f;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ProxifiedApps extends q {
    public static final /* synthetic */ int N = 0;
    public SwitchCompat G;
    public SwitchCompat H;
    public ProgressBar I;
    public RecyclerView J;
    public f K;
    public List L;
    public c M;

    static {
        NativeUtil.classesInit0(191);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native boolean onCreateOptionsMenu(Menu menu);

    @Override // android.app.Activity
    public final native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
