package org.jasypt.web.pbeconfig;

import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/* JADX INFO: loaded from: classes.dex */
public final class WebPBEConfigFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        if (WebPBEConfigRegistry.getInstance().isWebConfigurationDone()) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        PrintWriter writer = servletResponse.getWriter();
        writer.write(WebPBEConfigHtmlUtils.createNotInitializedHtml());
        writer.flush();
    }

    public void init(FilterConfig filterConfig) {
    }
}
