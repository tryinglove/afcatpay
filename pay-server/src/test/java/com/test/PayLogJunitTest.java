package com.test;

import com.afcat.server.util.LogUtil;
import org.junit.Test;

/**
 * Created by xn.L on 2017/12/21.
 */
public class PayLogJunitTest extends SpringServiceJunitTest{
    @Test
    public void success(){
        LogUtil.writeSuccessLog("127.0.0.2","mac","PayLogJunitTest","成功");
    }
}
