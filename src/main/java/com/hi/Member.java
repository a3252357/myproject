package com.hi;

import java.util.Date;
import com.hi.TableName;

/**
 * Created by wan on 2017/1/17.
 */
@TableU("membermain")
public class Member {
    @TableName("ID")
    private Long id;
    @TableName("会员名")
    private String membername;
    @TableName("会员生日")
    private Date memberbrithday;
    @TableName("会员ID")
    private String memmberno;
    @TableName("会员密码")
    private String password;
    @TableName("会员电话")
    private String phonenumber;
    @TableName("创建日期")
    private Date createdate;
    @TableName("过期日期")
    private Date enddate;
    @TableName("会员QQ")
    private String qqno;
    @TableName("会员邮件")
    private String email;
    @TableName("性别")
    private String sex;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public Date getMemberbrithday() {
        return memberbrithday;
    }

    public void setMemberbrithday(Date memberbrithday) {
        this.memberbrithday = memberbrithday;
    }

    public String getMemmberno() {
        return memmberno;
    }

    public void setMemmberno(String memmberno) {
        this.memmberno = memmberno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getQqno() {
        return qqno;
    }

    public void setQqno(String qqno) {
        this.qqno = qqno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
