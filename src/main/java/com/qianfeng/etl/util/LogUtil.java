package com.qianfeng.etl.util;

import com.qianfeng.etl.util.common.EventLogsConstant;
import org.apache.commons.lang.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LogUtil {


public Map parserLog(String log) {
    //定义一个map
    Map<String,String> info=new ConcurrentHashMap<String, String>();
    if(StringUtils.isEmpty(log)){
        String []fields=log.split(EventLogsConstant.COLUMN_SEPARTOR);
        if(fields.length==4){
            //向info赋值
            info.put(EventLogsConstant.EVENT_COLUMN_NAME_IP,fields[0]);
            info.put(EventLogsConstant.EVENT_COLUMN_NAME_SERVER_TIME),
            fields[1].replaceAll(".","");

            //判断是否有参数列表
            int index=fields[3].indexOf("?");
            if(index >0){
                //获取参数列表
                String params=fields[3].substring(index);

            }
        }
    }
return null;
}
}