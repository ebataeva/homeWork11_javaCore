import java.util.ArrayList;

public class Box {
ArrayList<Fruit> list= new ArrayList<>();

    public Box() {
        this.list = list;
    }

    public  void putFruitToBox(Fruit fruit, int count){
        for (int i = 0; i <count ; i++) {
            list.add(fruit);
        }

}
public Float getWeight(){
        Float sum = 0.0f;
    for (int i = 0; i < list.size(); i++) {
        sum = sum+  list.get(i).getWeight();
    }
    System.out.println(sum);
    return  sum;
}


}
