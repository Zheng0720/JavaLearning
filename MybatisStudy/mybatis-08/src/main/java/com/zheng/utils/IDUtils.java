package com.zheng.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author ZhengXinchang
 * @create 2021-09-24-14:53
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
