// https://favtutor.com/blogs/rock-paper-scissors-java
//GROUP MEMBERS: BARLINTANCO (HARDCODE), DELVALLE(HARDCODE), GUERZON(PLANNING), JACILDO(HARDCODE), TALABUCON(PLANNING)
import java.util.*;

public class RockPaperScissor {
	
	public static void main(String[] args) {

		
			//MODIFIED: DECLARE HEALTHBAR VARIABLES
			Integer ComputerHealth = 100;
			Integer UserHealth = 100;

			//MODIFIED: ANNOUNCEMENT!
			System.out.println();
			System.out.println("Welcome to Rock Paper Scissors XTREME!!!!!");
			System.out.println("By default, you and the Computer will have 100hp. Eliminate your Opponent!" );
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
		
	
		Scanner scn = new Scanner(System.in);
		
		while(true) {

		//MODIFIED: LOOP 
		while( UserHealth > 0 || ComputerHealth > 0){
		//1. RANDOMIZED COMPUTER MOVE
		
			// array of string containing available moves.
			String [] availableMoves = {"Rock", "Paper", "Scissors"};
		
			// using Random() function on indices of array so that it chooses a random move.
			String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
		
			//MODIFIED: DECLARE COMPUTER HEALTH
			System.out.println();
			System.out.println("Computer has chosen it's move.");
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
		
		//2. PLAYER MOVE
		
			//input
			String userMove;
		
			// loop until the user chooses the correct move
			while(true) {
				System.out.println();
				System.out.println("Please choose your move from these available moves : 'Rock' 'Paper' 'Scissors' ");
				System.out.print("Enter the move you chose : ");
				userMove = scn.nextLine();
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
		
				// checking if user's move is one of the available moves or not
				if(userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors") || userMove.equals("BRAVO!") || userMove.equals("hesoyam") || userMove.equals("k3ntp0g1") || userMove.equals("ihatejava")){ 
					System.out.println();
					break;
				}
			
				// if user didn't enter a valid input
				System.out.println();
				System.out.println("Invalid Move!!");
				System.out.println("Please enter the move from the available moves only!");
				System.out.println();
			}
		
			//printing what computer chose
			System.out.println("Computer chose : " + computerMove);
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
		
		//3. COMPARING THE MOVES & DECIDING THE WINNER

			//MODIFIED: CHEAT CODES!!!!!

			if(userMove.equals("hesoyam")) {
				{System.out.println("  __  __ _____  _____ _____ _____ ____  _   _    _____ _    _  _____ _____ ______  _____ _____ _ \r\n" + //
										" |  \\/  |_   _|/ ____/ ____|_   _/ __ \\| \\ | |  / ____| |  | |/ ____/ ____|  ____|/ ____/ ____| |\r\n" + //
										" | \\  / | | | | (___| (___   | || |  | |  \\| | | (___ | |  | | |   | |    | |__  | (___| (___ | |\r\n" + //
										" | |\\/| | | |  \\___ \\\\___ \\  | || |  | | . ` |  \\___ \\| |  | | |   | |    |  __|  \\___ \\\\___ \\| |\r\n" + //
										" | |  | |_| |_ ____) |___) |_| || |__| | |\\  |  ____) | |__| | |___| |____| |____ ____) |___) |_|\r\n" + //
										" |_|  |_|_____|_____/_____/|_____\\____/|_| \\_|_|_____/ \\____/ \\_____\\_____|______|_____/_____/(_)\r\n" + //
										"                _ /_ |/ _ \\ / _ \\  | |  | |  ____|   /\\   | | |__   __| |  | |                   \r\n" + //
										"              _| |_| | | | | | | | | |__| | |__     /  \\  | |    | |  | |__| |                   \r\n" + //
										"             |_   _| | | | | | | | |  __  |  __|   / /\\ \\ | |    | |  |  __  |                   \r\n" + //
										"               |_| | | |_| | |_| | | |  | | |____ / ____ \\| |____| |  | |  | |                   \r\n" + //
										"                   |_|\\___/ \\___/  |_|  |_|______/_/    \\_\\______|_|  |_|  |_|                   \r\n" + //
										"                                                                                                 \r\n" + //
										"                                                                                                 ");
				}
				UserHealth = 100;
				System.out.println();
				System.out.println("hehehe. Restored to full health!");
				System.out.println();
				System.out.println("User health: [ " + UserHealth + "% ]" );
				System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				
			}

			if(userMove.equals("BRAVO!")) {
				{System.out.println(" ____  _____       __      ______  _ \r\n" + //
										" |  _ \\|  __ \\     /\\ \\    / / __ \\| |\r\n" + //
										" | |_) | |__) |   /  \\ \\  / / |  | | |\r\n" + //
										" |  _ <|  _  /   / /\\ \\ \\/ /| |  | | |\r\n" + //
										" | |_) | | \\ \\  / ____ \\  / | |__| |_|\r\n" + //
										" |____/|_|  \\_\\/_/    \\_\\/   \\____/(_)\r\n" + //
										"                                      ");
				}
				ComputerHealth = ComputerHealth-50;
				System.out.println();
				System.out.println("BRAVO! You found the cheat code! You dealt 50 damage to the Computer >:)");
				System.out.println();
				System.out.println("User health: [ " + UserHealth + "% ]" );
				System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				
			}

			if(userMove.equals("ihatejava")) {
				{System.out.println("																	   ,---,  \r\n" + //
										"                             ,--.                   ,--.  ,----..   ,`--.' |  \r\n" + //
										"  .--.--.      ,---,       ,--.'|  ,----..      ,--/  /| /   /   \\  |   :  :  \r\n" + //
										" /  /    '. ,`--.' |   ,--,:  : | /   /   \\  ,---,': / '/   .     : '   '  ;  \r\n" + //
										"|  :  /`. / |   :  :,`--.'`|  ' :|   :     : :   : '/ /.   /   ;.  \\|   |  |  \r\n" + //
										";  |  |--`  :   |  '|   :  :  | |.   |  ;. / |   '   ,.   ;   /  ` ;'   :  ;  \r\n" + //
										"|  :  ;_    |   :  |:   |   \\ | :.   ; /--`  '   |  / ;   |  ; \\ ; ||   |  '  \r\n" + //
										" \\  \\    `. '   '  ;|   : '  '; |;   | ;  __ |   ;  ; |   :  | ; | ''   :  |  \r\n" + //
										"  `----.   \\|   |  |'   ' ;.    ;|   : |.' .':   '   \\.   |  ' ' ' :;   |  ;  \r\n" + //
										"  __ \\  \\  |'   :  ;|   | | \\   |.   | '_.' :|   |    '   ;  \\; /  |`---'. |  \r\n" + //
										" /  /`--'  /|   |  ''   : |  ; .''   ; : \\  |'   : |.  \\   \\  ',  /  `--..`;  \r\n" + //
										"'--'.     / '   :  ||   | '`--'  '   | '/  .'|   | '_\\.';   :    /  .--,_     \r\n" + //
										"  `--'---'  ;   |.' '   : |      |   :    /  '   : |     \\   \\ .'   |    |`.  \r\n" + //
										"            '---'   ;   |.'       \\   \\ .'   ;   |,'      `---`     `-- -`, ; \r\n" + //
										"                    '---'          `---`     '---'                    '---`\"  \r\n" + //
										"                                                                              ");
				}
				UserHealth = -999;
				System.out.println();
				System.out.println("Drop ka na, ayaw mo pala sa java e.");
				System.out.println();
				System.out.println("User health: [ " + UserHealth + "% ]" );
				System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				
			}

			if(userMove.equals("k3ntp0g1")) {
				{System.out.println("llllllllllllllllllllllllllllclllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllollllllllllllllllllllllllollllloolllllllllllllooooollloooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllolllllllllllllloolllllllllllooolloooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllccccccccccc::;;;cllllllllllllllllllllloolllllooooolloollllloooooooooloooooooooooooooooooooooooooooooooooooooooooooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcccccccccccccc:::;,,'''''.....;clllllllllllllllllllllolllllloooolllollooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcccllllllccccccccccc:::::::;,'.............,:cllllllllllllllllllllolllollloooooollloooooollooolloooooooooooooooloooooooooooooooooooooooooooooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllccccc::c:::ccccccccc:ccccc::::::;;,''...............',:ccccllllllllllloollllooooollooolooollollooolloolloooloooooooooollooooooooooooooooooooooooooooooooooooooooo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcccccccc::;;;;;;::::::;;;;;;;::ccc::;;;;,''..................',;::cccccllllllllooolloolllolloooolllloollllllloooloooooooooollllllllllllllllllooooooooooooooooooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcccccc::::::::::::;;;;;;;;;;;,,'',,,,;;;;:::;;;,,'....................',;;:::ccccccccccccllllllllllollollllllllllllllllollllllllloolllllllllllllllllllllooooooooooooooooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllccc:::;;;;;;,;;;;;;;,,,,,,'''''''''''',,,;;;;;::;,,,''..............     .....''',,,,,;;;;;;;;;;;::ccllllllllllllllllllllllllollllllllllllllllllllllllllllllllllooooooooooooooooooooooooo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllccccccc::;;;,,,,,,,,'''''',,,''''.................',''',,''.................     ........',,,,;;;;,'''',,'',:clllllllllllllllllllllllllllllllllllllllllllllllllllllllllllloooooooolloooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcllllcccccc::;;;;;,,,,,,,,,,'''..................................................       ...........'''',;;;;,''.....',:cclllllllllllllllllllllllllllllllllllllllccccccccccccccllllllllllllolllooooooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcccclllcccccccccc:::::;;;,,,,'''...'.....................................................                 ...........'''''......,;:::ccllcccllllllllllllllllllllllllllcllcccccccccccccccccclllllllllllllllllllooooooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllccccccccc:::;;;;;;;;,''''........................................................  . .                       .....................,;:::::ccccccccccccllllllllllllllllcccccccccccccccccc:ccccccllllllllllllllllllloooooooo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcllllllllllllcccccc::;;;;,,,''''''................................................................                 ...   ..........................,;;;;::::ccccccccccccclccccccccccccccccc:::::::::::::::cccclllllllllllllllllooooooooo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcclllllccc:::;,,''''.............................................................................                 .    ....   ...................'',,;;::cccccccccccccccccccccccccccc::::::::::::::::::::ccccclllllllllllllllllloooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcccc::;,,''..............................................................................   ....                       ..   ...................'''''',;:::::::::::ccccccccccccccc:::::::::::::::;;:::::::cccccccllllllllllllllllooooo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcc:;,''............................................................................................           ...           ............................',;;:::::::::::::ccccccc::::::::::::::;;;;;;;;:::::::cccccccccccccccclllllloooo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllcc:;,'................................................................................................      ...               ............. ...    ............'',;;;:::::::::::::::::::::::;;;;;;;;;;;;;:::::::::cccccccccccccccclllllloo\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllc:;,'.................................................................................................             .....     ...        .....        ......'''''....'',;;;;:::::::::::::::;;;;;;;;;;;;;;;;;;::::::::::::cccccccccccccclllllo\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllc:;'.....................................................................................................    . ..     ....  ......                ..   ...................'',,;;;;;:::::::;;;;;;;;;;;;;;;;;;;;;;;:::::::::::::::::::::cccccllll\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllc:;'...........................................................................................................................                    .............................'',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::::::::::::::::::::cccclll\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllllllllllcc:,'........................................................................................................       ........                         ..................................'',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::;;:::::::::::::::ccccll\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllllc:,'....................................................................... ...................... .....        ............................  ...............................................'',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::;;::::::::::cccc\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllllc:;,.......................................................................................         .............................................     .    .......  ...............................'',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::::::::::cccc\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllllllllcc:;'...................................................................................       ............. ......    ........      .  .....                     .         ............................'',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::::::::cc\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllccc::;'......................................................................   ........         ......                   .          ..........                                   .    .......................',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::::::c\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllcccc:;,'.....................................................................  .............       ..  .. .     ..      ....    ................                                            ..... ................',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::::::::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllcccc:;'......................''........................   .  ........................    ...                   .      .......    ............  .                   ...                               ..     ........,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::::::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllllcc:,...............'........................................................              .........          .........  ...   ............  .              ..   ........                                   ........',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllccc:,..............'.......................................................              .............   ...   ......      .   .......     .                .... ..........   .                                 ........',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllllcc:,......................................................................          ...............................      .   ......                   .......... ..........       .                             ...........',;;;;;;;;;;;;::;;;;;;;;;;;;;;;::::\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllllcc:,..'...................................................................           ..............................      ....  ...             .       .....................       ..                             ............',,;;;;;;;;;;:;;;;;;;;;;;:;;;;;;:\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllcc:,....................................................................      ................. ....................  ........                  ...     .........................    ..    ...                        .. .......'',;;;;;;;;;;;;;;;;;;;;;::;;;;::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllllc;'.......................................................................   ...........  .................. ............... ..                 ..    ...... .... ..............         . ..                             ....''..',,;;;;;;;;;;;;;;;;;;;;;;;;:::\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllllc;'....................................................'''............ .................   ............. ............ ..........               .       .....  ...  ........  .....     .. ............                      ...'''..',,;;;;;;;;;;;;;;;;;;;;;:;;::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllll:,......................................................''''............................     ........ ..........................                       .. ...  ..  ........    ......  .................                     ....'....'',;;;;;;;;;;;;::;;;;::;;;::\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllc;'....................................................................................           ...............................                      .... .. ....  ......     ...  ..   ...................                   .........'',,;;;;;;;;;;;;;;;;;;;;;;:\r\n" + //
										"lllllllllllllllllllllllllllllllllllllll:,........................................................................................       .......... ......................                  .      ..    ...  .....       ..  ..   ....................  .             ..............',,,;;;;;;;;;;;;;;;;;:::\r\n" + //
										"llllllllllllllllllllllllllllllllllllll:,......................................................................................... ...  ....................'.............  .                               ......          ..      .................... ..          ..................'',,,;;;;;;;;;;;;;;::;\r\n" + //
										"lllllllllllllllllllllllllllllllllllllc;'...........................  ............................................................ ..................''''................            ..                    ....             ..      ......................     .. .......   .............',,,;;;;;;;;;;;;::;;\r\n" + //
										"llllllllllllllllllllllllllllllllllllc;'...........................................................'''.............................................'''...................              .                  ..         ...     ...    .....................   ..........      ..............'',;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllllllllllllllllc;............................................. ...............................................................''......'''..........                                            ....     ....  ...................... .........           ...............',;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllllllllllllllllll:,......................................''......  .............................................................''.....',,'''.........                   ..                 ...........  . ...    ....  .... .......... ...  ..              ...............',,,;;;;;;;;;::\r\n" + //
										"lllllllllllllllllllllllllllllllll:,.............................................. ..............................................................'''''''',,,''''........       ...     ..........            .............   ...     ..  ....   .... ...                       ...............''',;;;;;;;;;::\r\n" + //
										"llollllllllllllllllllllllllllllc:,......   ....................................    ..............................................................''',,,,''..'''.........   ....................             ............. .            ..... .. ......                         ..  .  .......''',,,,;;;;;;;:\r\n" + //
										"llllllllllllllllllllllllllllllc:;.......   ...................'................  ...............................................................'''','''.....................................               ............. ..  ..       ...   .........                        ... .............'',,,,,;;;;;;\r\n" + //
										"llllllllllllllllllllllllllllllc;'....      .................''................. .................................'''.................'.......'......''................ ................. ....             ...............  .  ..      ...   ..........             ...      .....................'',,;;;;;;;\r\n" + //
										"lllllllllllllllllllllllllllllc:,....       ............................................................................'....................''..........................................               .. ............... ..  ...    ...  ............            .......   .....................',;;;;;;;;;\r\n" + //
										"llllllllllllllllllllllllllllc:,......    ........................................................................................'''.......'''..........................................          ....    ............... .......  .... .............            ..............    ..............',,,;;;;;;:\r\n" + //
										"lllllllllllllllllccccccclllcc;'..   ... ..............................................''.....................................''...'''''..'''..............................................    ......     ................ ......  .................               ............     ...............'',,;;;;;:\r\n" + //
										"lllllllllllllllcc::;;;;:cccc:,..    ................................................''...........................................''''''...'''....'''''''..................   ...     ................   ......................    ...........   .                   ........       ...............',,;;;;;;;\r\n" + //
										"llllllllllllllcc:;,'''',;cc:,..  .................................................'..............  ..............................'''''''',,,''..'''.......................  .......   ........................................    ....                                .  ..        ..............',;;;;;;;;;\r\n" + //
										"lllllllllllllllc:;,'..',;::;..  ..................................................'.......    ..  ...  ...............................'',,'''............................     ..... ..........................................  ..                                    .             .............',;;;;;;;;;\r\n" + //
										"llllllllllllllllc:;,,,,;;:;'...........................................................       .   .......................'.........'''''''',''..............................  ........................'''''.'.............      ........                                            ....  ......',,;;;;;;;;;\r\n" + //
										"lllllllllllllllllccc::::::;'.........................................................       ...  .................''',,;;;,,,'''''''''''''''''.......................................................',,'''''...........         .......                                                  ......',,;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllccccc;........................................................       ...   .................'',;;;:;;;;;,,,,,,''''''''''.......................................................',,,,,,,'.........      ...  ........                                                   ...',,;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllclcc:,.....................................................          .....................',;::cccc:;;;:::::;,''''''''''......................................................''''',,,'.........      .... ..........                                                 ....',,;;;;;;;;;;\r\n" + //
										"llllllllllllllccccccccccc;'....................................................  ..      .................'''';::cccccccc:ccccc:::;;;;;;,,,,,''''''''''''''''.................................'''......................   ..............                                                  .....',;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllccccccc:,...............................  ...................   ..    ............'''...'',;:ccccccccc:::::::cccccccc::;;;;,,,,,',,,,,,,,,,,,,,,,,,,;;;;,,,''''...........,;:::;,,''....''''........................                                                      ...',,;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllllllcc:'....................................................  ...    .........',,''''',;::ccclllllllcccc:ccllllllllccccccccc:::;;;;;:;;;;;,,'''''',,,,,'''.............';;;;,,,,'''',,,;;,'....   .....''........                                                     ......',;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllllc;'...................................................   ..    ........,;;,'',,;::ccllcllllllllccllllllloooooooooolllllllllccccc:::::;;,,''....................'''''',,,''''''''''''...     .......................                                               ....',;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllllc;....................................................  .    .......',;;;,,,;::cccclllllllllollllloooooooooooooooolllllllllllllllcllcccc:::;;;,,,,,,,,,'''''''''''''''''...........      ............................                                            ....',,;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllllc;....................................................      ..''..',;:::;;::::ccccclllllllllolllooooooooooooooolllooolloollllllllllllllcllllllllccccc::;;;::;;,,''...............  .......................................                                     ......',,;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllll:,...........................................'......      ...''..,;:::::::ccccclllllllollllllloooooooooooooollloooooooooollolloooollllllloooooooolllccccclllllcc:;,,'.....................................................                                     ...''',,,;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllllllc;'.................................................     .......',::ccccccccclllllllllllllllllllllloooooolllllllloooooooollooooooooololllllolooollllllllllllllllllccc::;;,,''.......'',,,'','''''....'...''...................                                 .....''',,;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllllcc:,.......... ......................................    ....''',,;:cccccccccccclllllllllllllllllllloooooolllllllllooooooolooooooooooloollllllllllloooooooooolllllllllccccc:::;;;;:::::::::;;;;;;,'...,,''',''..'''''''........                                 .....'',,;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllc:,.........  ....   ... ................................',;;;;:::cclccccccccccccccllllllllllllllllloollllllllllllllooooooooooooooooooollllllooooooddooooooooolllllllccccccccccccccccccc:::::::,'..',,'',;,,,,',,,,,'''....  .                                .......'',,,;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllc:,........ .....   ...  ...................'......'',,,;;::::ccccccllllccccccccccllllllllllllllllllllllllllllllllllooooooooddddoooooloooodooooooodddooooooooooooooollllllllllllllllllccc::::;,..',,,,,;;;;;,,,,,,,,''....                                     .......'',;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllolllcc:;'.....   ...          ................'''',''',,;;;;::cccccccccccllcccccccc:cccccccllllllllllllllllllllllllloooooooooodddddooooooloooodddoooooodddooddddooooooooooooooooolooolllllllcc:;;,'',;;;,,;;;;;:;;;,,,,,'''...                                       .....'',,;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllllc:,.......   .          ................',,,,,,,;;;:::::ccccccccccclccccccccccccccccccccllllllllllllllllllllllooooooooddddddddooooooodddooodddddddooooddddddddddddooooooooooooooollllcc:;,'',,;;;;;;;;;;;:;;;;;,,,,''....                                      ......'',,;;;;;;;;;;;;;;\r\n" + //
										"llllllllllloolllllllc:;'....  ...            ...............',,,,;;;;:::::::cccccclccccccccccccc::cccccccccccccclllllccllllllllllooooooooodddddddddddddddddddddddddddoooodddddddddddooddoooooollllllcc::;;;,,;;;::::::::::::::::;;;;,,,,''....    .             .                   .....''',,;;;;;;;;;;;;;;\r\n" + //
										"llllolllllllllllllllc;,'..........          ...............',,,,;;:::::::cccccccccccccccccccccc::::::cccccccccccccccccccllllllllooooooooddddddxxxxxxxxxxxdddddddddddoooddddddddddddddddddoooollcc:::c:::;;:::ccccccccccccc::::::::;;;,,,''......... .....   ......               ........'',,;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllc:;,'...  ........     .................,,,;;:::::::cccccc:ccccccccccccccccc::::::::::;;;;::::::::ccccclllllllllooooodddxxxxxkkkkkkxxxxxxxdddddddoddddddddddddddddddddddoodooolllllcc:::cccclllllllccc::::::;;;;;,,,,'.... ....................            ...........'',,;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllooloollllcc:;;,...  .......    ..................',,;;::::::::ccccccccccccccccccccc::::;;;;;;;,,,',,,,,,,,,,;;;;;;;;;;:;;::cllooddxxkkkOOOOkkkOOkkkxxxxxddxddxxxxxxxxxxddxxxdddddddddddoooollccllllllllcccccc::::;;;;;,,,,'',,''.... ....................           .............',,;;;;;;;;;;;;;;;\r\n" + //
										"lllloolllllllllllccc::;,...........    ..................'',;;:::::::::ccccccccccccccccc:::::;;,,'',,''''''''',,''..''''''.'''''''''',,;;;:loddxxkkOkOOOOkkkxxxxxxxkkxxxxxxkkkxxxxxxxxxxxddddddddooooolllcccc:::;;;;;,,,,,,'''''''''''...... .....................            .............',;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllcc::;'...  ....      ..................',;;;:::::::::cccccccccccccccc::;;,,''..''''''''',''','''..'''''''''''''''........',;:ccodddxxxxkkkkkkkkkxkkxkkkkkkkkkkkxxxxxxxxdddddddolllllc:;;;,'...'''''...................... ......................         ..   ..........',,;;;;;;;;;;;;;;;\r\n" + //
										"llllllloolllllllllllc:,'..  ...        ..  .............',,;;:::::::::ccccccccccccccc:::;,'.....',,,,,;;;;;;,,,,,,,,;;,;;;,,,,,,,,,,;,'''''..';::cllclllodxdddxkkOOOOOkkkkkkkkkkkkxxxxkxddddddolc::::;'............'''''''''''''.........  .......................        ..............',,,;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllllc:,........      ..................'',,;;:::::cc:cccccccccccccccc:;,'....''',;;;::cccc:cccccccccllcllllc:cc::::;::;;;;,,,',;:cllcclcloolclodxOOO00OkkkkkOkkxxxxxxxddollllllcc:;;,'............',,,,,,;,,,,,,,,'...............................  ....    ............',,;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllllc:,........       ..................',,,;;::::::ccccccccccc:cccc::;,'..''',;::cccclllllllllooooodddddddxxdooooollcc:::cc::;;:cccllllcllccllodxkkkOOOkkkkkkkxxxdddddollcccccccc:;;;,',,,,,'',,,,;;;;::::::;;;;;,,'....'........................ .....     ..........'',,,;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllc:;'.......            .............'',,;;:::::::ccccccccccccccc:;;,'',,;;;:cclllllllooooooooddoddddxxxxkkxkkxxxdoooollllllcccllloollllllloooodxxkkOOkkkkxxxxddddddolllcclllccc:::;,;;;;;;:::cccccclllllcc::;;;;,,',,;;;,,'........................       ...........',,,;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllc:;,....  ..     ..  ..............'''',;;::::::ccccccccccccc::::;,,,;:;:::cclllllllloooooooooodddxxxxxxkkkkkxxxxddddddooooooollooolllllllloooddxxxkkxxxxxddddodooooolcccccllc:::::::cccclloooolloooooollcc:::::::::cc:::;,,,''.................... ..    ..........'',,,;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllcc;,'.......    ...................''',,;;;::::::cccccccccccc::c:;;:::::::ccllllllloooooooooooodddxxxkkkkOkxxxdddddddddddoooooooooolllllllloooodddxxxxxxxxdddooooooollcccccllccclcccllloooodddoooooooooollllcllllllcccc::;;;;,,,''.....................   .........'',,,;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllloolllllolllcc:,'........  .....................''',;;;;::::::ccccccccc:c::cc:::::ccccccclllllloooooooooooddddddxkkOOOkkxxdddddoooooooooooooooooooooooooooodddddxxxxddddddooooolllllcllllllllllllooodddddddddddoooooollllllllllllcccc::::;;,,,''''''.............    ...........'',,;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllcc;,,'.....   ......................'',,;;;;::::::cccccccc::cc::::::ccccccccclllllllloooooodooodddddddxxxxxxxddooooooooooooooooooooooooooooooooddddddxxxddddooooooollllllllllllllllooddddddxxxxxdddoooooolllllllllcccccccc::::;;,,''','''''............  .........'',,,,;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllollllllcc::;'.....    .....................'',,;;;;::::::ccccccccc::ccccccccccccccccclllllllollooooolllllllllllllllllllllllllllolllllllooooooooooooooodddddxxxxxddoooooooolllllcccllllllooddddxxxxxxxxxdddoooooolllllllllcccccccc::::;;;;,,,,,,,,''...........  ........'',,,;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllcc:,.....     .....................',,;;;;;::::::ccccccccc::ccccccccccccccclllllllllllllllcccccccccllloolllcc::::::ccccllllllllllllooooooooooddddddxxxxdddddooooolllllcccccllloodddddddddddddddooolllllllccclllccllllccc:::::;;;;;,,,,,,,,'...................'',,,,;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllllc;,......... ......................'',;;;;;:::::ccccccccccccccccccccccccccclllllllllccc:::::::::::::::cc::::;;;;;;;;;;::ccclllllllllllooooooooddddxxxxxdddddoooolllllcccccllloooooooollllllllllllcccc:::::::::cccccccccc:::::;;;;;;,,,,,,,,'................''',,;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllllllllc:;'........  .......................',,;;;;:::::ccc:ccccccc::ccccccccccccccclllllccc:::::::;;;,,,'......'.....'',,;;;;;;;::ccccccclllllllooooooodddxxxxxdddooollllllcccccclllllllccc::::::::;;;;;,,,,,;;;;;;;;;;::ccccc::::::::;;;;;;;;;;,,'................',,,,;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllloollllc:;;,,''................... .........'',;;;;::::cc::cccccccccccccccccccccccccclcccc::;;;;;;,''.''........'.......''',,,;;;;;::cccccccccllllllooooddxxkkxxdddooolllllccc:cccllccccc::;;;;;,...............'',,;;;;;;;::c::::::::::;;;;;;;;;,,'.................',,;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllloolllllllllllcc:::;,''............................'',,,;;:::ccc:cccccccccccccllllllcccccccccccc:::;;,,'....,;;.......ld;.....';:;,',,,;;;::ccccccllllcclllloooddxxkkxxdddoollccccc:::cclllccc:::;;;;;,.....;c,.............',,,;;;:::::::::::::;;;;;;;;;,,'..... ..........'',;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllollllllllllccc;,,'............................',,,;;;::::::ccccccccccccllllllllcccccccc:::;;,,'.....':cc:,......,;'.....,lddc:;;,,;;::ccccllllllcccllloooddxxkkkxdddoolccccc::::clllllcc:;;;:lllc,....:l,.......',,'.....',,;;:::::::::::::::;;;;;;;,'....  .........',,;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lolllllllllllllllolllcc:;,'............................',,,;;:::::::ccccccccccccllllllllcccc:::::;;;,'......';clllc;'...........;lxkxdl:::;;;;::cclloddolccccllllooddxkkkxxddollcc::::::cloooolc:cccloddxdc,............,:cc:'......'',;;::::::::::::::;;;;;;,'....   .......',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"oollllllllllloollllllcc::,..'''.....''.................',,,;;::::::cccccccccllclllllllllcc:::::::;;,,,'''',,;;::::c:;,'''','.'';codollc:;;;:;,,;cloodddolccccccllloddxxxxxddoollc::::;;:coddollc:;:clodddxdc,'........',:cc:;,'.......',,;;;;;:::::::::::;;;;,,....   ....'''',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"olllolllllllllollllllllc:,',;;;'....',................''',,;;;:::::ccccccccllllllllllllcccc:::::::;;;;;;;::cccc:::ccc:cc:cc::;:ccccc::::::::::;:cloddooolccccccclloodddxxxddoollc::;;;;:cloolc:c:::ccccccllc:;;::;,,,,,;;;;;;;;,,,,''.'',,,,;;;:::::::::::;;;;,'.........'',,,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"ollllllllllllloooloollllc;;,;:c:'''''''................'',,;;:::::::cccccccllllllllllllllcccccccc:::::cccclllllllooooodxxddoollllllllcccccllllcllloddooolccccccclloodddxxdddooolcc::;;;:clollclloodoooooododddoollccc::::::::c::::;;;,,,,;;;;;::::c::::::;;;;;,'.......''',;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lollllllllooooollloolllllc:;:clc:;;;;,,.................',,;;;:::::::ccccccclllllllllllllllcccccccccccccclloooodddddddxxxxxdddolllllllllllllllllloooolllccccccccllooodddxddddoollc::;;;;:cllloooodddoddddddddddddoollllllllllcccc:::;;;;;:::::::::cc:::::;;;;;,'......'',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"loolllllllllllllloooollllllccloolllc::c;'...............',,;;;;:::::::cccccclllllllllllllllllllllcccccccllllooooddddddddddddoooolllllccccccccllllllllllccccccccclllooddddddddooollc::;;;::cclloooollllolllllllooooooooooooollllcc:::;;:::::::::::ccccc::::;;;;,'.....',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllloolloloooooooooolllllllloddoddoccolc,'''...........',,;;;;::::::cccccccclllllllllllllllllllllllcccccllllooooooddooooooooolllllccccccccllooolllllcccccccccclllloooddddddddooollc::;;;:::ccllollllllllllllllllllooooooollllccc:::::::::::c:::cccccc::::;;;;,'.....',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllloooooooooloooolllllllolllodxddxdlloolc;,''..........',,,;;;;:::::::ccccccllllllllllllllllllloooolllllllllllllllllllllllllllllcclllllloooooollllllllccccccllloooooooddddddddoolllc::;;;:::cclloooooooollllllllllllllllllllccc:::::::ccccccccccccccc:::::;;,,'....',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"loooooolooollllllooolloolllllodxdddollooolc;,,'.........'',,;;;;:::::::::ccclllllllllllloooooooooooddooooooollllllllllllllllllooooooddooooooollllllllllllcccllloooooooodddddddoooollcc:::::::ccclllooodddooloolllllllllllllccccccccccccccccccccccccccc:::::;;,,'....',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llloolllloolllloooollllolllllldxddolcloooooc;,,'........',,,,;;;;:::::::cccclllllllloooooooooooooooddddddddddooooooodddddddddddxxddddddooooooooooolllllllcclllloooooooodddddddooooollccc:::::cccllllooodddddddoooolllllllllllllllllcllllclllcccccccccc:::::;;;,'....,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllllollllllolllllooollllddolclooooool:;,,'.......',,,,;;;;;::::::cccclllllooloooooooooooooooooooddddddddddxxxxxxddxxxxxxddddddoooooooooooollllllllllllloooooooooddddddddoooolllcccc:::cccclloooooodddddddooooooooooooooolllllllllllllllllccccccc:::;;;;,'....,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lollllloollllllllllloooolllllllodolloodddoool:;,,'......''',,;;;;;;;::::cccclllllllloooooooooooooooooodddddddxxxxxxxddxdddddddddooodddooooooooollllllllllllooooooooooooddddddddoooollllcccc:::cccclllooooodddddddoooooooooooooooooollllllllllllllcccc::::::;;;,'...',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllloolllollllloolllodoloxxkxxxddolc;,,'.....''',,,;;;;;;;::::cccllllllloolloooooooooooooooddddddddddddddddddddoooooddoodddddddoooollllllllooooooolooooooooooddddddoooooollllcccc:ccccccllloooddoddodddddoddoddoooooooooooolllllllccllccccc::::::;;,'...',;;;;;;;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llloolllllllllollllolllllolollllllldkOOOkxxxddl:;,'.....'',,,,;;;;;;;::::ccclllllloolllooooooooooooddddxddddddddoooooodddoooddddddddddddddooooolooooooooolllllllloooooddddddddddoooolllccccccccc:ccclllloooooooddodddddddddooooooooooooolllllllccccccc::::::;;,'..',,;;;;;;;;;;;;;;;;;;,;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllollllllloolllooolloollllolllccoxkOOOkkkxxxoc;,,'....'',,,,;;;;;;;;:::cccclllllllloloooooooodddddddxddddddooddooodddddddddddddddddddddddooooooooooolllllollloooooooddodddddddooooollllccccccccccccllllooooooooooodddddddddddooooooooooollllccccccccc:::::;;,'''',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllllllolllllollooooollccldxkkkkxxxxxl:;;,'...''',,,,,;;;;;;;;::ccclllllllooooooooddoddddddddddddddooddddddddddddddddxxxxxxxxdddddoooooooooolllloooooooooooooooodddddddoooooolllcccccccccccllloooooddoooooooodddddddddddddooooooooollllcccccccc::::;;,,''',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"lllllllllooooollooollllloolooolllccodxxxxxdddoc;;;,'....'',,,,;;;;;;;;:::cccclllllllllloooddddddddddddddddddoooddddddddddddxxxxxxxxxxxxxxxxddddddoollllllooooooooooooooooodddddooooooolllccccccccccclllloooooddddddddddddddddddddddooooooooollllllcccccc::::;;,,'',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"llllllllllllloooooooooooooooooollc:loddxdddooc:;;;,'...''',,,,,;;;;;;;::::ccllllllllooooodddddddddddddddddddddddxxxxxxxxxxxxxxxxxkkkkkkkkkxxxxxddollllllloooooooooooooooooooooodoooooollcccccccc:cclllloooooddddddddddddddddddddddddoooooooollllllcccccc::::;;,,,',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"ollooooollloolooooooooooooolooollc:clodddoolc:::;,,'...''',,,,,,,;;;;:::::ccllllllloooooddddddddddddddddddxxxxxxxxxxxxxxxxxxkkkkkkkkkkkkkkkkxxddolcccccllllllllloooooooddodddddddooooollccccccc:::clloooooddddddddddddddddddddddddddddoooooolllllllccccc::::;;,,,',,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"oooooooollooooollloooooooolloooollc:coodolcc::::;,''...'',,,,,,,,;;;;::::cccllllloooooodddddddddddddddddddxxxxxxxxxxxxxxkkkkkkkkOkkkOOkkkkkxxddlcc:::ccccclllcllllooooodddddddddddddoollccccccc::::clodddddddxxxxxxxxxxxdddddddxddddddooooooollllllcccccc:::;;,,'',,,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"oooooooooooollooooloooooooolooooolc:cloooc::::;::;'''''''',,,,,;;;;;;::::ccclllllloooooodddddddddddddddxxxxxxxxxxxxxkkkkOOOOOOOOOOkkkkkkkxxxddlc:::cccccccllllllllooodddxxxxxxxdddddooollccccccc::::clodddxxxxxxxxxxxxxxxxxddddxddddddoooooooollllllccccc:::;;,'',,,,,,;;;;;;;;;;;;;;;;;,;;;;;;;;;;;;;;;;;;;\r\n" + //
										"ooooooooooooollooooooooooooooollllc::clolccccc:::;''''''',,,,,,;;,;;;;:::ccclllllloooooodddddddddddxdddxxxxxxkkkkkkkkOOOOOOOOOOOOOkkxxxxxdddolcccccllllllllllcclloodddxxxxxkxxxxxdddooolllcccllllcc::cldxxxxxkkkxkkkxxxxxxxxddxxddddddooodooooollllllcccc:::;;,,,,,,;;;;;;,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"ooooooooollllooooooooooooolllllllllc::ccccclollc:;,''''',,,,,,,;;;;;;:::ccccllllloooooooddddddddddddxxxxxxxkkkkkOOOOOOOOOOOOkkOkkkkxxxxxdddolccllloooooooooolllloodddxxxkkOkkkkxxxddddoollllllooolllcccodxxkkkkkkkkkkkxxxxxxxxxxxxxdddddddooooolllllcccc::::;;,,,,,,;;;;;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"oooooooollllllloooooooooooooooloollcccccccclddolc;,'''''',,,,,,;;;;;;:::cccclllllooooooodddoddddddxxxxxxxxkOkkOOOOO000O00OOkkkkkxxxxddddddolclloooddddddddddoooodddxxxkO0KK00Okkkxxddddooolllooooooolcccodxxkkkkkkkkkkkkkkkxxxxxxxxdddddddoooooollllcccc:::;;,,,,,,,;;;,;;;;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"oooooollloooooollooooooooooooolloolccllc::clooolc;,'''''',,,,,,;;;;;;::ccccclllloooooooooodddddddxxxxxxxkkkOOOOOOO00K00O0OOkkkxxxxddddxxxdlccllodddxxxxxxxxxxxddddxxxkkO0XXNX0Okkxxxxdddoooooddddddoollccodxxkkkkkkkkkkkkkkxxxxxxxxdddddddooooolllllcccc:::;;,''',,,,;;;,,;;;;;;;;,,;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"oooooollooooooooooooooooooooooolllllcllc::cloolc:;,'''''',,,,,,;;;;;;:::cccccllllooooooooodddddddddxxxxkkkkOOOOOOO0000OOOOkkkxxxdddddxxxdolcllodddxxxxxkkkkkkkxddddxxxxkkO000Okxxxxdddooooodddxxxdddoollccodxkkkkkkkkkkkkkkkkxxxxxxdddddddoooooollllccc::::;;,''',,,,;;;;;;;;;;,,,,,;;;;;;;;;;;;;;;,,,;;;;;;\r\n" + //
										"ooooooolllooooooooooooooooooooooolllccc:::looolc:;,,'''''',,,,,;;;;;::::cccclllllloooooooodddddddddxxxkkkkkOOOO0000000OOOkkxxdddddddxxxddocclooddxxxxxxxxxxxxxxdoodddddxxxxxxxxxdddoooooooddddxxxddddoolccldxxxkkkOOOOkkkkkkkkkxxxxdddddddodddooollllcc::::;;,'',,,;;;;;;;;;;;;,,,;,,;;;,;;;;,;;;;,,;;;;;;;;\r\n" + //
										"ooooooollooooooooooooooolooolllooollc:::cclooolc:;;,'''''',,,,;;;;;;:::ccccclllllloooooooddddddddddxxxkkkkkOOOOO000OOOOkkxxddddddddxxxxddocclooddddddoooooooooooooooddddddxxddddddooooollloooodddddddoolc:lddxxkkkkOkkkkkkkkkkxxxxxxdddoodddddooolllccc:::;;;,''',;;;;;;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n" + //
										"ooooooooooooooooooooooooooooollllooll:::cloooolc::;,'''''',,,,;;;;;;:::ccccccclllloooooooodoooodddxxxxkkkkOOOOOOOOOOkkkxxxxddddddxxxxxxddolcllooooolcccccllllllllllloooooodddooooolllcccccclllllooodoolc::lodddxxkkkkkkkkkkkkkxxxxxxddddddddooooolllcc::::;;,,''',;::;;;;;;;,,;;;;;;;;;;;;;;;;;;,;;;;;,,,,;;\r\n" + //
										"oolllloooooooooooooooooolooolllllllllcclloooollcllc;''''''',,,,;;;;;:::ccccccllllllllooooooooooddxxxxkkkkkkOOOOOOOOkkxxxxddddddxxxxxxxddoolccllllllccccllodxxddoolcllllllooolllllccc:cccclooolllcllollc::cllooddxxxxxkkkkkkkkkxxxxxdddddddddoooolllcc::::;;;,,'',;:cc:;;;;;;,,,;;;;,,,;;;;;;;;;;;;;;;;,,;;;;\r\n" + //
										"ooooooooooooooooooooooollllolllloolllcclooooooloool:,'''''',,,,,;;;;:::cccccclllllllllooooooooddddxxxxxkxkkkkkkkkkkxxxxddddddddxxxxxxdddooollccccccccccccloodxxxxddddolccccccccclllcclllllllllllllllcc:cclloooodddddxxxkkkkkkxxxxxdddddddddooooollccc:::;;;,,,'',;:cc:;;;;;;,,,;;;;,,,;;;,,,;;;;;;;,,;;;;;;;\r\n" + //
										"ooooooooooooooooooooooooooooooolollllcclooooddddddoc,''''',,,,,;;;;;:::::ccclllllllllloooooooddddddddxxxxkkkkkkkkkxxxxdddooodxxxxxxxxdddddooollcccccllllllooddddddddddooollllllooooooolcccccccccccccccclloooooooooddddxxkxxxxxxxdxddddddddoooolllcccc::;;;;,,,''';:cc;;,;;;,,,;;;;,,;;,;;,,,;;;,,;;,,;;;;;;;\r\n" + //
										"oolooooooooooolooooooolooollooooloolllllllodddxxddoc,''''',,,,,;;;;;:::::cccccllllllllooooooodddddddddxxxxxxxkkxxxxxdddoooddxxkxxxxxxddddddoooolllloloooooooooodddddddddddddddddooooollcccccccclllllllloooooooooooooodddxxxxxxdddddddddddoooollllcccc::;;;,,,,'',;::;;,;;;,,,;;,,;,;;,,,,,,,;;;;,;;;,;;;;;;;\r\n" + //
										"ooloooooooooooooooollllolllloolllollllllllloodddoolc,'''',,,,,,;;;;;::::ccccccllllllllooooooooodddddddxxxxxxxxxxxxxddoooodxxxkkxxxxxxddddddooooooooooooooooooodddddddddddddddddooooolllcllllllllllllloooooooolllloooooooodddddddddddddoooooolllllcc::::;;;,,,,',,,;;;;;;;;;;;;;;;;;;;,,,;;;;;;;;;;;;,,;;;;;;\r\n" + //
										"loooooooooollooolollllloolloollllllloollollllllllcc:,''''',,,,;;;;;;;::::cccccllllllllloooooooodddddddddxxxxxxxxxddddoodddxxxxxxxxxxxddddddooooooooooooodddddddddddddoodddddddddooooolllllllllllllllolooooooolcclloolllllooodddddddddooooooolllccc:::::;;,,,,,,,,,,,;;;;;;;;,;;;;;;;,;;;,;;;;;;;;;;;,;;;;;;;\r\n" + //
										"oooooolloolloooolooooolooollllllllloolllllllllllllcc;'''''',,,;;;;;;;;:::cccccllllllllooooooooooooodddddddddxxddddddoooddddxxxxxxxxxdddooodooooooooooddddddddddddddddddddddddxxdddooolllllllllolllllllloooooollllllllllllllloooooooooooooollllccc::::;;;;,,,,',,,,;;;;;;,,,,,;;;;;;;,,,,,;;;,,;;;;;;;;;;;;,;\r\n" + //
										"ooooooloooollollooooooooooolllllllloolllllooooloollc:,''''',,;;;;;;;;;:::ccccccllllllooooooooooooooooddddddddddddddooooddddddxxxdddddddooooooooooooooddddddddddddddddoddddddddxxxddoooollllllllllllllllllllllllllllllllllcllllooooooooooolllllcc:::::;;;;,,,,,,,,,;;,,,,;;,;;;,,,,,,;,,,;,,;;,,,;;,,;;;;;,,;\r\n" + //
										"oooooooooooooollooooloooooooollllllllloollloollloollc;,'''',,;;;,,;;;;;::::cccclllllooooooooooooooooddddoddddddddddoooooodddddddddooooooloooooooooddoddddddddddddddddoooooooddddddooooolllllllllcccllllllllcccccclcccllllcccllloooooooooollllccc:::::;;;;,,,,,,,,,,,,,,;;,,;;;,,,;,,,,,;,,,;;;;,;;;;;;;;;;;;\r\n" + //
										"ooooloooooooooooooooooooooooollloooollllllloollllllll:,'''',,,,,,,,;;;;:::::ccclllllllloooooooooooooddddddddddddddoolloooooodoooollllllllllloooooooooodddddddddddddddooooooooooddoooooolloooolllccccc:ccllcc::cccccc:ccccccccllooooooooolllcccc::::::;;;,,,,,,,,,,,,,,,,,,,,,,,;,;,,,,,,,,;;;,,,;;;,,;;;;;;;\r\n" + //
										"ooolloooooooooooloooooooolloollllllooolllloooolllllllc;,''',,,,,,,,,;;;;:::::ccclllllllloooooooooooooooddddddddddooollooollloollllllcllllllloooooooooddoododdoddddxddddddddoooodddooooooloooolllllcccccclcc::;::::::::::cccccloooooooolllllcccc:::::;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,,;;,,,;;;,,,,,;,,,,\r\n" + //
										"oooollloooooooooolooooooooooooollllllllllllloollllooll:;,'',,,,,,,,,,;;;::c::ccclllllllllooooooooddddooddddddddooooooollllcclccccllccccllclloooooooooooooollllcllllolloodollllllllllllllllllllllllllllccccc:::;;;;;;:::::ccccloooooooollllcccc::::::;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,,,,,,,,,,,\r\n" + //
										"ooooollooooooooooooooooooooooooolooooloolllloollllllllc:,'',,,,,,,,,,,;;:::ccccccllllolllllollllooooooodddddddddooooolllll::c::cccccclllllllllllllccccccc::::::::ccccccclcccccccccccccccccccccccccccclccccccc:;;;;;;;;;:::ccllodoooollllllcccc::::::;;;,,,,,,,,,,;,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,,;,,,,,,,,,,\r\n" + //
										"oooooooooloooooooooooooooooollllloooooooolllooolloollllc;,,,,,,,,,,,,,,;;:::cccccclllllllllollllooooooooddddddddddooollllc:cc::cccccccllcccccc::::;;;::::::::::::cccccccc::::ccccccccc::::::::;;;;:::::::cc::::;;,,,;;::cccclooddoooollllccccc::::::;;,,,',,,,,,,,,,,,,,,,,;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,,\r\n" + //
										"loooooooollloooooooolooolloooollllloooooooooooooooolollc:;,',,,;;;;,,,,,;;::cccccclllllllllllloooooooooooooddddddddoollccccc:;;;::::::::;;;;;;;;;;;;;;;;;;;::::;;:::::::::::::::::::::;;;;;;:;;;;;;;,,,,,,,;,;;;;;;:::cloolllooddoollllllccccc:::::;;;,,,,,,,,,,,,,;,,,,,,;;,,,,,,,,,,,,,,,,,,,,,,,;;;,,,,,,\r\n" + //
										"ollooolooolllllllooooooollllooooollooooolllloooooollllllc:,',,,,;;;;,,,,;;:::cccccllllllllllllllooooooooodddddddddddolcccccc::::;;;,,'',,'',,,,,,;;;;;;;;;::;;;;;;;;;;::::;;;::;;;;;;;;;;;;;;;;;;;,,,,'''',,;;:ccccclclloooooodddooollllcccc::::::;;;,,,,,,,,,,,,,,,,,,,,;;;,,,,,,,,,,,,,,,,,,,,,,,,;,,,,,,,\r\n" + //
										"oolloooooooooooloooooooooollllooooooooollollollllllllllllc;,,,,,;;;;;,,,,;;:::cccclllllllllllllloooooooooooodddddxddoolcccccllcccc::;,,,,,,;;,,,,;;;;;;;:::::::::;;::::::::::llc::::;;;;;;;;;;;;;;;;;;,,,,,;::cclllloooooooodddddoolllllcccc:::::;;;,,,',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;;,,,\r\n" + //
										"ollllooooooollloooolooooollllllooollloooolllollllllllollllc;,,,,;;;;;;,,,,;;::cccclllllllllllllllloooooooooooddddxdddolllllooolllllcc::;;;;:;;;:::::::::::::ccccllllllllcclollllllllcccccc:::::;;;;;:;;;;;;::clllloooooooodddddoooollllccc:::::::;;;,,'',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,,,,,,,,,,,,,;,,\r\n" + //
										"lllllooolllllllooooooooooolooollooolooollollllllllollolllllc;,,,;;;;;;;,,,;;;::::ccllllllllllllllloooooooooooodddxxxxdddoooooooooollllcc::::::::::::::::::ccccccclllllllclllllllllllccccc:::::;;;;:;;;;;;:::cclllloooooddddddddoooolllcccc::::::;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,,\r\n" + //
										"ooollllolloollloollooooooooloollooooooollooooloollolloooolll:,,,,,;;;;;;,,,;;;:::cclcllllllllllllooooooooooollooddxxxxxxdddodddooooolllcccc:::::cc::::::::clollloooooooollooollooollccccccc:::;;;;::;:;;:::cllllllooooodddddddoooollccccc::::::;;;,,'',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;\r\n" + //
										"lolllllllllllloooooolloooooloooloooooooooooooooollooooollollc:,,,,;,;;;;;,,,;;:::ccccllllllllllllllooooooooollloodxxxxxxxxdddddddooooollcccccc:::::::::::::llooodddddoooooooooddddoolccccc:::;;;;;;::::::ccclllllloodddddddddoooolllcccc:::::::;;,,,',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"lllloollooolllooooooooooooooooooooooooooooooooooooooooooollllc:,,,,,,;;;;,,;;;;;::ccccllllllllllllloooooddoolllloodxxxxxxxdddddddddooooollcccccccc::::::::::cclooooooooodddoooddoollccccc::;;;;;;;;::::cccccllllloooddodddddoooolllcccc:::::::;;,,'',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;\r\n" + //
										"llooooooooooooooolooooloooooooooooooooolllllllllloolllooooolllc:,,,,,,;;;;,,,;;;;::ccccclllllloooooooooodddollllooddxxxxxxxxdddddddddooooollllcclcccccccccc::cccllllloooooooollllcc:::::::;;;;::::::ccccllllllooooooooooddooooolllcccc::::::;;;,''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;;\r\n" + //
										"loooooooollooooooloooooooooooooooooooooolllllllooooooolllooolllc;,,,,,,;;;,,,;;;;;::ccccclllllooooooooooodddooooooodddddddxxxdddddddddddddooollllllclllllccccccccllllloolllllccccc:::::::::::ccccccccllllllllloooooooooooooooolllcccc::::::;;;,,'',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,,,,,,,;;\r\n" + //
										"llllooolllloooooooooooooooooooooooooooooooolooooollooolllllllll:;'',,,;;;;,,,,;;;;;:::ccclllllloolloooooodddddddoooodddddddxdddddddddddddddooooollllllcclclllccclllllloooooollcccccccccccccccccllcccllllllllllooooooooooooooolllccc:::::::;;;,,',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;\r\n" + //
										"llllooollloollooooooooooooooooooooooooooooooooooooooolooollllc;'...',,,;,,,,,,,;;;;;::::cccllllllooooooooodddddddooodddddddddddddddddddddddooooooooollcccllccccc:cccccccccccccccccccccccccccccllllllllllllllllooooooooollollllllccc::::::;;,,,',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;;,,\r\n" + //
										"olllooooooooloooooooooooooooooooooooooooooooooooolooolooollc:,'....''',,,,,,,,,;;;;;;;:::cccllllllooooooooooddddddodddddddddddddddddddddddoodoooooodoooooolllllcccccc::::::;:::cccccclllllllllllllllllllllllllllolllllllllllllcccc::::::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,,\r\n" + //
										"ollloooooollooooooooooooooooooooooooooooooooooooooooooolll:,'......''',,,;,,,,,,,;;;;;;:::cccllllllloooooooooddddddddddddddddddddddddooddooooododdddddddddoodoolooollcccccc:::clllllllllooolllooooolloolllllllllllllllllllllcccccc:::::;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,,\r\n" + //
										"oooooooooollloooooooooooooooooooooooooooooooooooooooooll:;''......'''',,,;;;,,,,,;;,;;;;:::cccclllllllooooooooooooddddddddddddddddooooooooooooddddddddddddddddooooooooooooolcllooooooooooooooooooooollllllllllllllllllllllccccc:::::::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooooooooolloooooooooooooooooooooooooooooooooooooooolc;'..'......''''',,,,,,,,,,,,;,,;;;::::ccclllllllllooooooooooodddoddddodddddoddooooodddddddddddddddddddddddddddddddddoooododdddddddoooooooooooollllllllllllllllllllccccc::::::;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;;\r\n" + //
										"ollooooooooooooooooooooooooooooooooooooooooooooooooll:,'..........''''',,,,,,,,,,,,,,,;;;;;:::cccccllllllllllllolloooooooodddddddoooooooooddddddddddddddddddddddddddddddddddddddddddddddddooooooollllllllllllllllllllllcccc::::::::;;;,,''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"olllooooooollllooooooooooooooooooooooooooooooooooolc;'............'',,,,,,,,,,,,,,,,,,,,;;;;::::cccclllllllllllllllloooooooodddoddoooooooooddooddoodddddddddxxddddxxxxxxxxxxxxxxddddddddddooooooolllllllllcclllccllllccccc::::::;;;;;,,'...',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oloooooooolllooooooooooooooooooooooooooooooooooollc;'''''.........',,,,,,,,,,,,;;;,,,,,,,;;;;;:::ccccclllllllllllllllloooooooddoooooooooooooooodddddddddxxdxxxxxdxxxxxxkkkxxxxxxxxdxxddddooooooooolllllllllcccccccclcccc::::::::;;;,,'.....'',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oooooooolloooooooooooooooooooooooooooooooooooooolc;'....''.......'',,,,,,,;,,;;;;;;,,,,,,,,;;;;;:::cccccccccllllllllllloooooooooooooooooooooooooddddddddxddxxxxxxxxxkkkkkkkkkxxxxxxxddddddooooollollllllllcccccccccccc::::::::;;;,,'.....'''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oooooooooooooolooooooooooooooooooooooooooooooollc,'''.''''...''..'',,,,,;;;;;;;;;;;;;;,,,,,,,,,;;::::ccccccccccclllllllloooooooooooooooooodoooooddddddddxxxxxxxxxxxkkkkkkkkkxxxxxddddddddooooooolllllllllcccccccccccc:::::;;;;;;,,'......''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooooooooooooollloooooooooooooooooooooooooooolc,'.....''...'''..'',,,;;;;;;;;;;;;;;;;;;,,,,,,,;;;;:::::cccccccccccclllllllllloooooooooooooddoodddddddddddddxxxxxxxxxxkkkkkkxxxxxxxxdddddooooooolllllllllccccccccc:::::::;;;;;,,'........''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooooooooooollllloooooooooooooollooooooooooolc;''''''''....''''''',,;;;;;;:;;;:::::;;;;;,,,,,,,,,;;;;:::::cccccccccccccclllllllooooooooooodddooddddddddddddxxxxxxxxxxxxxxkxxxxxxxxddddddoooooollllllllllccccccc:::::;;;;;;;,,''...........'''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooooolllllllllllllllloollooolllllooooooolll:,'....''''....'''''',,,;;;;;;::::::::::::;;;;;,,,,,,,,;;;;;:::::ccccccccccccccccllllllooooooooooooooodddddddddddddxxxxxxxxxxxxxxxxxxdddddooooolllllllllccccccccc::::;;;;;,,;,,''.............''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"llloooolllllllllllllllllllllllllllllllllolll:,''.'''''''....',''.',,;;;;;;;::::::::::::::;;;;;,,,,,,,,,;;;;;::::cc::::cccccccccccllllloollooooooooooddddoooddddddddddxxxxxxxdddddddooooooollllllllllcccccccc:::;;;;;;;;,,,''...'...........''''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"lllllllllllllllllllllllllllllllllllllllllll:,''....''''''....''..',,;;;;;::::::::::::::::::;;;;;;,,,,,,,,,,;;;;:::::::::::::::::::cclllllllllooooooooooooolooooddddddddddddddddddoooollllllllllllccccccccc:::;;;;;;,,,,,,'''''''..''......''''''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"loolllllllllllllllllllllllllllllllllllllllc;''....''..'''....'..'',,;;;;;:::::::::::::::::::::;;;;;,,,,,,,,,,,;;;;;;:::::::::;::::::ccccccccclllllllooooolllllloooooooolooooooooooooolllllllcccccccccc::::;;;;,,,,,,,,'''''''''........''....''''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"llllllllllllllllllllllllllllllllllllllllllc,''''.''''''''.. ....'',,;;;;:::::::ccccccccccc:::::::;;;;;,,,,,,,,,;;;;;;;;;;;;;;;;;;;;;:::::::ccccccllllllllllllllllllllllloollllllllllllllccccc::::::::::;;;,;,,,,,,''''''',,,,,'.............'..''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oooollolllllllllllllllllllllllllllollllllc;'''..''''''''''.. ...'',,;;;:::::::ccccccccccccccc:::::;;;;;;;;,,,,,,,,,;;;;;;;;;;;;;;;;,,;;;::::::::ccccccccllllcclllcllllllllllllccccccccc::::::;:::::;;;,,,,,,,,'''''''',,,,,,,,'.........'.....''''''''',,',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooololllloooooooooolllllllllolloooooool:,'''''''''''''''.. ...',,,;;;:::::cccccccccccccccccccc:::::::;;;;;;;,,,,,,,;,,,,,,;;;;;;;,,,,,;,,;;;;::::::::cccc:::ccccccccccccccccc:::::::::;,;;;;;;;;;,,,'',,'''''''',,,,;,;,,,,''....''........'''''',,,,,''',,'',;;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oooooooooloooooooooooolllooooooooooooool:,'''''...'''''''''.....',,;;;:::::cccccccccccccccccccccccccc::::::;;;;;;;,,,,,,,,,,,,,,;;;,,,,',''',,;;;,,;;:::::;;;;;;::::::::::::::::::;;::;;,,,,,;,,,''''''''''''''',,;;;;;;;;,,,'.....''..........''''',,,,',,,,''';:::::;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oooooooooooooooooooooooooooooooooooooll:,'''''.'''''''''''''...'',,,;;::::cccccccccccccclllccccllcccccccc::::;:;;;;;;;,,,,,,,,,,;;;;,,,',,'',,,,,,',,;,;,,,,,,,,;;;;;;;;;;;,,,;;;;,,;;;;;,,'',''''''''''...'',,;;;;;;;;;;;,,,'....'''''.......''',,'',,,,,,,,''',;::::::::;;;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"oooloooooooooooooooooooooooooooooooool:,''''''''''''''',,'''....',,;;;::::cccccccccccccllllllllllllccccccccc::::::;;:;;;;;;,,,',,,,,,,,,,,,,,;,,,,'',,,,,,,,,'',;,,,,,;;;,,,,,,,,,,,,,,,,,,''''''''..'''',,,;;;:::;:::;;;;,,''...''''........''''''',,,,,,,'''''',;:::::::::::::::;;;,,,,,,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooooolooooooooooooooooooooooooooool:,'''''..'..'''''''''''''...,;;;;::::ccccccccccclcllllllllllllllllccllccccccc:::::::;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,,,,;;;;,,,,,,,','',,,,','''..'''''',,;;;;::::::::::;;;;;,,'....'''''....'..'''',,,,,,'',,,,,,''',;::::::::::::::::::;;;;,,,,,,,,,,,,,,,,,,\r\n" + //
										"ooooooooooolooooolooooooooooooooooolc;,'''''..'''''',,''',,''''...,;;:::::ccccccccccllllllllllllllllllllllllllcccccccccc::::::::;;;;;,,,,,,,,,,,,,,,,,,,,',,,,,,;,,;;;;;,,,,,,,,''',,,'''''.'''',,,;;;:::::::::c:::::;;;;;,,'...''''''....'''''',,,,,,,,,,,,,,,,'''';:::::::::::c:::::::::;;;;;;,,,,,,,,,,,,\r\n" + //
										"oooooooooooooooolooooooooooooooooolc;,'''''''..'''''''''''''',''...,;;::::ccccccclllllllllllllooooolllllllllllllllllllccccccccc::::::;;;;;;;;,,,,,,,,,,,,,,,',,,,,,;;,,,,,,,,,,''',,,,,,''',,,;;;;::::::ccccccccc::::::;;;;,'....''''.....'''',,,,,,,,,,,,,,,,,,,''.';:::::::::::::::::::::::::::;;,,,,,,,,,\r\n" + //
										"ooooooooooooooooooooooooooooooooll:;,'''''.....''''''',,'''''''''...,;:::::ccccccclllllllllllooolooooolllloollllllllllllllllcccccccc::::::::::;;;;;;;;;;,,;,,,,,,,,;;,,,,,,,,,,,,,,;;;;;;;;;;;::::ccccccccccccccc::::::;;;,,...'''''''....''',,,,,,,,,,,;,,,,,,,,,''.';::::::::::::::::::c::::::::::;;;;,,,,\r\n" + //
										"oooooooooooooooooooooooooooooollc:,,''''''..''''''''',,,,,,,'''''''..';:::cccccllclllllllllloooloooooooooooooolllllolllllllllllcccccccccccc:c:::::::::::::::;:;;;;;;;;;;;;;;;;;;::;::::::::::::ccccccccccccccccccc::::::;;,'...',''''....''''.....,;;,,''',,,;;,,,,''.';::::::cc::::::::ccc:::c::::c:::::;;;\r\n" + //
										"oooooooooooooollllooooooollllccc:;,,''''''''''..'''''''',,,,'',,,,''..';:cccccclllllllllllloooooooooooooooooooooooooolooollllllllllccccccccccccccccccc:::::c:::::::::::::::::::::::::::::::::cccccccllllccllccccccc:::::;;,'...''''''...''''.. .,,,::;,'....'',,;;,,''.';:::::::c:::::::::cccccc::c:::::::::\r\n" + //
										"ooooooooooooooooooooollllccccccc;,,,'''''''''.''''',,,,,,,,',,,,,'''''.',:cccccclllllllolllooooooooooooooooooooooooooooooollllllllllllllllllcllcccccccccccccccccccccccccccccc::::::ccc:::ccccccccclllllllllllcccccc::::;;;,'..',''''..''','....,:;,::;;'''''''',,,,,,,'.';:::::::c::::::::cccccc::::::::::::\r\n" + //
										"oooooooooooooloooolllcc::cc::cc:,,',''''''''...''''',,,,,,,,,,,,,,,''''..';:cclllllllloooloooooooooooooooooooooooooooooooollolllllllllllllllllllllllllllcccccllllccccccccccccccccccccccccccccllllllllllllllllcccccc::::;;,'...''''''..''',....;::;,::;;,,'''..'',,,,,;,'.';:::::::::::c:::::c:::ccc:::::::::\r\n" + //
										"ooooooooooooolllllccc::::::::cc:,'','''''''''..'''''',,,,,,,,,,',,,,''''''',:cllllllllooooooooooooooooooooooddooddddooooooooooooollllllllllllllllllllllllllllllllccllccccccccccccccccccccclllllllllllolllllllllccccc:::;;,'..''''''.''',,'...;;';:;;:;;;,,''''''',,,',;,'.';:c:::::::c:cc:::ccc:::ccc::c::cc\r\n" + //
										"oooooooooollllcc::cc::::::::ccc;,'''''''''''''''''',,,,,,,,,,,,,,,,,'',,''''';:cllllllloooooooooooodooooodddddooddooooooooooooooooooollllllllllllllllllllllllllllllccccccccccccccccccccllllllllloooooooolllllllcccccc::;;,'.'','''''',,,.. .,c;.;:;;::;,,;,'''''',,,''',,,'';c::::ccccccc:::ccccc::c:cccc:::\r\n" + //
										"oooooollllcc:cc:::c::::::::::::;,'',,''''''''''.'''',,,',,,,,,,,,,,,,,''''''''';cllllloooooooooooooddddddddddddddooddddddddooooooooooooolllllloooooolllllllllllllllllllllcccccccclllllllllllooooooooooooollollcccccc:::;,'..''''''',,,,..''.','.;:;;::;;;;;,'''''',,'''',,'.,:::::ccc::::cccccccc::ccc::cc::\r\n" + //
										"oooollccc:::::::::::::::::::::::,''''''''''..''''''',,,,,,,,,,,,,,,,,,,''''''''',:cllooooooooooddddddddddddddddddddddddddddddddooooolloooooooooooooooooolllllllllllllllllllllllllllllllloooooooooooooooooooollllcccc:::;,'.'''''',,,,...;loc;'..;c;;::;;;;;;,''''',,,''',,,'';::ccccc::cccccccccccc:::ccccc:\r\n" + //
										"olllcc:::::::c::::::::::::::::::,'''''''''''''''''',,,,,,,,,,,,,,,,,,,,',,,''',,',;cloolooooooodddddddddddddddddddddddddddddddddddooooooooooooooooooooooollllllllllllllllllllllllllllllloooooooooooooooooooollllcccc::;;,''''''',,,,....':ldol;';c:::;;;;;;;;,''''',,,'',,,,',:cc:::ccc:::ccccccccc::::c::cc");
				}
				ComputerHealth = ComputerHealth-100;
				System.out.println();
				System.out.println("POGI SI SIR! AUTOWIN! -100hp to the Computer!");
				System.out.println();
				System.out.println("User health: [ " + UserHealth + "% ]" );
				System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				
			}
		
			//checking if tie

			if(userMove.equals(computerMove)) {
				System.out.println("Its a tie!");
				System.out.println();
				System.out.println("User health: [ " + UserHealth + "% ]" );
				System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
			}
		
			//checking for all other moves possible
		
			else if(userMove.equals("Rock")) {
			
				if(computerMove.equals("Paper")) {
					System.out.println();
					System.out.println("Oh no...");
					System.out.println("You lost 25hp");
					//MODIFIED: Lessen User Health
					UserHealth = UserHealth-25;
					System.out.println();
					System.out.println("User health: [ " + UserHealth + "% ]" );
					System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
					System.out.println();
				System.out.println("---------------------------------------------------------------------");
				} 
				else if(computerMove.equals("Scissors")) {
					System.out.println("ROCK BEATS SCISSORS BABY!!!");
					System.out.println("Take that computer! (-25hp for computer)");
					//MODIFIED: Lessen Computer Health
					ComputerHealth = ComputerHealth-25;
					System.out.println();
					System.out.println("User health: [ " + UserHealth + "% ]" );
					System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
					System.out.println();
				System.out.println("---------------------------------------------------------------------");
				}
			}
		
			else if(userMove.equals("Paper")) {
			
				if(computerMove.equals("Rock")) {
					System.out.println("SUGOIIII!");
					System.out.println("You damaged the computer for 25hp!");
					//MODIFIED: Lessen Computer Health
					ComputerHealth = ComputerHealth-25;
					System.out.println();
					System.out.println("User health: [ " + UserHealth + "% ]" );
					System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
				} 
				else if(computerMove.equals("Scissors")) {
					System.out.println("Wompwomp");
					System.out.println("OUCH! You lost 25hp!");
					//MODIFIED: Lessen User Health
					UserHealth = UserHealth-25;
					System.out.println();
					System.out.println("User health: [ " + UserHealth + "% ]" );
					System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
				}
			}
		
			else if(userMove.equals("Scissors")) {
			
				if(computerMove.equals("Paper")) {
					System.out.println("YOU DID IT!");
					System.out.println("-25hp for the computer!");
					//MODIFIED: Lessen Computer Health
					ComputerHealth = ComputerHealth-25;
					System.out.println();
					System.out.println("User health: [ " + UserHealth + "% ]" );
					System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
				} 
				else if(computerMove.equals("Rock")) {
					System.out.println("welp...");
					System.out.println("You have taken 25hp of damage!");
					//MODIFIED: Lessen User Health
					UserHealth = UserHealth-25;
					System.out.println();
					System.out.println("User health: [ " + UserHealth + "% ]" );
					System.out.println("Computer health: [ " + ComputerHealth + "% ]" );
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
				}
			}
			//MODIFIED: EXIT IF HEALTH IS 0
			if(UserHealth <= 0){
				System.out.println();
				System.out.println("_____.___.________   ____ ___  ________________  .___.____     ___________________ ._.\r\n" + //
										"\\__  |   |\\_____  \\ |    |   \\ \\_   _____/  _  \\ |   |    |    \\_   _____/\\______ \\| |\r\n" + //
										" /   |   | /   |   \\|    |   /  |    __)/  /_\\  \\|   |    |     |    __)_  |    |  \\ |\r\n" + //
										" \\____   |/    |    \\    |  /   |     \\/    |    \\   |    |___  |        \\ |    `   \\|\r\n" + //
										" / ______|\\_______  /______/    \\___  /\\____|__  /___|_______ \\/_______  //_______  /_\r\n" + //
										" \\/               \\/                \\/         \\/            \\/        \\/         \\/\\/");
				System.out.println();
				System.exit(0);
				}
			
			if(ComputerHealth <= 0){
				System.out.println();
				System.out.println(" /$$     /$$ /$$$$$$  /$$   /$$       /$$      /$$ /$$$$$$ /$$   /$$ /$$\r\n" + //
										"|  $$   /$$//$$__  $$| $$  | $$      | $$  /$ | $$|_  $$_/| $$$ | $$| $$\r\n" + //
										" \\  $$ /$$/| $$  \\ $$| $$  | $$      | $$ /$$$| $$  | $$  | $$$$| $$| $$\r\n" + //
										"  \\  $$$$/ | $$  | $$| $$  | $$      | $$/$$ $$ $$  | $$  | $$ $$ $$| $$\r\n" + //
										"   \\  $$/  | $$  | $$| $$  | $$      | $$$$_  $$$$  | $$  | $$  $$$$|__/\r\n" + //
										"    | $$   | $$  | $$| $$  | $$      | $$$/ \\  $$$  | $$  | $$\\  $$$    \r\n" + //
										"    | $$   |  $$$$$$/|  $$$$$$/      | $$/   \\  $$ /$$$$$$| $$ \\  $$ /$$\r\n" + //
										"    |__/    \\______/  \\______/       |__/     \\__/|______/|__/  \\__/|__/\r\n" + //
										"                                                                        \r\n" + //
										"                                                                        \r\n" + //
										"                                                                        ");
				System.out.println();
				System.exit(0);
				}
		}
		
		}
			
	}

	}


	


