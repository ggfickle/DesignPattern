package designPatter.proxy.jdk;

public class UserDao2 implements IUserDao{
    @Override
    public void selectUser() {
        System.out.println("get user Dao2 success ");
    }
}
