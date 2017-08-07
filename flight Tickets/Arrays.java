import java.util.Scanner;
public class Arrays {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);  //make an input object called input
int trigger = 0, i = 0, seats_counterA = 1, seats_counterB = 1, seat_class = 0, triggerB = 0, triggerA = 0;
int seats[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
for(;;){ 
    if(seat_class == 0){
        System.out.println("Welcome to the Airlines");
        System.out.println("Please enter 1 for first class or 2 for economy class");
        seat_class = input.nextInt(); //get the user's answer
    if(seat_class == 2){  //check the class and activate the trigger accordingly
        triggerB = 1;
        triggerA = 0;
        }
    else if(seat_class == 1){
       triggerA = 1;
       triggerB = 0;
       }}
    if(seat_class == 1 && seats_counterA <= 11){
        if(seats_counterB <= 10 || triggerA == 1){
            do{
               for(i = 0; i < 11; i++){
                    if(seats[i] == 0 && seats_counterA <= 10){
                        seats[i] = 1;
                        trigger = 1;
                        System.out.println("YOUR TICKET  FIRST CLASS\n  Seat NO: "+seats_counterA);
                        seats_counterA += 1;
                        seat_class = 0;
                        break; 
                        }
               if(seats_counterA == 11){
                   seat_class = 2;
                   break;
            }}
            }while(trigger == 0 && i < 11);
    }
         else if(seats_counterB == 11 && triggerB == 1){ 
            do{
              System.out.println("Sorry but all the seats in ECONOMY class are full would you like to be placed in FIRST class");
              int answer = input.nextInt();
              if(answer == 1){
                for(i = 0; i < 11; i++){
                    if(seats[i] == 0 && seats_counterA <= 10){
                        seats[i] = 1;
                        trigger = 1;
                        System.out.println("YOUR TICKET  FIRST CLASS\n  Seat NO: "+seats_counterA);
                        seats_counterA += 1;
                        seat_class = 0;
                        break; 
            }}}
              else if(answer == 0){
                System.out.println("SORRY u can wait for the next flight");
                seat_class = 0;
                break;
           }}while(trigger == 0 && i < 11);
        }}
        else if(seat_class == 2 && seats_counterB <= 11){
            if(seats_counterA <= 10 || triggerB == 1){
                do{
                    for(i = 10; i < 21; i++){
                        if(seats[i] == 0){
                            seats[i] = 1;
                            trigger = 1;
                            System.out.println("YOUR TICKET  SECOND CLASS\n  Seat NO: "+(seats_counterB+10));
                            seats_counterB += 1;
                            seat_class = 0;
                            break;
                        }
                    if(seats_counterB == 11){
                        seat_class = 1;
                        break;
                }}}while(trigger == 0 && i > 10 && i <= 20);
        }
            else if (seats_counterA == 11 && triggerA == 1){
                do{
                    System.out.println("Sorry but all the seats in FIRST class are full would you like to be placed in SECOND class");
                    int answer = input.nextInt();
                    if(answer == 1){
                        for(i = 10; i < 21; i++){
                            if(seats[i] == 0){
                                seats[i] = 1;
                                trigger = 1;
                                System.out.println("YOUR TICKET  SECOND CLASS\n  Seat NO: "+(i+1));
                                seats_counterB += 1;
                                seat_class = 0;
                                break;
                           }}}
                    else if (answer == 0) {
                        System.out.println("SORRY u can wait for the next flight");
                        seat_class = 0;
                        break;
                }}while(trigger == 0 && i > 10 && i <= 20);
            }}
    if(seats_counterA == 11 && seats_counterB == 11){
          System.out.println("The plane is full");
          break;
 }}}}
