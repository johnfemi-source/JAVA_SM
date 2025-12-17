public class DaysOfChristmas {
    
   
     
    public static void main (String[] args) {
        switch (day) {
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            case 7:
                return "seventh";
            case 8:
                return "eighth";
            case 9:
                return "ninth";
            case 10:
                return "tenth";
            case 11:
                return "eleventh";
            case 12:
                return "twelfth";
            default:
                return "";
        }
    }
    
     
    
    public static String getGift(int day) {
        switch (day) {
            case 1:
                return "A partridge in a pear tree";
            case 2:
                return "Two turtle doves";
            case 3:
                return "Three French hens";
            case 4:
                return "Four calling birds";
            case 5:
                return "Five golden rings";
            case 6:
                return "Six geese a-laying";
            case 7:
                return "Seven swans a-swimming";
            case 8:
                return "Eight maids a-milking";
            case 9:
                return "Nine ladies dancing";
            case 10:
                return "Ten lords a-leaping";
            case 11:
                return "Eleven pipers piping";
            case 12:
                return "Twelve drummers drumming";
            default:
                return "";
        }
    }
    
     
    public static void printTwelveDaysOfChristmas() {
      
        for (int day = 1; day <= 12; day++) {
            
            String dayName = getDayName(day);
            System.out.println("On the " + dayName + " day of Christmas, my true love gave to me:");
            
            
            for (int giftDay = day; giftDay >= 1; giftDay--) {
                String gift = getGift(giftDay);
                
                

                if (giftDay == 1 && day > 1) {
                    System.out.println("And " + gift.toLowerCase());
                } else {
                    System.out.println(gift);
                }
            }
            
           
            System.out.println();
        }
    }
    
    
    
}
