package o4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.badge.BadgeState$State;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import x4.y;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BadgeState$State f16105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BadgeState$State f16106b = new BadgeState$State();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16109e;

    public b(Context context) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        BadgeState$State badgeState$State = new BadgeState$State();
        int i10 = badgeState$State.f11736a;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        int i11 = styleAttribute == 0 ? R.style.a0m : styleAttribute;
        int[] iArr = l4.a.f15190c;
        y.a(context, attributeSet, R.attr.bk, i11);
        y.b(context, attributeSet, iArr, R.attr.bk, i11, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.bk, i11);
        Resources resources = context.getResources();
        this.f16107c = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.o5));
        this.f16109e = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.o4));
        this.f16108d = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.o_));
        BadgeState$State badgeState$State2 = this.f16106b;
        int i12 = badgeState$State.f11739f;
        badgeState$State2.f11739f = i12 == -2 ? 255 : i12;
        CharSequence charSequence = badgeState$State.f11743t;
        badgeState$State2.f11743t = charSequence == null ? context.getString(R.string.n4) : charSequence;
        BadgeState$State badgeState$State3 = this.f16106b;
        int i13 = badgeState$State.f11744u;
        badgeState$State3.f11744u = i13 == 0 ? R.plurals.i : i13;
        int i14 = badgeState$State.f11745v;
        badgeState$State3.f11745v = i14 == 0 ? R.string.ng : i14;
        Boolean bool = badgeState$State.f11747x;
        badgeState$State3.f11747x = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State4 = this.f16106b;
        int i15 = badgeState$State.f11741q;
        badgeState$State4.f11741q = i15 == -2 ? typedArrayObtainStyledAttributes.getInt(8, 4) : i15;
        int i16 = badgeState$State.f11740h;
        if (i16 != -2) {
            this.f16106b.f11740h = i16;
        } else if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f16106b.f11740h = typedArrayObtainStyledAttributes.getInt(9, 0);
        } else {
            this.f16106b.f11740h = -1;
        }
        BadgeState$State badgeState$State5 = this.f16106b;
        Integer num = badgeState$State.f11737b;
        badgeState$State5.f11737b = Integer.valueOf(num == null ? tp1.g(context, typedArrayObtainStyledAttributes, 0).getDefaultColor() : num.intValue());
        Integer num2 = badgeState$State.f11738d;
        if (num2 != null) {
            this.f16106b.f11738d = num2;
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f16106b.f11738d = Integer.valueOf(tp1.g(context, typedArrayObtainStyledAttributes, 3).getDefaultColor());
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.na, l4.a.D);
            typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            ColorStateList colorStateListG = tp1.g(context, typedArrayObtainStyledAttributes2, 3);
            tp1.g(context, typedArrayObtainStyledAttributes2, 4);
            tp1.g(context, typedArrayObtainStyledAttributes2, 5);
            typedArrayObtainStyledAttributes2.getInt(2, 0);
            typedArrayObtainStyledAttributes2.getInt(1, 1);
            int i17 = typedArrayObtainStyledAttributes2.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes2.getResourceId(i17, 0);
            typedArrayObtainStyledAttributes2.getString(i17);
            typedArrayObtainStyledAttributes2.getBoolean(14, false);
            tp1.g(context, typedArrayObtainStyledAttributes2, 6);
            typedArrayObtainStyledAttributes2.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes2.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes2.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(R.style.na, l4.a.f15206s);
            typedArrayObtainStyledAttributes3.hasValue(0);
            typedArrayObtainStyledAttributes3.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes3.recycle();
            this.f16106b.f11738d = Integer.valueOf(colorStateListG.getDefaultColor());
        }
        BadgeState$State badgeState$State6 = this.f16106b;
        Integer num3 = badgeState$State.f11746w;
        badgeState$State6.f11746w = Integer.valueOf(num3 == null ? typedArrayObtainStyledAttributes.getInt(1, 8388661) : num3.intValue());
        BadgeState$State badgeState$State7 = this.f16106b;
        Integer num4 = badgeState$State.f11748y;
        badgeState$State7.f11748y = Integer.valueOf(num4 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0) : num4.intValue());
        BadgeState$State badgeState$State8 = this.f16106b;
        Integer num5 = badgeState$State.f11749z;
        badgeState$State8.f11749z = Integer.valueOf(num5 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0) : num5.intValue());
        BadgeState$State badgeState$State9 = this.f16106b;
        Integer num6 = badgeState$State.A;
        badgeState$State9.A = Integer.valueOf(num6 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, badgeState$State9.f11748y.intValue()) : num6.intValue());
        BadgeState$State badgeState$State10 = this.f16106b;
        Integer num7 = badgeState$State.B;
        badgeState$State10.B = Integer.valueOf(num7 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, badgeState$State10.f11749z.intValue()) : num7.intValue());
        BadgeState$State badgeState$State11 = this.f16106b;
        Integer num8 = badgeState$State.C;
        badgeState$State11.C = Integer.valueOf(num8 == null ? 0 : num8.intValue());
        BadgeState$State badgeState$State12 = this.f16106b;
        Integer num9 = badgeState$State.D;
        badgeState$State12.D = Integer.valueOf(num9 != null ? num9.intValue() : 0);
        typedArrayObtainStyledAttributes.recycle();
        Locale locale = badgeState$State.f11742s;
        if (locale == null) {
            this.f16106b.f11742s = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f16106b.f11742s = locale;
        }
        this.f16105a = badgeState$State;
    }
}
