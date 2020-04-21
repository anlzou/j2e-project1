package anlzou.com.mapper;

import anlzou.com.entity.SysPrivilege;
import anlzou.com.entity.SysRole;
import anlzou.com.entity.SysUser;

import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectRoleByUserId(Long role_id);
}