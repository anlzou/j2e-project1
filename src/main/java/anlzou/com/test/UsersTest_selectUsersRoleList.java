/**
 * @author anlzou
 * @date 2020/4/21 10:47
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.SysUser;
import anlzou.com.mapper.SysUserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersTest_selectUsersRoleList {
    public  static  void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        SysUserMapper sysUserMapper=session.getMapper(SysUserMapper.class);
        try{
            List<SysUser> sysUserList=sysUserMapper.selectUsersRoleList();
            for (SysUser s:sysUserList) {
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
