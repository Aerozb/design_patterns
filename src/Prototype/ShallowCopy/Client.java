package Prototype.ShallowCopy;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("aa", 12);
        sheep.sheep= new Sheep("bb", 11);
        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep)sheep.clone();
        System.out.println("clone1的String类型name："+clone1.getName().hashCode());
        System.out.println("clone2的String类型name："+clone2.getName().hashCode());
        System.out.println("clone1的Sheep类型："+clone1.getSheep().hashCode());
        System.out.println("clone2的Sheep类型："+clone2.getSheep().hashCode());
    }
}
