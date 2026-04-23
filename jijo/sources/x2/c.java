package x2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import m1.e1;
import m1.g0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f18379d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f18380f;

    @Override // m1.g0
    public final int a() {
        return this.f18380f.size();
    }

    @Override // m1.g0
    public final void e(e1 e1Var, int i10) {
        b bVar = (b) e1Var;
        File file = (File) this.f18380f.get(i10);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        String line = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        bVar.f18378u.setText(name.replaceAll("[a-zA-Z_.]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(absolutePath)));
            line = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException unused) {
        }
        TextView textView = bVar.f18377t;
        textView.setText(line);
        textView.setOnClickListener(new a(this.f18379d, absolutePath));
    }

    @Override // m1.g0
    public final e1 f(RecyclerView recyclerView, int i10) {
        View viewInflate = LayoutInflater.from(this.f18379d).inflate(R.layout.b1, (ViewGroup) null);
        b bVar = new b(viewInflate);
        bVar.f18378u = (TextView) viewInflate.findViewById(R.id.no);
        bVar.f18377t = (TextView) viewInflate.findViewById(R.id.wc);
        return bVar;
    }
}
