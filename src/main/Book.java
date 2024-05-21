package main;

public class Book {
        private String title;
        private int numberOfPages;
        private String author;
        private String publisher;

        public Book(String title, int numberOfPages, String author, String publisher) {
            setTitle(title);
            setNumberOfPages(numberOfPages);
            setAuthor(author);
            setPublisher(publisher);
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Il titolo non puo essere vuoto ");
        }
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Le pagine devono essere maggiori di 0 ");
        }
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("l'autore non puo essere vuoto ");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Il dato non puo essere vuoto ");
        }
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

}

