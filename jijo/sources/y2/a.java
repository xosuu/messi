package y2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.s;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import x2.c;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends s {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public c f20447h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public RecyclerView f20448i0;

    public static ArrayList Z() {
        String strA = TextUtils.isEmpty(null) ? z2.b.a() : null;
        File file = new File(strA);
        if (!file.exists() || !file.isDirectory()) {
            throw new RuntimeException(g1.a.q("The path provided doesn't exists : ", strA));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(file.listFiles()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((File) it.next()).getName().contains("_exception")) {
                it.remove();
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    @Override // androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
    }

    @Override // androidx.fragment.app.s
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.ay, viewGroup, false);
        this.f20448i0 = (RecyclerView) viewInflate.findViewById(R.id.g8);
        return viewInflate;
    }

    @Override // androidx.fragment.app.s
    public final void J() {
        this.Q = true;
        w wVarC = c();
        RecyclerView recyclerView = this.f20448i0;
        ArrayList arrayListZ = Z();
        c cVar = new c();
        cVar.f18379d = wVarC;
        cVar.f18380f = arrayListZ;
        this.f20447h0 = cVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.f20447h0);
    }
}
