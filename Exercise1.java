public class Exercise1 {

    static boolean iwillNotCheat = false;
    static boolean iwillWin = false;

    public static void main(String[] args) throws Exception {
        
        assert iwillNotCheat == true: " bobo ka kasi!";

        assert iwillWin== true: "gagawin ko lahat para manalo hoho!";
        
        enterCompetition();
    
    }

    static void enterCompetition(){
        iwillNotCheat = false;
    }
}
