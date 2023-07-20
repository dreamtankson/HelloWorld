public class Calculator{
    public Calculator(){

    }

    public double add(int a,int b){
        return a;
    }

    public static void main(String[] args){
        Calculator  myCalculator = new  Calculator();
        System.out.println(myCalculator.add(5, 7));
    }
}
