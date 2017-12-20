package daoTest;

import com.afcat.common.vo.DUser;
import com.afcat.dal.dao.DUserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;




public class DaoJunitTest  extends SpringDaoJunitTest{
    @Autowired
    private DUserDao userDao;
    @Test
    public void addUser(){
        DUser user = new DUser();
        user.setUserId(55523);
        user.setUserName("刘恩龙。。。。");
        user.setUserRemark("添加user测试");

        userDao.addUser(user);
    }

    @Test
    public void updateUser(){
        DUser user = new DUser();
        user.setUserId(55588556);
        user.setUserName("不是我");
        user.setUserRemark("修改user测试");

        userDao.updateUser(user);
    }

    @Test
    public void queryUser(){
        List<DUser> userList = userDao.getAllUser();

        for(DUser l:userList){
            System.out.println(l.getUserName());
        }
    }

    @Test
    public void deleteUser(){
        userDao.deleteUser(55588556);

        queryUser();
    }

    @Test
    public void queryById(){
        DUser user = userDao.getUserById(55523);

        System.out.println(user.getUserName());
    }
}
