public class supplementary1 {
    public static void main(String[] args) {
        // Fiction books
        String[] fictionBooks = {"To Kill a Mockingbird", "1984", "The Great Gatsby"};

        // Non-fiction books
        String[] nonFictionBooks = {"The History of the World", "The Universe in a Nutshell", "A Brief History of Time"};

        // Create a new array with the combined length of both arrays
        String[] inventory = new String[fictionBooks.length + nonFictionBooks.length];

        // Copy the elements of the first array into the merged array
        for (int i = 0; i < fictionBooks.length; i++) {
            inventory[i] = fictionBooks[i];
        }

        // Copy the elements of the second array into the merged array
        for (int i = 0; i < nonFictionBooks.length; i++) {
            inventory[fictionBooks.length + i] = nonFictionBooks[i];
        }

        // Print the merged inventory
        System.out.println("Inventory:");
        for (String book : inventory) {
            System.out.println(book);
        }
    }
}
