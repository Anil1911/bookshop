package com.example;
import java.util.ArrayList;


public class BookShop {

    ArrayList<Book> bookArray;

   public BookShop(){
       this.bookArray=new ArrayList<>();
   }
   public void display(){
       if(bookArray.isEmpty()){
           System.out.println("No books are there");
       }
       else {
           System.out.println("Book Id\t Book Name\t+Book Author\t+Book Price");
        for(Book book:bookArray){
            System.out.println(book.id+"\t"+book.name+"\t"+book.author+"\t"+book.price);
        }

       }

   }

   public void addBook(int id,String name,String author,double price){
       if(id>=100){
           System.out.println("Max limit is exceed");
       }
       else {
           bookArray.add(new Book(id,name,author,price));
           System.out.println("Book is inserted successfully");
       }
   }
    public void delete(int id){
       for(Book book:bookArray) {
           if (book.id==id) {
               bookArray.remove(book);
               System.out.println("Book deleted Successfully");
               return;
           }
       }
           System.out.println("Book not Found");

    }
    public void search(int id){
       for(Book book:bookArray){
           if(book.id==id){
               System.out.println("Book Name: " + book.name);
               System.out.println("Book Author: " + book.author);
               System.out.println("Price: " + book.price);
               return;

           }
       }
        System.out.println("Book is not Found");

    }

    public void Update(int id,String name,String author,double price){
       for(Book book:bookArray){
           if (book.id==id){
               book.name=name;
               book.author=author;
               book.price=price;
               System.out.println("Updated book successfully");
               return;
           }
       }
        System.out.println("Book not found");
    }

}
