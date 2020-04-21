package anlzou.com.entity;

import java.util.Date;
import java.util.List;

public class SysUser {
    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("SysUser{");
//        sb.append("id=").append(id);
//        sb.append(", userName='").append(userName).append('\'');
//        sb.append(", userPassword='").append(userPassword).append('\'');
//        sb.append(", userEmail='").append(userEmail).append('\'');
//        sb.append(", createTime=").append(createTime);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "sysUsers{id="+id+",userName="+userName+","+roleList;
    }


//    private  SysRole role;
//    public SysRole getRole() {
//        return role;
//    }
//    public void setRole(SysRole role) {
//        this.role = role;
//    }

    private List<SysRole> roleList;
    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }
}