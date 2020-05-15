package com.bingqi.test;

import com.bingqi.service.QrCodeService;
import com.google.zxing.WriterException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestService {
    private QrCodeService service;
    private String path;
    private String content;

    @Before
    public void setUp(){
        System.out.println("---start---");
        service = new QrCodeService();
        path = "/Users/zhanggong/Desktop/QRCode.png";
        content = "YBNR\tID\t_YBRQ__MC\t_YBRQ__N\t_YBRQ__Y\t_YBRQ__R\t_YBRQ__S\t_YBWZ__WD\t_YBWZ__JD\t_YBWZ__JDDW\t_YBWZ__MC\tSJLY\tSJGXRQ\t_SJGXRQ__N\t_SJGXRQ__Y\t_SJGXRQ__R\t_SJGXRQ__S\t_SJGXRQ__F\t_SJGXRQ__M\n" +
                "{\"date\":\"2020-05-15\",\"temp\":\"19\",\"windlevel\":\"1\",\"qpf\":\"0.0\",\"uvi\":\"2\",\"pressure\":\"877\",\"windDir\":\"WNW\",\"iconDay\":\"0\",\"pop\":\"10\",\"realFeel\":\"22\",\"condition\":\"晴\",\"windDegrees\":\"315\",\"conditionId\":\"5\",\"hour\":\"9\",\"iconNight\":\"30\",\"snow\":\"0\",\"humidity\":\"83\",\"updatetime\":\"2020-05-15 09:21:36\",\"windSpeed\":\"1\"}\t4739e5fb-2f6a-4dfc-98e2-99e6958ce0b5\t2020/5/15\t2020\t5\t15\t9\t22\t100\t度\t中国云南省西双版纳傣族自治州勐海县\t墨迹天气\t2020/5/15 9:21\t2020\t5\t15\t9\t21\t36\n" +
                "{\"date\":\"2020-05-15\",\"temp\":\"21\",\"windlevel\":\"2\",\"qpf\":\"0.0\",\"uvi\":\"5\",\"pressure\":\"881\",\"windDir\":\"W\",\"iconDay\":\"0\",\"pop\":\"10\",\"realFeel\":\"24\",\"condition\":\"晴\",\"windDegrees\":\"270\",\"conditionId\":\"1\",\"hour\":\"10\",\"iconNight\":\"30\",\"snow\":\"0\",\"humidity\":\"52\",\"updatetime\":\"2020-05-15 09:21:36\",\"windSpeed\":\"8\"}\t7a774e45-5429-4a58-b495-dd11ac7f8670\t2020/5/15\t2020\t5\t15\t10\t22\t100\t度\t中国云南省西双版纳傣族自治州勐海县\t墨迹天气\t2020/5/15 9:21\t2020\t5\t15\t9\t21\t36\n" +
                "{\"date\":\"2020-05-15\",\"temp\":\"22\",\"windlevel\":\"2\",\"qpf\":\"0.0\",\"uvi\":\"7\",\"pressure\":\"881\",\"windDir\":\"W\",\"iconDay\":\"0\",\"pop\":\"10\",\"realFeel\":\"25\",\"condition\":\"晴\",\"windDegrees\":\"270\",\"conditionId\":\"1\",\"hour\":\"11\",\"iconNight\":\"30\",\"snow\":\"0\",\"humidity\":\"46\",\"updatetime\":\"2020-05-15 09:21:36\",\"windSpeed\":\"9\"}\tfe872cc9-ad7a-4ed5-8908-68d882dad4f9\t2020/5/15\t2020\t5\t15\t11\t22\t100\t度\t中国云南省西双版纳傣族自治州勐海县\t墨迹天气\t2020/5/15 9:21\t2020\t5\t15\t9\t21\t36\n" +
                "{\"date\":\"2020-05-15\",\"temp\":\"24\",\"windlevel\":\"2\",\"qpf\":\"0.0\",\"uvi\":\"9\",\"pressure\":\"880\",\"windDir\":\"W\",\"iconDay\":\"0\",\"pop\":\"10\",\"realFeel\":\"27\",\"condition\":\"晴\",\"windDegrees\":\"270\",\"conditionId\":\"1\",\"hour\":\"12\",\"iconNight\":\"30\",\"snow\":\"0\",\"humidity\":\"41\",\"updatetime\":\"2020-05-15 09:21:36\",\"windSpeed\":\"9\"}\t4d8f5075-0efe-4fb7-83ac-115609ce52ae\t2020/5/15\t2020\t5\t15\t12\t22\t100\t度\t中国云南省西双版纳傣族自治州勐海县\t墨迹天气\t2020/5/15 9:21\t2020\t5\t15\t9\t21\t36\n";}

    @After
    public void done(){
        System.out.println("----end---");
    }

    @Test
    public void testCreateCode() throws IOException, WriterException {
        Boolean res = service.createQrCode(path, content, 1600, "JPEG");
        System.out.println(res);
    }
    //        readQrCode(new FileInputStream(new File("/Users/zhanggong/Desktop/QRCode.png")));

    @Test
    public void testReadQrCode() throws IOException, WriterException {
        service.readQrCode(new FileInputStream(new File(path)));
    }
}
