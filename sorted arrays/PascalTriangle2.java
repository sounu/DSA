
// https://leetcode.com/problems/pascals-triangle-ii/description/?envType=problem-list-v2&envId=array
// 119. Pascal's Triangle II
import java.util.ArrayList;
import java.util.List;
class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
       
        row.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
           
            row.add(1);
            
       
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }

    public static void main(String[] args) {
        // Class name and constructor must match
        PascalTriangle2 obj = new PascalTriangle2();
        
        // Example: rowIndex 3 should return [1, 3, 3, 1]
        System.out.println(obj.getRow(3));
    }
}