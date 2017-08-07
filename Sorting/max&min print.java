import java.util.Scanner;
class Excercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = {11,-12,100,45,1};
        int min = array[0], max = array[0];
        String answer;
        char a;
        for(int i = 0; i < array.length; i++){
          for(int j = 1; j < array.length; j++){
              if(min > array[j])
                min = array[j];
              else if (max < array[j])
                max = array[j];
        
          }}
        System.out.println("Choose L for min and M for max");
        answer = input.next();
        a = answer.charAt(0);
        if(a == 'L')
            System.out.println(min);
        else if (a == 'M')
            System.out.println(max);
        else
            System.out.println("ERROR CHOOSE THE RIGHT OPERAND");
    }
    
}
