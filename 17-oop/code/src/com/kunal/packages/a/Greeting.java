package com.kunal.packages.a;
        //To include all class files
// import com.kunal.packages.b.*;
import com.kunal.packages.b.Message;
// Class included so u can create objs and use methods,variables.

        // Below one import inside methods and var in class,Use static or not-Depends
//import static com.kunal.packages.b.Message.*;
// Not work as non static func can't access->import com.kunal.packages.b.Message.message;
        // Use static for static func.& variables.Hence, can accessed without class name
// import static com.kunal.packages.b.Message.message1; or .Message.*;
        /*AMBIGUITY:when static members of same name are imported from diff. classes
                    Compiler throws error as which member to use.So using static is
                    not beneficial(in rare cases).
        */          

public class Greeting{
    public static void main(String[] args) {
        // without import
//         com.kunal.packages.b.Message.message1(); 
//         com.kunal.packages.b.Message obj = new com.kunal.packages.b.Message();
//         obj.message();
         Message obj =  new Message();
         obj.message();
         message1(); //without Message.message1();
         //message() is accessible in diff. pkg because it's public(Not good practice).
          
         //if func.modifier is "protected" 
         //then message() access in diff. pkg class ONLY
         //if it's a subclass(extends Message)
         //also subclass obj can ONLY Access not other one not even parent class obj
         Greeting obj = new Greeting();
         obj.message();
    }
}
