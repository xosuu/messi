package org.jasypt.web.pbeconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.WebPBEConfig;

/* JADX INFO: loaded from: classes.dex */
public final class WebPBEConfigServlet extends HttpServlet {
    private static final long serialVersionUID = -7201635392816652667L;

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
    private void execute(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        try {
            WebPBEConfigRegistry webPBEConfigRegistry = WebPBEConfigRegistry.getInstance();
            if (webPBEConfigRegistry.isWebConfigurationDone()) {
                writeResponse(WebPBEConfigHtmlUtils.createConfigurationDoneHtml(), httpServletResponse);
                return;
            }
            int i10 = 0;
            if (CommonUtils.isEmpty(httpServletRequest.getParameter(WebPBEConfigHtmlUtils.PASSWORD_SETTING_FLAG))) {
                writeResponse(WebPBEConfigHtmlUtils.createInputFormHtml(httpServletRequest, false), httpServletResponse);
                return;
            }
            List<WebPBEConfig> configs = webPBEConfigRegistry.getConfigs();
            int i11 = 0;
            int i12 = 0;
            for (WebPBEConfig webPBEConfig : configs) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(WebPBEConfigHtmlUtils.VALIDATION_PREFIX);
                stringBuffer.append(i12);
                String parameter = httpServletRequest.getParameter(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(WebPBEConfigHtmlUtils.PASSWORD_PREFIX);
                stringBuffer2.append(i12);
                String parameter2 = httpServletRequest.getParameter(stringBuffer2.toString());
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(WebPBEConfigHtmlUtils.PASSWORD_RETYPED_PREFIX);
                stringBuffer3.append(i12);
                String parameter3 = httpServletRequest.getParameter(stringBuffer3.toString());
                if (!CommonUtils.isEmpty(parameter) && !CommonUtils.isEmpty(parameter2) && parameter2.equals(parameter3) && webPBEConfig.getValidationWord().equals(parameter)) {
                    i11++;
                }
                i12++;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            Calendar calendar = Calendar.getInstance();
            if (i11 < configs.size()) {
                ServletContext servletContext = getServletContext();
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Failed attempt to set PBE Configuration from ");
                stringBuffer4.append(httpServletRequest.getRemoteAddr());
                stringBuffer4.append(" [");
                stringBuffer4.append(simpleDateFormat.format(calendar.getTime()));
                stringBuffer4.append("]");
                servletContext.log(stringBuffer4.toString());
                writeResponse(WebPBEConfigHtmlUtils.createInputFormHtml(httpServletRequest, true), httpServletResponse);
                return;
            }
            for (WebPBEConfig webPBEConfig2 : configs) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(WebPBEConfigHtmlUtils.PASSWORD_PREFIX);
                stringBuffer5.append(i10);
                webPBEConfig2.setPassword(httpServletRequest.getParameter(stringBuffer5.toString()));
                i10++;
            }
            webPBEConfigRegistry.setWebConfigurationDone(true);
            ServletContext servletContext2 = getServletContext();
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("PBE Configuration succesfully set from ");
            stringBuffer6.append(httpServletRequest.getRemoteAddr());
            stringBuffer6.append(" [");
            stringBuffer6.append(simpleDateFormat.format(calendar.getTime()));
            stringBuffer6.append("]");
            servletContext2.log(stringBuffer6.toString());
            writeResponse(WebPBEConfigHtmlUtils.createConfigurationDoneHtml(), httpServletResponse);
        } catch (IOException e10) {
            getServletContext().log("Exception raised during servlet execution", e10);
            throw e10;
        } catch (Throwable th) {
            getServletContext().log("Exception raised during servlet execution", th);
            throw new ServletException(th);
        }
    }

    private void writeResponse(String str, HttpServletResponse httpServletResponse) {
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write(str);
        writer.flush();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        execute(httpServletRequest, httpServletResponse);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        execute(httpServletRequest, httpServletResponse);
    }
}
