package collections;
import java.util.*;

public class Main
{
    public static void main(String[] args) // <-- always the same, but the JDK is always looking for this
    {
        // when you DECLARE an array you have to tell it its type
        // *** CAN SETUP ARRAYS LIKE BELOW BUT NOT HOW IT IS TAUGHT AND USED ***
        // Dogs dogArray[]; // <-- array has type class Dogs, have to stick with that type
        // dogArray = new Dogs[5]; // <-- AT THE BEGINNING, you decide how many elements it has! this one has 0-4

        // THE RIGHT WAY TO SET UP ARRAYS --> way it is taught or normally seen
        Dogs[] dogArray = new Dogs[5];
        
        System.out.println("*** Arrays ***");

        // INSTANTIATED AN OBJECT OF TYPE DOGS at array element specified
        dogArray[0] = new Dogs("Springer", 50, false); // element zero
        dogArray[1] = new Dogs("Bulldog", 50, true); // element one
        dogArray[2] = new Dogs("Collie", 50, false); // element two
        dogArray[3] = new Dogs("Chihuahua", 5, true); // element three
        dogArray[4] = new Dogs("Corgie", 35, true); // element four
        // Java will default (meaning if missing or no value present -> will give value ie null, undefined, zero)
        // i.e. if dogArray[2] was not defined, it will equal to null

        System.out.println("For Loop");

        for (int i = 0; i < dogArray.length; i++)
        {
            System.out.println(dogArray[i]);
        }

        System.out.println("Breed 4 good for apartment? " + dogArray[3].isApartment());

        System.out.println();

        System.out.println(dogArray.toString());

        System.out.println();

        System.out.println(Arrays.toString(dogArray));

    }
}