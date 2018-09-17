package day05.TrainTwo.Train3;

public class Test {
    public static void main(String[] args) {
        try{
            // boolean check = login("admin", "bitch");
            boolean check = login("admin", "admin");
            if(check){
                System.out.println("欢迎登陆");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Boolean login(String name,String pwd) throws LoginException {
        if(!"admin".equals(name)){
            throw new LoginException("用户名不存在");
        }
        else if(!"admin".equals(pwd)){
            throw new LoginException("密码错误");
        }
        return true;
    }
}
