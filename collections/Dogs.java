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

    // methods - behavior - getters
    private String getBreed()
    {
        return breed;
    }

    private int getAverageWeight()
    {
        return averageWeight;
    }

    private boolean getApartment()
    {
        return apartment;
    }

    // methods - behavior - setters
    private void setBreed(String breed)
    {
        this.breed = breed;
    }

    private void setAverageWeight(int taco)
    {
        this.averageWeight = taco;
    }

    private void setApartment(boolean taco)
    {
        this.apartment = taco;
    }
}