package com.example.web.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    /**
     * 用户名查找
     *
     * @param userName
     * @return
     */
    UserEntity findByUserName(String userName);

    /**
     * 用户名与邮箱查找
     *
     * @param userName
     * @param email
     * @return
     */
    UserEntity findByUserNameOrEmail(String userName, String email);
}
