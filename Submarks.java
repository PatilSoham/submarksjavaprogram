package Submarks;
import java.util.Scanner;

class Submarks{

    public static void main(String[] args) {
        Grade g = new Grade();

        System.out.println("Enter the vlaue of phy");
        Scanner ph = new Scanner(System.in);
        g.p= ph.nextInt();

        System.out.println("Enter the value of chy");
        Scanner ch = new Scanner(System.in);
        g.c = ch.nextInt();

        System.out.println("Enter the value of math");
        Scanner mh = new Scanner(System.in);
        g.m = mh.nextInt();
        g.main();
        g.xyz();
    }
}
class Subject extends Submarks{
    int p,c,m,total;
    float avg;
    void main(){
        total = p+c+m;
        System.out.println("Your total value is" + total);

        avg = total/3;
        System.out.println("Your avg value is" + avg); 

    }
}
class Grade extends Subject{
    void xyz(){

        if(p<30 || c<30 || m<30 || avg<30){
            System.out.println("Your are fail");
        }
        else if(avg>90){
            System.out.println("Your grade is A");
        }
        else if(avg>80 && avg<91){
            System.out.println("Your grade is B");
        }
        else if(avg>70 && avg<81){
            System.out.println("Your grade is C");
        }
    }
}



