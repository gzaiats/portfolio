import java.util.Scanner;
public class PetSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
           Welcome to Pet Simulator

           What do you wish to name your pet? 
           """);
        String petName = scanner.nextLine();

        System.out.println("""
           \n
           What is %s's species? 

           D - Dog
           C - Cat
           H - Horse
           \n
           """.formatted(petName));
        char petSpecies = Character.toUpperCase(scanner.next().charAt(0));

        System.out.println("""
           \n
           Is %s a male or a female?

           M - Male
           F - Female
           \n
           """.formatted(petName));
        char petGender = Character.toUpperCase(scanner.next().charAt(0));

        System.out.println("""
           \n
           Meet your pet:
           \n
           """);

        String dog = """
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⣒⣻⣦⣿⣿⣰⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣶⠄⠀⠀⠀⠀
            ⠀⠀⣴⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⢀⣴⣿⣿⣿⣿⣿⣄⠀⠀
            ⠀⠀⣿⣿⣿⣵⣿⣿⣋⣩⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢿⣿⣿⣟⠿⢶⣿⣿⣿⣿⣿⠀⠀
            ⢠⠿⠛⣲⣿⣿⣿⣉⢥⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣿⣿⣿⣻⣷⣿⣿⡏⠻⣿⣿⠀
            ⠀⠀⠀⠀⢀⣿⣿⣭⣴⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⡄⠀⠀⣿⣷⣛⡻⢿⣿⡿⠛⠀⠀⠀⠀
            ⠀⠀⠀⠀⠈⣻⣿⣿⣿⣿⣿⣿⣿⣶⡿⢻⡾⣿⣿⠁⠀⠀⠈⣿⣻⢿⡇⣿⡝⠁⠀⠀⠀⠀
            ⠀⠀⠀⠀⠚⢛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠙⣿⢸⣿⡄⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⢀⣻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⠷⡀⠀⠀⠀⠀
            ⠀⠀⠀⠀⢰⣡⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡿⣯⣭⣉⠎⣿⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⣼⠛⣴⣿⣿⣿⠿⠛⠁⠀⢸⣿⡑⡀⠀⠀⠀⠀⠙⣿⣛⣿⣯⢶⣿⣿⣄⠀⠀⠀
            ⠀⠀⠀⠀⡇⣽⣿⣿⠋⢫⢁⠀⠀⠀⠀⢿⣿⠀⠹⣶⣤⣀⣀⣠⣿⣤⣠⣿⣿⣿⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⣿⠟⣿⣿⠀⠁⠀⠀⠀⠀⠀⠀⠻⣿⣿⡄⠀⠈⡀⠀⢿⣿⣿⣟⣿⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⣿⢸⣿⣿⡿⠰⣴⡼⢠⠚⠀⠀⠀⠀⢿⣿⠀⠀⠀⠀⠛⣿⢿⣯⡄⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠘⠀⣿⣿⡇⣾⣿⠀⠀⡀⠀⢠⠀⠀⠀⠀⠛⠻⠛⠀⠙⣿⣿⠹⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⡇⢰⠀⠀⢸⠀⠀⠃⠀⠀⠀⠀⢸⣆⣿⠇⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⢻⠹⣿⠘⣿⢻⠀⢠⠀⠀⠀⢷⠀⠀⠘⡆⡼⣿⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢷⠀⢿⣿⢸⠀⠀⠀⠀⠀⠀⠟⠼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        """;

        String cat = """
            ⠀⠀⠀⠀⢠⡶⠚⢷⣤⡀⠀⠀⠀⠀⠀⣲⡶⠛⠻⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⢠⡿⠁⠀⠀⠙⣷⣄⠀⢀⣴⡟⠁⠀⠀⢷⢹⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⣾⠃⠀⠠⠶⠚⠛⠛⠛⠛⠋⠀⠀⣀⡀⢸⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⢸⣏⡔⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠚⠉⠉⣿⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⢾⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⢠⣿⢠⣶⡆⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀
            ⢒⡾⠁⠘⠟⠁⠀⠀⠀⠀⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀
            ⠉⣧⠀⠀⠀⠀⠃⠀⠀⠀⠈⠉⠠⣍⠀⠀⠀⠀⠀⠀⣸⡇⢀⣤⠶⠛⠛⠻⢦⣄
            ⠀⠸⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡟⣴⠟⠁⠀⠀⠀⠀⠀⢻
            ⠀⠀⠀⠛⣷⡦⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⡴⠞⠋⢠⡟⠀⠀⠀⠀⠀⠀⢀⡾
            ⠀⠀⠀⢰⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⣤⡀⢸⠃⠀⠀⠀⠀⢠⡶⠟⠁
            ⠀⠀⠀⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢷⣹⡄⠀⠀⠀⠀⣼⠀⠀⠀
            ⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠈⢿⣇⠀⠀⠀⠀⢹⡄⠀⠀
            ⠀⠀⠀⢸⡀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⡄⠀⠀⠀⠈⣧⠀⠀
            ⠀⠀⠀⢸⡇⠘⡇⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⢹⡇⠀
            ⠀⠀⠀⢸⡇⠀⠙⠀⠀⠀⠀⠀⢠⠞⠁⠀⠀⠀⠀⠀⠀⠀⣿⠇⠀⠀⠀⢸⡇⠀
            ⠀⠀⠀⢸⡇⠀⢸⡆⠀⠀⠀⠀⣟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠀⠀⠀⠀⣸⠇⠀
            ⠀⠀⠀⢸⣿⠀⠀⡇⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⢀⣴⡟⠁⠀
            ⠀⠀⠀⠘⠿⠶⢶⢧⣦⣦⡴⢾⣥⣽⣤⣤⣤⣤⣤⣤⡴⣯⡤⠴⠶⠛⠋⠀⠀⠀
        """;

        String horse = """
            ⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⢱⠐⠄⠙⠽⡲⣤⡀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⡾⠃⠀⠀⢀⠈⠻⣿⣿⣶⡶⢃⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⡼⣧⣀⣠⡴⠀⢂⠀⠙⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⢸⣅⣩⠟⠁⢰⠀⠸⡄⠀⠐⢻⣿⣿⡿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠈⠙⠁⠀⠀⢀⠀⠀⡇⠀⠀⠄⠻⠿⢷⣋⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⣸⠀⢠⠇⢀⡜⠀⠀⠐⡄⠀⠀⠈⠈⠐⢤⡀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⢠⡏⠀⢈⡴⠋⠀⠀⠀⠀⡗⠀⠀⠀⠀⠀⠀⢻⣿⣶⣦⣄⠀
            ⠀⠀⠀⠀⠀⡾⠀⡄⡎⠀⠀⠀⠀⠀⡰⠃⠀⠀⠀⠀⡠⠀⢀⡇⠙⣿⣿⡷
            ⠀⠀⠀⠀⡠⠣⠀⠇⡄⠀⠀⠀⢠⠔⠁⠀⠀⠀⣠⠞⠀⢀⡜⣠⣾⢿⠟⠀
            ⠀⠀⢀⡴⠁⣀⠤⠊⠘⡆⠀⣠⠣⢤⠤⠴⢲⠋⠙⠀⣰⠋⠘⡝⠁⠘⠄⠀
            ⠀⣰⡿⠖⠉⠀⠀⢀⠊⡀⠚⠁⠀⠈⠀⡰⠁⠀⡆⡜⠁⠀⠀⠁⠀⠀⠀⠀
            ⢀⡿⠁⠀⠀⠀⢰⣿⠏⠀⠀⠀⠀⡀⢰⠁⢀⣼⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⣾⡇⠀⠀⠀⠀⠀⢻⣧⣶⡄⠀⠀⣇⠎⣠⡾⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⣿⣷⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⣼⢏⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠙⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠏⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        """;
        
        if (petSpecies == 'D') {
            System.out.println(dog);
        } else if (petSpecies == 'C') {
            System.out.println(cat);
        } else if (petSpecies == 'H') {
            System.out.println(horse);
        } else {
            System.out.println("Error");
        }

        System.out.println("""
           \n
           Name: %s
           Species: %c
           Gender: %c
        """.formatted(petName, petSpecies, petGender));

        System.out.println("Press C to continue or E to exit the game.");
        char choice = Character.toUpperCase(scanner.next().charAt(0));

        if (choice == 'E') {
            return;
        } else if (choice != 'C') {
            System.out.println("Invalid option.");
        }
        
        System.out.println("""
           \n
           Here are %s's stats. You can change the values by playing, feeding
           and cuddling with your pet.

           Energy: 10  
           Happiness: 5
           Skill: 0

           You can interact with %s by giving the following commands:

           F - Feed
           W - Walk
           P - Play
           T - Train
           C - Cuddle

           And you can exit anytime by pressing E.

           What will be your first action?
           \n
           """.formatted(petName, petName));

        int energy = 10;
        int happiness = 5;
        int skill = 0;

        String stats = """
           \n
           Energy: %d
           Happiness: %d
           Skill: %d
           \n
           """.formatted(energy, happiness, skill);

        while (true) {
            char command = Character.toUpperCase(scanner.next().charAt(0));

            if (command == 'F') {
                System.out.println("\n You fed %s. Energy +5. What do you want to do next?".formatted(petName));
                energy += 5;
                System.out.println(stats);

            } else if (command == 'W') {
                System.out.println("\n You walked with %s. Energy -1, Hapinness +2. What do you want to do next?".formatted(petName));
                energy -= 1;
                happiness += 2;
                System.out.println(stats);

            } else if (command == 'P') {
                System.out.println("\n You played with %s. Energy -2, Hapinness +3. What do you want to do next?".formatted(petName));
                energy -= 1;
                happiness += 3;
                System.out.println(stats);

            } else if (command == 'T') {
                System.out.println("\n You trained %s. Energy -3, Skill +3. What do you want to do next?".formatted(petName));
                energy -= 3;
                skill += 3;
                System.out.println(stats);

            } else if (command == 'C') {
                System.out.println("\n You walked with %s. Energy +3, Hapinness +3. What do you want to do next?".formatted(petName));
                energy += 3;
                happiness += 3;
                System.out.println(stats);

            } else if (command == 'E') {
                System.out.println("\n Exited game.");
                break;
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }
    }
}
