package anlzou.com.mapper;

import anlzou.com.entity.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}