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
    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getAverageWeight()
    {
        return averageWeight;
    }

    public void setAverageWeight(int taco)
    {
        this.averageWeight = taco;
    }

    // because it is a boolean, usually named with an "is" instead of "get" <-- common
    public boolean isApartment()
    {
        return apartment;
    }

    public void setApartment(boolean taco)
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