package com.dhruv.recursion.subsequencePattern.medium;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][]maze = {{true,true,true},{true,false,true},{true,true,true}};
        printMazePaths(maze,0,0,"");
    }
    static void printMazePaths(boolean[][]maze,int row, int col,String p){
//        base case
        if( row == maze.length-1 && col == maze[0].length-1 ){
            System.out.println(p);
            return;
        }
//        body
        if( !maze[row][col] ){
            return;
        }
        if( row != maze.length-1 && col != maze[0].length-1 ){
            printMazePaths(maze,row+1,col,p+'D');
            printMazePaths(maze,row, col+1,p+'R');
        }
        if( row == maze.length-1 ){
            printMazePaths(maze,row,col+1,p+'R');
        }
        if( col == maze.length-1 ){
            printMazePaths(maze,row+1,col , p+'D');
        }

    }
}
