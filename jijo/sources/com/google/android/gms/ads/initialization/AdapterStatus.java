package com.google.android.gms.ads.initialization;

/* JADX INFO: loaded from: classes.dex */
public interface AdapterStatus {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State NOT_READY;
        public static final State READY;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ State[] f1955a;

        static {
            State state = new State("NOT_READY", 0);
            NOT_READY = state;
            State state2 = new State("READY", 1);
            READY = state2;
            f1955a = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f1955a.clone();
        }
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
