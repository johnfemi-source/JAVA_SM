import java.util.Scanner;
public class Successfuldeliveries{
public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);

    String commissiontable = """
   ____________________________________________
   |Collection Rate|Amount Per Parcel|Base Pay|
   |Less than 50%  |              160|  5,000 |
   |50-59%         |              200|  5,000 |
   |60-69%         |              250|  5,000 |
   |>=70%          |              500|  5,000 |

    """;
    System.out.println(commissiontable);

        System.out.print("ENter the number of successful deliveries: ");
        int delivery = inputCollector.nextInt();

        numberOfSuccessfuldeliveries(delivery);
}

    public static void numberOfSuccessfuldeliveries(int delivery){
    int wagesOfRider = 0;

    if(delivery < 50){
    wagesOfRider = delivery * 160 + 5000;
}   else if (delivery >= 50 && delivery <= 59){
    wagesOfRider = delivery * 200 + 5000;
}   else if (delivery >= 60 && delivery <= 69){
    wagesOfRider = delivery * 250 + 5000;
}   else if (delivery >= 70){
    wagesOfRider = delivery * 500 + 5000;
}

    System.out.println("The rider's wage is: " +  wagesOfRider);
}
}
