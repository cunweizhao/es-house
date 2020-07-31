package com.zcw.eshouse.web.dto;

/**
 * @ClassName : UserDTO
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-31 18:42
 */
public class UserDTO {
    private Long id;
    private String name;
    private String avatar;
    private String phoneNumber;
    private String lastLoginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
