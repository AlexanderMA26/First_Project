import java.util.*;

public class Main {
    public static void main(String[] args) {

            DataTypes();

            ConditionalStatements();

            Loops();










        Math.floor(Math.random() *(100 - 0 + 1) + 0);

        String[] nameArray = new String[]{"Liam", "Noah", "Oliver", "Elijah", "James", "William", "Benjamin", "Lucas", "Henry", "Theodore", "Jack", "Levi", "Alexander", "Jackson", "Mateo", "Daniel", "Michael", "Mason", "Sebastian", "Ethan", "Logan", "Owen", "Samuel", "Jacob", "Asher", "Aiden", "John", "Joseph", "Wyatt", "David", "Leo", "Luke", "Julian", "Hudson", "Grayson", "Matthew", "Ezra", "Gabriel", "Carter", "Isaac","Olivia", "Emma", "Charlotte", "Amelia", "Ava", "Sophia", "Isabella", "Mia", "Evelyn", "Harper", "Luna", "Camila", "Gianna", "Elizabeth", "Eleanor", "Ella", "Abigail", "Sofia", "Avery", "Scarlett", "Emily", "Aria", "Penelope", "Chloe", "Layla", "Mila", "Nora", "Hazel", "Madison", "Ellie", "Lily", "Nova", "Isla", "Grace", "Violet", "Aurora", "Riley"};

        Random rand = new Random();

        Scanner classSize = new Scanner(System.in);
        System.out.println("Enter the class size");
        int size = Integer.parseInt(classSize.nextLine());


        int[] gradeArray = new int[size];
        int AvGrade = 0;
        for (int x = 0; x < size; x++) {

            student Student1 = new student();
            Student1.studentAge = (int) Math.floor(Math.random() * (20 - 7 + 1) + 7);

            Student1.studentName = nameArray[rand.nextInt(nameArray.length)];


            Student1.studentGrade = (int) Math.floor(Math.random() * (100 - 50 + 1) + 50);

            gradeArray[x] = Student1.studentGrade;

            System.out.println();
            System.out.println("Student's name is " + Student1.studentName);
            System.out.println("Student's grade is " + Student1.studentAge);
            System.out.println("Student's grade is " + Student1.studentGrade);
            System.out.println();
            AvGrade += Student1.studentGrade;
        }

        AvGrade = AvGrade /  size;

        System.out.println("The average grade of the class is " + AvGrade);



        Dog Fido = new Dog();

        Fido.eat();
        Fido.sleep();

        Cat Marcelle = new Cat();

        Marcelle.eat();
        Marcelle.sleep();


        Person John = new Person();

        John.setage(24);
        John.setname("John");
        John.setadress("1218 Moss Street");

        System.out.println("Age: " + John.getage());
        System.out.println("Name: " + John.getname());


        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int x = 0; x <= 10; x ++){
            nums.add(x);
        }

        nums.remove(0);
        nums.remove(2);

        System.out.println(nums.size());

        if (nums.contains(4)){
            System.out.println("ArrayList contains 4");
        } else{
            System.out.println("ArrayList doesn't contains 4");
        }

        Collections.sort(nums);

        ArrayList<Integer> evento100 = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) {
                evento100.add(i);
            }
            if (evento100.size() == 10){
                System.out.println(evento100);
                break;
            }
        }

        Scanner daysOfTheWeek = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int day = Integer.parseInt(classSize.nextLine());

        switch (day){

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");
        }


        Scanner Grade = new Scanner(System.in);
        System.out.println("Enter a number grade from 1 to 5");
        int grade = Integer.parseInt(classSize.nextLine());

        switch (grade){
            case 1:
                System.out.println("F");

            case 2:
                System.out.println("D");

            case 3:
                System.out.println("C");

            case 4:
                System.out.println("B");

            case 5:
                System.out.println("A");
        }



        Scanner Reversestring = new Scanner(System.in);
        System.out.println("Enter a string");
        String reverse = Reversestring.nextLine();


        Max(1, 2);




        }

        public static void factorial(int a) {
            int partial = 1;
            if (a == 0 || a == 1) {
                System.out.println("The factorial is 1");
            } else {
                for (int p = 1; p <= a; p++){
                    partial *= p;
                }
                System.out.println("The factorial is " + partial);
            }
        }

    public static String reverseString(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static void maxNum(int numa, int numb){
        if (numa > numb){
            System.out.println(numa + " is bigger than " + numb);
        } else if (numa == numb) {
            System.out.println(numa + " is equal to " + numb);
        }else{
            System.out.println(numb + " is bigger than " + numa);
        }
    }

    public static class student {
        public String studentName;

        public int studentAge;

        public int studentGrade;

    }

    public static class Animal{

        void eat(){
            System.out.println("I eat lots of food");
        }

        void sleep(){
            System.out.println("I slept for " + (int) Math.floor(Math.random() * (20 - 0 + 1) + 0));
        }
    }

    static class Dog extends Animal{

    void eat(){System.out.println("I eat doggie chow.");}
    void sleep(){System.out.println("I sleep 13 hours a day.");}

    }


    static class Cat extends Animal{
        void eat(){System.out.println("I eat cat food");}
        void sleep(){System.out.println("I sleep all day");}


    }

    public static class Person{

        private String name = "";

        private int age = 0;

        private String adress = "";
        // initialize age
        public void setage(int age) {
            this.age = age;
        }

        public void setadress(String adress){
            this.adress = adress;
        }


        // initialize name
        public void setname(String name) {
            this.name = name;
        }

        // access age
        public int getage() {
            return this.age;
        }

        // access name
        public String getname() {
            return this.name;
        }

        public String getadress(){
            return this.adress;
        }

    }

    static void Reverse(String string){
        System.out.println(reverseString(string));
    }

    static void Max(int num1, int num2){

        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);

        }else{
            System.out.println("The numbers are equal");
        }
    }

    static void DataTypes(){
        short shortData = 300; // Change to int if necessary
        int intData = 1000;
        long longData = 9000000;

        float floatData = 26.52F;

        double doubleData = 26.2525252;

        char charData = 'A';

        boolean boolData = true;

        System.out.println(intData);
        System.out.println(longData);
        System.out.println(shortData);
        System.out.println(floatData);
        System.out.println(doubleData);
        System.out.println(charData);
        System.out.println(boolData);

        String toInt = "1234567";
        System.out.println(toInt);
        Integer.parseInt(toInt);
        System.out.println(toInt);

        int toString = 12345678;
        System.out.println(toString);
        String.valueOf(toString);
        System.out.println(toString);
    }

    static void ConditionalStatements(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");

        Integer integer = myObj.nextInt();  // Read user input


        if (integer % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }


        if (integer > 0) {
            System.out.println("The number is positive");
        } else if (integer < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        boolean isPrime = true;

        for (int i = 2; i < integer / 2; i++) {
            if (integer % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }


        Scanner newNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a new number");
        Integer newInt = myObj.nextInt();

        maxNum(16, newInt);
    }

    static void Loops(){
        for (int x = 1; x <= 10; x++){
            System.out.println(x);
        }
        for (int y = 1; y <= 10; y ++){
            if (y % 2 == 0){
                System.out.println(y);
            }
        }
    }








}


