import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> list = new ArrayList<>();

    public Box() {
        this.list = list;
    }

    public void putFruitToBox(Fruit fruit, int count) {
        for (int i = 0; i < count; i++) {
            list.add(fruit);
        }

    }

    public Float getWeight() {
        Float sum = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getWeight();
        }
        System.out.println(sum);
        return sum;
    }

    public ArrayList<Fruit> getList() {
        return list;
    }

    public static Boolean compare(Box box1, Box box2) {
        if (box1.getList().get(0) == (box2.getList().get(0)) && box1.getList().size()==box2.getList().size()) {
            return true;
        }
        return false;
    }
    public  Boolean compare(Box box) {
        if (this.getList().get(0) == (box.getList().get(0)) && this.getList().size()==box.getList().size()) {
            return true;
        }
        return false;
    }
}