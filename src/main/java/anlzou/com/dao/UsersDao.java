/**
 * @author anlzou
 * @date 2020/3/24 15:48
 * @version xx
 * @description xx
 */

package anlzou.com.dao;
import anlzou.com.entity.Users;
import java.util.List;

public interface UsersDao {
    /*
查询users数据表中所有数据
 */
    List<Users> queryAll();
}
