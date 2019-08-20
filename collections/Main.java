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

        System.out.println("*** Array List ***"); // more similar in concept to javascript

        ArrayList<Dogs> dogsArrayList = new ArrayList<Dogs>(); // created array list of type Dogs with angle brackets, second line is TO INITIALIZE IT
        dogsArrayList.addAll(Arrays.asList(dogArray)); // will add all of the array from above, first converts to list then takes array and adds it in order
        dogsArrayList.add(new Dogs("Mutt", 15, true)); // <-- use the method "add" instantiating a new object of type dog, THE WAY to add a single element to bottom of list

        for ( Dogs d : dogsArrayList)
        {
            System.out.println(d);
        }

        System.out.println();

        for ( Dogs d : dogsArrayList ) // each element is called "d" of type Dogs 
        {  
            if (d.getAverageWeight() >= 50)
            {
                System.out.println(d.getBreed() + " are large");
            } 
            else
            {
                System.out.println(d.getBreed() + " are small");
            }
            // System.out.println(d); // <-- common naming convention for class types, using lowercase letter of whatever that word is 
        }

        System.out.println();

        // cannot compare strings directly with equals ie "koua" == "koua" because strings are objects, 
        // DO NOT COMPARE OBJECTS because will probably not give u results u are after
        // HOW TO COMPARE STRINGS
        if (dogsArrayList.get(2).getBreed().equals("Turtle")) // to compare Strings have to use .equals <- method
        {
            System.out.println("We have a match");
        }
        else 
        {
            System.out.println("No match for " + dogsArrayList.get(2).getBreed());
        }

        // arrays and array lists KEEP ORDER

        System.out.println();

        // with an array we knew the length of it beforehand, because we set it up that way
        // with an arraylist we don't know the "size" of it, so we have to calculate it with a method because it can change over time
        System.out.println("dogsArrayList is (size) " + dogsArrayList.size()); // calls a method "size" to get the size of array list
        System.out.println(dogsArrayList.get(3)); // to find a specific element use method "get"
        dogsArrayList.remove(3); // to remove a specific element use method "remove"
        System.out.println(dogsArrayList.get(3));
        System.out.println();

        // in arraylist there are NO EMPTY SPOTS, when we remove it shifts everything up or back in order
        // iterators come into play when we work with Spring
        Iterator<Dogs> iterator = dogsArrayList.iterator(); // method inside object arraylist that converts it into an iterator
        // same result as for loop
        while (iterator.hasNext()) // hasNext method returns true as long as the iterator still has elements to go like for loop will go thru everything in there
        {
            // Dogs tempDog = iterator.next(); // have to call on this method to go to the next element
            //  System.out.println(tempDog);
            // *** BOTH WAYS WORK ***
            System.out.println(iterator.next());
        }

        System.out.println();
    }
}