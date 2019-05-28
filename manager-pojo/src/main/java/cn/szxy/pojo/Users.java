package cn.szxy.pojo;

import java.util.Objects;

/**
 * @Auther:wzer
 * @Date:2019/5/27
 * @Description:cn.szxy.pojo
 * @Version:1.0
 * 用户类
 **/
public class Users
{
    private Integer userid;
    private String username;
    private Integer userage;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public Integer getUserage() {
        return userage;
    }

    public Integer getUserid() {
        return userid;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }
}
