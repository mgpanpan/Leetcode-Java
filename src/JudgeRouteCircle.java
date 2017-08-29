public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'R') x += 1;
            else if (moves.charAt(i) == 'L') x -= 1;
            else if (moves.charAt(i) == 'U') y += 1;
            else if (moves.charAt(i) == 'D') y -= 1;

            if (x == 0 && y == 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("DURDLDRRLL"));
    }
}
