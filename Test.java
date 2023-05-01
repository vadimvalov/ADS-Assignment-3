import java.util.Random;

public class Test {
    private int value;
    public Test(int value){
        this.value = value;
    }
    public static void main(String[] args) {
        MyHashTable<Test, Student> table = new MyHashTable<>();
        Random random = new Random();
        for (int i = 0; i < 10001; i++) {
            Test test = new Test(i);
            Student value = new Student("V. V.");
            table.put(test, value);
            System.out.println("KEY: " + i + " VALUE: " + value.getName());
        }

        int rand = random.nextInt(10001);
        Test testKey = new Test(rand);
        Student studenttest = table.get(testKey);
        if(table.contains(studenttest)){
            System.out.println("Student : " + studenttest.getName());
        } else {
            System.out.println("No student with this ID" + rand);
        }

    }
}