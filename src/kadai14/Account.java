package kadai14;

/**
 * 練習問題14-1
 * 口座番号を表すString型のフィールドaccountNumberと残高を表すint型のフィールドbalanceを持つ銀行口座クラスAccountの作成
 * さらに、このクラスにメソッドを追加し、以下の二つの条件を満たすようにする。
 * ①口座番号4649、残高1592円のaccountインスタンスを変数aに生成し、「system.out.println(a)」を実行すると、画面に「¥1592(口座番号 = 4649)と表示」
 * ②口座番号が等しければ等価と判断する（口座番号の先頭に半角スペースが付けられた場合も、スペースを無視して判断する）
 */
public class Account {
    private String accountNumber;
    private int balance;

    public String toString() {
        return "¥" + this.balance + "(口座番号 = " + this.accountNumber.trim() + ")";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Account) {
            Account a = (Account) o;
            String s1 = a.accountNumber.trim();
            String s2 = this.accountNumber.trim();
            if (s1.equals(s2) == true) {
                return true;
            }
        }
        return false;
    }

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
