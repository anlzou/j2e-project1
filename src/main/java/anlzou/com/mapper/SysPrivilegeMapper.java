package anlzou.com.mapper;

import anlzou.com.entity.SysPrivilege;

import java.util.List;

public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPrivilege record);

    int insertSelective(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPrivilege record);

    int updateByPrimaryKey(SysPrivilege record);

    List<SysPrivilege> selectPrivilegeByRoleId(Long role_id);
}