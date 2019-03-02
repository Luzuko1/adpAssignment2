import java.util.*;

public class CollectionClass
{
    public static void main(String[] args)
    {
        System.out.println("ArrayList");
        System.out.println("*******************************************");


        ArrayList<String> names = new ArrayList<>();

        names.add("Luzuko Ndlebe");
        names.add("John Smith");
        names.add("Mike Wllow");
        names.add("Bob Marley");
        names.add("Wllow Smith");

        names.set(1,"May Day");
        names.remove(3);

        String mike = "Micheal Jackson";
        names.add(mike);


        for (int i = 0; i <names.size() ; i++)
        {
            System.out.println(names.get(i));
        }
        if (names.contains(mike))
        {
            System.out.println("Mike is here");
        }

        System.out.println("---------------------------------------------");
        System.out.println("SET");
        System.out.println("*********************************************");

        Set<String> firstSet = new LinkedHashSet();

        Set<String> secondSet = new TreeSet<>();
        firstSet.add("Mouse");
        firstSet.add("Cat");
        firstSet.add("Cow");
        firstSet.add("Dog");

        for(String animals: firstSet)
        {
            System.out.println(animals);
        }

        if (secondSet.isEmpty())
        {
            System.out.println("This Set is empty.");
        }

        System.out.println("---------------------------------------------");
        System.out.println("MAPS");
        System.out.println("*********************************************");

        Map mapOne = new HashMap();

        mapOne.put(1, "John");
        mapOne.put(2,"Mike");
        mapOne.put(3,"Jack");
        mapOne.put(4,"Sammy");

        String person1 = (String)mapOne.get(1);
        String person2 = (String)mapOne.get(2);
        String person3 = (String)mapOne.get(3);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
