package de.blinkt.openvpn.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class TrafficHistory implements Parcelable {
    public static final Parcelable.Creator<TrafficHistory> CREATOR = new j4.b(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f12564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList f12565b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedList f12566d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TrafficDatapoint f12567f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TrafficDatapoint f12568h;

    public static class TrafficDatapoint implements Parcelable {
        public static final Parcelable.Creator<TrafficDatapoint> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f12569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f12570b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f12571d;

        public TrafficDatapoint(long j10, long j11, long j12) {
            this.f12570b = j10;
            this.f12571d = j11;
            this.f12569a = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f12569a);
            parcel.writeLong(this.f12570b);
            parcel.writeLong(this.f12571d);
        }

        public TrafficDatapoint(Parcel parcel) {
            this.f12569a = parcel.readLong();
            this.f12570b = parcel.readLong();
            this.f12571d = parcel.readLong();
        }
    }

    public final a b(long j10, long j11) {
        TrafficDatapoint trafficDatapoint = new TrafficDatapoint(j10, j11, System.currentTimeMillis());
        a aVarC = c(trafficDatapoint);
        this.f12564a.add(trafficDatapoint);
        if (this.f12567f == null) {
            this.f12567f = new TrafficDatapoint(0L, 0L, 0L);
            this.f12568h = new TrafficDatapoint(0L, 0L, 0L);
        }
        d(trafficDatapoint, true);
        return aVarC;
    }

    public final a c(TrafficDatapoint trafficDatapoint) {
        LinkedList linkedList = this.f12564a;
        TrafficDatapoint trafficDatapoint2 = linkedList.size() == 0 ? new TrafficDatapoint(0L, 0L, System.currentTimeMillis()) : (TrafficDatapoint) linkedList.getLast();
        if (trafficDatapoint == null) {
            if (linkedList.size() < 2) {
                trafficDatapoint = trafficDatapoint2;
            } else {
                linkedList.descendingIterator().next();
                trafficDatapoint = (TrafficDatapoint) linkedList.descendingIterator().next();
            }
        }
        return new a(trafficDatapoint2, trafficDatapoint);
    }

    public final void d(TrafficDatapoint trafficDatapoint, boolean z9) {
        TrafficDatapoint trafficDatapoint2;
        long j10;
        LinkedList<TrafficDatapoint> linkedList;
        HashSet hashSet = new HashSet();
        new Vector();
        LinkedList linkedList2 = this.f12565b;
        if (z9) {
            trafficDatapoint2 = this.f12567f;
            linkedList = this.f12564a;
            j10 = 60000;
        } else {
            trafficDatapoint2 = this.f12568h;
            j10 = 3600000;
            linkedList = linkedList2;
            linkedList2 = this.f12566d;
        }
        long j11 = trafficDatapoint.f12569a;
        if (j11 / j10 > trafficDatapoint2.f12569a / j10) {
            linkedList2.add(trafficDatapoint);
            if (z9) {
                this.f12567f = trafficDatapoint;
                d(trafficDatapoint, false);
            } else {
                this.f12568h = trafficDatapoint;
            }
            for (TrafficDatapoint trafficDatapoint3 : linkedList) {
                if ((j11 - trafficDatapoint3.f12569a) / j10 >= 5) {
                    hashSet.add(trafficDatapoint3);
                }
            }
            linkedList.removeAll(hashSet);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f12564a);
        parcel.writeList(this.f12565b);
        parcel.writeList(this.f12566d);
        parcel.writeParcelable(this.f12567f, 0);
        parcel.writeParcelable(this.f12568h, 0);
    }
}
