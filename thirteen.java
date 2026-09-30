public class thirteen {
    public static void main(String[] args) {

        int[] marks = {85, 78, 92, 88, 76};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Third mark: " + marks[2]);

        marks[1] = 80;

        System.out.println("Updated second mark: " + marks[1]);

        System.out.println("All marks:");

        for (int mark : marks) {
            System.out.println(mark);
        }

    }
}  

