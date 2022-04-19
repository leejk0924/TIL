package chapter03.ch9.web.userinfo;

import chapter03.ch9.domain.userinfo.UserInfo;
import chapter03.ch9.domain.userinfo.dao.UserInfoDao;
import chapter03.ch9.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import chapter03.ch9.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\jk\\Documents\\dev\\TIL\\JAVA\\src\\chapter03\\db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE"))
            userInfoDao = new UserInfoOracleDao();
        else if (dbType.equals("MYSQL"))
            userInfoDao = new UserInfoMySqlDao();
        else{
            System.out.println("db error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
