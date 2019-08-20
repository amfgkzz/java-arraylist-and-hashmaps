package collections;

public class Dogs
{
    // fields - attributes <-- (each individual is called) -> whole object (all fields/attributes) -> state the object
    private String breed;
    private int averageWeight;
    private boolean apartment;

    // constructor
    public Dogs(String breed, int averageWeight, boolean apartment)
    {
        this.breed = breed;
        this.averageWeight = averageWeight;
        this.apartment = apartment;
    }

    // methods - behavior - getters and setters
    private String getBreed()
    {
        return breed;
    }

    private void setBreed(String breed)
    {
        this.breed = breed;
    }

    private int getAverageWeight()
    {
        return averageWeight;
    }

    private void setAverageWeight(int taco)
    {
        this.averageWeight = taco;
    }

    // because it is a boolean, usually named with an "is" instead of "get" <-- common
    private boolean isApartment()
    {
        return apartment;
    }

    private void setApartment(boolean taco)
    {
        this.apartment = taco;
    }

    @Override
    public String toString()
    {
        return "Dogs : {" + "\n" +
        "breed: " + breed + ",\n"+
        "averageWeight: " + averageWeight + ",\n" +
        "apartment: " + apartment + ",\n" +
        " }";
    }
}