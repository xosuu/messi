package com.codetroopers.betterpickers.expirationpicker;

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
import com.codetroopers.betterpickers.datepicker.DatePicker;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Calendar;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ExpirationPicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {
    public static int K = -1;
    public static int L = -1;
    public Button A;
    public View B;
    public ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1650b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1651d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1652f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1653h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Button[] f1654q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button[] f1655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Button f1656t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Button f1657u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public UnderlinePageIndicatorPicker f1658v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewPager f1659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageButton f1660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ExpirationView f1661y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f1662z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f1664b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1665d;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1663a);
            parcel.writeIntArray(this.f1664b);
            parcel.writeInt(this.f1665d);
        }
    }

    public ExpirationPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1649a = 4;
        this.f1650b = -1;
        this.f1651d = new int[4];
        this.f1652f = -1;
        this.f1654q = new Button[12];
        this.f1655s = new Button[10];
        this.J = -1;
        this.f1662z = context;
        DateFormat.getDateFormatOrder(context);
        DatePicker.b();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.C = getResources().getColorStateList(R.color.da);
        this.D = R.drawable.g_;
        this.E = R.drawable.d2;
        this.F = getResources().getColor(R.color.c1);
        this.G = getResources().getColor(R.color.c3);
        this.I = R.drawable.e_;
        this.H = R.drawable.eh;
        this.f1653h = Calendar.getInstance().get(1);
    }

    private void setYearKeyRange(int i10) {
        int i11 = 0;
        while (true) {
            Button[] buttonArr = this.f1655s;
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
            Button[] buttonArr = this.f1655s;
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

    public final void a(int i10) {
        int i11 = this.f1652f;
        if (i11 < this.f1649a - 1) {
            while (i11 >= 0) {
                int[] iArr = this.f1651d;
                iArr[i11 + 1] = iArr[i11];
                i11--;
            }
            this.f1652f++;
            this.f1651d[0] = i10;
        }
        if (this.f1659w.getCurrentItem() < 2) {
            ViewPager viewPager = this.f1659w;
            viewPager.y(viewPager.getCurrentItem() + 1);
        }
    }

    public final void b() {
        int i10 = this.f1650b;
        String str = i10 < 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : String.format("%02d", Integer.valueOf(i10));
        ExpirationView expirationView = this.f1661y;
        int year = getYear();
        if (expirationView.f1666a != null) {
            if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                expirationView.f1666a.setText("--");
                expirationView.f1666a.setEnabled(false);
                expirationView.f1666a.a();
            } else {
                expirationView.f1666a.setText(str);
                expirationView.f1666a.setEnabled(true);
                expirationView.f1666a.a();
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = expirationView.f1667b;
        if (zeroTopPaddingTextView != null) {
            if (year <= 0) {
                zeroTopPaddingTextView.setText("----");
                expirationView.f1667b.setEnabled(false);
                expirationView.f1667b.a();
            } else {
                String string = Integer.toString(year);
                while (string.length() < 4) {
                    string = string.concat("-");
                }
                expirationView.f1667b.setText(string);
                expirationView.f1667b.setEnabled(true);
                expirationView.f1667b.a();
            }
        }
    }

    public final void c() {
        b();
        Button button = this.A;
        if (button != null) {
            button.setEnabled(getYear() >= this.f1653h && getMonthOfYear() > 0);
        }
        boolean z9 = (this.f1650b == -1 && this.f1652f == -1) ? false : true;
        ImageButton imageButton = this.f1660x;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
        int i10 = 0;
        while (true) {
            Button[] buttonArr = this.f1654q;
            if (i10 >= buttonArr.length) {
                break;
            }
            Button button2 = buttonArr[i10];
            if (button2 != null) {
                button2.setEnabled(true);
            }
            i10++;
        }
        int i11 = this.f1652f;
        if (i11 == 1) {
            setYearMinKeyRange((this.f1653h % 100) / 10);
        } else if (i11 == 2) {
            setYearMinKeyRange(Math.max(0, (this.f1653h % 100) - (this.f1651d[0] * 10)));
        } else if (i11 == 3) {
            setYearKeyRange(-1);
        }
    }

    public int getLayoutId() {
        return R.layout.bl;
    }

    public int getMonthOfYear() {
        return this.f1650b;
    }

    public int getYear() {
        int[] iArr = this.f1651d;
        return (iArr[1] * 10) + (iArr[2] * 100) + (iArr[3] * 1000) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        boolean z9 = true;
        view.performHapticFeedback(1);
        if (view == this.f1660x) {
            int currentItem = this.f1659w.getCurrentItem();
            if (currentItem != 0) {
                if (currentItem == 1) {
                    if (this.f1652f >= 2) {
                        int i11 = 0;
                        while (true) {
                            i10 = this.f1652f;
                            if (i11 >= i10) {
                                break;
                            }
                            int[] iArr = this.f1651d;
                            int i12 = i11 + 1;
                            iArr[i11] = iArr[i12];
                            i11 = i12;
                        }
                        this.f1651d[i10] = 0;
                        this.f1652f = i10 - 1;
                    } else if (this.f1659w.getCurrentItem() > 0) {
                        ViewPager viewPager = this.f1659w;
                        viewPager.y(viewPager.getCurrentItem() - 1);
                    }
                }
            } else if (this.f1650b != -1) {
                this.f1650b = -1;
            }
        } else if (view == this.f1661y.getMonth()) {
            this.f1659w.setCurrentItem(K);
        } else if (view == this.f1661y.getYear()) {
            this.f1659w.setCurrentItem(L);
        } else if (view.getTag(R.id.gi).equals("month")) {
            this.f1650b = ((Integer) view.getTag(R.id.gj)).intValue();
            if (this.f1659w.getCurrentItem() < 2) {
                ViewPager viewPager2 = this.f1659w;
                viewPager2.y(viewPager2.getCurrentItem() + 1);
            }
        } else if (view.getTag(R.id.gi).equals("year")) {
            a(((Integer) view.getTag(R.id.q4)).intValue());
        }
        c();
        if (this.f1650b == -1 && this.f1652f == -1) {
            z9 = false;
        }
        ImageButton imageButton = this.f1660x;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.B = findViewById(R.id.hh);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1651d;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = 0;
            i10++;
        }
        this.f1658v = (UnderlinePageIndicatorPicker) findViewById(R.id.lf);
        ViewPager viewPager = (ViewPager) findViewById(R.id.lg);
        this.f1659w = viewPager;
        viewPager.setOffscreenPageLimit(2);
        this.f1659w.setAdapter(new c3.a(this, (LayoutInflater) this.f1662z.getSystemService("layout_inflater"), 1));
        this.f1658v.setViewPager(this.f1659w);
        this.f1659w.setCurrentItem(0);
        ExpirationView expirationView = (ExpirationView) findViewById(R.id.gr);
        this.f1661y = expirationView;
        expirationView.setTheme(this.J);
        this.f1661y.setUnderlinePage(this.f1658v);
        this.f1661y.setOnClick(this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.gz);
        this.f1660x = imageButton;
        imageButton.setOnClickListener(this);
        this.f1660x.setOnLongClickListener(this);
        a(this.f1653h / 1000);
        a((this.f1653h % 1000) / 100);
        ViewPager viewPager2 = this.f1659w;
        viewPager2.y(viewPager2.getCurrentItem() - 1);
        Button button = this.f1656t;
        if (button != null) {
            button.setEnabled(false);
        }
        Button button2 = this.f1657u;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        b();
        c();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f1660x;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i10 = 0; i10 < this.f1649a; i10++) {
            this.f1651d[i10] = 0;
        }
        this.f1652f = -1;
        this.f1650b = -1;
        this.f1659w.y(0);
        b();
        c();
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
        this.f1652f = savedState.f1663a;
        int[] iArr = savedState.f1664b;
        this.f1651d = iArr;
        if (iArr == null) {
            this.f1651d = new int[this.f1649a];
            this.f1652f = -1;
        }
        this.f1650b = savedState.f1665d;
        c();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1665d = this.f1650b;
        savedState.f1664b = this.f1651d;
        savedState.f1663a = this.f1652f;
        return savedState;
    }

    public void setMinYear(int i10) {
        this.f1653h = i10;
    }

    public void setSetButton(Button button) {
        this.A = button;
        if (button == null) {
            return;
        }
        button.setEnabled(getYear() >= this.f1653h && getMonthOfYear() > 0);
    }

    public void setTheme(int i10) {
        this.J = i10;
        if (i10 != -1) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i10, b.f17a);
            this.C = typedArrayObtainStyledAttributes.getColorStateList(7);
            this.D = typedArrayObtainStyledAttributes.getResourceId(5, this.D);
            this.E = typedArrayObtainStyledAttributes.getResourceId(0, this.E);
            this.H = typedArrayObtainStyledAttributes.getResourceId(1, this.H);
            this.F = typedArrayObtainStyledAttributes.getColor(9, this.F);
            this.G = typedArrayObtainStyledAttributes.getColor(6, this.G);
            this.I = typedArrayObtainStyledAttributes.getResourceId(2, this.I);
        }
        for (Button button : this.f1654q) {
            if (button != null) {
                button.setTextColor(this.C);
                button.setBackgroundResource(this.D);
            }
        }
        for (Button button2 : this.f1655s) {
            if (button2 != null) {
                button2.setTextColor(this.C);
                button2.setBackgroundResource(this.D);
            }
        }
        UnderlinePageIndicatorPicker underlinePageIndicatorPicker = this.f1658v;
        if (underlinePageIndicatorPicker != null) {
            underlinePageIndicatorPicker.setSelectedColor(this.G);
        }
        View view = this.B;
        if (view != null) {
            view.setBackgroundColor(this.F);
        }
        ImageButton imageButton = this.f1660x;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.E);
            this.f1660x.setImageDrawable(getResources().getDrawable(this.I));
        }
        Button button3 = this.f1656t;
        if (button3 != null) {
            button3.setTextColor(this.C);
            this.f1656t.setBackgroundResource(this.D);
        }
        Button button4 = this.f1657u;
        if (button4 != null) {
            button4.setTextColor(this.C);
            this.f1657u.setBackgroundResource(this.D);
        }
        ExpirationView expirationView = this.f1661y;
        if (expirationView != null) {
            expirationView.setTheme(this.J);
        }
    }
}
