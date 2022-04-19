package chapter03.ch9.domain.userinfo.dao;

import chapter03.ch9.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
