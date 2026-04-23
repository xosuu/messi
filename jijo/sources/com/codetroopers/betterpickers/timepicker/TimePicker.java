package com.codetroopers.betterpickers.timepicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.widget.TextView;
import java.text.DateFormatSymbols;
import org.joda.time.DateTimeConstants;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class TimePicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {
    public final boolean A;
    public View B;
    public ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button[] f1738b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1739d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1740f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f1741h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f1742q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageButton f1743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TimerView f1744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f1745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f1746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String[] f1747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f1748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Button f1750z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f1752b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1753d;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1751a);
            parcel.writeIntArray(this.f1752b);
            parcel.writeInt(this.f1753d);
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1737a = 4;
        this.f1738b = new Button[10];
        this.f1739d = new int[4];
        this.f1740f = -1;
        this.A = false;
        this.H = -1;
        this.f1745u = context;
        this.A = DateFormat.is24HourFormat(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.f1748x = context.getResources().getString(R.string.yc);
        this.C = getResources().getColorStateList(R.color.da);
        this.D = R.drawable.g_;
        this.E = R.drawable.d2;
        this.F = getResources().getColor(R.color.c1);
        this.G = R.drawable.e_;
    }

    private int getEnteredTime() {
        int[] iArr = this.f1739d;
        return (iArr[1] * 10) + (iArr[2] * 100) + (iArr[3] * 1000) + iArr[0];
    }

    private void setKeyRange(int i10) {
        int i11 = 0;
        while (true) {
            Button[] buttonArr = this.f1738b;
            if (i11 >= buttonArr.length) {
                return;
            }
            buttonArr[i11].setEnabled(i11 <= i10);
            i11++;
        }
    }

    public final void a(int i10) {
        int i11 = this.f1740f;
        if (i11 < this.f1737a - 1) {
            while (i11 >= 0) {
                int[] iArr = this.f1739d;
                iArr[i11 + 1] = iArr[i11];
                i11--;
            }
            this.f1740f++;
            this.f1739d[0] = i10;
        }
    }

    public final boolean b() {
        int i10;
        int enteredTime = getEnteredTime();
        return !this.A ? enteredTime >= 1 && enteredTime <= 12 : enteredTime >= 0 && enteredTime <= 23 && (i10 = this.f1740f) > -1 && i10 < 2;
    }

    public final void c() {
        Button button = this.f1750z;
        if (button == null) {
            return;
        }
        if (this.f1740f == -1) {
            button.setEnabled(false);
            return;
        }
        if (!this.A) {
            button.setEnabled(this.f1749y != 0);
            return;
        }
        int enteredTime = getEnteredTime();
        Button button2 = this.f1750z;
        if (this.f1740f >= 2 && (enteredTime < 60 || enteredTime > 95)) {
            z = true;
        }
        button2.setEnabled(z);
    }

    public final void d() {
        for (Button button : this.f1738b) {
            if (button != null) {
                button.setTextColor(this.C);
                button.setBackgroundResource(this.D);
            }
        }
        View view = this.B;
        if (view != null) {
            view.setBackgroundColor(this.F);
        }
        Button button2 = this.f1741h;
        if (button2 != null) {
            button2.setTextColor(this.C);
            this.f1741h.setBackgroundResource(this.D);
        }
        TextView textView = this.f1746v;
        if (textView != null) {
            textView.setTextColor(this.C);
            this.f1746v.setBackgroundResource(this.D);
        }
        Button button3 = this.f1742q;
        if (button3 != null) {
            button3.setTextColor(this.C);
            this.f1742q.setBackgroundResource(this.D);
        }
        ImageButton imageButton = this.f1743s;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.E);
            this.f1743s.setImageDrawable(getResources().getDrawable(this.G));
        }
        TimerView timerView = this.f1744t;
        if (timerView != null) {
            timerView.setTheme(this.H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:296:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.timepicker.TimePicker.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.timepicker.TimePicker.f():void");
    }

    public int getHours() {
        int[] iArr = this.f1739d;
        int i10 = (iArr[3] * 10) + iArr[2];
        if (i10 == 12) {
            int i11 = this.f1749y;
            if (i11 == 1) {
                return 12;
            }
            if (i11 == 2) {
                return 0;
            }
            if (i11 == 3) {
                return i10;
            }
        }
        return i10 + (this.f1749y == 1 ? 12 : 0);
    }

    public int getLayoutId() {
        return R.layout.ep;
    }

    public int getMinutes() {
        int[] iArr = this.f1739d;
        return (iArr[1] * 10) + iArr[0];
    }

    public int getTime() {
        int[] iArr = this.f1739d;
        return (iArr[1] * 10) + (iArr[2] * 60) + (iArr[3] * 600) + (iArr[4] * DateTimeConstants.SECONDS_PER_HOUR) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        view.performHapticFeedback(1);
        Integer num = (Integer) view.getTag(R.id.q4);
        if (num != null) {
            a(num.intValue());
        } else {
            ImageButton imageButton = this.f1743s;
            boolean z9 = this.A;
            if (view == imageButton) {
                if (!z9 && this.f1749y != 0) {
                    this.f1749y = 0;
                } else if (this.f1740f >= 0) {
                    int i11 = 0;
                    while (true) {
                        i10 = this.f1740f;
                        if (i11 >= i10) {
                            break;
                        }
                        int[] iArr = this.f1739d;
                        int i12 = i11 + 1;
                        iArr[i11] = iArr[i12];
                        i11 = i12;
                    }
                    this.f1739d[i10] = 0;
                    this.f1740f = i10 - 1;
                }
            } else if (view == this.f1741h) {
                getEnteredTime();
                if (!z9) {
                    if (b()) {
                        a(0);
                        a(0);
                    }
                    this.f1749y = 2;
                } else if (b()) {
                    a(0);
                    a(0);
                }
            } else if (view == this.f1742q) {
                getEnteredTime();
                if (!z9) {
                    if (b()) {
                        a(0);
                        a(0);
                    }
                    this.f1749y = 1;
                } else if (b()) {
                    a(3);
                    a(0);
                }
            }
        }
        e();
        boolean z10 = this.f1740f != -1;
        ImageButton imageButton2 = this.f1743s;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z10);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.j_);
        View viewFindViewById2 = findViewById(R.id.t3);
        View viewFindViewById3 = findViewById(R.id.wm);
        View viewFindViewById4 = findViewById(R.id.jk);
        this.f1744t = (TimerView) findViewById(R.id.wy);
        ImageButton imageButton = (ImageButton) findViewById(R.id.gz);
        this.f1743s = imageButton;
        imageButton.setOnClickListener(this);
        this.f1743s.setOnLongClickListener(this);
        Button button = (Button) viewFindViewById.findViewById(R.id.lc);
        Button[] buttonArr = this.f1738b;
        buttonArr[1] = button;
        buttonArr[2] = (Button) viewFindViewById.findViewById(R.id.ld);
        buttonArr[3] = (Button) viewFindViewById.findViewById(R.id.le);
        buttonArr[4] = (Button) viewFindViewById2.findViewById(R.id.lc);
        buttonArr[5] = (Button) viewFindViewById2.findViewById(R.id.ld);
        buttonArr[6] = (Button) viewFindViewById2.findViewById(R.id.le);
        buttonArr[7] = (Button) viewFindViewById3.findViewById(R.id.lc);
        buttonArr[8] = (Button) viewFindViewById3.findViewById(R.id.ld);
        buttonArr[9] = (Button) viewFindViewById3.findViewById(R.id.le);
        this.f1741h = (Button) viewFindViewById4.findViewById(R.id.lc);
        buttonArr[0] = (Button) viewFindViewById4.findViewById(R.id.ld);
        this.f1742q = (Button) viewFindViewById4.findViewById(R.id.le);
        setLeftRightEnabled(false);
        for (int i10 = 0; i10 < 10; i10++) {
            buttonArr[i10].setOnClickListener(this);
            buttonArr[i10].setText(String.format("%d", Integer.valueOf(i10)));
            buttonArr[i10].setTag(R.id.q4, new Integer(i10));
        }
        f();
        Resources resources = this.f1745u.getResources();
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f1747w = amPmStrings;
        if (this.A) {
            this.f1741h.setText(resources.getString(R.string.ya));
            this.f1742q.setText(resources.getString(R.string.yb));
        } else {
            this.f1741h.setText(amPmStrings[0]);
            this.f1742q.setText(this.f1747w[1]);
        }
        this.f1741h.setOnClickListener(this);
        this.f1742q.setOnClickListener(this);
        this.f1746v = (TextView) findViewById(R.id.cc);
        this.f1749y = 0;
        this.B = findViewById(R.id.hh);
        d();
        e();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f1743s;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        this.f1749y = 0;
        for (int i10 = 0; i10 < this.f1737a; i10++) {
            this.f1739d[i10] = 0;
        }
        this.f1740f = -1;
        f();
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
        this.f1740f = savedState.f1751a;
        int[] iArr = savedState.f1752b;
        this.f1739d = iArr;
        if (iArr == null) {
            this.f1739d = new int[this.f1737a];
            this.f1740f = -1;
        }
        this.f1749y = savedState.f1753d;
        e();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1752b = this.f1739d;
        savedState.f1753d = this.f1749y;
        savedState.f1751a = this.f1740f;
        return savedState;
    }

    public void setLeftRightEnabled(boolean z9) {
        this.f1741h.setEnabled(z9);
        this.f1742q.setEnabled(z9);
        if (z9) {
            return;
        }
        this.f1741h.setContentDescription(null);
        this.f1742q.setContentDescription(null);
    }

    public void setSetButton(Button button) {
        this.f1750z = button;
        c();
    }

    public void setTheme(int i10) {
        this.H = i10;
        if (i10 != -1) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i10, b.f17a);
            this.C = typedArrayObtainStyledAttributes.getColorStateList(7);
            this.D = typedArrayObtainStyledAttributes.getResourceId(5, this.D);
            this.E = typedArrayObtainStyledAttributes.getResourceId(0, this.E);
            this.F = typedArrayObtainStyledAttributes.getColor(4, this.F);
            this.G = typedArrayObtainStyledAttributes.getResourceId(2, this.G);
        }
        d();
    }
}
