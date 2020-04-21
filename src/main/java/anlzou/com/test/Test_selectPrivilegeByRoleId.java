/**
 * @author anlzou
 * @date 2020/4/21 11:13
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.SysPrivilege;
import anlzou.com.mapper.SysPrivilegeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test_selectPrivilegeByRoleId {
    public static  void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        SysPrivilegeMapper sysPrivilegeMapper=session.getMapper(SysPrivilegeMapper.class);
        try{
            List<SysPrivilege> list=sysPrivilegeMapper.selectPrivilegeByRoleId(1l);
            System.out.println(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
