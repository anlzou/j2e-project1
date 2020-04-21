package anlzou.com.entity;

public class SysPrivilege {
    private Long id;

    private String privilegeName;

    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysPrivilege{");
        sb.append("id=").append(id);
        sb.append(", privilegeName='").append(privilegeName).append('\'');
        sb.append(", privilegeUrl='").append(privilegeUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}