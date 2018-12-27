/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Prince
 */
public class Main {

    public static boolean playerTurn = true;
    public static boolean playerWon = false;
    public static boolean computerWon = false;
    public static tictactoe board = new tictactoe();

    public static void main(String[] args) {
        if (board.isVisible() == false) {
            board.setVisible(true);
        }

    }

    public static void checkforwin() {
        if (board.button1.getText().equals("X")) {
            if (board.button4.getText().equals("X")) {
                if (board.button7.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }
        if (board.button1.getText().equals("X")) {
            if (board.button5.getText().equals("X")) {
                if (board.button9.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button1.getText().equals("X")) {
            if (board.button2.getText().equals("X")) {
                if (board.button3.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button1.getText().equals("X")) {
            if (board.button4.getText().equals("X")) {
                if (board.button7.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button3.getText().equals("X")) {
            if (board.button5.getText().equals("X")) {
                if (board.button7.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button3.getText().equals("X")) {
            if (board.button6.getText().equals("X")) {
                if (board.button9.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button7.getText().equals("X")) {
            if (board.button8.getText().equals("X")) {
                if (board.button9.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button4.getText().equals("X")) {
            if (board.button5.getText().equals("X")) {
                if (board.button6.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button2.getText().equals("X")) {
            if (board.button5.getText().equals("X")) {
                if (board.button8.getText().equals("X")) {
                    playerWon = true;
                    computerWon = false;
                    System.out.println("Yoo nigga!! player X won");
                }
            }
        }

        if (board.button1.getText().equals("O")) {
            if (board.button4.getText().equals("O")) {
                if (board.button7.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }
        if (board.button1.getText().equals("O")) {
            if (board.button5.getText().equals("O")) {
                if (board.button9.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button1.getText().equals("O")) {
            if (board.button2.getText().equals("O")) {
                if (board.button3.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button1.getText().equals("O")) {
            if (board.button4.getText().equals("O")) {
                if (board.button7.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button3.getText().equals("O")) {
            if (board.button5.getText().equals("O")) {
                if (board.button7.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button3.getText().equals("O")) {
            if (board.button6.getText().equals("O")) {
                if (board.button9.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button7.getText().equals("O")) {
            if (board.button8.getText().equals("O")) {
                if (board.button9.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button4.getText().equals("O")) {
            if (board.button5.getText().equals("O")) {
                if (board.button6.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

        if (board.button2.getText().equals("O")) {
            if (board.button5.getText().equals("O")) {
                if (board.button8.getText().equals("O")) {
                    playerWon = false;
                    computerWon = true;
                    System.out.println("Yoo nigga!! player O won");
                }
            }
        }

    }

}
