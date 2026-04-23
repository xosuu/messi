package com.codetroopers.betterpickers.datepicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import com.google.android.gms.ads.RequestConfiguration;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class DatePicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {
    public static int S = -1;
    public static int T = -1;
    public static int U = -1;
    public UnderlinePageIndicatorPicker A;
    public ViewPager B;
    public ImageButton C;
    public DateView D;
    public final String[] E;
    public final Context F;
    public final char[] G;
    public Button H;
    public boolean I;
    public View J;
    public ColorStateList K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1624b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1625d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1626f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1627h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1628q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button[] f1630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button[] f1631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button[] f1632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f1633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Button f1634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Button f1635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageButton f1636z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1638b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f1639d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f1640f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1641h;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1637a);
            parcel.writeInt(this.f1638b);
            parcel.writeIntArray(this.f1639d);
            parcel.writeIntArray(this.f1640f);
            parcel.writeInt(this.f1641h);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1623a = 2;
        this.f1624b = 4;
        this.f1625d = -1;
        this.f1626f = new int[2];
        this.f1627h = new int[4];
        this.f1628q = -1;
        this.f1629s = -1;
        this.f1630t = new Button[12];
        this.f1631u = new Button[10];
        this.f1632v = new Button[10];
        this.I = false;
        this.R = -1;
        this.F = context;
        this.G = DateFormat.getDateFormatOrder(context);
        this.E = b();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.K = getResources().getColorStateList(R.color.da);
        this.L = R.drawable.g_;
        this.M = R.drawable.d2;
        this.N = getResources().getColor(R.color.c1);
        this.O = getResources().getColor(R.color.c3);
        this.Q = R.drawable.e_;
        this.P = R.drawable.eh;
    }

    public static String[] b() {
        Locale locale = Locale.getDefault();
        boolean z9 = locale != null;
        SimpleDateFormat simpleDateFormat = z9 ? new SimpleDateFormat("MMM", locale) : new SimpleDateFormat("MMM");
        GregorianCalendar gregorianCalendar = z9 ? new GregorianCalendar(locale) : new GregorianCalendar();
        gregorianCalendar.set(1, 0);
        gregorianCalendar.set(5, 1);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        String[] strArr = new String[12];
        for (int i10 = 0; i10 < 12; i10++) {
            gregorianCalendar.set(2, i10);
            strArr[i10] = simpleDateFormat.format(gregorianCalendar.getTime()).toUpperCase();
        }
        return strArr;
    }

    private void setDateKeyRange(int i10) {
        int i11 = 0;
        while (true) {
            Button[] buttonArr = this.f1631u;
            if (i11 >= buttonArr.length) {
                return;
            }
            Button button = buttonArr[i11];
            if (button != null) {
                button.setEnabled(i11 <= i10);
            }
            i11++;
        }
    }

    private void setDateMinKeyRange(int i10) {
        int i11 = 0;
        while (true) {
            Button[] buttonArr = this.f1631u;
            if (i11 >= buttonArr.length) {
                return;
            }
            Button button = buttonArr[i11];
            if (button != null) {
                button.setEnabled(i11 >= i10);
            }
            i11++;
        }
    }

    private void setYearKeyRange(int i10) {
        int i11 = 0;
        while (true) {
            Button[] buttonArr = this.f1632v;
            if (i11 >= buttonArr.length) {
                return;
            }
            Button button = buttonArr[i11];
            if (button != null) {
                button.setEnabled(i11 <= i10);
            }
            i11++;
        }
    }

    private void setYearMinKeyRange(int i10) {
        int i11 = 0;
        while (true) {
            Button[] buttonArr = this.f1632v;
            if (i11 >= buttonArr.length) {
                return;
            }
            Button button = buttonArr[i11];
            if (button != null) {
                button.setEnabled(i11 >= i10);
            }
            i11++;
        }
    }

    public final void a() {
        Button button = this.H;
        if (button == null) {
            return;
        }
        button.setEnabled(getDayOfMonth() > 0 && (this.I || getYear() > 0) && getMonthOfYear() >= 0);
    }

    public final void c() {
        Button button = this.f1633w;
        if (button != null) {
            button.setEnabled(false);
        }
        ImageButton imageButton = this.f1636z;
        if (imageButton != null) {
            imageButton.setEnabled(getDayOfMonth() > 0);
        }
        Button button2 = this.f1634x;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        Button button3 = this.f1635y;
        if (button3 != null) {
            button3.setEnabled(false);
        }
    }

    public final void d() {
        int i10 = this.f1625d;
        String str = i10 < 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.E[i10];
        DateView dateView = this.D;
        int dayOfMonth = getDayOfMonth();
        int year = getYear();
        if (dateView.f1642a != null) {
            if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                dateView.f1642a.setText("-");
                dateView.f1642a.setTypeface(dateView.f1645f);
                dateView.f1642a.setEnabled(false);
                dateView.f1642a.a();
            } else {
                dateView.f1642a.setText(str);
                dateView.f1642a.setTypeface(dateView.f1646h);
                dateView.f1642a.setEnabled(true);
                dateView.f1642a.b();
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = dateView.f1643b;
        if (zeroTopPaddingTextView != null) {
            if (dayOfMonth <= 0) {
                zeroTopPaddingTextView.setText("-");
                dateView.f1643b.setEnabled(false);
                dateView.f1643b.a();
            } else {
                zeroTopPaddingTextView.setText(Integer.toString(dayOfMonth));
                dateView.f1643b.setEnabled(true);
                dateView.f1643b.a();
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = dateView.f1644d;
        if (zeroTopPaddingTextView2 != null) {
            if (year <= 0) {
                zeroTopPaddingTextView2.setText("----");
                dateView.f1644d.setEnabled(false);
                dateView.f1644d.a();
            } else {
                String string = Integer.toString(year);
                while (string.length() < 4) {
                    string = "-".concat(string);
                }
                dateView.f1644d.setText(string);
                dateView.f1644d.setEnabled(true);
                dateView.f1644d.a();
            }
        }
    }

    public final void e() {
        Button[] buttonArr;
        Button button;
        ImageButton imageButton = this.f1636z;
        if (imageButton != null) {
            imageButton.setEnabled(getDayOfMonth() > 0);
        }
        d();
        a();
        boolean z9 = (this.f1625d == -1 && this.f1628q == -1 && this.f1629s == -1) ? false : true;
        ImageButton imageButton2 = this.C;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z9);
        }
        int dayOfMonth = getDayOfMonth();
        int i10 = 0;
        while (true) {
            buttonArr = this.f1630t;
            if (i10 >= buttonArr.length) {
                break;
            }
            Button button2 = buttonArr[i10];
            if (button2 != null) {
                button2.setEnabled(true);
            }
            i10++;
        }
        if (dayOfMonth > 29 && (button = buttonArr[1]) != null) {
            button.setEnabled(false);
        }
        if (dayOfMonth > 30) {
            Button button3 = buttonArr[3];
            if (button3 != null) {
                button3.setEnabled(false);
            }
            Button button4 = buttonArr[5];
            if (button4 != null) {
                button4.setEnabled(false);
            }
            Button button5 = buttonArr[8];
            if (button5 != null) {
                button5.setEnabled(false);
            }
            Button button6 = buttonArr[10];
            if (button6 != null) {
                button6.setEnabled(false);
            }
        }
        int dayOfMonth2 = getDayOfMonth();
        if (dayOfMonth2 >= 4) {
            setDateKeyRange(-1);
        } else if (dayOfMonth2 >= 3) {
            int i11 = this.f1625d;
            if (i11 == 1) {
                setDateKeyRange(-1);
            } else if (i11 == 3 || i11 == 5 || i11 == 8 || i11 == 10) {
                setDateKeyRange(0);
            } else {
                setDateKeyRange(1);
            }
        } else if (dayOfMonth2 < 2 && dayOfMonth2 < 1) {
            setDateMinKeyRange(1);
        } else {
            setDateKeyRange(9);
        }
        int year = getYear();
        if (year >= 1000) {
            setYearKeyRange(-1);
        } else if (year >= 1) {
            setYearKeyRange(9);
        } else {
            setYearMinKeyRange(1);
        }
    }

    public int getDayOfMonth() {
        int[] iArr = this.f1626f;
        return (iArr[1] * 10) + iArr[0];
    }

    public int getLayoutId() {
        return R.layout.b3;
    }

    public int getMonthOfYear() {
        return this.f1625d;
    }

    public int getYear() {
        int[] iArr = this.f1627h;
        return (iArr[1] * 10) + (iArr[2] * 100) + (iArr[3] * 1000) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z9 = true;
        view.performHapticFeedback(1);
        if (view == this.C) {
            char c10 = this.G[this.B.getCurrentItem()];
            if (c10 != 'M') {
                if (c10 != 'd') {
                    if (c10 == 'y') {
                        if (this.f1629s >= 0) {
                            int i12 = 0;
                            while (true) {
                                i11 = this.f1629s;
                                if (i12 >= i11) {
                                    break;
                                }
                                int[] iArr = this.f1627h;
                                int i13 = i12 + 1;
                                iArr[i12] = iArr[i13];
                                i12 = i13;
                            }
                            this.f1627h[i11] = 0;
                            this.f1629s = i11 - 1;
                        } else if (this.B.getCurrentItem() > 0) {
                            ViewPager viewPager = this.B;
                            viewPager.y(viewPager.getCurrentItem() - 1);
                        }
                    }
                } else if (this.f1628q >= 0) {
                    int i14 = 0;
                    while (true) {
                        i10 = this.f1628q;
                        if (i14 >= i10) {
                            break;
                        }
                        int[] iArr2 = this.f1626f;
                        int i15 = i14 + 1;
                        iArr2[i14] = iArr2[i15];
                        i14 = i15;
                    }
                    this.f1626f[i10] = 0;
                    this.f1628q = i10 - 1;
                } else if (this.B.getCurrentItem() > 0) {
                    ViewPager viewPager2 = this.B;
                    viewPager2.y(viewPager2.getCurrentItem() - 1);
                }
            } else if (this.f1625d != -1) {
                this.f1625d = -1;
            }
        } else if (view == this.f1636z) {
            if (this.B.getCurrentItem() < 2) {
                ViewPager viewPager3 = this.B;
                viewPager3.y(viewPager3.getCurrentItem() + 1);
            }
        } else if (view == this.D.getDate()) {
            this.B.setCurrentItem(T);
        } else if (view == this.D.getMonth()) {
            this.B.setCurrentItem(S);
        } else if (view == this.D.getYear()) {
            this.B.setCurrentItem(U);
        } else if (view.getTag(R.id.gi).equals("month")) {
            this.f1625d = ((Integer) view.getTag(R.id.gj)).intValue();
            if (this.B.getCurrentItem() < 2) {
                ViewPager viewPager4 = this.B;
                viewPager4.y(viewPager4.getCurrentItem() + 1);
            }
        } else if (view.getTag(R.id.gi).equals("date")) {
            int iIntValue = ((Integer) view.getTag(R.id.q4)).intValue();
            int i16 = this.f1628q;
            if (i16 < this.f1623a - 1) {
                while (i16 >= 0) {
                    int[] iArr3 = this.f1626f;
                    iArr3[i16 + 1] = iArr3[i16];
                    i16--;
                }
                this.f1628q++;
                this.f1626f[0] = iIntValue;
            }
            if ((getDayOfMonth() >= 4 || (getMonthOfYear() == 1 && getDayOfMonth() >= 3)) && this.B.getCurrentItem() < 2) {
                ViewPager viewPager5 = this.B;
                viewPager5.y(viewPager5.getCurrentItem() + 1);
            }
        } else if (view.getTag(R.id.gi).equals("year")) {
            int iIntValue2 = ((Integer) view.getTag(R.id.q4)).intValue();
            int i17 = this.f1629s;
            if (i17 < this.f1624b - 1) {
                while (i17 >= 0) {
                    int[] iArr4 = this.f1627h;
                    iArr4[i17 + 1] = iArr4[i17];
                    i17--;
                }
                this.f1629s++;
                this.f1627h[0] = iIntValue2;
            }
            if (getYear() >= 1000 && this.B.getCurrentItem() < 2) {
                ViewPager viewPager6 = this.B;
                viewPager6.y(viewPager6.getCurrentItem() + 1);
            }
        }
        e();
        if (this.f1625d == -1 && this.f1628q == -1 && this.f1629s == -1) {
            z9 = false;
        }
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.J = findViewById(R.id.hh);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1626f;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f1627h;
            if (i11 >= iArr2.length) {
                this.A = (UnderlinePageIndicatorPicker) findViewById(R.id.lf);
                ViewPager viewPager = (ViewPager) findViewById(R.id.lg);
                this.B = viewPager;
                viewPager.setOffscreenPageLimit(2);
                this.B.setAdapter(new c3.a(this, (LayoutInflater) this.F.getSystemService("layout_inflater"), 0));
                this.A.setViewPager(this.B);
                this.B.setCurrentItem(0);
                DateView dateView = (DateView) findViewById(R.id.gr);
                this.D = dateView;
                dateView.setTheme(this.R);
                this.D.setUnderlinePage(this.A);
                this.D.setOnClick(this);
                ImageButton imageButton = (ImageButton) findViewById(R.id.gz);
                this.C = imageButton;
                imageButton.setOnClickListener(this);
                this.C.setOnLongClickListener(this);
                c();
                d();
                e();
                return;
            }
            iArr2[i11] = 0;
            i11++;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.C;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i10 = 0; i10 < this.f1623a; i10++) {
            this.f1626f[i10] = 0;
        }
        for (int i11 = 0; i11 < this.f1624b; i11++) {
            this.f1627h[i11] = 0;
        }
        this.f1628q = -1;
        this.f1629s = -1;
        this.f1625d = -1;
        this.B.y(0);
        d();
        e();
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1628q = savedState.f1637a;
        this.f1629s = savedState.f1638b;
        int[] iArr = savedState.f1639d;
        this.f1626f = iArr;
        int[] iArr2 = savedState.f1640f;
        this.f1627h = iArr2;
        if (iArr == null) {
            this.f1626f = new int[this.f1623a];
            this.f1628q = -1;
        }
        if (iArr2 == null) {
            this.f1627h = new int[this.f1624b];
            this.f1629s = -1;
        }
        this.f1625d = savedState.f1641h;
        e();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1641h = this.f1625d;
        savedState.f1639d = this.f1626f;
        savedState.f1637a = this.f1628q;
        savedState.f1640f = this.f1627h;
        savedState.f1638b = this.f1629s;
        return savedState;
    }

    public void setSetButton(Button button) {
        this.H = button;
        a();
    }

    public void setTheme(int i10) {
        this.R = i10;
        if (i10 != -1) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i10, b.f17a);
            this.K = typedArrayObtainStyledAttributes.getColorStateList(7);
            this.L = typedArrayObtainStyledAttributes.getResourceId(5, this.L);
            this.M = typedArrayObtainStyledAttributes.getResourceId(0, this.M);
            this.P = typedArrayObtainStyledAttributes.getResourceId(1, this.P);
            this.N = typedArrayObtainStyledAttributes.getColor(9, this.N);
            this.O = typedArrayObtainStyledAttributes.getColor(6, this.O);
            this.Q = typedArrayObtainStyledAttributes.getResourceId(2, this.Q);
        }
        for (Button button : this.f1630t) {
            if (button != null) {
                button.setTextColor(this.K);
                button.setBackgroundResource(this.L);
            }
        }
        for (Button button2 : this.f1631u) {
            if (button2 != null) {
                button2.setTextColor(this.K);
                button2.setBackgroundResource(this.L);
            }
        }
        for (Button button3 : this.f1632v) {
            if (button3 != null) {
                button3.setTextColor(this.K);
                button3.setBackgroundResource(this.L);
            }
        }
        UnderlinePageIndicatorPicker underlinePageIndicatorPicker = this.A;
        if (underlinePageIndicatorPicker != null) {
            underlinePageIndicatorPicker.setSelectedColor(this.O);
        }
        View view = this.J;
        if (view != null) {
            view.setBackgroundColor(this.N);
        }
        Button button4 = this.f1633w;
        if (button4 != null) {
            button4.setTextColor(this.K);
            this.f1633w.setBackgroundResource(this.L);
        }
        ImageButton imageButton = this.f1636z;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.L);
            this.f1636z.setImageDrawable(getResources().getDrawable(this.P));
        }
        ImageButton imageButton2 = this.C;
        if (imageButton2 != null) {
            imageButton2.setBackgroundResource(this.M);
            this.C.setImageDrawable(getResources().getDrawable(this.Q));
        }
        Button button5 = this.f1634x;
        if (button5 != null) {
            button5.setTextColor(this.K);
            this.f1634x.setBackgroundResource(this.L);
        }
        Button button6 = this.f1635y;
        if (button6 != null) {
            button6.setTextColor(this.K);
            this.f1635y.setBackgroundResource(this.L);
        }
        DateView dateView = this.D;
        if (dateView != null) {
            dateView.setTheme(this.R);
        }
    }

    public void setYearOptional(boolean z9) {
        this.I = z9;
    }
}
