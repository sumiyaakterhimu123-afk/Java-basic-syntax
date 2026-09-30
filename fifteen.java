public class fifteen {
    
    public static void main(String[] args) {

        String name = "Sumaiya Akter Himu";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Character at index 0: " + name.charAt(0));

        String anotherName = "Meherin Ritu";

        if (name.equals(anotherName)) {
            System.out.println("Both names are equal.");
        } else {
            System.out.println("Names are different.");
        }

    }
}

