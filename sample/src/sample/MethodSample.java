package sample;

import javax.naming.spi.DirStateFactory.Result;

public class MethodSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // 2つの数値を加算した結果を出力
        var number1 = 34;
        var number2 = 12;
        
        sumMethod(number1, number2);
        
        var result2 = sumMethod2(number1, number2);
        System.out.println("sumMethod2の結果は" + result2);
        
        

    }

public static void sumMethod(int num1, int num2) {
    
    int result = num1 + num2;
    System.out.println("sumMethod1結果は" + result + "です");
}

public static int sumMethod2(int num1, int num2) {
    
    int result = num1 + num2;
    return result;
}

}
