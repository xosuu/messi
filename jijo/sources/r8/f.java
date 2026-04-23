package r8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a0;
import m1.e1;
import m1.g0;
import org.json.JSONArray;
import org.json.JSONException;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g0 implements Filterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f16557d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f16558f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f16560q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PackageManager f16561s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t0.d f16565w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16559h = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f16562t = new ArrayList();

    public f(Context context) {
        this.f16558f = context;
        this.f16557d = LayoutInflater.from(context);
        this.f16561s = context.getPackageManager();
        String string = App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("L;9Io8\u001b<i\u0019;j\u001dnb@9b\u001aicKj>L=9No>Lf")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (!string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.f16562t.add(jSONArray.getString(i10));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        for (String str : App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("\u0019nb@=mHhnKl>Noh\u0019k>\u001ainNmiJ=lHm<I;jAkbA:<LfjA=b\u001eg8LmnOi?N=;@g?\u001eklH")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(Crypt.a(Crypt.xrc("J;kIf8\u0019;jJh<MljJmi@k<O;>Ogi\u001d;cM<")), -1)) {
            this.f16562t.remove(str);
        }
    }

    public static boolean h(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.g0
    public final int a() {
        List list = this.f16560q;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // m1.g0
    public final void e(e1 e1Var, int i10) {
        final e eVar = (e) e1Var;
        final ApplicationInfo applicationInfo = (ApplicationInfo) this.f16560q.get(i10);
        AppCompatImageView appCompatImageView = eVar.f16553t;
        PackageManager packageManager = this.f16561s;
        appCompatImageView.setImageDrawable(applicationInfo.loadIcon(packageManager));
        boolean z9 = true;
        int i11 = applicationInfo.flags & 1;
        AppCompatTextView appCompatTextView = eVar.f16554u;
        Context context = this.f16558f;
        if (i11 != 0) {
            StringBuilder sbK = a0.k(Crypt.a(Crypt.xrc("N=;\u001a=>H;k\u001cf;Alc\u001d<mL=8K9mK><@<>L<")) + context.getResources().getColor(R.color.se) + Crypt.a(Crypt.xrc("Li>Kjn\u001e:kH=hOmn\u0019=n\u001e:;LliL=hJml@=")), " ");
            sbK.append((Object) applicationInfo.loadLabel(packageManager));
            appCompatTextView.setText(Html.fromHtml(sbK.toString()));
        } else {
            appCompatTextView.setText(applicationInfo.loadLabel(packageManager));
        }
        if (this.f16563u) {
            appCompatTextView.setTextColor(context.getResources().getColor(R.color.bf));
        } else {
            appCompatTextView.setTextColor(-12303292);
        }
        String str = applicationInfo.packageName;
        AppCompatTextView appCompatTextView2 = eVar.f16555v;
        appCompatTextView2.setText(str);
        appCompatTextView2.setTextColor(context.getResources().getColor(R.color.bf));
        if (!this.f16563u) {
            appCompatTextView2.setTextColor(-12303292);
        }
        if (!h(applicationInfo.packageName, this.f16562t) && !this.f16564v) {
            z9 = false;
        }
        AppCompatCheckBox appCompatCheckBox = eVar.f16556w;
        appCompatCheckBox.setChecked(z9);
        appCompatCheckBox.setTag(applicationInfo.packageName);
        appCompatCheckBox.setEnabled(this.f16563u);
        boolean z10 = this.f16563u;
        View view = eVar.f15445a;
        view.setEnabled(z10);
        view.setOnClickListener(new View.OnClickListener() { // from class: r8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f fVar = this.f16549a;
                if (fVar.f16563u) {
                    e eVar2 = eVar;
                    eVar2.f16556w.setChecked(!r1.isChecked());
                    AppCompatCheckBox appCompatCheckBox2 = eVar2.f16556w;
                    if (!appCompatCheckBox2.isChecked()) {
                        fVar.f16562t.remove(appCompatCheckBox2.getTag().toString());
                    } else {
                        if (f.h(applicationInfo.packageName, fVar.f16562t)) {
                            return;
                        }
                        fVar.f16562t.add(appCompatCheckBox2.getTag().toString());
                    }
                }
            }
        });
    }

    @Override // m1.g0
    public final e1 f(RecyclerView recyclerView, int i10) {
        View viewInflate = this.f16557d.inflate(R.layout.bu, (ViewGroup) recyclerView, false);
        e eVar = new e(viewInflate);
        eVar.f16553t = (AppCompatImageView) viewInflate.findViewById(R.id.kk);
        eVar.f16554u = (AppCompatTextView) viewInflate.findViewById(R.id.oy);
        eVar.f16555v = (AppCompatTextView) viewInflate.findViewById(R.id.qh);
        eVar.f16556w = (AppCompatCheckBox) viewInflate.findViewById(R.id.f0);
        return eVar;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f16565w == null) {
            this.f16565w = new t0.d(this, 0);
        }
        return this.f16565w;
    }
}
