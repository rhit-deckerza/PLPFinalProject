object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
  }
}


object Sudoku {
    def runOnBoard(function: (Int, Int) => Int, board: Array[Array[Int]], startingRow: Int, startingCol: Int): Array[Array[Int]] = {
        Array.ofDim[Int](9, 9)
    }
    def solveCell(row: Int, col: Int): Int = {
        0
    }
    def isValid(board: Array[Array[Int]], row: Int, col: Int, num: Int): Boolean = {
        true
    }
    def removeRandom(row: Int, col: Int): Int = {
        0
    }
}
