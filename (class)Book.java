public class Book {

    private String NameOfBook;
    private String Autor;
    private int Year;


    Book(String defNameOfBook, String defAutor, int defYear){
        NameOfBook = defNameOfBook;
        Autor = defAutor;
        Year = defYear;

    }




    //method to assigned value "Autor"
    void setAutor(String i ){
        Autor = i;
    }
    void setNameOfBook(String i ){
        NameOfBook = i;
    }
    void setYear(int i){
        Year = i;
    }


    // method to print the Autor of Book
    void isAutor(){
        System.out.println(Autor);
    }

    // method to print the NameOfBook
    void isNameOfBook(){
        System.out.println(NameOfBook);
    }

    //method to print the Year
    void isYear() {
        System.out.println(Year);
    }
}

