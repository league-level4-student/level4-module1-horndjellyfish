package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
    public void Horoscope(Zodiac sign) {
        switch(sign) {
            case ARIES:
                System.out.println("You have a lot of work to do, and responsibilities might be many, but you still need to make time for rest. Don’t let circumstances drive you away from contact with your body and its needs, as results that come from such an approach might be smaller than you might anticipate.\n" +
                        "\n" +
                        "Do well with yourself. Care for your time, don’t spend it on activities and people that don’t make you happy or serve a higher cause, and share your inner world only where you feel safe.");
                break;
            case TAURUS:
                System.out.println("ily");
                break;
        }
    }
	// 3. Make a main method to test your method

}
