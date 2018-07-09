package com.afcat.mailserver.test.v2;

import com.afcat.mailserver.title.FileTitleHandle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xn.L on 2018/7/9.
 */
public class ClientNumberTest {
    @Test
    public void getNumberTest(){
        String type="xd";
        FileTitleHandle handle = new FileTitleHandle(type);


        Assert.assertEquals(2,handle.getNumber());
    }
    @Test
    public void setNumberTest(){
        String type = "db";
        FileTitleHandle handle = new FileTitleHandle(type);

        handle.setClientNumber();

        FileTitleHandle handles = new FileTitleHandle(type);


        Assert.assertEquals(2,handle.getNumber());
    }
}
