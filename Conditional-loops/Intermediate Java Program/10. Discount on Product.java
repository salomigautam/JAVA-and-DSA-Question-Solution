//         discount structure
package com.shalom;
import java.util.Scanner;
public class Program55_DiscountOfProduct {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int price;
        int discount;
        System.out.println("enter the product price : ");
        price=in.nextInt();
        if(price>=1000) {
            discount = 10;
        }
        else if(price>=500){
            discount=5;
        }
        else if(price>=100){
            discount=2;
        }
        else{
            discount=0;
        }
        System.out.println("you are able to take "+discount+"% of discount");
//        int discountprice1=(price/100)*discount;
//        int discountprice=price/discount;.......this also correct
        int discountprice=(discount*price)/100;
        int SP=price-discountprice;
        System.out.println("price of your product is : "+SP);
        System.out.println("you saved "+discountprice+" rupees by discount");

    }

}
