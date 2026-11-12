package Section_01;

public class Challenge_01 {
    public static void main(String[] args){
        double varOne = 20.00;
        double varTwo = 80.00;
        double resultOne = (varOne + varTwo) * 100;
        double resultTwo = resultOne % 40;
        boolean value = resultTwo == 0 ? true : false;
        System.out.println(value);
        if(!value){
            System.out.print(("Got some remainder!!"));
        }
    }
}
