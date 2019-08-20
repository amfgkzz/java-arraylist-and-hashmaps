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
        // anytime we create an internal object -> in our case iterator we create a class file with dollar signs in our case it is main$1.class
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

        // because arraylist keeps things in order WE CAN SORT THEM
        // groups of data are called "Collections"
        Collections.sort(dogsArrayList, new Comparator<Dogs>()
        {
            // comparing the TWO objects DESC
           // public int compare (Dogs o1, Dogs o2) // HAVE TO BE SAME TYPE, o1 and o2 are object1, object2
           // {
           //     return o2.getBreed().compareToIgnoreCase(o1.getBreed());
           // }

            // *** ASC CASE
            public int compare (Dogs o1, Dogs o2) // HAVE TO BE SAME TYPE, o1 and o2 are object1, object2
            {
                // return o1.getBreed().compareToIgnoreCase(o2.getBreed());

                // SORT BY AVERAGE WEIGHT
                return o1.getAverageWeight() - o2.getAverageWeight(); // asc, but if want desc order switch objects around
            }


        });

        for ( Dogs d : dogsArrayList)
        {
            System.out.println(d);
        }

        System.out.println();

        System.out.println("*** HashMaps ***");
        // when working with java WEB API's most common collections we work with is arraylist
        // next most common is HashMaps
        // HashMap<Key, Value> keys are unique (most common keys are integer, 
        // string but can be anything as long as unique),
        // values can be whatever
        HashMap<Integer, Dogs> dogsHashMap = new HashMap<Integer, Dogs>();

        int hashCount = 0;
        for (Dogs d : dogsArrayList)
        {
            // the put method will do
            // put(KEY, VALUE) - KEY does not exist - add
            // - KEY DOES EXIST - replace, ie will replace/add if does or doesnt exist
            dogsHashMap.put(hashCount, d);
            hashCount++;
        }

        dogsArrayList.clear(); // removes all of the elements in the arraylist
        
        System.out.println(dogsHashMap.get(3)); 
        // do not assume that hashmaps are in order because they arent
        // but this makes it very very efficient at using memory, java will handle where to put in memory
        // without worrying about order
        System.out.println(dogsHashMap.size());
        dogsHashMap.remove(3);
        System.out.println(dogsHashMap.get(3));
        System.out.println(dogsHashMap.size());
        System.out.println();

        for (Integer i : dogsHashMap.keySet()) // method keySet will return all the keys in the hashmap
        {
            System.out.println("key: " + i + " value: " + dogsHashMap.get(i));
        }
        System.out.println();

        // In order to sort a hashmap, must convert to an arraylist AND THEN sort it
        // ArrayList can only take in ONE type, but HashMap.Entry <-- is a type that pairs up our hashmap
        // with key, values. Entry also needs the parameters
        ArrayList<HashMap.Entry<Integer, Dogs>> sortedMap = new ArrayList<HashMap.Entry<Integer, Dogs>>();
        sortedMap.addAll(dogsHashMap.entrySet()); // method that returns all of the HashMap.Entry

        Collections.sort(sortedMap, new Comparator<HashMap.Entry<Integer, Dogs>>()
        {
            public int compare (HashMap.Entry<Integer, Dogs> o1, HashMap.Entry<Integer, Dogs> o2)
            {
                return o1.getValue().getAverageWeight() - o2.getValue().getAverageWeight();
            }
        });

        for ( HashMap.Entry<Integer, Dogs> d : sortedMap )
        {
            System.out.println("key: " + d.getKey() + " value: " + d.getValue());
        }
        System.out.println();
    }
}