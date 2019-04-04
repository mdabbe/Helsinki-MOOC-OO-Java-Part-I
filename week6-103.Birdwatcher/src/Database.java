import java.util.ArrayList;

public class Database {
    ArrayList<Bird> birds;


    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void add(String name, String latinName) {
        this.birds.add(new Bird(name,latinName));
    }
    public void observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name) || bird.getLatinName().equals(name)) {
                bird.setTimesObserved();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void statistics() {
        for (Bird bird : birds)
            System.out.println(bird);
    }

    public void show(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name) || bird.getLatinName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }

    }
}
