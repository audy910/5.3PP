public class dogDriver
{
    public static void main(String[] args)
    {
        //give classes a use
        dog dog3 = new dog("Brady", "Maltipoo", 7, 26.6);
        dog dog1 = new dog("Fang", "Husky", 5, 80);
        dog dog2 = new dog("Nutmeg", "Australian Sheepdog", 12, 45.0);

        //test
        System.out.println(dog1.getName() + "'s breed is a " + dog1.getBreed() + " and is "
                + dog1.getAge() + " years old.");
        System.out.println(dog2.getName() + " weight in kilograms is " + dog2.toKilo());
        System.out.println(dog3.toString());
        System.out.println(dog1.getCount());
        System.out.println(dog3.compareTo(dog1));

    }//end main
}//end dogDriver
