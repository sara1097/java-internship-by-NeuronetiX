import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("adopt a pet");
        int number ;
        boolean petAdopted=false;
        String petName;
        int hunger=0;
        int happiness=0;
        do{
            System.out.println("choose from the following: \n 1.Adopt a Pet.\n" +
                    "2.Feed the Pet.\n" +
                    "3.Play with the Pet.\n" +
                    "4.Check Status.\n" +
                    "5.End Game");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    if(petAdopted)
                    {
                        System.out.println("you are already adopt a pet");
                    }
                    else{
                        System.out.println("choose your pet name:");
                        petName=scanner.next();
                        petAdopted=true;
                        hunger=50;
                        happiness=50;
                    }
                    break;
                case 2:
                    if(!petAdopted)
                    {
                        System.out.println("you haven't adopt a pet yet pls adopt one");
                    }
                    else{
                        hunger+=10;
                        happiness-=10;
                        System.out.println("pet has been fed .");
                        if(hunger==90)
                            hunger-=10;
                        if(hunger==0 || happiness==0){
                            System.out.println("Game over . Your pets condition has reached a critical level ");
                            System.out.println("pet's hunger :" + hunger);
                            System.out.println("pet's happiness :" + happiness);
                            number=5;
                        }
                    }
                    break;

                case 3:
                    if(!petAdopted)
                    {
                        System.out.println("you haven't adopt a pet yet pls adopt one");
                    }
                    else{
                        hunger-=10;
                        happiness+=10;
                        System.out.println("pet played and is happier now .");
                        if(happiness==90)
                            happiness-=10;
                        if(hunger==0 || happiness==0){
                            System.out.println("Game over . Your pets condition has reached a critical level ");
                            System.out.println("pet's hunger :" + hunger);
                            System.out.println("pet's happiness :" + happiness);
                            number=5;
                        }
                    }
                    break;
                case 4:
                    if(!petAdopted)
                    {
                        System.out.println("you haven't adopt a pet yet pls adopt one");
                    }
                    else{
                            System.out.println("pet's hunger :" + hunger);
                            System.out.println("pet's happiness :" + happiness);
                        }
                    break;
                case 5:
                    System.out.println("You entered 5 and exit the game");
                    if(!petAdopted)
                    {
                        System.out.println("you haven't adopt a pet yet pls adopt one");
                    }
                    else{
                        System.out.println("pet's hunger :" + hunger);
                        System.out.println("pet's happiness :" + happiness);
                    }
                    break;
                default:
                    System.out.println("Invalinumber.");
            }
        }while(number!=5);


    }
}