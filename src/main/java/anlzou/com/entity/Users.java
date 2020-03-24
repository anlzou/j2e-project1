/**
 * @author anlzou
 * @date 2020/3/24 15:45
 * @version xx
 * @description xx
 */

package anlzou.com.entity;

public class Users {
    private  int id;
    private  String name;
    private  String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass=" + pass +
                '}';
    }
}
