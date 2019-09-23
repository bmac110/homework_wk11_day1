public class Printer {

    private int sheets;
//    private int pages;
//    private int copies;

    public Printer(int sheets){
        this.sheets = sheets;
//        this.pages = pages;
//        this.copies = copies;
    }

    public int numberOfSheets(){return sheets;}

    public int print(int copies, int pages){
        int totalPages = 0;
        if(sheets >= 1){
            totalPages = copies * pages;
        }
        return sheets -= totalPages;

    }
}
