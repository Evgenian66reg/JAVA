package ru.top.oop;

public class DivArrays {
    double[] arr1;
    double[] arr2;

    public DivArrays(int num1, double[] arr1,int num2,  double[] arr2) {
        this.arr1 = new double[num1];
        for(int i=0; i<num1; i++){
            this.arr1[i] = arr1[i];
        }
        this.arr2 = new double[num2];
        for(int i=0; i<num2; i++){
            this.arr2[i] = arr2[i];
        }
    }

    public double[] Division(){
        double[] arr3;
        int num3;

        if (this.arr1.length > this.arr2.length){
            num3 = this.arr1.length;
        }
        else {
            num3 = this.arr2.length;
        }
        arr3 = new double[num3];
        for (int i=0; i<num3; i++){
            try {
                if (this.arr2[i] == 0.0){
                    throw new ArithmeticException();
                }
                arr3[i] = this.arr1[i] / this.arr2[i];
            }
            catch (ArithmeticException e){
                arr3[i] = 0;
                e.printStackTrace(System.err);
            }
            catch (ArrayIndexOutOfBoundsException e){
                arr3[i] = -1;
                e.printStackTrace(System.err);
            }
            finally {
               System.out.println("finally");
            }
        }
        return arr3;
    }
}