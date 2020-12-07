import java.util.ArrayList;

public class Animestory implements Runnable{
    // А МОЖНО БЫЛО ИНТРФЕЙС, ДА?
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    public void run() {
        animals.add(new Duck());
        animals.add(new KWA());
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new KWA());
        for (Animal animal: animals
             ) {
            animal.sound();
        }
    }

    public void run(int ducks, int kwas) {
        for (int i=0; i < ducks; i++) animals.add(new Duck());
        for (int j=0; j < kwas; j++) animals.add(new KWA());
        for (int k=0; k < ducks + kwas; k++) animals.get((int) (Math.random() * 5)).sound();
    }

}
