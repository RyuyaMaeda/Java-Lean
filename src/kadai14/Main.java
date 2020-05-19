package kadai14;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("4649", 9000);
        System.out.println(a1);
        Account a2 = new Account("4649", 3000);
        System.out.println(a2);
        if (a1.equals(a2) == true) {
            System.out.println("口座番号が同じです");
        } else {
            System.out.println("口座番号が同じではありません");
        }
    }
}
