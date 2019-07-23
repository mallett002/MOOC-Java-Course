//package week8.Factory;
//
//public class Packer {
//    private Factory factory;
//
//    public Packer() {
//        factory = new Factory();
//    }
//
//    public Box giveABoxFull() {
//        Box box = new Box(100);
//
//        for (int i = 0; i < 10; i++) {
//            Item newItem = factory.produceNew();
//            box.add(newItem);
//        }
//
//        return box;
//    }
//}
