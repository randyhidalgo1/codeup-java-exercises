package quote;

public class quote {
    public static String randomQuote(){
    int randomNumber = (int) (Math.random()*4) + 1;
    switch (randomNumber){
        case 1: return "killer's gonna kill";
        case 2: return "I'm gonna get me";
        case 3: return "I'm gonna get her";
        case 4: return "I'm gonna get him";
        default: return "I'm gonna get you";
    }
    }
}

