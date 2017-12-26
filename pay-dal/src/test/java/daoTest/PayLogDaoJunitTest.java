package daoTest;

import com.afcat.common.util.DateUtil;
import com.afcat.common.util.IDUtil;
import com.afcat.common.vo.PayLog;
import com.afcat.dal.dao.PayLogDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by xn.L on 2017/12/21.
 * 日志类测试
 */
public class PayLogDaoJunitTest extends SpringDaoJunitTest{
    @Autowired
    private  PayLogDao payLogDao;

    @Test
    public void writeLogs(){

        PayLog log = new PayLog();
        log.setLogId(IDUtil.getId());
        log.setLogIp("127.0.0.1");
        log.setLogClass("PayLogDaoJunitTest");
        log.setLogSuccess("1");
        log.setLogTime(DateUtil.getNowTime());
        payLogDao.writeLog(log);
    }

    @Test
    public void getErrorLog(){
        List<PayLog> logList = payLogDao.queryErrorLog();
        for (PayLog log:logList){
            System.out.println(log.getLogMsg()+log.getLogErrorcode());
        }
    }

}
