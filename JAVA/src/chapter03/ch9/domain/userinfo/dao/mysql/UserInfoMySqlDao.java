package chapter03.ch9.domain.userinfo.dao.mysql;

import chapter03.ch9.domain.userinfo.UserInfo;
import chapter03.ch9.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySQL userID = " + userInfo.getUserId());
    }
}
