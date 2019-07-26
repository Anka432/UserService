public class UserService {

    String[] users;

    public UserService(String[] users) {
        this.users = users;
    }

    public boolean isUserExist(String name) {
        for (String each : users
        ) {
            if (each.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int countUsers(String[] users) {
        int counter = users.length;

        return counter;
    }


    public int countRepeatsUsers(String name){

        int repeatUsers = 0;
        for (String each:users
             ) {
            if (each.equals(name)){
                repeatUsers++;
            }
        }
        return repeatUsers;
    }













//    String[]users;
//
//    public UserService(String[]users){
//        this.users=users;
//    }
//
//    public boolean isUserExist(String name){
//
//        for (String user:users
//             ) {
//            if(user.equals(name)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int getUsersCount(){
//        int countUsers=users.length;
//        return countUsers;
//    }
//
//    public int getCountRepeatsByLogin(String login){
//        int countRepeats=0;
//        for (String user:users
//             ) {
//            if(user.equals(login)){
//                countRepeats++;
//            }
//        }
//        return countRepeats;
//    }
}
