package team.dev.epro.apkcustom.widgets;

import android.app.ListActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import f.k0;
import f.u;
import java.io.File;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class FileChooser extends ListActivity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f17361h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f17363b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r8.a f17364d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k0 f17365f;

    static {
        NativeUtil.classesInit0(94);
    }

    public final native void a(File file);

    @Override // android.app.Activity
    public final native void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public final native u b();

    @Override // android.app.Activity
    public final native MenuInflater getMenuInflater();

    @Override // android.app.Activity
    public final native void invalidateOptionsMenu();

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final native void onConfigurationChanged(Configuration configuration);

    @Override // android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.ListActivity
    public final native void onListItemClick(ListView listView, View view, int i10, long j10);

    @Override // android.app.Activity
    public final native void onPostCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native void onPostResume();

    @Override // android.app.Activity
    public final native void onTitleChanged(CharSequence charSequence, int i10);

    @Override // android.app.Activity
    public final native void setContentView(int i10);

    @Override // android.app.Activity
    public native void setContentView(View view);

    @Override // android.app.Activity
    public final native void setContentView(View view, ViewGroup.LayoutParams layoutParams);
}
