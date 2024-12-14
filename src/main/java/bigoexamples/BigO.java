package bigoexamples;

public class BigO {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    private static void question1() {
        for (int i = 0; i < 50; i++) {
            System.out.println("do something");
        }
    }

    private static void question2() {
        int n = 4; //args[0] imagine this value is taken in as input

        for (int i = 0; i < n; i++) {
            System.out.println("do something");
        }
    }

    private static void question3() {
        int n = 5; //args[0] imagine this value is taken in as input

        for (int i = 0; i < n; i++) {
            System.out.println("do something");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("do something else");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("do something else else");
        }
    }

    private static void question4() {
        // minimax algorithm without alpha beta pruning

        /*function minimax(node, depth, isMaximizingPlayer):
            if depth == 0 or node is a terminal node:
                return evaluate(node)

            if isMaximizingPlayer:
                maxEval = -ve inf
                for each child in node.children:
                    eval = minimax(child, depth - 1, false)
                    maxEval = max(maxEval, eval)
                return maxEval
            else:
                minEval = +ve inf
                for each child in node.children:
                    eval = minimax(child, depth - 1, true)
                    minEval = min(minEval, eval)
                return minEval */
    }

    private static void question5() {
        int n = 30;

        for (int i = 0; i < n; i++) {
            System.out.println("do something");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("do something");
            for (int j = 0; j < n; j++) {
                System.out.println("do something better");
            }
            for (int k = 0; k < n; k++) {
                System.out.println("do something best");
            }
        }

    }
}
