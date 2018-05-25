
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise_3
{

    public void removeevenInRange (LinkedList<Integer> list, int startingIndex, int endingIndex)
    {
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
        {
            int number = iterator.next();

            if (number % 2 == 0 && number >= startingIndex && number <endingIndex)
            {
                iterator.remove();
            }



        }
        System.out.println(list);
    }

    public static void main(String[] args)
    {
       Exercise_3 exercise_3 = new Exercise_3();
        LinkedList<Integer> list = new LinkedList<>();
        int startingIndex=5;
        int endingIndex=10;

        list.add(1);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(10);
        list.add(7);
        list.add(27);
        list.add(54);
        list.add(25);
        list.add(15);
        list.add(13);
        list.add(12);
        list.add(116);

        exercise_3.removeevenInRange(list, startingIndex, endingIndex );




    }

}
