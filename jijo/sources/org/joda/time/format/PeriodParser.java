package org.joda.time.format;

import java.util.Locale;
import org.joda.time.ReadWritablePeriod;

/* JADX INFO: loaded from: classes.dex */
public interface PeriodParser {
    int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale);
}
