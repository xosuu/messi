package org.minidns.util;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MultipleIoException extends IOException {
    public static void a(AbstractList abstractList) throws IOException {
        if (abstractList.isEmpty()) {
            return;
        }
        if (abstractList.size() == 1) {
            throw ((IOException) abstractList.get(0));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            sb.append(((Exception) it.next()).getMessage());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        MultipleIoException multipleIoException = new MultipleIoException(sb.toString());
        Collections.unmodifiableList(abstractList);
        throw multipleIoException;
    }
}
