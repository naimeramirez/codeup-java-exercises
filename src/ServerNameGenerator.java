public class ServerNameGenerator {

    public static String[] adjectives = {"Ashamed", "Adorable", "Attractive", "Beautiful", "Awful", "Aggressive", "Cruel", "Clever", "Tasty", "Jealous"};

    public static String[] nouns = {"Bottle", "Monkey", "Lion", "City", "Beach", "Shoes", "Book", "Pencil", "Movie", "Car"};

    public static String randomElement(String[] words){
        return words[(int)Math.floor(Math.random() * (words.length - 1))];
    }

    public static void main(String[] args) {
        System.out.println("Server name: ");
        System.out.println(randomElement(adjectives) + " " + randomElement(nouns));
    }
}
