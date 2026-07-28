import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        Scanner scanner = new Scanner (System.in);

     while(true){

        System.out.print("$ ");
        String command = scanner.nextLine();

        //exit builtin code
        if (command.equals("exit")){
        break;
        }

        //echo biultin code
        else if(command.startsWith("echo")){
            System.out.println(command.substring(5));
        }


        //type built in code
        else if (command.startsWith("type")) {

            //if the command equals to a builtin command
            if(command.equals("type exit")  || command.equals("type echo") || command.equals("type type")){
            System.out.println(command.substring(5) + " is a shell builtin");}

            //if the command doesn't equal a builtin command
            else {
                System.out.println(command.substring(5) + ": not found");
            }
        }
     }
    }
}
