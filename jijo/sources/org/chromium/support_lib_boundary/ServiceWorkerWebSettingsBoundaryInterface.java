package org.chromium.support_lib_boundary;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z9);

    void setAllowFileAccess(boolean z9);

    void setBlockNetworkLoads(boolean z9);

    void setCacheMode(int i10);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
