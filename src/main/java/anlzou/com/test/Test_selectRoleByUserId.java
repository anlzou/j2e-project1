/**
 * @author anlzou
 * @date 2020/4/21 11:36
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.SysRole;
import anlzou.com.mapper.SysRoleMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test_selectRoleByUserId {
    public static  void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        SysRoleMapper sysRoleMapper=session.getMapper(SysRoleMapper.class);
        try{
            List<SysRole> list=sysRoleMapper.selectRoleByUserId(1L);
            System.out.println(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
