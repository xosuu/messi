package e3;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.fragment.app.w;
import b7.u;
import com.codetroopers.betterpickers.numberpicker.NumberPickerErrorTextView;
import com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout;
import com.google.android.gms.internal.ads.tp1;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import v5.l;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class j extends m implements c {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final /* synthetic */ int f12702h1 = 0;
    public TextView A0;
    public TextView B0;
    public TextView C0;
    public TextView D0;
    public TextView E0;
    public View F0;
    public RadialPickerLayout G0;
    public NumberPickerErrorTextView H0;
    public int I0;
    public int J0;
    public String K0;
    public String L0;
    public boolean M0;
    public int N0;
    public int O0;
    public Boolean P0;
    public int Q0;
    public Integer R0;
    public Integer S0;
    public Calendar T0;
    public Calendar U0;
    public char V0;
    public String W0;
    public String X0;
    public boolean Y0;
    public ArrayList Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public i f12703a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f12704b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f12705c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f12706d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f12707e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f12708f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public String f12709g1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public s8.g f12710x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public a3.a f12711y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Button f12712z0;

    public j() {
        Calendar calendar = Calendar.getInstance();
        this.O0 = calendar.get(12);
        this.N0 = calendar.get(11);
        this.Y0 = false;
        this.Q0 = R.style.h7;
    }

    public static int k0(int i10) {
        switch (i10) {
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 2;
            case 10:
                return 3;
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 6;
            case 14:
                return 7;
            case 15:
                return 8;
            case 16:
                return 9;
            default:
                return -1;
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null || !bundle.containsKey("hour_of_day") || !bundle.containsKey("minute") || !bundle.containsKey("is_24_hour_view")) {
            if (this.P0 == null) {
                this.P0 = Boolean.valueOf(DateFormat.is24HourFormat(l()));
                return;
            }
            return;
        }
        this.N0 = bundle.getInt("hour_of_day");
        this.O0 = bundle.getInt("minute");
        this.P0 = Boolean.valueOf(bundle.getBoolean("is_24_hour_view"));
        this.Y0 = bundle.getBoolean("in_kb_mode");
        this.Q0 = bundle.getInt("theme");
        if (bundle.containsKey("future_minutes_limit")) {
            this.R0 = Integer.valueOf(bundle.getInt("future_minutes_limit"));
        }
        if (bundle.containsKey("past_minutes_limit")) {
            this.S0 = Integer.valueOf(bundle.getInt("past_minutes_limit"));
        }
        if (bundle.containsKey("current_date")) {
            this.T0 = (Calendar) bundle.getSerializable("current_date");
        }
        if (bundle.containsKey("picker_date")) {
            this.U0 = (Calendar) bundle.getSerializable("picker_date");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v78 */
    @Override // androidx.fragment.app.s
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        TypedArray typedArray;
        Resources resources;
        h hVar;
        int i11;
        View view;
        ?? r02;
        w wVar;
        int i12;
        char c10;
        String str;
        Bundle bundle2 = bundle;
        if (this.f825o0) {
            this.f829s0.getWindow().requestFeature(1);
        }
        View viewInflate = layoutInflater.inflate(R.layout.e9, viewGroup, false);
        h hVar2 = new h(this);
        viewInflate.findViewById(R.id.wt).setOnKeyListener(hVar2);
        Resources resourcesR = r();
        TypedArray typedArrayObtainStyledAttributes = c().obtainStyledAttributes(this.Q0, a3.b.f18b);
        int color = typedArrayObtainStyledAttributes.getColor(9, d0.f.b(c(), R.color.a9));
        int color2 = typedArrayObtainStyledAttributes.getColor(2, d0.f.b(c(), R.color.ak));
        int color3 = typedArrayObtainStyledAttributes.getColor(5, d0.f.b(c(), R.color.ak));
        int color4 = typedArrayObtainStyledAttributes.getColor(6, d0.f.b(c(), R.color.a9));
        this.I0 = typedArrayObtainStyledAttributes.getColor(10, d0.f.b(c(), R.color.ak));
        this.J0 = typedArrayObtainStyledAttributes.getColor(11, d0.f.b(c(), R.color.s_));
        this.f12706d1 = resourcesR.getString(R.string.jo);
        this.f12707e1 = resourcesR.getString(R.string.ve);
        this.f12708f1 = resourcesR.getString(R.string.mq);
        this.f12709g1 = resourcesR.getString(R.string.vf);
        TextView textView = (TextView) viewInflate.findViewById(R.id.kb);
        this.A0 = textView;
        textView.setOnKeyListener(hVar2);
        this.B0 = (TextView) viewInflate.findViewById(R.id.ka);
        this.D0 = (TextView) viewInflate.findViewById(R.id.ny);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.nv);
        this.C0 = textView2;
        textView2.setOnKeyListener(hVar2);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.cc);
        this.E0 = textView3;
        textView3.setOnKeyListener(hVar2);
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.K0 = amPmStrings[0];
        this.L0 = amPmStrings[1];
        this.f12711y0 = new a3.a(c());
        RadialPickerLayout radialPickerLayout = (RadialPickerLayout) viewInflate.findViewById(R.id.ws);
        this.G0 = radialPickerLayout;
        radialPickerLayout.setOnValueSelectedListener(this);
        this.G0.setOnKeyListener(hVar2);
        RadialPickerLayout radialPickerLayout2 = this.G0;
        w wVarC = c();
        a3.a aVar = this.f12711y0;
        int i13 = this.N0;
        int i14 = this.O0;
        boolean zBooleanValue = this.P0.booleanValue();
        if (radialPickerLayout2.f1728q) {
            view = viewInflate;
            hVar = hVar2;
            resources = resourcesR;
            typedArray = typedArrayObtainStyledAttributes;
            i10 = color;
            i11 = color4;
            r02 = 1;
        } else {
            radialPickerLayout2.f1726f = aVar;
            radialPickerLayout2.f1731u = zBooleanValue;
            boolean z9 = radialPickerLayout2.M.isTouchExplorationEnabled() ? true : radialPickerLayout2.f1731u;
            radialPickerLayout2.f1732v = z9;
            b bVar = radialPickerLayout2.f1734x;
            i10 = color;
            if (!bVar.f12662s) {
                Resources resources2 = wVarC.getResources();
                bVar.f12657b = z9;
                if (z9) {
                    bVar.f12660h = Float.parseFloat(resources2.getString(R.string.dp));
                } else {
                    bVar.f12660h = Float.parseFloat(resources2.getString(R.string.do_res_0x7f1200a2));
                    bVar.f12661q = Float.parseFloat(resources2.getString(R.string.bi));
                }
                bVar.f12662s = true;
            }
            bVar.invalidate();
            if (radialPickerLayout2.f1732v) {
                typedArray = typedArrayObtainStyledAttributes;
            } else {
                int i15 = i13 < 12 ? 0 : 1;
                a aVar2 = radialPickerLayout2.f1735y;
                if (aVar2.f12652w) {
                    typedArray = typedArrayObtainStyledAttributes;
                } else {
                    Resources resources3 = wVarC.getResources();
                    aVar2.f12645f = resources3.getColor(R.color.ak);
                    aVar2.f12647q = resources3.getColor(R.color.a9);
                    aVar2.f12646h = resources3.getColor(R.color.a1);
                    typedArray = typedArrayObtainStyledAttributes;
                    Typeface typefaceCreate = Typeface.create(resources3.getString(R.string.us), 0);
                    Paint paint = aVar2.f12642a;
                    paint.setTypeface(typefaceCreate);
                    paint.setAntiAlias(true);
                    paint.setTextAlign(Paint.Align.CENTER);
                    aVar2.f12648s = Float.parseFloat(resources3.getString(R.string.do_res_0x7f1200a2));
                    aVar2.f12649t = Float.parseFloat(resources3.getString(R.string.bi));
                    String[] amPmStrings2 = new DateFormatSymbols().getAmPmStrings();
                    aVar2.f12650u = amPmStrings2[0];
                    aVar2.f12651v = amPmStrings2[1];
                    aVar2.setAmOrPm(i15);
                    aVar2.D = -1;
                    aVar2.f12652w = true;
                }
                aVar2.invalidate();
            }
            Resources resources4 = wVarC.getResources();
            int i16 = 12;
            int[] iArr = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            int[] iArr2 = {0, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
            int[] iArr3 = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
            resources = resourcesR;
            String[] strArr = new String[12];
            hVar = hVar2;
            String[] strArr2 = new String[12];
            i11 = color4;
            String[] strArr3 = new String[12];
            view = viewInflate;
            int i17 = 0;
            while (i17 < i16) {
                if (zBooleanValue) {
                    wVar = wVarC;
                    i12 = 1;
                    c10 = 0;
                    str = String.format("%02d", Integer.valueOf(iArr2[i17]));
                } else {
                    wVar = wVarC;
                    i12 = 1;
                    c10 = 0;
                    str = String.format("%d", Integer.valueOf(iArr[i17]));
                }
                strArr[i17] = str;
                Object[] objArr = new Object[i12];
                objArr[c10] = Integer.valueOf(iArr[i17]);
                strArr2[i17] = String.format("%d", objArr);
                Object[] objArr2 = new Object[i12];
                objArr2[c10] = Integer.valueOf(iArr3[i17]);
                strArr3[i17] = String.format("%02d", objArr2);
                i17++;
                i16 = 12;
                wVarC = wVar;
            }
            w wVar2 = wVarC;
            radialPickerLayout2.f1736z.c(resources4, strArr, zBooleanValue ? strArr2 : null, radialPickerLayout2.f1732v, true);
            radialPickerLayout2.f1736z.invalidate();
            radialPickerLayout2.A.c(resources4, strArr3, null, radialPickerLayout2.f1732v, false);
            radialPickerLayout2.A.invalidate();
            radialPickerLayout2.d(0, i13);
            radialPickerLayout2.d(1, i14);
            radialPickerLayout2.B.b(wVar2, radialPickerLayout2.f1732v, zBooleanValue, true, (i13 % 12) * 30, radialPickerLayout2.f1731u && i13 <= 12 && i13 != 0);
            radialPickerLayout2.C.b(wVar2, radialPickerLayout2.f1732v, false, false, i14 * 6, false);
            r02 = 1;
            radialPickerLayout2.f1728q = true;
            bundle2 = bundle;
        }
        int i18 = 0;
        n0((bundle2 == null || !bundle2.containsKey("current_item_showing")) ? 0 : bundle2.getInt("current_item_showing"), false, r02, r02);
        this.G0.invalidate();
        this.A0.setOnClickListener(new g(this, i18));
        this.C0.setOnClickListener(new g(this, r02));
        View view2 = view;
        ((TextView) view2.findViewById(R.id.wv)).setVisibility(8);
        NumberPickerErrorTextView numberPickerErrorTextView = (NumberPickerErrorTextView) view2.findViewById(R.id.if_res_0x7f090152);
        this.H0 = numberPickerErrorTextView;
        int i19 = 4;
        if ((this.R0 == null && this.S0 == null) ? false : true) {
            numberPickerErrorTextView.setVisibility(4);
        } else {
            numberPickerErrorTextView.setVisibility(8);
        }
        Button button = (Button) view2.findViewById(R.id.hk);
        this.f12712z0 = button;
        int i20 = i11;
        button.setTextColor(i20);
        this.f12712z0.setOnClickListener(new g(this, 2));
        this.f12712z0.setOnKeyListener(hVar);
        Button button2 = (Button) view2.findViewById(R.id.dw);
        button2.setTextColor(i20);
        button2.setOnClickListener(new g(this, 3));
        this.F0 = view2.findViewById(R.id.cb);
        if (this.P0.booleanValue()) {
            this.E0.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((TextView) view2.findViewById(R.id.tc)).setLayoutParams(layoutParams);
        } else {
            this.E0.setVisibility(0);
            r0(this.N0 < 12 ? 0 : 1);
            this.F0.setOnClickListener(new g(this, i19));
        }
        this.M0 = true;
        o0(this.N0, true);
        p0(this.O0);
        Resources resources5 = resources;
        this.W0 = resources5.getString(R.string.ye);
        this.X0 = resources5.getString(R.string.g5);
        this.V0 = this.W0.charAt(0);
        this.f12705c1 = -1;
        this.f12704b1 = -1;
        this.f12703a1 = new i(new int[0]);
        if (this.P0.booleanValue()) {
            i iVar = new i(7, 8, 9, 10, 11, 12);
            i iVar2 = new i(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            iVar.a(iVar2);
            i iVar3 = new i(7, 8);
            this.f12703a1.a(iVar3);
            i iVar4 = new i(7, 8, 9, 10, 11, 12);
            iVar3.a(iVar4);
            iVar4.a(iVar);
            iVar4.a(new i(13, 14, 15, 16));
            i iVar5 = new i(13, 14, 15, 16);
            iVar3.a(iVar5);
            iVar5.a(iVar);
            i iVar6 = new i(9);
            this.f12703a1.a(iVar6);
            i iVar7 = new i(7, 8, 9, 10);
            iVar6.a(iVar7);
            iVar7.a(iVar);
            i iVar8 = new i(11, 12);
            iVar6.a(iVar8);
            iVar8.a(iVar2);
            i iVar9 = new i(10, 11, 12, 13, 14, 15, 16);
            this.f12703a1.a(iVar9);
            iVar9.a(iVar);
        } else {
            i iVar10 = new i(i0(0), i0(1));
            i iVar11 = new i(8);
            this.f12703a1.a(iVar11);
            iVar11.a(iVar10);
            i iVar12 = new i(7, 8, 9);
            iVar11.a(iVar12);
            iVar12.a(iVar10);
            i iVar13 = new i(7, 8, 9, 10, 11, 12);
            iVar12.a(iVar13);
            iVar13.a(iVar10);
            i iVar14 = new i(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            iVar13.a(iVar14);
            iVar14.a(iVar10);
            i iVar15 = new i(13, 14, 15, 16);
            iVar12.a(iVar15);
            iVar15.a(iVar10);
            i iVar16 = new i(10, 11, 12);
            iVar11.a(iVar16);
            i iVar17 = new i(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            iVar16.a(iVar17);
            iVar17.a(iVar10);
            i iVar18 = new i(9, 10, 11, 12, 13, 14, 15, 16);
            this.f12703a1.a(iVar18);
            iVar18.a(iVar10);
            i iVar19 = new i(7, 8, 9, 10, 11, 12);
            iVar18.a(iVar19);
            i iVar20 = new i(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            iVar19.a(iVar20);
            iVar20.a(iVar10);
        }
        if (this.Y0) {
            this.Z0 = bundle2.getIntegerArrayList("typed_times");
            q0(-1);
            this.A0.invalidate();
        } else if (this.Z0 == null) {
            this.Z0 = new ArrayList();
        }
        this.G0.setTheme(typedArray);
        int i21 = i10;
        view2.findViewById(R.id.wq).setBackgroundColor(i21);
        view2.findViewById(R.id.q9).setBackgroundColor(color3);
        view2.findViewById(R.id.wp).setBackgroundColor(i21);
        view2.findViewById(R.id.wu).setBackgroundColor(i21);
        ((TextView) view2.findViewById(R.id.tc)).setTextColor(this.J0);
        ((TextView) view2.findViewById(R.id.cc)).setTextColor(this.J0);
        this.G0.setBackgroundColor(color2);
        return view2;
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.Q = true;
        a3.a aVar = this.f12711y0;
        aVar.f13c = null;
        aVar.f11a.getContentResolver().unregisterContentObserver(aVar.f12b);
    }

    @Override // androidx.fragment.app.s
    public final void J() {
        this.Q = true;
        this.f12711y0.a();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void K(Bundle bundle) {
        RadialPickerLayout radialPickerLayout = this.G0;
        if (radialPickerLayout != null) {
            bundle.putInt("hour_of_day", radialPickerLayout.getHours());
            bundle.putInt("minute", this.G0.getMinutes());
            bundle.putBoolean("is_24_hour_view", this.P0.booleanValue());
            bundle.putInt("current_item_showing", this.G0.getCurrentItemShowing());
            bundle.putBoolean("in_kb_mode", this.Y0);
            Integer num = this.R0;
            if (num != null) {
                bundle.putInt("future_minutes_limit", num.intValue());
            }
            Integer num2 = this.S0;
            if (num2 != null) {
                bundle.putInt("past_minutes_limit", num2.intValue());
            }
            bundle.putSerializable("current_date", this.T0);
            bundle.putSerializable("picker_date", this.U0);
            if (this.Y0) {
                bundle.putIntegerArrayList("typed_times", this.Z0);
            }
            bundle.putInt("theme", this.Q0);
        }
    }

    public final boolean e0(int i10) {
        if ((this.P0.booleanValue() && this.Z0.size() == 4) || (!this.P0.booleanValue() && l0())) {
            return false;
        }
        this.Z0.add(Integer.valueOf(i10));
        i iVar = this.f12703a1;
        Iterator it = this.Z0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            ArrayList<i> arrayList = iVar.f12701b;
            if (arrayList == null) {
                iVar = null;
            } else {
                for (i iVar2 : arrayList) {
                    int i11 = 0;
                    while (true) {
                        int[] iArr = iVar2.f12700a;
                        if (i11 < iArr.length) {
                            if (iArr[i11] == iIntValue) {
                                iVar = iVar2;
                                break;
                            }
                            i11++;
                        }
                    }
                }
                iVar = null;
            }
            if (iVar == null) {
                f0();
                return false;
            }
        }
        u.B(this.G0, String.format("%d", Integer.valueOf(k0(i10))));
        if (l0()) {
            if (!this.P0.booleanValue() && this.Z0.size() <= 3) {
                ArrayList arrayList2 = this.Z0;
                arrayList2.add(arrayList2.size() - 1, 7);
                ArrayList arrayList3 = this.Z0;
                arrayList3.add(arrayList3.size() - 1, 7);
            }
            this.f12712z0.setEnabled(true);
        }
        return true;
    }

    public final int f0() {
        int iIntValue = ((Integer) this.Z0.remove(r0.size() - 1)).intValue();
        if (!l0()) {
            this.f12712z0.setEnabled(false);
        }
        return iIntValue;
    }

    public final void g0() {
        if (this.U0 != null && this.T0 != null && this.R0 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.U0.getTime());
            calendar.set(11, this.G0.getHours());
            calendar.set(12, this.G0.getMinutes());
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(this.T0.getTime());
            calendar2.add(12, this.R0.intValue());
            if (calendar.compareTo(calendar2) > 0) {
                NumberPickerErrorTextView numberPickerErrorTextView = this.H0;
                if (numberPickerErrorTextView != null) {
                    numberPickerErrorTextView.setText(v(R.string.me));
                    NumberPickerErrorTextView numberPickerErrorTextView2 = this.H0;
                    numberPickerErrorTextView2.f1715b.removeCallbacks(numberPickerErrorTextView2.f1714a);
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(numberPickerErrorTextView2.getContext(), android.R.anim.fade_in);
                    animationLoadAnimation.setAnimationListener(new d3.a(numberPickerErrorTextView2, 0));
                    numberPickerErrorTextView2.startAnimation(animationLoadAnimation);
                    return;
                }
                return;
            }
        }
        if (this.U0 != null && this.T0 != null && this.S0 != null) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(this.U0.getTime());
            calendar3.set(11, this.G0.getHours());
            calendar3.set(12, this.G0.getMinutes());
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(this.T0.getTime());
            calendar4.add(12, -this.S0.intValue());
            if (calendar3.compareTo(calendar4) < 0) {
                NumberPickerErrorTextView numberPickerErrorTextView3 = this.H0;
                if (numberPickerErrorTextView3 != null) {
                    numberPickerErrorTextView3.setText(v(R.string.mo));
                    NumberPickerErrorTextView numberPickerErrorTextView4 = this.H0;
                    numberPickerErrorTextView4.f1715b.removeCallbacks(numberPickerErrorTextView4.f1714a);
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(numberPickerErrorTextView4.getContext(), android.R.anim.fade_in);
                    animationLoadAnimation2.setAnimationListener(new d3.a(numberPickerErrorTextView4, 0));
                    numberPickerErrorTextView4.startAnimation(animationLoadAnimation2);
                    return;
                }
                return;
            }
        }
        s8.g gVar = this.f12710x0;
        if (gVar != null) {
            int hours = this.G0.getHours();
            int minutes = this.G0.getMinutes();
            RequestBlock requestBlock = gVar.f16753a;
            CheckBox checkBox = requestBlock.f17200i0;
            StringBuilder sb = new StringBuilder("Expired ");
            Locale locale = Locale.US;
            int i10 = gVar.f16754b;
            sb.append(String.format(locale, "%02d", Integer.valueOf(i10)));
            sb.append("/");
            int i11 = gVar.f16755c + 1;
            sb.append(String.format(locale, "%02d", Integer.valueOf(i11)));
            sb.append("/");
            int i12 = gVar.f16756d;
            sb.append(i12);
            sb.append(" ");
            sb.append(String.format(locale, "%02d", Integer.valueOf(hours)));
            sb.append(":");
            sb.append(String.format(locale, "%02d", Integer.valueOf(minutes)));
            checkBox.setText(sb.toString());
            requestBlock.U0 = i12 + "-" + String.format(locale, "%02d", Integer.valueOf(i11)) + "-" + String.format(locale, "%02d", Integer.valueOf(i10)) + " " + String.format(locale, "%02d", Integer.valueOf(hours)) + ":" + String.format(locale, "%02d", Integer.valueOf(minutes));
        }
        Z(false, false);
    }

    public final void h0(boolean z9) {
        this.Y0 = false;
        if (!this.Z0.isEmpty()) {
            int[] iArrJ0 = j0(null);
            RadialPickerLayout radialPickerLayout = this.G0;
            int i10 = iArrJ0[0];
            int i11 = iArrJ0[1];
            radialPickerLayout.c(0, i10);
            radialPickerLayout.c(1, i11);
            if (!this.P0.booleanValue()) {
                this.G0.setAmOrPm(iArrJ0[2]);
            }
            this.Z0.clear();
        }
        if (z9) {
            s0(false);
            RadialPickerLayout radialPickerLayout2 = this.G0;
            boolean z10 = radialPickerLayout2.I;
            radialPickerLayout2.F = true;
            radialPickerLayout2.D.setVisibility(4);
        }
    }

    public final int i0(int i10) {
        if (this.f12704b1 == -1 || this.f12705c1 == -1) {
            KeyCharacterMap keyCharacterMapLoad = KeyCharacterMap.load(-1);
            int i11 = 0;
            while (true) {
                if (i11 >= Math.max(this.K0.length(), this.L0.length())) {
                    break;
                }
                char cCharAt = this.K0.toLowerCase(Locale.getDefault()).charAt(i11);
                char cCharAt2 = this.L0.toLowerCase(Locale.getDefault()).charAt(i11);
                if (cCharAt != cCharAt2) {
                    KeyEvent[] events = keyCharacterMapLoad.getEvents(new char[]{cCharAt, cCharAt2});
                    if (events != null && events.length == 4) {
                        this.f12704b1 = events[0].getKeyCode();
                        this.f12705c1 = events[2].getKeyCode();
                    }
                } else {
                    i11++;
                }
            }
        }
        if (i10 == 0) {
            return this.f12704b1;
        }
        if (i10 == 1) {
            return this.f12705c1;
        }
        return -1;
    }

    public final int[] j0(Boolean[] boolArr) {
        int i10;
        int i11;
        int i12 = -1;
        if (this.P0.booleanValue() || !l0()) {
            i10 = -1;
            i11 = 1;
        } else {
            ArrayList arrayList = this.Z0;
            int iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            i10 = iIntValue == i0(0) ? 0 : iIntValue == i0(1) ? 1 : -1;
            i11 = 2;
        }
        int i13 = -1;
        for (int i14 = i11; i14 <= this.Z0.size(); i14++) {
            ArrayList arrayList2 = this.Z0;
            int iK0 = k0(((Integer) arrayList2.get(arrayList2.size() - i14)).intValue());
            if (i14 == i11) {
                i13 = iK0;
            } else if (i14 == i11 + 1) {
                int i15 = (iK0 * 10) + i13;
                if (boolArr != null && iK0 == 0) {
                    boolArr[1] = Boolean.TRUE;
                }
                i13 = i15;
            } else if (i14 == i11 + 2) {
                i12 = iK0;
            } else if (i14 == i11 + 3) {
                int i16 = (iK0 * 10) + i12;
                if (boolArr != null && iK0 == 0) {
                    boolArr[0] = Boolean.TRUE;
                }
                i12 = i16;
            }
        }
        return new int[]{i12, i13, i10};
    }

    public final boolean l0() {
        int i10;
        if (!this.P0.booleanValue()) {
            return this.Z0.contains(Integer.valueOf(i0(0))) || this.Z0.contains(Integer.valueOf(i0(1)));
        }
        int[] iArrJ0 = j0(null);
        return iArrJ0[0] >= 0 && (i10 = iArrJ0[1]) >= 0 && i10 < 60;
    }

    public final void m0(int i10, int i11, boolean z9) {
        if (this.R0 != null || this.S0 != null) {
            NumberPickerErrorTextView numberPickerErrorTextView = this.H0;
            numberPickerErrorTextView.f1715b.removeCallbacks(numberPickerErrorTextView.f1714a);
            numberPickerErrorTextView.setVisibility(4);
        }
        if (i10 == 0) {
            o0(i11, false);
            String str = String.format("%d", Integer.valueOf(i11));
            if (this.M0 && z9) {
                n0(1, true, true, false);
                str = str + ". " + this.f12709g1;
            } else {
                this.G0.setContentDescription(this.f12706d1 + ": " + i11);
            }
            u.B(this.G0, str);
            return;
        }
        if (i10 == 1) {
            p0(i11);
            this.G0.setContentDescription(this.f12708f1 + ": " + i11);
            return;
        }
        if (i10 == 2) {
            r0(i11);
        } else if (i10 == 3) {
            if (!l0()) {
                this.Z0.clear();
            }
            h0(true);
        }
    }

    public final void n0(int i10, boolean z9, boolean z10, boolean z11) {
        TextView textView;
        RadialPickerLayout radialPickerLayout = this.G0;
        radialPickerLayout.getClass();
        if (i10 == 0 || i10 == 1) {
            int currentItemShowing = radialPickerLayout.getCurrentItemShowing();
            radialPickerLayout.f1733w = i10;
            e eVar = radialPickerLayout.C;
            f fVar = radialPickerLayout.A;
            e eVar2 = radialPickerLayout.B;
            f fVar2 = radialPickerLayout.f1736z;
            if (!z9 || i10 == currentItemShowing) {
                int i11 = i10 == 0 ? 255 : 0;
                int i12 = i10 == 1 ? 255 : 0;
                float f10 = i11;
                tp1.p(fVar2, f10);
                tp1.p(eVar2, f10);
                float f11 = i12;
                tp1.p(fVar, f11);
                tp1.p(eVar, f11);
            } else {
                l[] lVarArr = new l[4];
                if (i10 == 1) {
                    lVarArr[0] = fVar2.getDisappearAnimator();
                    lVarArr[1] = eVar2.getDisappearAnimator();
                    lVarArr[2] = fVar.getReappearAnimator();
                    lVarArr[3] = eVar.getReappearAnimator();
                } else if (i10 == 0) {
                    lVarArr[0] = fVar2.getReappearAnimator();
                    lVarArr[1] = eVar2.getReappearAnimator();
                    lVarArr[2] = fVar.getDisappearAnimator();
                    lVarArr[3] = eVar.getDisappearAnimator();
                }
                v5.g gVar = radialPickerLayout.N;
                if (gVar != null && gVar.d()) {
                    radialPickerLayout.N.c();
                }
                v5.g gVar2 = new v5.g();
                gVar2.f17822b = new ArrayList();
                gVar2.f17823d = new HashMap();
                gVar2.f17824f = new ArrayList();
                gVar2.f17825h = new ArrayList();
                f.f fVar3 = null;
                gVar2.f17827s = null;
                gVar2.f17828t = false;
                gVar2.f17829u = false;
                radialPickerLayout.N = gVar2;
                gVar2.f17826q = true;
                l lVar = lVarArr[0];
                if (lVar != null) {
                    gVar2.f17826q = true;
                    fVar3 = new f.f(gVar2, lVar);
                }
                for (int i13 = 1; i13 < 4; i13++) {
                    l lVar2 = lVarArr[i13];
                    v5.f fVar4 = (v5.f) ((v5.g) fVar3.f12833d).f17823d.get(lVar2);
                    if (fVar4 == null) {
                        fVar4 = new v5.f(lVar2);
                        ((v5.g) fVar3.f12833d).f17823d.put(lVar2, fVar4);
                        ((v5.g) fVar3.f12833d).f17824f.add(fVar4);
                    }
                    fVar4.a(new v5.d((v5.f) fVar3.f12832b, 0));
                }
                radialPickerLayout.N.f();
            }
        }
        if (i10 == 0) {
            int hours = this.G0.getHours();
            if (!this.P0.booleanValue()) {
                hours %= 12;
            }
            this.G0.setContentDescription(this.f12706d1 + ": " + hours);
            if (z11) {
                u.B(this.G0, this.f12707e1);
            }
            textView = this.A0;
        } else {
            int minutes = this.G0.getMinutes();
            this.G0.setContentDescription(this.f12708f1 + ": " + minutes);
            if (z11) {
                u.B(this.G0, this.f12709g1);
            }
            textView = this.C0;
        }
        int i14 = i10 == 0 ? this.I0 : this.J0;
        int i15 = i10 == 1 ? this.I0 : this.J0;
        this.A0.setTextColor(i14);
        this.C0.setTextColor(i15);
        l lVarP = u.p(textView, 0.85f, 1.1f);
        if (z10) {
            lVarP.f17879x = 300L;
        }
        lVarP.f();
    }

    public final void o0(int i10, boolean z9) {
        String str;
        if (this.P0.booleanValue()) {
            str = "%02d";
        } else {
            i10 %= 12;
            str = "%d";
            if (i10 == 0) {
                i10 = 12;
            }
        }
        String str2 = String.format(str, Integer.valueOf(i10));
        this.A0.setText(str2);
        this.B0.setText(str2);
        if (z9) {
            u.B(this.G0, str2);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final void p0(int i10) {
        if (i10 == 60) {
            i10 = 0;
        }
        String str = String.format(Locale.getDefault(), "%02d", Integer.valueOf(i10));
        u.B(this.G0, str);
        this.C0.setText(str);
        this.D0.setText(str);
    }

    public final void q0(int i10) {
        RadialPickerLayout radialPickerLayout = this.G0;
        if (radialPickerLayout.I) {
            return;
        }
        radialPickerLayout.F = false;
        radialPickerLayout.D.setVisibility(0);
        if (i10 == -1 || e0(i10)) {
            this.Y0 = true;
            this.f12712z0.setEnabled(false);
            s0(false);
        }
    }

    public final void r0(int i10) {
        if (i10 == 0) {
            this.E0.setText(this.K0);
            u.B(this.G0, this.K0);
            this.F0.setContentDescription(this.K0);
        } else {
            if (i10 != 1) {
                this.E0.setText(this.W0);
                return;
            }
            this.E0.setText(this.L0);
            u.B(this.G0, this.L0);
            this.F0.setContentDescription(this.L0);
        }
    }

    public final void s0(boolean z9) {
        if (!z9 && this.Z0.isEmpty()) {
            int hours = this.G0.getHours();
            int minutes = this.G0.getMinutes();
            o0(hours, true);
            p0(minutes);
            if (!this.P0.booleanValue()) {
                r0(hours >= 12 ? 1 : 0);
            }
            n0(this.G0.getCurrentItemShowing(), true, true, true);
            this.f12712z0.setEnabled(true);
            return;
        }
        Boolean bool = Boolean.FALSE;
        Boolean[] boolArr = {bool, bool};
        int[] iArrJ0 = j0(boolArr);
        String str = boolArr[0].booleanValue() ? "%02d" : "%2d";
        String str2 = boolArr[1].booleanValue() ? "%02d" : "%2d";
        int i10 = iArrJ0[0];
        String strReplace = i10 == -1 ? this.W0 : String.format(str, Integer.valueOf(i10)).replace(' ', this.V0);
        int i11 = iArrJ0[1];
        String strReplace2 = i11 == -1 ? this.W0 : String.format(str2, Integer.valueOf(i11)).replace(' ', this.V0);
        this.A0.setText(strReplace);
        this.B0.setText(strReplace);
        this.A0.setTextColor(this.J0);
        this.C0.setText(strReplace2);
        this.D0.setText(strReplace2);
        this.C0.setTextColor(this.J0);
        if (this.P0.booleanValue()) {
            return;
        }
        r0(iArrJ0[2]);
    }
}
