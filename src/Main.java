import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        int randlist = 0;
        Scanner keyboard=new Scanner(System.in);

        ArrayList<Integer> Thelist = new ArrayList();
        Thelist.add(50);
        Thelist.add(25);
        Thelist.add(12);
        Thelist.add(36);
        Thelist.add(42);
        Thelist.add(96);
        Thelist.add(84);
        Thelist.add(46);
//        randlist = Thelist.get((int) (Math.random()* Thelist.size()));
//        System.out.println(randlist);

        System.out.println("enter a number to compare to the randlist and of the is" +
                "if there is a match, it would be return");
        int usernum= keyboard.nextInt();

        for(int i=0; i<Thelist.size(); i++)
        {
            if(usernum==Thelist.get(i)){
                System.out.println(usernum);
            }
        }


    }
}
