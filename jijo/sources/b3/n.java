package b3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.codetroopers.betterpickers.calendardatepicker.TextViewWithCircularIndicator;
import java.util.List;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.activities.PsiphonSettings;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f1301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(KeyEvent.Callback callback, Context context, int i10, List list, int i11) {
        super(context, i10, list);
        this.f1300a = i11;
        this.f1301b = callback;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        switch (this.f1300a) {
            case 1:
                View dropDownView = super.getDropDownView(i10, view, viewGroup);
                dropDownView.setBackgroundColor(d0.f.b(App.f17099v, R.color.mv));
                dropDownView.setBackground(d0.c.b(App.f17099v, R.drawable.ih));
                float f10 = dropDownView.getContext().getResources().getDisplayMetrics().density;
                ViewGroup.LayoutParams layoutParams = dropDownView.getLayoutParams();
                layoutParams.height = (int) (f10 * 30.0f);
                dropDownView.setLayoutParams(layoutParams);
                TextView textView = (TextView) dropDownView;
                textView.setTextSize(14.0f);
                textView.setGravity(16);
                return dropDownView;
            default:
                return super.getDropDownView(i10, view, viewGroup);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        switch (this.f1300a) {
            case 0:
                TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) super.getView(i10, view, viewGroup);
                textViewWithCircularIndicator.requestLayout();
                o oVar = (o) this.f1301b;
                oVar.getClass();
                int iIntValue = Integer.valueOf(textViewWithCircularIndicator.getText().toString()).intValue();
                textViewWithCircularIndicator.setCircleColor(oVar.f1308s);
                textViewWithCircularIndicator.setTextColor(oVar.f1307q);
                boolean z9 = ((d) oVar.f1302a).e0().f1616h == iIntValue;
                textViewWithCircularIndicator.f1622f = z9;
                if (z9) {
                    oVar.f1306h = textViewWithCircularIndicator;
                }
                return textViewWithCircularIndicator;
            case 1:
                View view2 = super.getView(i10, view, viewGroup);
                view2.setBackgroundColor(d0.f.b(App.f17099v, R.color.mv));
                ((TextView) view2).setTextSize(12.0f);
                return view2;
            default:
                View view3 = super.getView(i10, view, viewGroup);
                TextView textView = (TextView) view3;
                textView.setEllipsize(null);
                textView.setSingleLine(false);
                textView.setTextSize(14.0f);
                return view3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PsiphonSettings psiphonSettings, Context context) {
        super(context, android.R.layout.simple_spinner_item);
        this.f1300a = 1;
        this.f1301b = psiphonSettings;
    }
}
