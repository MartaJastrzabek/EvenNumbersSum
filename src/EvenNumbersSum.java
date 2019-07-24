public class EvenNumbersSum {
    private int sum;

    public void displayEvenNumbers(){
        int i = 0;
        while (i<=100){
            if(i%2==0){
                System.out.print(i + ", ");
                sum+=i;
            }
            i++;
        }
        System.out.println();
    }

    public String getSum(){
        return "Suma liczb parzystych z przedziału 0-100 wynosi: " + sum;
    }
}
