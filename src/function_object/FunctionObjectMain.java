package function_object;

import java.util.function.IntBinaryOperator;

public class FunctionObjectMain {
    public static int sub(int a, int b) {
        return a -b;
    }

    public static void main(String[] args) {
        // 関数オブジェクトを格納可能な型
        // ある特定の引数ともドリチを持つ関数オブジェクトを格納できるのは
        // その引数と戻り値をもつメソッド宣言を含んだSAM(single-abstract-method interface)インターフェースの型
        // 抽象メソッドを1つしか含まないインタフェースのこと
        IntBinaryOperator func = FunctionObjectMain::sub;
        int a = func.applyAsInt(5, 3);
        System.out.println("5 - 3 = " + a);
    }
}
