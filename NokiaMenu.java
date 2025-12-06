import java.util.Scanner;

public class NokiaMenu {
    
    public static void main(String[] args) {
        
        Scanner inputCollector = new Scanner(System.in);
        
        String menu = """
        WELCOME TO NOKIA 
        
        Press 1 - Phonebook
        Press 2 - Messages
        Press 3 - Call Register
        Press 4 - Tones
        Press 5 - Settings
        Press 6 - Games
        Press 7 - Calculator
        Press 8 - Clock
        
        """;
        
        System.out.println(menu);
        
        int mainMenuChoice = inputCollector.nextInt();
        
        switch(mainMenuChoice) {
            
            case 1 -> {
                System.out.println("Phonebook");
                
                String phonebookMenu = """
                
                Press 1 - Search
                Press 2 - Service Nos
                Press 3 - Add Name
                Press 4 - Erase
                Press 5 - Edit
                Press 6 - Assign Tone
                Press 7 - Send b'card
                Press 8 - Options
                Press 9 - Speed Dials
                Press 10 - Voice Tags
                
                """;
                
                System.out.println(phonebookMenu);
                int phonebookChoice = inputCollector.nextInt();
                
                switch(phonebookChoice) {
                    
                    case 1 -> System.out.println("Search contact...");
                    
                    case 2 -> System.out.println("Service Numbers");
                    
                    case 3 -> System.out.println("Add new name");
                    
                    case 4 -> System.out.println("Erase contact");
                    
                    case 5 -> System.out.println("Edit contact");
                    
                    case 6 -> System.out.println("Assign tone to contact");
                    
                    case 7 -> System.out.println("Send business card");
                    
                    case 8 -> {
                        System.out.println("Phonebook Options");
                        
                        String optionsMenu = """
                        
                        Press 1 - Type of view
                        Press 2 - Memory status
                        
                        """;
                        
                        System.out.println(optionsMenu);
                        int optionsChoice = inputCollector.nextInt();
                        
                        switch(optionsChoice) {
                            
                            case 1 -> System.out.println("Type of view selected");
                            case 2 -> System.out.println("Memory status: 50/250 contacts used");
                            
                        }
                    }
                    
                    case 9 -> System.out.println("Speed dials");
                    
                    case 10 -> System.out.println("Voice tags");
                    
                }
            }
            
            case 2 -> {
                System.out.println("Messages");
                
                String messagesMenu = """
                
                Press 1 - Write messages
                Press 2 - Inbox
                Press 3 - Outbox
                Press 4 - Picture messages
                Press 5 - Templates
                Press 6 - Smileys
                Press 7 - Message settings
                Press 8 - Info service
                Press 9 - Voice mailbox number
                Press 10 - Service command editor
                
                """;
                
                System.out.println(messagesMenu);
                int messagesChoice = inputCollector.nextInt();
                
                switch(messagesChoice) {
                    
                    case 1 -> System.out.println("Write new message...");
                    
                    case 2 -> System.out.println("Inbox: You have 3 new messages");
                    
                    case 3 -> System.out.println("Outbox: 5 sent messages");
                    
                    case 4 -> System.out.println("Picture messages");
                    
                    case 5 -> System.out.println("Message templates");
                    
                    case 6 -> System.out.println("Smileys :-) ;-) :-( :-D");
                    
                    case 7 -> {
                        System.out.println("Message Settings");
                        
                        String messageSettingsMenu = """
                        
                        Press 1 - Set 1
                        Press 2 - Common
                        
                        """;
                        
                        System.out.println(messageSettingsMenu);
                        int settingsChoice = inputCollector.nextInt();
                        
                        switch(settingsChoice) {
                            
                            case 1 -> {
                                System.out.println("Set 1");
                                
                                String set1Menu = """
                                
                                Press 1 - Message centre number
                                Press 2 - Messages sent as
                                Press 3 - Message validity
                                
                                """;
                                
                                System.out.println(set1Menu);
                                int set1Choice = inputCollector.nextInt();
                                
                                switch(set1Choice) {
                                    
                                    case 1 -> System.out.println("Message centre number: +2348012345678");
                                    case 2 -> System.out.println("Messages sent as: Text");
                                    case 3 -> System.out.println("Message validity: Maximum");
                                    
                                }
                            }
                            
                            case 2 -> {
                                System.out.println("Common Settings");
                                
                                String commonMenu = """
                                
                                Press 1 - Delivery reports
                                Press 2 - Reply via same centre
                                Press 3 - Character support
                                
                                """;
                                
                                System.out.println(commonMenu);
                                int commonChoice = inputCollector.nextInt();
                                
                                switch(commonChoice) {
                                    
                                    case 1 -> System.out.println("Delivery reports: On");
                                    case 2 -> System.out.println("Reply via same centre: On");
                                    case 3 -> System.out.println("Character support: Full");
                                    
                                }
                            }
                            
                        }
                    }
                    
                    case 8 -> System.out.println("Info service");
                    
                    case 9 -> System.out.println("Voice mailbox number");
                    
                    case 10 -> System.out.println("Service command editor");
                    
                }
            }
            
            case 3 -> {
                System.out.println("Call Register");
                
                String callRegisterMenu = """
                
                Press 1 - Missed calls
                Press 2 - Received calls
                Press 3 - Dialled numbers
                Press 4 - Erase recent call lists
                Press 5 - Show call duration
                Press 6 - Show call costs
                Press 7 - Call cost settings
                Press 8 - Prepaid credit
                
                """;
                
                System.out.println(callRegisterMenu);
                int callChoice = inputCollector.nextInt();
                
                switch(callChoice) {
                    
                    case 1 -> System.out.println("Missed calls: 2 calls");
                    
                    case 2 -> System.out.println("Received calls: 5 calls");
                    
                    case 3 -> System.out.println("Dialled numbers: 7 calls");
                    
                    case 4 -> System.out.println("Recent call lists erased");
                    
                    case 5 -> {
                        System.out.println("Call Duration");
                        
                        String durationMenu = """
                        
                        Press 1 - Last call duration
                        Press 2 - All calls duration
                        Press 3 - Received calls duration
                        Press 4 - Dialled calls duration
                        Press 5 - Clear timers
                        
                        """;
                        
                        System.out.println(durationMenu);
                        int durationChoice = inputCollector.nextInt();
                        
                        switch(durationChoice) {
                            
                            case 1 -> System.out.println("Last call: 5 minutes 23 seconds");
                            case 2 -> System.out.println("All calls: 2 hours 15 minutes");
                            case 3 -> System.out.println("Received: 1 hour 10 minutes");
                            case 4 -> System.out.println("Dialled: 1 hour 5 minutes");
                            case 5 -> System.out.println("Timers cleared");
                            
                        }
                    }
                    
                    case 6 -> {
                        System.out.println("Call Costs");
                        
                        String costsMenu = """
                        
                        Press 1 - Last call cost
                        Press 2 - All calls cost
                        Press 3 - Clear counters
                        
                        """;
                        
                        System.out.println(costsMenu);
                        int costsChoice = inputCollector.nextInt();
                        
                        switch(costsChoice) {
                            
                            case 1 -> System.out.println("Last call cost: $2.50");
                            case 2 -> System.out.println("All calls cost: $45.00");
                            case 3 -> System.out.println("Cost counters cleared");
                            
                        }
                    }
                    
                    case 7 -> System.out.println("Call cost settings");
                    
                    case 8 -> System.out.println("Prepaid credit: $25.00");
                    
                }
            }
            
            case 4 -> {
                System.out.println("Tones");
                
                String tonesMenu = """
                
                Press 1 - Ringing tone
                Press 2 - Ringing volume
                Press 3 - Incoming call alert
                Press 4 - Composer
                Press 5 - Message alert tone
                Press 6 - Keypad tones
                Press 7 - Warning and game tones
                Press 8 - Vibrating alert
                Press 9 - Screen saver
                
                """;
                
                System.out.println(tonesMenu);
                int tonesChoice = inputCollector.nextInt();
                
                switch(tonesChoice) {
                    
                    case 1 -> System.out.println("Ringing tone: Nokia Tune");
                    
                    case 2 -> System.out.println("Ringing volume: Medium");
                    
                    case 3 -> System.out.println("Incoming call alert: Ringing");
                    
                    case 4 -> System.out.println("Composer - Create your own ringtone");
                    
                    case 5 -> System.out.println("Message alert tone: Standard");
                    
                    case 6 -> System.out.println("Keypad tones: On");
                    
                    case 7 -> System.out.println("Warning and game tones: On");
                    
                    case 8 -> System.out.println("Vibrating alert: Off");
                    
                    case 9 -> System.out.println("Screen saver: Clock");
                    
                }
            }
            
            case 5 -> {
                System.out.println("Settings");
                
                String settingsMenu = """
                
                Press 1 - Call settings
                Press 2 - Phone settings
                Press 3 - Security settings
                Press 4 - Restore factory settings
                
                """;
                
                System.out.println(settingsMenu);
                int settingsChoice = inputCollector.nextInt();
                
                switch(settingsChoice) {
                    
                    case 1 -> {
                        System.out.println("Call Settings");
                        
                        String callSettingsMenu = """
                        
                        Press 1 - Automatic redial
                        Press 2 - Speed dialling
                        Press 3 - Call waiting options
                        Press 4 - Own number sending
                        Press 5 - Phone line in use
                        Press 6 - Automatic answer
                        
                        """;
                        
                        System.out.println(callSettingsMenu);
                        int callSettingsChoice = inputCollector.nextInt();
                        
                        switch(callSettingsChoice) {
                            
                            case 1 -> System.out.println("Automatic redial: On");
                            case 2 -> System.out.println("Speed dialling: On");
                            case 3 -> System.out.println("Call waiting: Activated");
                            case 4 -> System.out.println("Own number sending: On");
                            case 5 -> System.out.println("Phone line: Line 1");
                            case 6 -> System.out.println("Automatic answer: Off");
                            
                        }
                    }
                    
                    case 2 -> {
                        System.out.println("Phone Settings");
                        
                        String phoneSettingsMenu = """
                        
                        Press 1 - Language
                        Press 2 - Cell info display
                        Press 3 - Welcome note
                        Press 4 - Network selection
                        Press 5 - Lights
                        Press 6 - Confirm SIM service actions
                        
                        """;
                        
                        System.out.println(phoneSettingsMenu);
                        int phoneSettingsChoice = inputCollector.nextInt();
                        
                        switch(phoneSettingsChoice) {
                            
                            case 1 -> System.out.println("Language: English");
                            case 2 -> System.out.println("Cell info display: Off");
                            case 3 -> System.out.println("Welcome note: Welcome to Nokia");
                            case 4 -> System.out.println("Network selection: Automatic");
                            case 5 -> System.out.println("Lights: On");
                            case 6 -> System.out.println("Confirm SIM actions: Yes");
                            
                        }
                    }
                    
                    case 3 -> {
                        System.out.println("Security Settings");
                        
                        String securityMenu = """
                        
                        Press 1 - PIN code request
                        Press 2 - Call barring service
                        Press 3 - Fixed dialling
                        Press 4 - Closed user group
                        Press 5 - Phone security
                        Press 6 - Change access codes
                        
                        """;
                        
                        System.out.println(securityMenu);
                        int securityChoice = inputCollector.nextInt();
                        
                        switch(securityChoice) {
                            
                            case 1 -> System.out.println("PIN code request: On");
                            case 2 -> System.out.println("Call barring: Off");
                            case 3 -> System.out.println("Fixed dialling: Off");
                            case 4 -> System.out.println("Closed user group: Off");
                            case 5 -> System.out.println("Phone security: On");
                            case 6 -> System.out.println("Change access codes");
                            
                        }
                    }
                    
                    case 4 -> System.out.println("Factory settings restored!");
                    
                }
            }
            
            case 6 -> {
                System.out.println("Games");
                
                String gamesMenu = """
                
                Press 1 - Snake II
                Press 2 - Space Impact
                Press 3 - Bantumi
                
                """;
                
                System.out.println(gamesMenu);
                int gamesChoice = inputCollector.nextInt();
                
                switch(gamesChoice) {
                    
                    case 1 -> System.out.println("Starting Snake II...");
                    case 2 -> System.out.println("Starting Space Impact...");
                    case 3 -> System.out.println("Starting Bantumi...");
                    
                }
            }
            
            case 7 -> System.out.println("Calculator ready");
            
            case 8 -> {
                System.out.println("Clock");
                
                String clockMenu = """
                
                Press 1 - Alarm clock
                Press 2 - Clock settings
                Press 3 - Date setting
                Press 4 - Stopwatch
                Press 5 - Countdown timer
                Press 6 - Auto update of date and time
                
                """;
                
                System.out.println(clockMenu);
                int clockChoice = inputCollector.nextInt();
                
                switch(clockChoice) {
                    
                    case 1 -> System.out.println("Set alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Set date");
                    case 4 -> System.out.println("Stopwatch ready");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto upate: on");

                }
             }

             default -> System.out.print("Invalid choice!");

        }

       
    }
 }
















            


