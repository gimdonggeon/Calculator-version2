import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> result = new ArrayList<>();

    public double calculate(int num1, int num2, char cal) {
        double value = 0;
        if (cal == '+') {
            value = num1 + num2;
        } else if (cal == '-') {
            value = num1 - num2;
        } else if (cal == '*') {
            value = num1 * num2;
        } else if (cal == '/') {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다");
            } else {
               value = num1 / num2;
            }
        } else {
            System.out.println("값을 잘 못 입력하셨습니다.");
        }
        result.add(value);
        return value;
    }

    public List<Double> getResult() {
        return result;
    }
    public void addResult(Double result){
        this.result.add(result);
    }
    public void zeroIndexDeleteList() {
        result.remove(0);
    }
}
