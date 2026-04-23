package com.codetroopers.betterpickers.hmspicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
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
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import org.joda.time.DateTimeConstants;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class HmsPicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {
    public ColorStateList A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button[] f1673b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1674d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1675f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f1676h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f1677q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f1678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HmsView f1679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f1680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f1681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f1682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f1683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Button f1684y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f1685z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f1687b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1688d;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1686a);
            parcel.writeIntArray(this.f1687b);
            parcel.writeInt(this.f1688d);
        }
    }

    public HmsPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1672a = 5;
        this.f1673b = new Button[10];
        this.f1674d = new int[5];
        this.f1675f = -1;
        this.F = -1;
        this.f1680u = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.A = getResources().getColorStateList(R.color.da);
        this.B = R.drawable.g_;
        this.C = R.drawable.d2;
        this.D = getResources().getColor(R.color.c1);
        this.E = R.drawable.e_;
    }

    public final void a() {
        for (Button button : this.f1673b) {
            if (button != null) {
                button.setTextColor(this.A);
                button.setBackgroundResource(this.B);
            }
        }
        View view = this.f1685z;
        if (view != null) {
            view.setBackgroundColor(this.D);
        }
        TextView textView = this.f1681v;
        if (textView != null) {
            textView.setTextColor(this.A);
            this.f1681v.setBackgroundResource(this.B);
        }
        TextView textView2 = this.f1682w;
        if (textView2 != null) {
            textView2.setTextColor(this.A);
            this.f1682w.setBackgroundResource(this.B);
        }
        TextView textView3 = this.f1683x;
        if (textView3 != null) {
            textView3.setTextColor(this.A);
            this.f1683x.setBackgroundResource(this.B);
        }
        ImageButton imageButton = this.f1676h;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.C);
            this.f1676h.setImageDrawable(getResources().getDrawable(this.E));
        }
        HmsView hmsView = this.f1679t;
        if (hmsView != null) {
            hmsView.setTheme(this.F);
        }
        Button button2 = this.f1677q;
        if (button2 != null) {
            button2.setTextColor(this.A);
            this.f1677q.setBackgroundResource(this.B);
        }
    }

    public final void b() {
        HmsView hmsView = this.f1679t;
        boolean z9 = this.G == 1;
        int[] iArr = this.f1674d;
        int i10 = iArr[4];
        int i11 = iArr[3];
        int i12 = iArr[2];
        int i13 = iArr[1];
        int i14 = iArr[0];
        hmsView.f1695s.setVisibility(z9 ? 0 : 8);
        ZeroTopPaddingTextView zeroTopPaddingTextView = hmsView.f1689a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setText(String.format("%d", Integer.valueOf(i10)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = hmsView.f1691d;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setText(String.format("%d", Integer.valueOf(i11)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = hmsView.f1690b;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setText(String.format("%d", Integer.valueOf(i12)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = hmsView.f1693h;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setText(String.format("%d", Integer.valueOf(i13)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = hmsView.f1692f;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setText(String.format("%d", Integer.valueOf(i14)));
        }
    }

    public int getHours() {
        return this.f1674d[4];
    }

    public int getLayoutId() {
        return R.layout.bs;
    }

    public int getMinutes() {
        int[] iArr = this.f1674d;
        return (iArr[3] * 10) + iArr[2];
    }

    public int getSeconds() {
        int[] iArr = this.f1674d;
        return (iArr[1] * 10) + iArr[0];
    }

    public int getTime() {
        int[] iArr = this.f1674d;
        return (iArr[1] * 10) + (iArr[2] * 60) + (iArr[3] * 600) + (iArr[4] * DateTimeConstants.SECONDS_PER_HOUR) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        view.performHapticFeedback(1);
        Integer num = (Integer) view.getTag(R.id.q4);
        if (num != null) {
            int iIntValue = num.intValue();
            int i11 = this.f1675f;
            if (i11 < this.f1672a - 1 && (i11 != -1 || iIntValue != 0)) {
                while (i11 >= 0) {
                    int[] iArr = this.f1674d;
                    iArr[i11 + 1] = iArr[i11];
                    i11--;
                }
                this.f1675f++;
                this.f1674d[0] = iIntValue;
            }
        } else if (view == this.f1676h) {
            if (this.f1675f >= 0) {
                int i12 = 0;
                while (true) {
                    i10 = this.f1675f;
                    if (i12 >= i10) {
                        break;
                    }
                    int[] iArr2 = this.f1674d;
                    int i13 = i12 + 1;
                    iArr2[i12] = iArr2[i13];
                    i12 = i13;
                }
                this.f1674d[i10] = 0;
                this.f1675f = i10 - 1;
            }
        } else if (view == this.f1677q) {
            if (this.G == 1) {
                this.G = 0;
            } else {
                this.G = 1;
            }
        }
        b();
        Button button = this.f1684y;
        if (button != null) {
            int i14 = this.f1675f;
            if (i14 == -1) {
                button.setEnabled(false);
            } else {
                button.setEnabled(i14 >= 0);
            }
        }
        boolean z9 = this.f1675f != -1;
        ImageButton imageButton = this.f1676h;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
        boolean z10 = this.f1675f != -1;
        ImageButton imageButton2 = this.f1676h;
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
        this.f1679t = (HmsView) findViewById(R.id.k3);
        ImageButton imageButton = (ImageButton) findViewById(R.id.gz);
        this.f1676h = imageButton;
        imageButton.setOnClickListener(this);
        this.f1676h.setOnLongClickListener(this);
        Button button = (Button) viewFindViewById.findViewById(R.id.lc);
        Button[] buttonArr = this.f1673b;
        buttonArr[1] = button;
        buttonArr[2] = (Button) viewFindViewById.findViewById(R.id.ld);
        buttonArr[3] = (Button) viewFindViewById.findViewById(R.id.le);
        buttonArr[4] = (Button) viewFindViewById2.findViewById(R.id.lc);
        buttonArr[5] = (Button) viewFindViewById2.findViewById(R.id.ld);
        buttonArr[6] = (Button) viewFindViewById2.findViewById(R.id.le);
        buttonArr[7] = (Button) viewFindViewById3.findViewById(R.id.lc);
        buttonArr[8] = (Button) viewFindViewById3.findViewById(R.id.ld);
        buttonArr[9] = (Button) viewFindViewById3.findViewById(R.id.le);
        this.f1677q = (Button) viewFindViewById4.findViewById(R.id.lc);
        buttonArr[0] = (Button) viewFindViewById4.findViewById(R.id.ld);
        this.f1678s = (Button) viewFindViewById4.findViewById(R.id.le);
        setRightEnabled(false);
        for (int i10 = 0; i10 < 10; i10++) {
            buttonArr[i10].setOnClickListener(this);
            buttonArr[i10].setText(String.format("%d", Integer.valueOf(i10)));
            buttonArr[i10].setTag(R.id.q4, new Integer(i10));
        }
        b();
        this.f1677q.setText(this.f1680u.getResources().getString(R.string.q8));
        this.f1677q.setOnClickListener(this);
        this.f1681v = (TextView) findViewById(R.id.kc);
        this.f1682w = (TextView) findViewById(R.id.nw);
        this.f1683x = (TextView) findViewById(R.id.t4);
        this.f1685z = findViewById(R.id.hh);
        a();
        b();
        Button button2 = this.f1684y;
        if (button2 != null) {
            int i11 = this.f1675f;
            if (i11 == -1) {
                button2.setEnabled(false);
            } else {
                button2.setEnabled(i11 >= 0);
            }
        }
        boolean z9 = this.f1675f != -1;
        ImageButton imageButton2 = this.f1676h;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z9);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f1676h;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i10 = 0; i10 < this.f1672a; i10++) {
            this.f1674d[i10] = 0;
        }
        this.f1675f = -1;
        b();
        b();
        Button button = this.f1684y;
        if (button != null) {
            int i11 = this.f1675f;
            if (i11 == -1) {
                button.setEnabled(false);
            } else {
                button.setEnabled(i11 >= 0);
            }
        }
        boolean z9 = this.f1675f != -1;
        ImageButton imageButton2 = this.f1676h;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z9);
        }
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
        this.f1675f = savedState.f1686a;
        int[] iArr = savedState.f1687b;
        this.f1674d = iArr;
        if (iArr == null) {
            this.f1674d = new int[this.f1672a];
            this.f1675f = -1;
        }
        b();
        Button button = this.f1684y;
        if (button != null) {
            int i10 = this.f1675f;
            if (i10 == -1) {
                button.setEnabled(false);
            } else {
                button.setEnabled(i10 >= 0);
            }
        }
        boolean z9 = this.f1675f != -1;
        ImageButton imageButton = this.f1676h;
        if (imageButton != null) {
            imageButton.setEnabled(z9);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1687b = this.f1674d;
        savedState.f1686a = this.f1675f;
        return savedState;
    }

    public void setPlusMinusVisibility(int i10) {
        Button button = this.f1677q;
        if (button != null) {
            button.setVisibility(i10);
        }
    }

    public void setRightEnabled(boolean z9) {
        this.f1678s.setEnabled(z9);
        if (z9) {
            return;
        }
        this.f1678s.setContentDescription(null);
    }

    public void setSetButton(Button button) {
        this.f1684y = button;
        if (button == null) {
            return;
        }
        int i10 = this.f1675f;
        if (i10 == -1) {
            button.setEnabled(false);
        } else {
            button.setEnabled(i10 >= 0);
        }
    }

    public void setTheme(int i10) {
        this.F = i10;
        if (i10 != -1) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i10, b.f17a);
            this.A = typedArrayObtainStyledAttributes.getColorStateList(7);
            this.B = typedArrayObtainStyledAttributes.getResourceId(5, this.B);
            this.C = typedArrayObtainStyledAttributes.getResourceId(0, this.C);
            this.D = typedArrayObtainStyledAttributes.getColor(4, this.D);
            this.E = typedArrayObtainStyledAttributes.getResourceId(2, this.E);
        }
        a();
    }
}
