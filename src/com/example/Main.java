package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookShop bookShop=new BookShop();

        while(true){
            System.out.println("\nMain Menu--");
            System.out.println("1- Display all books");
            System.out.println("2- Add Book");
            System.out.println("3- Update Book");
            System.out.println("4- Delete book");
            System.out.println("5- Search book");
            System.out.println("6- Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1: bookShop.display();
                break;
                case 2:
                    System.out.println("Enter the Book Id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Book name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Book author:");
                    String author=sc.nextLine();
                    System.out.println("Enter the Book Price");
                    double price=sc.nextDouble();
                    bookShop.addBook(id,name,author,price);
                break;
                case 3:
                    System.out.println("Enter the Book Id:");
                     id=sc.nextInt();
                    System.out.println("Enter the Book name:");
                     name=sc.nextLine();
                    System.out.println("Enter the Book author:");
                     author=sc.nextLine();
                    System.out.println("Enter the Book Price");
                     price=sc.nextDouble();
                    bookShop.Update(id,name,author,price);
                    break;
                case 4:
                    System.out.println("Enter the id to delete book");
                    id=sc.nextInt();
                    bookShop.delete(id);
                    break;
                case 5:
                    System.out.println("Enter the book you want to search");
                    id=sc.nextInt();
                    bookShop.search(id);
                    return;
                case 6:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }


        }

    }
}
