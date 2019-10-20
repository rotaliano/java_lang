package function_object;

import java.util.function.*;

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
        //----------------
        Func1 func1 = FunctionObjectMain::isOdd;
        Func1 func11 = (x) -> { return x % 2 == 1; };
        System.out.println(func1.call(3));
        System.out.println(func11.call(3));

        Func2 func2 = new FunctionObjectMain()::addNamePrefix;
        Func2 func22 = (male, name) -> {
            if (male == true) { return "Mr." + name; }
            else { return "Ms." + name; }
        };
        System.out.println(func2.call(true, "AAAA"));
        System.out.println(func22.call(true, "BBB"));
    }

    public interface Func1 {
        public abstract boolean call(int x);
    }
    public interface Func2 {
        public abstract String call(boolean x, String y);
    }

    public static boolean isOdd(int x) { return (x % 2 == 1); }
    public String addNamePrefix(boolean male, String name) {
        if (male == true) { return "Mr." + name; }
        else { return "Ms." + name; }
    }
}
