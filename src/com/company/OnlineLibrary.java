package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Library{
    String[] issuedBook = new String[100];
    String[] availableBook = new String[100];
    public int numBooks = 0;

    public void addBook(){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the book name that you want to add in the library");
            String book = sc.next();
            for (String s : availableBook) {
                if (Objects.equals(s, book)) {
                    System.out.println("Book already there..");
                    break;
                }
                else {
                    availableBook[numBooks] = book;
                    System.out.println(book + " book added..");
                    numBooks++;
                    break;
                }
            }
            System.out.println("Do you want to add more book? Enter 1 for yes 0 for no");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("number : " +numBooks);

    }

    public void getAvailableBook() {
        System.out.println("Available books are:");
        for (String book : this.availableBook) {
            if (book==null) {
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    public void getIssuedBook(String iBook) {
        for (int i=0;i<this.availableBook.length;i++){
            if (this.availableBook[i].equals(iBook)){
                System.out.println("The book has been issued!");
                this.availableBook[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
}
public class OnlineLibrary {
    public static void main(String[] args) throws IOException {
        Library l1 = new Library();

        do{
            System.out.println("-------------------------->>   Welcome to library management system   <<--------------------------");
            System.out.println("Enter 1: Add book\nEnter 2: Show Available books\nEnter 3: Issue books\nEnter 5: Exit the library management system:-");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();

            if (user==1) {
                l1.addBook();
            }
            else if (user==2) {
                l1.getAvailableBook();
            }
            else if (user == 3) {
                l1.getAvailableBook();
                System.out.println("Enter book you want to issue:");
                String issue = sc.nextLine();
                l1.getIssuedBook(issue);
            }
            else if (user == 5) {
                System.out.println("Thanks for visiting library management system");
                break;
            }
            else {
                System.out.println("Not a valid input.");
            }
        }while (true);
    }
}
