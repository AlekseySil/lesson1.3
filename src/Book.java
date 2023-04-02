
    public class Book {
        private String title;
        private int year;
        private Author author;

        public Book (Author author, String title, int year){
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public Author getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

