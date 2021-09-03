
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Object lotto[] = {17,6,25,49};
        Arrays.sort(lotto);
        System.out.println("This weeks Lottery numbers in ascending order are:");
        for (Object bonusBall : lotto) {
            System.out.println("Number = " + bonusBall);
        }
        int searchValue = 17;
        int returnValue = Arrays.binarySearch(lotto,searchValue);
        System.out.println("Your Bonus ball is number 17 and it is in index position: " + returnValue);
}
}