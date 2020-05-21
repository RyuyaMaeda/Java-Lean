package kadai14;

/**
 * 練習問題14-1
 * 口座番号を表すString型のフィールドaccountNumberと残高を表すint型のフィールドbalanceを持つ銀行口座クラスAccountの作成
 * さらに、このクラスにメソッドを追加し、以下の二つの条件を満たすようにする。
 * ①口座番号4649、残高1592円のaccountインスタンスを変数aに生成し、「system.out.println(a)」を実行すると、画面に「¥1592(口座番号 = 4649)と表示」
 * ②口座番号が等しければ等価と判断する（口座番号の先頭に半角スペースが付けられた場合も、スペースを無視して判断する）
 */
public class Account {

    /**
     * 口座番号
     */
    private String accountNumber;

    /**
     * 残高(円)
     */
    private int balance;

    /**
     * 文字列表現のメソッドです
     *
     * @return 残高と口座番号を含む文字列を返す
     */
    public String toString() {
        return "¥" + this.balance + "(口座番号 = " + this.accountNumber.trim() + ")";
    }

    /**
     * 等価判定のメソッドです
     * 口座番号が等しければ等価と判断する
     *
     * @param object
     * @return 等価の場合trueを返す, 等価でない場合falseを返す
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Account) {
            Account account = (Account) object;
            if (account.accountNumber.trim().equals(this.accountNumber.trim()) == true) {
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
