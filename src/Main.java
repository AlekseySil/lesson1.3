public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Иван Тургенев");
        Book book1 = new Book(author1,"Отцы и дети",1862);
        System.out.println("Автор: " + author1.getAuthor());
        System.out.println("Книга - " + book1.getTitle());
        System.out.println( "Год выпуска: " + book1.getYear());
        book1.setYear(1861);
        System.out.println("Год написания: " + book1.getYear());

        Author author2 = new Author("Михаил Лермонтов");
        Book book2 = new Book(author2,"Герой нашего времени", 1810);
        System.out.println("Автор: " + author2.getAuthor());
        System.out.println("Книга - " + book2.getTitle());
        System.out.println( "Год выпуска: " + book2.getYear());
    }
}