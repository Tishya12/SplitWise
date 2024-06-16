import model.User;
import service.ExpenseManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("u1", "User1", "gaurav@workat.tech", "9876543210");
        User user2 = new User("u2", "User1", "gaurav@workat.tech", "9876543210");
        User user3 = new User("u3", "User1", "gaurav@workat.tech", "9876543210");
        User user4 = new User("u4", "User1", "gaurav@workat.tech", "9876543210");

        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.adduser(user1);




    }
}