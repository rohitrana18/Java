/* Datatpes in java are of two types 

(1). Primitive Datatype

i. Integer => int - 4 bytes, long - 8 bytes , short - 2 bytes, byte - 1 byte (-128 to 127).

ii. Float => double - 8 bytes, float - 4 bytes.

iii. Character => char - 2 bytes.

iv. Boolean 

(2). Non-Primitive Datatype
*/

class Datatype{
    public static void main(String a[]){

        int num =3763832; // Default value
        byte b = 127;
        short s = 671;
        long l = 531874698478375l;  // explicitly converted 


        double d = 74.44827; // Default value
        float f = 8427.849f; // explicitly converted

        char c = 'r'; // In character you have to put '' this only.


        Boolean bool = true; 



        // Literals in java 

        int num1 = 0b111;     // Binaray number

        int num2 = 0x7E;      // Hexadecimal number
        
        System.out.println(num2);
        System.out.println(num1);


        char g = '3';
        System.out.println(g);
    }
}




// ************************** Type Conversion and Type Casting *******************************

// When we do explicit Conversion it is called Casting

class data{
    public static void main(String a[]){
        byte by = 127;
        int in = 258;
        byte  k = (byte) in;

        float fl = 38.93f;
        int n = (int) fl;


        // Type promotion 
        
        byte b1 = 10;
        byte b2 = 20;
        int result = 10*20; // Here byte is promoted into integer because the result will be out of range of byte
        System.out.println(result);
    }
}