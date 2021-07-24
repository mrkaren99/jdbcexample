package jdbcexample;

import jdbcexample.manager.UserManager;
import jdbcexample.model.User;

public class JdbcExample {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user = User.builder()
                .name("poxos4")
                .surname("poxosyan4")
                .email("poxos4@mail.com")
                .password("poxos4")
                .build();
        System.out.println("Before: "+ user);
        userManager.addUser(user);
        System.out.println("After: " + user);

//        List<User> users = userManager.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//
//        userManager.deleteUser(1);
//
//        users = userManager.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//
//        User userById = userManager.getUserById(3);
//        System.out.println(userById);
//        userById.setName("Petros");
//        userById.setSurname("Petrosyan");
//        userManager.updateUser(userById);
//        System.out.println(userManager.getUserById(3));
    }

}
