package net.i2p.crypto.eddsa.math;

import java.io.Serializable;
import net.i2p.crypto.eddsa.math.GroupElement;

/* JADX INFO: loaded from: classes.dex */
public class Curve implements Serializable {
    private static final long serialVersionUID = 4578920872509827L;
    private final FieldElement I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FieldElement f15995d;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private final FieldElement f15996d2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Field f15997f;
    private final GroupElement zeroP2;
    private final GroupElement zeroP3;
    private final GroupElement zeroP3PrecomputedDouble;
    private final GroupElement zeroPrecomp;

    /* JADX INFO: renamed from: net.i2p.crypto.eddsa.math.Curve$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation;

        static {
            int[] iArr = new int[GroupElement.Representation.values().length];
            $SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation = iArr;
            try {
                iArr[GroupElement.Representation.P2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation[GroupElement.Representation.P3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation[GroupElement.Representation.P3PrecomputedDouble.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation[GroupElement.Representation.PRECOMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Curve(Field field, byte[] bArr, FieldElement fieldElement) {
        this.f15997f = field;
        FieldElement fieldElementFromByteArray = field.fromByteArray(bArr);
        this.f15995d = fieldElementFromByteArray;
        this.f15996d2 = fieldElementFromByteArray.add(fieldElementFromByteArray);
        this.I = fieldElement;
        FieldElement fieldElement2 = field.ZERO;
        FieldElement fieldElement3 = field.ONE;
        this.zeroP2 = GroupElement.p2(this, fieldElement2, fieldElement3, fieldElement3);
        this.zeroP3 = GroupElement.p3(this, fieldElement2, fieldElement3, fieldElement3, fieldElement2, false);
        this.zeroP3PrecomputedDouble = GroupElement.p3(this, fieldElement2, fieldElement3, fieldElement3, fieldElement2, true);
        this.zeroPrecomp = GroupElement.precomp(this, fieldElement3, fieldElement3, fieldElement2);
    }

    public GroupElement createPoint(byte[] bArr, boolean z9) {
        return new GroupElement(this, bArr, z9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Curve)) {
            return false;
        }
        Curve curve = (Curve) obj;
        return this.f15997f.equals(curve.getField()) && this.f15995d.equals(curve.getD()) && this.I.equals(curve.getI());
    }

    public FieldElement get2D() {
        return this.f15996d2;
    }

    public FieldElement getD() {
        return this.f15995d;
    }

    public Field getField() {
        return this.f15997f;
    }

    public FieldElement getI() {
        return this.I;
    }

    public GroupElement getZero(GroupElement.Representation representation) {
        int i10 = AnonymousClass1.$SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation[representation.ordinal()];
        if (i10 == 1) {
            return this.zeroP2;
        }
        if (i10 == 2) {
            return this.zeroP3;
        }
        if (i10 == 3) {
            return this.zeroP3PrecomputedDouble;
        }
        if (i10 != 4) {
            return null;
        }
        return this.zeroPrecomp;
    }

    public int hashCode() {
        return (this.f15997f.hashCode() ^ this.f15995d.hashCode()) ^ this.I.hashCode();
    }
}
