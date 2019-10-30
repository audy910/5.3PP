public class dog implements Comparable
{
    //global variables
    private String name, breed;
    private int age, compare;
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


    public String compareTo(dog someDog)
    {
        if(this.age < someDog.age)
        {
            compare = -1;

        }else if(this.age == someDog.age)
        {
            compare = 0;
        }
        else {
            compare = 1;
        }

        String output= "";
        if(compare == -1 )
        {
            output = someDog.getName() + " is older";
        }//end if
        else if (compare == 0)
        {
            output = "they are the same age";
        }//end else if
        else
        {
            output = this.getName() + " is older";
        }//end else
        return output;
    }//end compareTo




    @Override
    public int compareTo(Object o) {
        return 0;
    }
}//end dog
