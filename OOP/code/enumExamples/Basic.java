package com.kunal.enumExamples;

public class Basic {
    enum Week implements A{
        Monday, Tuesday(5), Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is Week
        // another constructor
        Week (int a) {
            System.out.println(a);

        }
        void display() {

        }

        Week() {
            System.out.println("Constructor called for " + this);
        }

         @Override
         public void hello() {
             System.out.println("hey how are you");
         }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

        Week week1 = Week.Tuesday;
//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
