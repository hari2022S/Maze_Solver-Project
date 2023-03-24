package Maze_Solver;

import java.util.List;

public class dfs {
    public static boolean searchPath(int[][] maze,int i, int j, List<Integer> path){
        if(maze[j][i] == 9){
            path.add(i);
            path.add(j);
            return true;
        }
        if(maze[j][i] == 0){
            maze[j][i]=2;
            int dx = -1;
            int dy = 0;
            if(searchPath(maze,i+dx,j+dy, path)){
                path.add(i);
                path.add(j);
                return true;
            }
            dx = 1;
            dy = 0;
            if(searchPath(maze,i+dx,j+dy, path)){
                path.add(i);
                path.add(j);
                return true;
            }
            dx = 0;
            dy = -1;
            if(searchPath(maze,i+dx,j+dy, path)){
                path.add(i);
                path.add(j);
                return true;
            }
            dx = 0;
            dy = 1;
            if(searchPath(maze,i+dx,j+dy, path)){
                path.add(i);
                path.add(j);
                return true;
            }
        }
        return false;
    }
}
