package com.morthan.learn.test;

import com.morthan.learn.util.FreemarkerUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>名称 : freemarker作为报文模板组装报文 </p>
 * <p>版本 : 1.0 </p>
 * <p>作者 : M.chen </p>
 * <p>日期 : 2018/5/25  17:06 </p>
 */
@Slf4j
public class FreemarkerTest {
    @Test
    public void freemarkerTest(){
        //准备参数
        Map<String,String> map = new HashMap<>();
        map.put("reqTime",new Date().toString());
        map.put("appId","app1234");
        map.put("tel","5432147");
        map.put("name","morthan");
        map.put("code","Freemarker Test OK!");
        //获取报文String
        String ftlString = "";
        try {
            ftlString = FreemarkerUtils.getFtlString("temp2string.ftl", "/templates", map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //打印报文
        log.info(ftlString);
    }
}
