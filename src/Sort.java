import java.util.Arrays;

public class Sort implements createCollection, iterator{
    public static void main(String[] args) {
        int[] tab = new int[40];
        boolean check = true;
        int i = 0;

        while(check){
            tab[i] = createCollection.create();
            i++;
            if(i>=40){
                check = false;
            }
        }

        System.out.println("Normal");
        System.out.println(Arrays.toString(tab));

        System.out.println("Bubble sorted");
        System.out.println(Arrays.toString(iterator.next(tab)));

        System.out.println("Get specific element using bubble sort");
        System.out.println(iterator.getElement(23, iterator.next(tab)));
    }
}
