package kadai15.kadai15_2;

/**
 * 練習15-2
 * フォルダ名が入っている変数folderとファイル名が入っている変数fileを連結して
 * 「c:¥javadev¥readme.txt」のような完全なファイル名としての文字列を完成させるメソッドを作成
 */
public class Main {
    public static void main(String[] args) {
        String folder = "c:¥javadev¥";
        String file = "readme.txt";
        System.out.println(concatenatePath(folder, file));
    }

    /**
     * 二つのパスを連結するメソッドです。
     * フォルダ名の末尾に"¥"がない場合は"¥"を付与してからファイル名と連結する
     *
     * @param folder フォルダ名(「c:¥javadev」や「c:¥user¥」のような末尾に¥が付いている形式とついていない形式)
     * @param file   ファイル名(Read.txtの形式)
     * @return 完全ファイル名の文字列を返す
     */
    public static String concatenatePath(String folder, String file) {
        if (!folder.endsWith("¥")) {
            folder += "¥";
        }
        return folder + file;
    }
}
