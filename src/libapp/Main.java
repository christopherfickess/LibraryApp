package libapp;

public class Main {
    public static void main(String[] args){
        LibraryApp app = new LibraryApp();

//        app.searchByTitle("castle");
//        app.searchByTitle("night");
//        app.searchByTitle("dagger");
        app.checkInBook("06917");
        app.checkInBook("72391");
    }
}
