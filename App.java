import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator realCalculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char cal;

        String end = "0";
        while (!end.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            num2 = sc.nextInt();
            System.out.println("사칙연산기호를 넣어주세요 : ");
            cal = sc.next().charAt(0);

            double resultlist = realCalculator.calculate(num1, num2, cal);

            System.out.println(resultlist);
            System.out.println("더 계산하시겠습니까? exit 입력 시 종료 : ");
            sc.nextLine();
            end = sc.nextLine();
            List<Double> resultList = realCalculator.getResult();

            for (Double result : resultList) {
                System.out.println(result);
            }
        }
        realCalculator.zeroIndexDeleteList();
    }
}