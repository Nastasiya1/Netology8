public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<>(new String[3]);
        MagicBox<Number> box2 = new MagicBox<>(new Number[5]);
        box1.add("alpha");
        box1.add("beta");
        System.out.println(box1.pick());
        box1.add("gamma");
        System.out.println(box1.pick());
        box2.add(1);
        box2.add(2);
        box2.add(3);
        System.out.println(box2.pick());
        box2.add(4);
        box2.add(5);
        System.out.println(box2.pick());
    }
}
