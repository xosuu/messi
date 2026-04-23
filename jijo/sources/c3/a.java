package c3;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.codetroopers.betterpickers.datepicker.DatePicker;
import com.codetroopers.betterpickers.expirationpicker.ExpirationPicker;
import java.util.Locale;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a extends z1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f1561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f1562e;

    public /* synthetic */ a(LinearLayout linearLayout, LayoutInflater layoutInflater, int i10) {
        this.f1560c = i10;
        this.f1562e = linearLayout;
        this.f1561d = layoutInflater;
    }

    @Override // z1.a
    public final void a(ViewGroup viewGroup, int i10, Object obj) {
        switch (this.f1560c) {
            case 0:
                viewGroup.removeView((View) obj);
                break;
            default:
                viewGroup.removeView((View) obj);
                break;
        }
    }

    @Override // z1.a
    public final int c() {
        switch (this.f1560c) {
            case 0:
                return 3;
            default:
                return 2;
        }
    }

    @Override // z1.a
    public final Object f(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        LayoutInflater layoutInflater = this.f1561d;
        int i11 = this.f1560c;
        LinearLayout linearLayout = this.f1562e;
        switch (i11) {
            case 0:
                DatePicker datePicker = (DatePicker) linearLayout;
                Resources resources = datePicker.F.getResources();
                char c10 = datePicker.G[i10];
                if (c10 == 'M') {
                    DatePicker.S = i10;
                    view = layoutInflater.inflate(R.layout.bz, viewGroup, false);
                    View viewFindViewById = view.findViewById(R.id.j_);
                    View viewFindViewById2 = view.findViewById(R.id.t3);
                    View viewFindViewById3 = view.findViewById(R.id.wm);
                    View viewFindViewById4 = view.findViewById(R.id.jk);
                    ((TextView) view.findViewById(R.id.jz)).setText(R.string.my);
                    Button button = (Button) viewFindViewById.findViewById(R.id.lc);
                    Button[] buttonArr = datePicker.f1630t;
                    buttonArr[0] = button;
                    buttonArr[1] = (Button) viewFindViewById.findViewById(R.id.ld);
                    buttonArr[2] = (Button) viewFindViewById.findViewById(R.id.le);
                    buttonArr[3] = (Button) viewFindViewById2.findViewById(R.id.lc);
                    buttonArr[4] = (Button) viewFindViewById2.findViewById(R.id.ld);
                    buttonArr[5] = (Button) viewFindViewById2.findViewById(R.id.le);
                    buttonArr[6] = (Button) viewFindViewById3.findViewById(R.id.lc);
                    buttonArr[7] = (Button) viewFindViewById3.findViewById(R.id.ld);
                    buttonArr[8] = (Button) viewFindViewById3.findViewById(R.id.le);
                    buttonArr[9] = (Button) viewFindViewById4.findViewById(R.id.lc);
                    buttonArr[10] = (Button) viewFindViewById4.findViewById(R.id.ld);
                    buttonArr[11] = (Button) viewFindViewById4.findViewById(R.id.le);
                    for (int i12 = 0; i12 < 12; i12++) {
                        buttonArr[i12].setOnClickListener(datePicker);
                        buttonArr[i12].setText(datePicker.E[i12]);
                        buttonArr[i12].setTextColor(datePicker.K);
                        buttonArr[i12].setBackgroundResource(datePicker.L);
                        buttonArr[i12].setTag(R.id.gi, "month");
                        buttonArr[i12].setTag(R.id.gj, Integer.valueOf(i12));
                    }
                } else if (c10 == 'd') {
                    DatePicker.T = i10;
                    view = layoutInflater.inflate(R.layout.bx, viewGroup, false);
                    View viewFindViewById5 = view.findViewById(R.id.j_);
                    View viewFindViewById6 = view.findViewById(R.id.t3);
                    View viewFindViewById7 = view.findViewById(R.id.wm);
                    View viewFindViewById8 = view.findViewById(R.id.jk);
                    ((TextView) view.findViewById(R.id.jz)).setText(R.string.ft);
                    Button button2 = (Button) viewFindViewById5.findViewById(R.id.lc);
                    Button[] buttonArr2 = datePicker.f1631u;
                    buttonArr2[1] = button2;
                    buttonArr2[2] = (Button) viewFindViewById5.findViewById(R.id.ld);
                    buttonArr2[3] = (Button) viewFindViewById5.findViewById(R.id.le);
                    buttonArr2[4] = (Button) viewFindViewById6.findViewById(R.id.lc);
                    buttonArr2[5] = (Button) viewFindViewById6.findViewById(R.id.ld);
                    buttonArr2[6] = (Button) viewFindViewById6.findViewById(R.id.le);
                    buttonArr2[7] = (Button) viewFindViewById7.findViewById(R.id.lc);
                    buttonArr2[8] = (Button) viewFindViewById7.findViewById(R.id.ld);
                    buttonArr2[9] = (Button) viewFindViewById7.findViewById(R.id.le);
                    Button button3 = (Button) viewFindViewById8.findViewById(R.id.lc);
                    datePicker.f1633w = button3;
                    button3.setTextColor(datePicker.K);
                    datePicker.f1633w.setBackgroundResource(datePicker.L);
                    buttonArr2[0] = (Button) viewFindViewById8.findViewById(R.id.ld);
                    datePicker.f1636z = (ImageButton) viewFindViewById8.findViewById(R.id.le);
                    int i13 = 0;
                    for (int i14 = 10; i13 < i14; i14 = 10) {
                        buttonArr2[i13].setOnClickListener(datePicker);
                        buttonArr2[i13].setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i13)));
                        buttonArr2[i13].setTextColor(datePicker.K);
                        buttonArr2[i13].setBackgroundResource(datePicker.L);
                        buttonArr2[i13].setTag(R.id.gi, "date");
                        buttonArr2[i13].setTag(R.id.q4, Integer.valueOf(i13));
                        i13++;
                    }
                    datePicker.f1636z.setImageDrawable(resources.getDrawable(datePicker.P));
                    datePicker.f1636z.setBackgroundResource(datePicker.L);
                    datePicker.f1636z.setOnClickListener(datePicker);
                } else if (c10 == 'y') {
                    DatePicker.U = i10;
                    view = layoutInflater.inflate(R.layout.c0, viewGroup, false);
                    View viewFindViewById9 = view.findViewById(R.id.j_);
                    View viewFindViewById10 = view.findViewById(R.id.t3);
                    View viewFindViewById11 = view.findViewById(R.id.wm);
                    View viewFindViewById12 = view.findViewById(R.id.jk);
                    ((TextView) view.findViewById(R.id.jz)).setText(R.string.a0p);
                    Button button4 = (Button) viewFindViewById9.findViewById(R.id.lc);
                    Button[] buttonArr3 = datePicker.f1632v;
                    buttonArr3[1] = button4;
                    buttonArr3[2] = (Button) viewFindViewById9.findViewById(R.id.ld);
                    buttonArr3[3] = (Button) viewFindViewById9.findViewById(R.id.le);
                    buttonArr3[4] = (Button) viewFindViewById10.findViewById(R.id.lc);
                    buttonArr3[5] = (Button) viewFindViewById10.findViewById(R.id.ld);
                    buttonArr3[6] = (Button) viewFindViewById10.findViewById(R.id.le);
                    buttonArr3[7] = (Button) viewFindViewById11.findViewById(R.id.lc);
                    buttonArr3[8] = (Button) viewFindViewById11.findViewById(R.id.ld);
                    buttonArr3[9] = (Button) viewFindViewById11.findViewById(R.id.le);
                    Button button5 = (Button) viewFindViewById12.findViewById(R.id.lc);
                    datePicker.f1634x = button5;
                    button5.setTextColor(datePicker.K);
                    datePicker.f1634x.setBackgroundResource(datePicker.L);
                    buttonArr3[0] = (Button) viewFindViewById12.findViewById(R.id.ld);
                    Button button6 = (Button) viewFindViewById12.findViewById(R.id.le);
                    datePicker.f1635y = button6;
                    button6.setTextColor(datePicker.K);
                    datePicker.f1635y.setBackgroundResource(datePicker.L);
                    for (int i15 = 0; i15 < 10; i15++) {
                        buttonArr3[i15].setOnClickListener(datePicker);
                        buttonArr3[i15].setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i15)));
                        buttonArr3[i15].setTextColor(datePicker.K);
                        buttonArr3[i15].setBackgroundResource(datePicker.L);
                        buttonArr3[i15].setTag(R.id.gi, "year");
                        buttonArr3[i15].setTag(R.id.q4, Integer.valueOf(i15));
                    }
                } else {
                    view = new View(datePicker.F);
                }
                datePicker.c();
                datePicker.d();
                datePicker.e();
                viewGroup.addView(view, 0);
                return view;
            default:
                ExpirationPicker expirationPicker = (ExpirationPicker) linearLayout;
                expirationPicker.f1662z.getResources();
                if (i10 == 0) {
                    ExpirationPicker.K = i10;
                    view2 = layoutInflater.inflate(R.layout.by, viewGroup, false);
                    View viewFindViewById13 = view2.findViewById(R.id.j_);
                    View viewFindViewById14 = view2.findViewById(R.id.t3);
                    View viewFindViewById15 = view2.findViewById(R.id.wm);
                    View viewFindViewById16 = view2.findViewById(R.id.jk);
                    Button button7 = (Button) viewFindViewById13.findViewById(R.id.lc);
                    Button[] buttonArr4 = expirationPicker.f1654q;
                    buttonArr4[0] = button7;
                    buttonArr4[1] = (Button) viewFindViewById13.findViewById(R.id.ld);
                    buttonArr4[2] = (Button) viewFindViewById13.findViewById(R.id.le);
                    buttonArr4[3] = (Button) viewFindViewById14.findViewById(R.id.lc);
                    buttonArr4[4] = (Button) viewFindViewById14.findViewById(R.id.ld);
                    buttonArr4[5] = (Button) viewFindViewById14.findViewById(R.id.le);
                    buttonArr4[6] = (Button) viewFindViewById15.findViewById(R.id.lc);
                    buttonArr4[7] = (Button) viewFindViewById15.findViewById(R.id.ld);
                    buttonArr4[8] = (Button) viewFindViewById15.findViewById(R.id.le);
                    buttonArr4[9] = (Button) viewFindViewById16.findViewById(R.id.lc);
                    buttonArr4[10] = (Button) viewFindViewById16.findViewById(R.id.ld);
                    buttonArr4[11] = (Button) viewFindViewById16.findViewById(R.id.le);
                    int i16 = 0;
                    for (int i17 = 12; i16 < i17; i17 = 12) {
                        buttonArr4[i16].setOnClickListener(expirationPicker);
                        int i18 = i16 + 1;
                        buttonArr4[i16].setText(String.format("%02d", Integer.valueOf(i18)));
                        buttonArr4[i16].setTextColor(expirationPicker.C);
                        buttonArr4[i16].setBackgroundResource(expirationPicker.D);
                        buttonArr4[i16].setTag(R.id.gi, "month");
                        buttonArr4[i16].setTag(R.id.gj, Integer.valueOf(i18));
                        i16 = i18;
                    }
                } else if (i10 == 1) {
                    ExpirationPicker.L = i10;
                    view2 = layoutInflater.inflate(R.layout.bv, viewGroup, false);
                    View viewFindViewById17 = view2.findViewById(R.id.j_);
                    View viewFindViewById18 = view2.findViewById(R.id.t3);
                    View viewFindViewById19 = view2.findViewById(R.id.wm);
                    View viewFindViewById20 = view2.findViewById(R.id.jk);
                    Button button8 = (Button) viewFindViewById17.findViewById(R.id.lc);
                    Button[] buttonArr5 = expirationPicker.f1655s;
                    buttonArr5[1] = button8;
                    buttonArr5[2] = (Button) viewFindViewById17.findViewById(R.id.ld);
                    buttonArr5[3] = (Button) viewFindViewById17.findViewById(R.id.le);
                    buttonArr5[4] = (Button) viewFindViewById18.findViewById(R.id.lc);
                    buttonArr5[5] = (Button) viewFindViewById18.findViewById(R.id.ld);
                    buttonArr5[6] = (Button) viewFindViewById18.findViewById(R.id.le);
                    buttonArr5[7] = (Button) viewFindViewById19.findViewById(R.id.lc);
                    buttonArr5[8] = (Button) viewFindViewById19.findViewById(R.id.ld);
                    buttonArr5[9] = (Button) viewFindViewById19.findViewById(R.id.le);
                    Button button9 = (Button) viewFindViewById20.findViewById(R.id.lc);
                    expirationPicker.f1656t = button9;
                    button9.setTextColor(expirationPicker.C);
                    expirationPicker.f1656t.setBackgroundResource(expirationPicker.D);
                    buttonArr5[0] = (Button) viewFindViewById20.findViewById(R.id.ld);
                    Button button10 = (Button) viewFindViewById20.findViewById(R.id.le);
                    expirationPicker.f1657u = button10;
                    button10.setTextColor(expirationPicker.C);
                    expirationPicker.f1657u.setBackgroundResource(expirationPicker.D);
                    int i19 = 0;
                    for (int i20 = 10; i19 < i20; i20 = 10) {
                        buttonArr5[i19].setOnClickListener(expirationPicker);
                        buttonArr5[i19].setText(String.format("%d", Integer.valueOf(i19)));
                        buttonArr5[i19].setTextColor(expirationPicker.C);
                        buttonArr5[i19].setBackgroundResource(expirationPicker.D);
                        buttonArr5[i19].setTag(R.id.gi, "year");
                        buttonArr5[i19].setTag(R.id.q4, Integer.valueOf(i19));
                        i19++;
                    }
                } else {
                    view2 = new View(expirationPicker.f1662z);
                }
                Button button11 = expirationPicker.f1656t;
                if (button11 != null) {
                    button11.setEnabled(false);
                }
                Button button12 = expirationPicker.f1657u;
                if (button12 != null) {
                    button12.setEnabled(false);
                }
                expirationPicker.b();
                expirationPicker.c();
                viewGroup.addView(view2, 0);
                return view2;
        }
    }

    @Override // z1.a
    public final boolean g(View view, Object obj) {
        switch (this.f1560c) {
            case 0:
                if (view == obj) {
                }
                break;
            default:
                if (view == obj) {
                }
                break;
        }
        return false;
    }
}
