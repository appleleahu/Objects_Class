public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Joanene", "Rowling");
        Book book1 = new Book("''Harry Potter and the Philosopher's Stone''", 1998, author1);
        Author author2 = new Author("John Ronald Reuel", "Tolkien");
        Book book2 = new Book("''The Hobbit''", 1937, author2);
        System.out.println("Год издательства книги " + book1.getName() + ": " + book1.getAgeOfPublication() + ", Автор книги: " + author1.getFirstname() + " " + author1.getSurname() + ".");
        System.out.println("Год издательства книги " + book2.getName() + ": " + book2.getAgeOfPublication() + ", Автор книги: " + author2.getFirstname() + " " + author2.getSurname() + ".");
        book1.setAgeOfPublication(1997);
        System.out.println("Изначала автор хотела выпустить книгу " + book1.getName() + " в 1998-году, но планы изменились и автор выпустила книгу в"+": " + book1.getAgeOfPublication() +"-году" + ".");
    }
}