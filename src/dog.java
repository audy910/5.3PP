public class dog implements Comparable
{
    //global variables
    private String name, breed;
    private int age;
    private double weight;
    private static int count;

    //default constructor
    public dog()
    {
        name = null;
        breed = null;
        age = 0;
        weight = 0.0;
        count++;
    };//end default

    //constructor main 4 arg
    public dog(String name, String breed, int age, double weight)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        count++;
    }//end Dog

    //brain method
    public double toKilo()
    {
        double output;
        output = weight * 0.453592;
        return output;
    }//end toKilo
    //getters
    public String getName()
    {
        return name;
    } //end getName
    public String getBreed()
    {
        return breed;
    } //end getBreed
    public int getAge()
    {
        return age;
    } //end getAge
    public double getWeight()
    {
        return weight;
    } //end getWeight
    public String getCount()
    {
        return count + " dogs";
    }//end getCount
    //setters
    public void setName()
    {
        this.name = name;
    }//end setName
    public void setBreed()
    {
        this.breed = breed;
    }//end setBreed
    public void setAge()
    {
        this.age = age;
    }//end setAge
    public void setWeight()
    {
        this.weight = weight;
    }//end setWeight

    //toString
    public String toString() {
        String output = "";
        output = name + " is a " + age + " year old " + breed + " that weighs " + weight;
        return output;
    }//end toString()


    public int compareTo(dog someDog)
    {
        if(this.age < someDog.age)
        {
            return -1;

        }else if(this.age == someDog.age)
        {
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}//end dog
