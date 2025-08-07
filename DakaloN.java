
public class DakaloN {
    public static void main(String[]args){
        String[][]seats={{"Davie","Decent"},{"pertu","patty"},{"Mulweli","Muime"}};
        Children(seats);
    }
    public static void Children(String[][]seats){
        for( int row=0;row<seats.length;row++){
            for( int colum=0;colum<seats[row].length;colum++){
                System.out.println("row"+(row+1)+" , Seat " + (colum+1) + " : " + seats[row][col]);
            }
        }
    }
}