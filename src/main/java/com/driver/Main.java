package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y){
            return x+y;
        }
        public int product(int x , int y, int z){
            return x+y+z;
        }
        public double product(double x , double y){
            return x+y;
        }
    }
   public static void main(String[] args){
       Product productObject = new Product();
       productObject.product(2,3);
       productObject.product(2,3,4);
       productObject.product(2,3);

   }
}