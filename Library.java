
    public class Library {
        private book[] books;
        private int count;

        public Library() {
            books = new book[5]; // You can increase size as needed
            count = 0;
        }

        public void addBook(book book) {
            if (count < books.length) {
                books[count++] = book;
                System.out.println("Book added successfully.");
            } else {
                System.out.println("Library is full!");
            }
        }

        public void removeBook(int bookID) {
            for (int i = 0; i < count; i++) {
                if (books[i].getBookID() == bookID) {
                    for (int j = i; j < count - 1; j++) {
                        books[j] = books[j + 1];
                    }
                    books[--count] = null;
                    System.out.println("Book removed successfully.");
                    return;
                }
            }
            System.out.println("Book not found.");
        }

        public book searchBook(int bookID) {
            for (int i = 0; i < count; i++) {
                if (books[i].getBookID() == bookID) {
                    return books[i];
                }
            }
            return null;
        }

        public void displayBooks() {
            if (count == 0) {
                System.out.println("Library is empty.");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.println(books[i]);
                }
            }
        }
    }


