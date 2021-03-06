/**
 * @author anlzou
 * @date 2020/4/14 19:28
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.SysUser;
import anlzou.com.mapper.SysUserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersTest_SelectUsersRolec {
    public  static  void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        SysUserMapper sysUserMapper=session.getMapper(SysUserMapper.class);
        try{
            List<SysUser> sysUser=sysUserMapper.selectUsersRolec(1001L);
            System.out.println(sysUser);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
