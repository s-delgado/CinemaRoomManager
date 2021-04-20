package cinema;
import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    static final int maxSeatsInSmallRoom = 60;
    static final int costSeatInSmallRoom = 10;
    static final int costFrontSeatInLargeRoom = 10;
    static final int costBackSeatInLargeRoom = 8;
    static int rows;
    static int seatsInRow;
    static int rowNumber = 0;
    static int seatNumber = 0;
    static int [][] seatsCost;
    static int [][] boughtSeats;

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seatsInRow = scanner.nextInt();
        boughtSeats = new int[rows][seatsInRow]; // Keep track of seats
        fillSeatsCost();
        showMenu();

    }
    private static void showMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        int selection = scanner.nextInt();
        switch (selection) {
            case 0:
                break;
            case 1:
                drawSeats();
                showMenu();
                break;
            case 2:
                buySeats();
                showMenu();
                break;
            case 3:
                statistics();
                showMenu();
                break;
            default:
                System.out.println("Error!");
        }
    }

    private static void drawSeats() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 0; i <= rows; ++i) {
            if (i > 0) {
                System.out.print(i + " ");
            }

            for (int j = 1; j <= seatsInRow; ++j) {
                if (i == 0) {
                    System.out.print(j + " ");
                } else {
                    if (boughtSeats[i - 1][j - 1] == 1) {
                        System.out.print("B ");
                    } else {
                        System.out.print("S ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
    private static void fillSeatsCost() {
        int allSeats = rows * seatsInRow;
        int rowsFront = rows / 2;

        seatsCost = new int[rows][seatsInRow];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < seatsInRow; ++j) {
                if (allSeats <= maxSeatsInSmallRoom) {
                    seatsCost[i][j] = costSeatInSmallRoom;
                } else if (i < rowsFront) {
                    seatsCost[i][j] = costFrontSeatInLargeRoom;
                } else {
                    seatsCost[i][j] = costBackSeatInLargeRoom;
                }
            }
        }
    }
    private static void buySeats() {
        System.out.println("\nEnter a row number:");
        rowNumber = scanner.nextInt();

        System.out.println("\nEnter a seat number in that row:");
        seatNumber = scanner.nextInt();


        if (rowNumber > rows || seatNumber > seatsInRow || rowNumber < 1 || seatNumber < 1) {
            System.out.println("Wrong input!");
            buySeats();
        } else if (boughtSeats[rowNumber - 1][seatNumber - 1] == 1) {
                System.out.println("That ticket has already been purchased!");
                buySeats();
        } else {
            System.out.println("Ticket price: $" + seatsCost[rowNumber - 1][seatNumber - 1]);
            boughtSeats[rowNumber - 1][seatNumber - 1] = 1;
        }

    }
    private static int calcTotalIncome() {

        if (rows * seatsInRow <= 60) {
            return rows * seatsInRow * costSeatInSmallRoom;
        } else {
            int rowsFront = rows/2;
            int rowsBack = rows - rowsFront;

            return rowsBack * seatsInRow * costBackSeatInLargeRoom + rowsFront * seatsInRow * costFrontSeatInLargeRoom;
            }
        }
    private static int[] calcCurrentState() {
        int income = 0;
        int seatsSold = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < seatsInRow; ++j) {
                income += seatsCost[i][j] * boughtSeats[i][j];
                seatsSold += boughtSeats[i][j];
            }
        }
        return new int[] {income, seatsSold};
    }
    private static void statistics() {
        int [] state = calcCurrentState();
        int currentIncome = state[0];
        int numTicketsPurchased = state[1];
        int totalIncome = calcTotalIncome();
        System.out.printf("Number of purchased tickets: %d %n", numTicketsPurchased);
        System.out.printf("Percentage: %.2f%% %n", 100 * ((float) numTicketsPurchased / (rows * seatsInRow)));
        System.out.printf("Current income: $%d %n", currentIncome);
        System.out.printf("Total income: $%d %n", totalIncome);
        System.out.print("\n");
    }

}





