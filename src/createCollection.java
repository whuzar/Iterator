import java.util.Random;

public interface createCollection {
    static int create() {
        Random r = new Random();
        return r.nextInt(1, 40);
    }
}
