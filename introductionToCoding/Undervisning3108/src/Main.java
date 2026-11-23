import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    String[] menuItems = {"Create Post", "Delete Post", "Like Post", "Share Post", "Save", "Comment Post", "Display Post", "Exit"};
    String[] posts = new String[10];
    int postNum = 0;
    int[] likes = new int[10];
    //Todo: initializer et array, likes

    void main(){
        boolean running = true;
        while (running) {
            displayMenu();

            int userinput = getUserInput();

            //Brug brugerens input til at printe menupunktet ud
            //String item = menuItems[userinput-1];
            //System.out.println(item);
            //Brug en switch-case til at evaluere input og
            //     kalde en metode der svarer til valget
            switch (userinput){
                case 1: createPost();  break;
                case 2: deletePost(0); break;
                case 3: likePost(); break;
                case 4: sharePost(); break;
                case 5: savePost(); break;
                case 6: commentPost(); break;
                case 7: displayPosts(); break;
                case 8: exitProgram(); running = false; break;
                default :
                    System.out.println("findes ikke");
            }
            System.out.println();
        }


    }

    private void displayPosts() {
        for (int i = 0; i < posts.length; i++) {
            String post = posts[i];
            System.out.println(post + " : " + likes[i]);
        }
/*        //lav for each loop der traversere posts og printer hvert element
        for(String post: posts){
            System.out.println(post);
        }*/

    }

    private void exitProgram() {
        System.out.println("Closing program");
    }

    private void follow() {
    }

    private void commentPost() {
    }

    private void savePost() {
    }

    private void sharePost() {
    }

    private void likePost() {
        //Todo:
        // Hvilken post vil bruger gerne like? - gem svaret i int index.
        // Increment tallet i likes arrayet på index med 1.
        System.out.println("Hvilket post vil du gerne like?");
        int index = getUserInput() - 1;
        likes[index] = index;





    }

    private void deletePost(int index) {
        posts[index]=null;
    }

    void createPost() {
        //bed brugeren om at taste sin post
        //put posten ned i arrayet med posts
        System.out.println("tast din post");

        String input = scan.nextLine();
        posts[postNum]=input;
        postNum++;
    }

    public int getUserInput(){
        //læs brugeren input
        //opdater en global variabel, med brugerens valg
        System.out.println("tast et tal for at vælge:  ");
        int userInput = Integer.parseInt(scan.nextLine());
        return userInput;

    }

    void displayMenu() {
        //Gennemløbe menu og for hvert item printe
        // 1. Create Post
        for(int i  = 0; i < menuItems.length;i++){
            String output = menuItems[i];
            System.out.println(i+1+". "+output);
        }


       /* int count = 0;
        for(String item: menuItems){
            count++;
            System.out.println(count+". "+item);
        }*/
    }
}