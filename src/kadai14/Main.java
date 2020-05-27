package kadai14;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("4649", 9000);
        System.out.println(account1);
        Account account2 = new Account("4649", 3000);
        System.out.println(account2);
        if (account1.equals(account2)) {
            System.out.println("口座番号が同じです");
        } else {
            System.out.println("口座番号が同じではありません");
        }
    }
}
