package com.morthan.learn.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.util.Map;

/**
 * <p>名称 : 把freemarker作为报文模板,注入数据map生成可以发送的报文xml文件 </p>
 * <p>版本 : 1.0 </p>
 * <p>作者 : M.chen </p>
 * <p>日期 : 2018/5/25  16:28 </p>
 */
public class FreemarkerUtils {

    /**
     * 组合模板文件和参数,并转换成String
     * @param templateFileName 模板文件名称 必须带.ftl后缀
     * @param templateFilePath 模板文件相对路径
     * @param paramMap 参数
     * @return 组合模板文件和参数的xml字符串
     */
    public static String getFtlString(String templateFileName,String templateFilePath,Map<String, String> paramMap) throws Exception{
        Configuration config = new Configuration(Configuration.VERSION_2_3_22);
        //如果当前方法不是static，直接使用this.getClass()
        config.setClassForTemplateLoading(FreemarkerUtils.class, templateFilePath);
        config.setDefaultEncoding("UTF-8");//要UTF-8,不然中文乱码
        //获取模板文件
        Template template = config.getTemplate(templateFileName);
        return FreeMarkerTemplateUtils.processTemplateIntoString(template, paramMap);//注入数据并转成String
    }
}
