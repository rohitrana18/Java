class operators{
    public static void main (String a[]){

        // Arithmetic operators 
        int num = 4;
      
      
        int num1 = 39;
        int result = num +num1;
        int result1 = num -num1;
        int result2 = num *num1;
        int result3 = num /num1;
        int result4 = num %num1;

        num = num +1;
        num +=1;
        num++; // post increment
        ++num; // pre increment
        num--;

        int result = num++; // first fetch the result  then perform increment
        int result = ++num; // first increment the value then fetch the result
        System.out.println(result);



        // // Relational Operators
        
        int n1 = 37;
        int n2 = 83;

        boolean resulta = n1 >n2;
        boolean resultb = n1< n2;
        boolean resultc = n1 == n2;
        boolean resultd = n1 >= n2;
        boolean resulte = n1 <= n2;
        boolean resultf = n1 != n2;
        



        System.out.println(resulta);
        System.out.println(resultb);
        System.out.println(resultc);
        System.out.println(resultd);
        System.out.println(resulte);
        System.out.println(resultf);



        // Logical operators
       
        int x=29;
        int y=93;
        int c=03;
        int b = 73;

        boolean result = c>b && x<y ;
        boolean result1 = c>b || x<y ;

        System.out.println(!result);
        System.out.println(result1);



        // Ternary operator

        // ?: this is the representation of ternary operator . We use ternary operator in place of if else statement because it save time and memory 
           

           int n = -1;
        int result = 0;

        result = n%2==0 ? 10 : 20 ;

        System.out.println(result);





        

    }
}