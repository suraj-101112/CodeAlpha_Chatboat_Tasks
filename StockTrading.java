import java.util.*;

class Stock {
    String name;
    double price;

    Stock(String n,double p){
        name=n; 
        price=p;
    }
}

public class StockTrading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000;

        Stock s=new Stock("TCS",100);

        System.out.println("Stock: "+s.name+" Price:"+s.price);
        System.out.print("Buy how many shares? ");
        int qty=sc.nextInt();

        double cost=qty*s.price;

        if(cost<=balance){
            balance-=cost;
            System.out.println("Bought! Balance left:"+balance);
        }else{
            System.out.println("Not enough balance");
        }
    }
}
