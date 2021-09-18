package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
    // 1. Create an enum in a separate file called Zodiac that contains a category for
    //    all 12 zodiac signs.
    public static void main(String[] args) {
        _00_Horoscope hs = new _00_Horoscope();
        Zodiac[] signs = {Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO, Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES};
        int input = JOptionPane.showOptionDialog(null, "Select your Zodiac sign.", "Zodiac sign", 0, -1, null, signs, 0);
        if (input == Zodiac.ARIES.ordinal()) {
            hs.Horoscope(Zodiac.ARIES);
        }
        else if (input == Zodiac.TAURUS.ordinal()) {
            hs.Horoscope(Zodiac.TAURUS);
        }
        else if (input == Zodiac.GEMINI.ordinal()) {
            hs.Horoscope(Zodiac.GEMINI);
        }
        else if (input == Zodiac.CANCER.ordinal()) {
            hs.Horoscope(Zodiac.CANCER);
        }
        else if (input == Zodiac.LEO.ordinal()) {
            hs.Horoscope(Zodiac.LEO);
        }
        else if (input == Zodiac.VIRGO.ordinal()) {
            hs.Horoscope(Zodiac.VIRGO);
        }
        else if (input == Zodiac.LIBRA.ordinal()) {
            hs.Horoscope(Zodiac.LIBRA);
        }
        else if (input == Zodiac.SCORPIO.ordinal()) {
            hs.Horoscope(Zodiac.SCORPIO);
        }
        else if (input == Zodiac.SAGITTARIUS.ordinal()) {
            hs.Horoscope(Zodiac.SAGITTARIUS);
        }
        else if (input == Zodiac.CAPRICORN.ordinal()) {
            hs.Horoscope(Zodiac.CAPRICORN);
        }
        else if (input == Zodiac.AQUARIUS.ordinal()) {
            hs.Horoscope(Zodiac.AQUARIUS);
        }
        else if (input == Zodiac.PISCES.ordinal()) {
            hs.Horoscope(Zodiac.PISCES);
        }

    }

    // 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
    //    a different horoscope based on the Zodiac's state.
    public void Horoscope(Zodiac sign) {
        switch (sign) {
            case ARIES:
                System.out.println("There's tension in the air, Aries, but there's little you can do about it. The harsh atmosphere is in stark contrast to the frivolity \n" +
                        "you felt over the last several days. It seems you received some good news. Perhaps you were finally recognized for your hard work? Don't brag \n" +
                        "about your accomplishments. It would only exacerbate the situation. Be patient. Avoid confrontation.");
                break;
            case TAURUS:
                System.out.println("You might be in a financial jam right now, Taurus. The stress of the situation has you considering some radical solutions. \n" +
                        "Would it really benefit your family if you took a second job? Confide in a friend and see if he or she can help you find a more agreeable \n" +
                        "solution. Perhaps a relative could give you a low-interest loan.");
                break;
            case GEMINI:
                System.out.println("Don't spread the good news too quickly, Gemini. As exciting as it is, nothing is confirmed yet. Keep the information under your hat \n" +
                        "until plane reservations have been made or you have the job offer in writing. Whatever the good news is, it's exactly what the doctor prescribed \n" +
                        "to give your self-confidence a boost.");
                break;
            case CANCER:
                System.out.println("If you receive a financial windfall, spend it wisely, Cancer. Your tendency might be to buy gifts or treat a crowd to a \n" +
                        "lavish night on the town. But where is the enduring value? Invested carefully, a small chunk of money can grow into a much larger \n" +
                        "one, which will give you many more options. Be prudent.");
                break;
            case LEO:
                System.out.println("You're energetic and enthusiastic today, Leo, and those around you respond favorably. It seems everyone wants to be in your \n" +
                        " orbit. Work at home and the office goes quickly and smoothly. Because you have so much energy, why not take on a new project? Normally \n" +
                        "this would send you over the edge, but today you feel you could take on anything. Go for it.");
                break;
            case VIRGO:
                System.out.println("There's tension all around you, so you'll be happiest spending as much time by yourself as possible, Virgo. If you must interact \n" +
                        "with people, keep your communication clear and concise. There's room for misunderstanding, which could result in a major blowup over a minor \n" +
                        "event. It simply isn't worth the trouble being with people today. Seclusion is the only place where you'll find peace.");
                break;
            case LIBRA:
                System.out.println("You're ready for a change, Libra, there's no doubt about it. As you grow older your interests broaden, and you're considering \n" +
                        "pursuing some of these new interests in earnest. Perhaps school beckons, or some adult education courses. You're ready to make a new place \n" +
                        "for yourself in the world. Go ahead and get started!");
                break;
            case SCORPIO:
                System.out.println("You've never looked better, Scorpio. Your partner notices, too, and showers you with extra affection and perhaps even an unexpected \n" +
                        "gift. This should put a smile on your face! At work, you may be given responsibilities beyond your usual job. Take care to do this special \n" +
                        "assignment well. If you do, other advancements are likely to follow.");
                break;
            case SAGITTARIUS:
                System.out.println(" Sometimes a little indulgence has value far beyond its price, Sagittarius. A bubble bath in the middle of the day, a luxurious \n" +
                        "hour spent browsing in a bookstore, a special outfit you've wanted for a long time - these are a few of the ways you could perk up your spirits. \n" +
                        "Why not? You could use a boost.");
                break;
            case CAPRICORN:
                System.out.println("You feel as though you've turned a financial and professional corner, Capricorn. Recent accomplishments have you feeling energized \n" +
                        "and on top of the world! You exude confidence. It's a good feeling, isn't it? Members of the opposite sex are especially attracted to you right \n" +
                        "now. And who could blame them? You're looking great!");
                break;
            case AQUARIUS:
                System.out.println("Who knew you were so talented, Aquarius? A creation done long ago suddenly takes on a life of its own. A short story written and \n" +
                        "submitted long ago is pulled from the bottom of the slush pile. Or a portrait you painted gets a second admiring look. Whatever the circumstances, \n" +
                        "you enjoy the recognition. Your work isn't the only thing receiving admiring glances. Your partner appreciates you, too!");
                break;
            case PISCES:
                System.out.println("Loving care is prescribed for someone in your family, Pisces. Offer a bowl of soup and some tea, but beyond that try and stay out of the way. \n" +
                        "Sometimes uninterrupted quiet is the best cure of all. You could use a bit of this yourself. Why not curl up with a good book? Even if it's the \n" +
                        "middle of the day, draw the shades and pretend it's night.");

                break;
        }
    }
    // 3. Make a main method to test your method

}
