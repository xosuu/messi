package org.jasypt.web.pbeconfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class WebPBEInitializationContextListener implements ServletContextListener {
    public static final String INIT_PARAM_INITIALIZER_CLASS_NAME = "webPBEInitializerClassName";
    static /* synthetic */ Class class$org$jasypt$web$pbeconfig$WebPBEInitializer;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError().initCause(e10);
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) throws Throwable {
        String initParameter = servletContextEvent.getServletContext().getInitParameter(INIT_PARAM_INITIALIZER_CLASS_NAME);
        if (CommonUtils.isEmpty(initParameter)) {
            throw new EncryptionInitializationException("webPBEInitializerClassName context initialization parameter not set in web.xml");
        }
        try {
            Class<?> clsLoadClass = Thread.currentThread().getContextClassLoader().loadClass(initParameter);
            Class clsClass$ = class$org$jasypt$web$pbeconfig$WebPBEInitializer;
            if (clsClass$ == null) {
                clsClass$ = class$("org.jasypt.web.pbeconfig.WebPBEInitializer");
                class$org$jasypt$web$pbeconfig$WebPBEInitializer = clsClass$;
            }
            if (clsClass$.isAssignableFrom(clsLoadClass)) {
                try {
                    ((WebPBEInitializer) clsLoadClass.newInstance()).initializeWebPBEConfigs();
                    return;
                } catch (IllegalAccessException e10) {
                    throw new EncryptionInitializationException(e10);
                } catch (InstantiationException e11) {
                    throw new EncryptionInitializationException(e11);
                }
            }
            StringBuffer stringBuffer = new StringBuffer("Class ");
            stringBuffer.append(initParameter);
            stringBuffer.append(" does not implement interface ");
            Class clsClass$2 = class$org$jasypt$web$pbeconfig$WebPBEInitializer;
            if (clsClass$2 == null) {
                clsClass$2 = class$("org.jasypt.web.pbeconfig.WebPBEInitializer");
                class$org$jasypt$web$pbeconfig$WebPBEInitializer = clsClass$2;
            }
            stringBuffer.append(clsClass$2.getName());
            throw new EncryptionInitializationException(stringBuffer.toString());
        } catch (ClassNotFoundException e12) {
            throw new EncryptionInitializationException(e12);
        }
    }
}
