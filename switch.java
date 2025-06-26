public class s
{
    public static void main(String a[])
     {
        int n =8;

        switch(n)
        {
          case 1:
            System.out.println("Monday");
            break;

             case 2:
               System.out.println("Tuesday");
                        break;


             case 3:
            System.out.println("Wednesday");
              break;



             case 4:
            System.out.println("Thrusday");
             break;


             case 5:
            System.out.println("Friday");
             break;



             case 6:
            System.out.println("Saturday");
             break;


             case 7:
            System.out.println("Sunday");
             break;
       
            default :
            System.out.println("INVALID NUMBER");
       
        }








        // New form of switch statement in java changes occur after java 12.



          String day = "Saturday";

        switch(day)
        {
          case "Saturday","Sunday" -> System.out.println("Can wake 8am in morning");

          default -> System.out.println("Wake at 6am ");

        }

    }

}