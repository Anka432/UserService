import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testIsUserExistWhenExist(){

        //is
        String []names= {"Karol","Paweł","Grzesiek","Michał"};
        UserService userService = new UserService(names);

        //then
        boolean result = userService.isUserExist("Grzesiek");

        //expected
        Assert.assertTrue(result);
    }

    @Test
    public void testIsUserExistWhenNoExist(){
        //is
        String[]names = {"Karol","Janek","Franek","Zosia"};
        UserService userService = new UserService(names);

        //then
        boolean result = userService.isUserExist("Michał");

        //expected
        Assert.assertFalse(result);
    }


    @Test
    public void testCountUsersNormal(){
        //is
        String[]names = {"Karol","Janek","Franek","Zosia"};
        UserService userService = new UserService(names);

        //then
        int count = userService.countUsers(names);

        //expected
        Assert.assertEquals(4,count);

    }

    @Test
    public void testCountUsersZero(){
        //is
        String[]names = {};
        UserService userService = new UserService(names);

        //then
        int count = userService.countUsers(names);

        //expected
        Assert.assertEquals(0,count);
    }

    @Test
    public void testCountRepeatUserWithRepeat(){

        //is
        String[]names = {"Karol","Zosia","Janek","Franek","Zosia"};
        UserService userService = new UserService(names);

        //than
        int result = userService.countRepeatsUsers("Zosia");

        //expected
        Assert.assertEquals(result,2);
    }

    @Test
    public void testCountRepeatUserWithoutRepeat(){

        //is
        String[]names = {"Karol","Janek","Franek","Zosia"};
        UserService userService = new UserService(names);

        //than
        int result = userService.countRepeatsUsers("Marysia");

        //expected
        Assert.assertEquals(result,0);
    }




























//    @Test
//    public void isUserExistWhenUserExist(){
//        //is
//        String[]users = {"Pablo","Kamil","Pablo"};
//
//        //then
//        UserService userService = new UserService(users);
//
//        //expected
//        boolean result = userService.isUserExist("Pablo");
//        Assert.assertTrue(result);
//
//    }
//
//    @Test
//    public void isUserExisteWhenUserNoExist(){
//
//        //is
//        String[] users = {"Michał", "Wojtek","Radek","Łukasz"};
//
//        //then
//       UserService userService = new UserService(users);
//       boolean result = userService.isUserExist("Franek");
//
//       //expected
//       Assert.assertFalse(result);
//    }
//
//    @Test
//    public void testGetCountUsers(){
//
//        //is
//        String[]users = {"Michał", "Wojtek","Radek","Łukasz"};
//
//        //then
//        UserService userService=new UserService(users);
//        int count = userService.getUsersCount();
//
//        //expected
//        Assert.assertEquals(4,count);
//    }
//
//    @Test
//    public void testGetUsersCount(){
//
//        //is
//        String[]users = {"Michał", "Radek","Łukasz","Wojtek","Michał"};
//
//        //then
//        UserService userService = new UserService(users);
//        int repeats =userService.getCountRepeatsByLogin("Michał");
//
//        //expected
//        Assert.assertEquals(2,repeats);
//
//    }
}
