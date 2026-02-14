import java.util.*;

class Room {
    int number;
    boolean booked=false;

    Room(int n){ number=n; }
}

public class HotelSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Room[] rooms={new Room(101),new Room(102),new Room(103)};

        System.out.print("Enter room number to book: ");
        int r=sc.nextInt();

        for(Room room:rooms){
            if(room.number==r){
                if(!room.booked){
                    room.booked=true;
                    System.out.println("Room booked!");
                }else{
                    System.out.println("Already booked");
                }
            }
        }
    }
}
