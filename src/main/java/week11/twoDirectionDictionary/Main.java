package week11.twoDirectionDictionary;


public class Main {
    public static void main(String[] args) {
        MindfulDictionary dict = new MindfulDictionary("C:\\bench\\MOOC\\src\\main\\java\\week11\\twoDirectionDictionary\\test.txt");
        dict.load();
        dict.save();
    }
}
