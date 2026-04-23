package j9;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import androidx.fragment.app.w;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressDialog f14470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14471b;

    static {
        NativeUtil.classesInit0(152);
    }

    public b(a aVar, w wVar) {
        this.f14471b = aVar;
        ProgressDialog progressDialog = new ProgressDialog(wVar, R.style.hc);
        this.f14470a = progressDialog;
        progressDialog.setCancelable(false);
    }

    @Override // android.os.AsyncTask
    public final native Object doInBackground(Object[] objArr);

    @Override // android.os.AsyncTask
    public final native void onPostExecute(Object obj);

    @Override // android.os.AsyncTask
    public final native void onPreExecute();

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
    }
}
