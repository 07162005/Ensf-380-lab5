class Book {
    private String isbn;
    private int pages;
    
    public Book() {
        this.isbn = "";
        this.pages = 0;
    }
    
    public Book(String isbn, int pages) {
        this.isbn = isbn;
        this.pages = pages;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
}

class Paperback extends Book {
    public Paperback() {
        super();
    }
    
    public Paperback(String isbn, int pages) {
        super(isbn, pages);
    }
    
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}

class Fiction extends Book {
    public Fiction() {
        super();
    }
    
    public Fiction(String isbn, int pages) {
        super(isbn, pages);
    }
    
    public String genre() {
        return "Method genre called from Fiction";
    }
    
    public String coverArt() {
        return "Method coverArt called from Fiction";
    }
}

class Nonfiction extends Paperback {
    public Nonfiction() {
        super();
    }
    
    public Nonfiction(String isbn, int pages) {
        super(isbn, pages);
    }
    
    public String topic() {
        return "Method topic called from Nonfiction";
    }
}

class Novel extends Fiction {
    public Novel() {
        super();
    }
    
    public Novel(String isbn, int pages) {
        super(isbn, pages);
    }
    
    @Override
    public String coverArt() {
        return "Method coverArt called from Novel";
    }
}

class Anthology extends Fiction {
    public Anthology() {
        super();
    }
    
    public Anthology(String isbn, int pages) {
        super(isbn, pages);
    }
    
    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }
}

public class MyBook {
    public static void main(String[] args) {
        System.out.println("=== Testing Book Hierarchy ===\n");
        
        System.out.println("Testing Anthology:");
        Anthology antho = new Anthology();
        System.out.println("  " + antho.coverArt());
        System.out.println("  " + antho.genre());
        Anthology antho2 = new Anthology("0987654321", 10);
        System.out.println("  ISBN: " + antho2.getIsbn() + ", Pages: " + antho2.getPages());
        
        System.out.println("\nTesting Novel:");
        Novel novel = new Novel();
        System.out.println("  " + novel.coverArt());
        System.out.println("  " + novel.genre());
        
        System.out.println("\nTesting Nonfiction:");
        Nonfiction nf = new Nonfiction();
        System.out.println("  " + nf.coverArt());
        System.out.println("  " + nf.topic());
        
        System.out.println("\nTesting Paperback:");
        Paperback pb = new Paperback();
        System.out.println("  " + pb.coverArt());
        
        System.out.println("\n=== Inheritance Verification ===");
        System.out.println("Anthology instanceof Fiction: " + (antho instanceof Fiction));
        System.out.println("Novel instanceof Fiction: " + (novel instanceof Fiction));
        System.out.println("Nonfiction instanceof Paperback: " + (nf instanceof Paperback));
        System.out.println("Nonfiction instanceof Book: " + (nf instanceof Book));
        System.out.println("Paperback instanceof Book: " + (pb instanceof Book));
    }
}