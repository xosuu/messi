package r8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16544b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f16545d;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i10) {
        return (u8.a) this.f16545d.get(i10);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = this.f16543a;
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService(Crypt.a(Crypt.xrc("\u001ckjM9j\u001bmnJo8NgcN;hNf>MkcM>cIgc\u001d<")))).inflate(this.f16544b, (ViewGroup) null);
        }
        u8.a aVar = (u8.a) this.f16545d.get(i10);
        if (aVar != null) {
            TextView textView = (TextView) view.findViewById(R.id.p);
            TextView textView2 = (TextView) view.findViewById(R.id.r);
            TextView textView3 = (TextView) view.findViewById(R.id.s);
            ((ImageView) view.findViewById(R.id.j5)).setImageDrawable(context.getResources().getDrawable(context.getResources().getIdentifier(Crypt.a(Crypt.xrc("\u001ejh\u001d9>OhbJk?O9b\u001cllIlj\u001bkj\u001do?Kg;\u001af")) + aVar.f17668h, null, context.getPackageName())));
            if (textView != null) {
                textView.setText(aVar.f17664a);
            }
            if (textView2 != null) {
                textView2.setText(aVar.f17665b);
            }
            if (textView3 != null) {
                textView3.setText(aVar.f17666d);
            }
        }
        return view;
    }
}
