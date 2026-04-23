package com.codetroopers.betterpickers.numberpicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigDecimal;
import java.math.BigInteger;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class NumberPicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {
    public View A;
    public ColorStateList B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button[] f1698b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1699d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1700f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f1701h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f1702q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageButton f1703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NumberView f1704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f1705u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f1706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NumberPickerErrorTextView f1707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f1709y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Button f1710z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f1712b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1713d;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1711a);
            int[] iArr = this.f1712b;
            if (iArr != null) {
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1712b);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.f1713d);
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1697a = 20;
        this.f1698b = new Button[10];
        this.f1699d = new int[20];
        this.f1700f = -1;
        this.f1709y = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.G = -1;
        this.f1705u = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.B = getResources().getColorStateList(R.color.da);
        this.C = R.drawable.g_;
        this.D = R.drawable.d2;
        this.F = R.drawable.e_;
        this.E = getResources().getColor(R.color.c1);
    }

    private String getEnteredNumberString() {
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i10 = this.f1700f; i10 >= 0; i10--) {
            int i11 = this.f1699d[i10];
            if (i11 != -1) {
                if (i11 == 10) {
                    string = g1.a.y(string, ".");
                } else {
                    StringBuilder sbS = g1.a.s(string);
                    sbS.append(this.f1699d[i10]);
                    string = sbS.toString();
                }
            }
        }
        return string;
    }

    public final void a(int i10) {
        if (this.f1700f < this.f1697a - 1) {
            int[] iArr = this.f1699d;
            if (iArr[0] == 0 && iArr[1] == -1 && !b() && i10 != 10) {
                this.f1699d[0] = i10;
                return;
            }
            for (int i11 = this.f1700f; i11 >= 0; i11--) {
                int[] iArr2 = this.f1699d;
                iArr2[i11 + 1] = iArr2[i11];
            }
            this.f1700f++;
            this.f1699d[0] = i10;
        }
    }

    public final boolean b() {
        boolean z9 = false;
        for (int i10 : this.f1699d) {
            if (i10 == 10) {
                z9 = true;
            }
        }
        return z9;
    }

    public final void c() {
        for (Button button : this.f1698b) {
            if (button != null) {
                button.setTextColor(this.B);
                button.setBackgroundResource(this.C);
            }
        }
        View view = this.A;
        if (view != null) {
            view.setBackgroundColor(this.E);
        }
        Button button2 = this.f1701h;
        if (button2 != null) {
            button2.setTextColor(this.B);
            this.f1701h.setBackgroundResource(this.C);
        }
        Button button3 = this.f1702q;
        if (button3 != null) {
            button3.setTextColor(this.B);
            this.f1702q.setBackgroundResource(this.C);
        }
        ImageButton imageButton = this.f1703s;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.D);
            this.f1703s.setImageDrawable(getResources().getDrawable(this.F));
        }
        NumberView numberView = this.f1704t;
        if (numberView != null) {
            numberView.setTheme(this.G);
        }
        TextView textView = this.f1706v;
        if (textView != null) {
            textView.setTextColor(this.B);
        }
    }

    public final void d() {
        this.f1702q.setEnabled(!b());
        e();
        Button button = this.f1710z;
        if (button != null) {
            int i10 = this.f1700f;
            if (i10 == -1) {
                button.setEnabled(false);
            } else {
                button.setEnabled(i10 >= 0);
            }
        }
        boolean z9 = this.f1700f != -1;
        ImageButton imageButton = this.f1703s;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
    }

    public final void e() {
        String strReplaceAll = getEnteredNumberString().replaceAll("\\-", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        String[] strArrSplit = strReplaceAll.split("\\.");
        if (strArrSplit.length >= 2) {
            if (strArrSplit[0].equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                this.f1704t.b("0", strArrSplit[1], b(), this.f1708x == 1);
                return;
            } else {
                this.f1704t.b(strArrSplit[0], strArrSplit[1], b(), this.f1708x == 1);
                return;
            }
        }
        if (strArrSplit.length == 1) {
            this.f1704t.b(strArrSplit[0], RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, b(), this.f1708x == 1);
        } else if (strReplaceAll.equals(".")) {
            this.f1704t.b("0", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true, this.f1708x == 1);
        }
    }

    public double getDecimal() {
        return getEnteredNumber().remainder(BigDecimal.ONE).doubleValue();
    }

    public BigDecimal getEnteredNumber() {
        String strQ = "0";
        for (int i10 = this.f1700f; i10 >= 0; i10--) {
            int i11 = this.f1699d[i10];
            if (i11 == -1) {
                break;
            }
            if (i11 == 10) {
                strQ = g1.a.y(strQ, ".");
            } else {
                StringBuilder sbS = g1.a.s(strQ);
                sbS.append(this.f1699d[i10]);
                strQ = sbS.toString();
            }
        }
        if (this.f1708x == 1) {
            strQ = g1.a.q("-", strQ);
        }
        return new BigDecimal(strQ);
    }

    public NumberPickerErrorTextView getErrorView() {
        return this.f1707w;
    }

    public boolean getIsNegative() {
        return this.f1708x == 1;
    }

    public int getLayoutId() {
        return R.layout.e6;
    }

    public BigInteger getNumber() {
        return getEnteredNumber().setScale(0, 3).toBigIntegerExact();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        view.performHapticFeedback(1);
        NumberPickerErrorTextView numberPickerErrorTextView = this.f1707w;
        numberPickerErrorTextView.f1715b.removeCallbacks(numberPickerErrorTextView.f1714a);
        numberPickerErrorTextView.setVisibility(4);
        Integer num = (Integer) view.getTag(R.id.q4);
        if (num != null) {
            a(num.intValue());
        } else if (view == this.f1703s) {
            if (this.f1700f >= 0) {
                int i11 = 0;
                while (true) {
                    i10 = this.f1700f;
                    if (i11 >= i10) {
                        break;
                    }
                    int[] iArr = this.f1699d;
                    int i12 = i11 + 1;
                    iArr[i11] = iArr[i12];
                    i11 = i12;
                }
                this.f1699d[i10] = -1;
                this.f1700f = i10 - 1;
            }
        } else if (view == this.f1701h) {
            if (this.f1708x == 0) {
                this.f1708x = 1;
            } else {
                this.f1708x = 0;
            }
        } else if (view == this.f1702q && (!b())) {
            a(10);
        }
        d();
        boolean z9 = this.f1700f != -1;
        ImageButton imageButton = this.f1703s;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.A = findViewById(R.id.hh);
        this.f1707w = (NumberPickerErrorTextView) findViewById(R.id.if_res_0x7f090152);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1699d;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = -1;
            i10++;
        }
        View viewFindViewById = findViewById(R.id.j_);
        View viewFindViewById2 = findViewById(R.id.t3);
        View viewFindViewById3 = findViewById(R.id.wm);
        View viewFindViewById4 = findViewById(R.id.jk);
        this.f1704t = (NumberView) findViewById(R.id.q2);
        ImageButton imageButton = (ImageButton) findViewById(R.id.gz);
        this.f1703s = imageButton;
        imageButton.setOnClickListener(this);
        this.f1703s.setOnLongClickListener(this);
        Button button = (Button) viewFindViewById.findViewById(R.id.lc);
        Button[] buttonArr = this.f1698b;
        buttonArr[1] = button;
        buttonArr[2] = (Button) viewFindViewById.findViewById(R.id.ld);
        buttonArr[3] = (Button) viewFindViewById.findViewById(R.id.le);
        buttonArr[4] = (Button) viewFindViewById2.findViewById(R.id.lc);
        buttonArr[5] = (Button) viewFindViewById2.findViewById(R.id.ld);
        buttonArr[6] = (Button) viewFindViewById2.findViewById(R.id.le);
        buttonArr[7] = (Button) viewFindViewById3.findViewById(R.id.lc);
        buttonArr[8] = (Button) viewFindViewById3.findViewById(R.id.ld);
        buttonArr[9] = (Button) viewFindViewById3.findViewById(R.id.le);
        this.f1701h = (Button) viewFindViewById4.findViewById(R.id.lc);
        buttonArr[0] = (Button) viewFindViewById4.findViewById(R.id.ld);
        this.f1702q = (Button) viewFindViewById4.findViewById(R.id.le);
        this.f1701h.setEnabled(true);
        this.f1702q.setEnabled(!b());
        if (!(!b())) {
            this.f1702q.setContentDescription(null);
        }
        for (int i11 = 0; i11 < 10; i11++) {
            buttonArr[i11].setOnClickListener(this);
            buttonArr[i11].setText(String.format("%d", Integer.valueOf(i11)));
            buttonArr[i11].setTag(R.id.q4, new Integer(i11));
        }
        e();
        Resources resources = this.f1705u.getResources();
        this.f1701h.setText(resources.getString(R.string.q8));
        this.f1702q.setText(resources.getString(R.string.q9));
        this.f1701h.setOnClickListener(this);
        this.f1702q.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.lh);
        this.f1706v = textView;
        this.f1708x = 0;
        if (textView != null) {
            textView.setText(this.f1709y);
        }
        c();
        d();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        NumberPickerErrorTextView numberPickerErrorTextView = this.f1707w;
        numberPickerErrorTextView.f1715b.removeCallbacks(numberPickerErrorTextView.f1714a);
        numberPickerErrorTextView.setVisibility(4);
        ImageButton imageButton = this.f1703s;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i10 = 0; i10 < this.f1697a; i10++) {
            this.f1699d[i10] = -1;
        }
        this.f1700f = -1;
        e();
        d();
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
        this.f1700f = savedState.f1711a;
        int[] iArr = savedState.f1712b;
        this.f1699d = iArr;
        if (iArr == null) {
            this.f1699d = new int[this.f1697a];
            this.f1700f = -1;
        }
        this.f1708x = savedState.f1713d;
        d();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1712b = this.f1699d;
        savedState.f1713d = this.f1708x;
        savedState.f1711a = this.f1700f;
        return savedState;
    }

    public void setDecimalVisibility(int i10) {
        Button button = this.f1702q;
        if (button != null) {
            button.setVisibility(i10);
        }
    }

    public void setLabelText(String str) {
        this.f1709y = str;
        TextView textView = this.f1706v;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setMax(BigDecimal bigDecimal) {
    }

    public void setMin(BigDecimal bigDecimal) {
    }

    public void setPlusMinusVisibility(int i10) {
        Button button = this.f1701h;
        if (button != null) {
            button.setVisibility(i10);
        }
    }

    public void setSetButton(Button button) {
        this.f1710z = button;
        if (button == null) {
            return;
        }
        int i10 = this.f1700f;
        if (i10 == -1) {
            button.setEnabled(false);
        } else {
            button.setEnabled(i10 >= 0);
        }
    }

    public void setTheme(int i10) {
        this.G = i10;
        if (i10 != -1) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i10, b.f17a);
            this.B = typedArrayObtainStyledAttributes.getColorStateList(7);
            this.C = typedArrayObtainStyledAttributes.getResourceId(5, this.C);
            this.D = typedArrayObtainStyledAttributes.getResourceId(0, this.D);
            this.E = typedArrayObtainStyledAttributes.getColor(4, this.E);
            this.F = typedArrayObtainStyledAttributes.getResourceId(2, this.F);
        }
        c();
    }
}
