public class Book {
    private final String name;
    private int ageOfPublication;
    private final Author bookAuthor;
    public Book ( String name, int ageOfPublication, Author bookAuthor){
        this.name = name;
        this.ageOfPublication = ageOfPublication;
        this.bookAuthor = bookAuthor;
    }
    public String getName(){
        return this.name;
    }
    public int getAgeOfPublication() {
        return this.ageOfPublication;
    }
    public Author getBookAuthor(){
        return this.bookAuthor;
    }

    public void setAgeOfPublication(int ageOfPublication) {
        this.ageOfPublication = ageOfPublication;
    }
}
