package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        int i = 0;
        int j = 0;

        if(matrix[i][j] == 'X') {
            if(matrix[i+1][j] == 'X') {
                if(matrix[i+2][j] =='X') {
                    return true;
                }
            } else if(matrix[i+1][j+1] == 'X') {
                if(matrix[i+2][j+2] == 'X') {
                    return true;
                }
            } else if(matrix[i][j+1] == 'X') {
                if(matrix[i][j+2] == 'X') {
                    return true;
                }
            }
        }
        if(matrix[i+1][j+1] == 'X') {
            if(matrix[i+1][j] == 'X') {
                if(matrix[i+1][j+2] == 'X') {
                    return true;
                }
            } else if(matrix[i][j+1] == 'X') {
                if(matrix[i+2][j+1] == 'X') {
                    return true;
                }
            } else if(matrix[i][j+2] == 'X') {
                if(matrix[i+2][j] == 'X') {
                    return true;
                }
            }
        }
        if(matrix[i+2][j+2] == 'X') {
            if(matrix[i+1][j+2] == 'X') {
                if(matrix[i][j+2] == 'X') {
                    return true;
                }
            } else if(matrix[i+2][j+1] == 'X') {
                if(matrix[i+2][j] == 'X') {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        int i = 0;
        int j = 0;

        if(matrix[i][j] == 'O') {
            if(matrix[i+1][j] == 'O') {
                if(matrix[i+2][j] =='O') {
                    return true;
                }
            } else if(matrix[i+1][j+1] == 'O') {
                if(matrix[i+2][j+2] == 'O') {
                    return true;
                }
            } else if(matrix[i][j+1] == 'O') {
                if(matrix[i][j+2] == 'O') {
                    return true;
                }
            }
        }
        if(matrix[i+1][j+1] == 'O') {
            if(matrix[i+1][j] == 'O') {
                if(matrix[i+1][j+2] == 'O') {
                    return true;
                }
            } else if(matrix[i][j+1] == 'O') {
                if(matrix[i+2][j+1] == 'O') {
                    return true;
                }
            } else if(matrix[i][j+2] == 'O') {
                if(matrix[i+2][j] == 'O') {
                    return true;
                }
            }
        }
        if(matrix[i+2][j+2] == 'O') {
            if(matrix[i+1][j+2] == 'O') {
                if(matrix[i][j+2] == 'O') {
                    return true;
                }
            } else if(matrix[i+2][j+1] == 'O') {
                if(matrix[i+2][j] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isTie() {
        if(!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        if(isInFavorOfX()) {
            return "X";
        } else if(isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }

}
