public class Printer {

    public int sheets;
    public int tonerVolume;

    public Printer(int sheets, int tonerVolume){
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets(){
        return sheets;
    }

    public int numberOfSheets(){return sheets;}

    public void print(int copies, int pages){
        int totalPages = copies * pages;
        if(totalPages <= sheets){
            sheets -= totalPages;
            tonerVolume -= totalPages;
        }
    }

}
