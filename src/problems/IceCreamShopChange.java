package problems;

import java.util.List;

public class IceCreamShopChange {
    /*  Ice Cream Shop Change Problem
You are a shopkeeper selling ice cream, each costing 5 euros. Customers can only pay using bills of 5, 10, or 15 euros. You must provide correct change to each customer if possible, but you start with no money in the cash register.

Each customer is served in a queue. You are given a list of integers, where each integer represents the bill given by a customer.

A 5 euro bill means no change is required.
A 10 euro bill means you need to give back 5 euros as change.
A 15 euro bill means you need to give back 10 euros as change, and you can do so using either a 10 euro bill (if available) or two 5 euro bills.
Write a function that determines whether you can give the correct change to all customers in the queue. If you can provide change for every customer, return True. Otherwise, return False.
     */
//5,5,15,10,10
    public static boolean checkCanGiveChange (List <Integer> bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (Integer bill : bills) {
            if (bill == 5) {
                fiveCount++;
            }else if (bill == 10) {
                if (fiveCount > 0) {
                    fiveCount--;
                }else {
                    return false;
                }
                tenCount++;
            } else {
                if (tenCount > 0) {
                    tenCount--;
                }else if (fiveCount > 2) {
                    fiveCount -= 2;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
