package anlzou.com.entity;

public class SysRolePrivilege {
    private Long roleId;

    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysRolePrivilege{");
        sb.append("roleId=").append(roleId);
        sb.append(", privilegeId=").append(privilegeId);
        sb.append('}');
        return sb.toString();
    }
}