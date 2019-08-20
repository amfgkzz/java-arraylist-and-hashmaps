package collections;

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

        dogArray[0] = new Dogs("Springer", 50, false);
    }
}