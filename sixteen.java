public class sixteen {
    
    public static void main(String[] args) {

        String sentence = "Java is easy to learn";

        String[] words = sentence.split(" ");

        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }

        String data = "Sumiya Akter Himu  252-35-563";

        String[] parts = data.split("\\s+");

        System.out.println("\nSeparated information:");

        for (String part : parts) {
            System.out.println(part);
        }

    }
}

