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

    }
}