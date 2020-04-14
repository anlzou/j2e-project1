package anlzou.com.mapper;

import anlzou.com.entity.SysUser;
import anlzou.com.entity.SysUserWithBLOBs;
import anlzou.com.entity.Users;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserWithBLOBs record);

    int insertSelective(SysUserWithBLOBs record);

    SysUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysUserWithBLOBs record);

    int updateByPrimaryKey(SysUser record);

//    SysUser selectUsersRole(Long id);
    List<SysUser> selectUsersRole(Long id);

//    SysUser selectUsersRoleb(Long id);
    List<SysUser> selectUsersRoleb(Long id);

//    SysUser selectUsersRolec(Long id);
    List<SysUser> selectUsersRolec(Long id);

    List<SysUser> selectUsersRoled(Long id);
}