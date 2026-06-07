interface LibraryUser {
    void registerAccount();
    void requestBook();
}

// KidUser Class
class KidUser implements LibraryUser {
    int age;
    String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if ("Kids".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// AdultUser Class
class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

// Main Class
public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        // Test Case #1
        System.out.println("Test Case #1");

        KidUser kid1 = new KidUser(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        KidUser kid2 = new KidUser(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println();

        // Test Case #2
        System.out.println("Test Case #2");

        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}
