package com.nana.common.utils;

public class StringUtils {
    
    /**
     * @author: GUOYUJUN
     * @time: 2019/12/26 17:54
     * @description: 转大写
     */   
    public static String toUpperCase(String str) {
        return str == null ? str : str.toUpperCase();
    }

    /**
     * @author: GUOYUJUN
     * @time: 2019/12/26 17:55
     * @description: 转小写
     */
    public static String toLowerCase(String str) {
        return str == null ? str : str.toLowerCase();
    }
}
