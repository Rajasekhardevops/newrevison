package revision;
import java.util.Random;

class HelloWorld
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        int minRange = 1000, maxRange= 5000;
        int value = rand.nextInt(maxRange - minRange) + minRange;
        
        System.out.println(value); 
    }
}
