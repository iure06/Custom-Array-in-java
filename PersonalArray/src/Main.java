import PersonalArrayClass.PersonalArray;

public class Main {
    public static void main(String[] args) {
        PersonalArray<Integer> myArray = new PersonalArray<>();

        myArray.add(3);
        myArray.add(2);
        myArray.add(5);
        myArray.add(7);
        myArray.add(7);
        myArray.print();

        myArray.set(4, 6);
        myArray.print();

    }
}