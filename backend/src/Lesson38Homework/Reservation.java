package Lesson38Homework;

class Reservation {
    String reservationID, customerName, date;
    Reservation(String reservationID,String customerName,String date) {
        this.reservationID=reservationID; this.customerName=customerName; this.date=date;
    }
    void show() { System.out.println("Reservation: " + reservationID + ", Name: " + customerName); }
}

class ResortReservation extends Reservation {
    int roomNumber;
    ResortReservation(String id,String name,String date,int roomNumber){
        super(id,name,date); this.roomNumber=roomNumber;
    }
    void show(){ super.show(); System.out.println("Room: "+roomNumber); }
}

class RailwayReservation extends Reservation {
    String seatNumber;
    RailwayReservation(String id,String name,String date,String seatNumber){
        super(id,name,date); this.seatNumber=seatNumber;
    }
    void show(){ super.show(); System.out.println("Seat: "+seatNumber); }
}

 class Main28 {
    public static void main(String[] args) {
        ResortReservation rr = new ResortReservation("R001","Elsen","2025-09-24",101);
        RailwayReservation rail = new RailwayReservation("T002","Leyla","2025-09-25","S12");
        rr.show();
        rail.show();
    }
}
