package com.sky.demo;

import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengyu
 * @date 2021/1/15 17:53
 */
public class GetParams {



    public static void main(String[] args) {
        Map<String, Object> mapParams = new HashMap<>();

        BufferedReader in = null;// 读取响应输入流
        StringBuffer sb = new StringBuffer();//map参数格式化成url发送参数格式
        String params = "";//格式化之后url传递的参数
        try {
            // 格式化参数
            if (mapParams.size() == 1) {
                for (Map.Entry<String, Object> entry : mapParams.entrySet()) {
                    sb.append(entry.getKey()).append("=").append(
                            entry.getValue() == null ? null :
                                    java.net.URLEncoder.encode(entry.getValue().toString(),
                                            "UTF-8"));  //对参数进行编码格式化以及拼接
                }
                params = sb.toString();
            } else {
                for (Map.Entry<String, Object> entry : mapParams.entrySet()) {
                    sb.append(entry.getKey()).append("=").append(
                            entry.getValue() == null ? null :
                                    java.net.URLEncoder.encode(entry.getValue().toString(),
                                            "UTF-8")).append("&");  //对参数进行编码格式化以及拼接
                }
                params = sb.toString().substring(0, sb.toString().length() - 1);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    }
