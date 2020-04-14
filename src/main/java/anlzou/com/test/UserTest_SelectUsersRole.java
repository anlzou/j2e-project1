/**
 * @author anlzou
 * @date 2020/4/14 18:01
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.SysUser;
import anlzou.com.mapper.SysUserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserTest_SelectUsersRole {
    public  static  void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        SysUserMapper sysUserMapper=session.getMapper(SysUserMapper.class);
        try{
            List<SysUser> sysUser=sysUserMapper.selectUsersRole(1001L);
            System.out.println(sysUser);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
