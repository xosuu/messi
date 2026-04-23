package org.joda.time.format;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes.dex */
interface InternalPrinter {
    int estimatePrintedLength();

    void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale);

    void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale);
}
