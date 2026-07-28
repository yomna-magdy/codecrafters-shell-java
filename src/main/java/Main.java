import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        Scanner scanner = new Scanner (System.in);

     while(true){

        System.out.print("$ ");
        String input = scanner.nextLine();
        String command;

         if(input.indexOf(" ") == -1){
             command = input;
         }
         else {
             command = input.substring(5).trim();
         }


        //exit builtin code
        if (command.equals("exit")){
        break;
        }

        //echo biultin code
        else if(input.startsWith("echo")){
            System.out.println(input.substring(5));
        }


        //type built in code
        else if (input.startsWith("type")) {

            //if the command equals to a builtin command
            if (command.equals("exit") || command.equals("echo") || command.equals("type")) {
                System.out.println(command + " is a shell builtin");
            }

            //if the command doesn't equal a builtin command
            else {
                System.out.println(command + ": not found");
            }
        }
     }
    }
}
