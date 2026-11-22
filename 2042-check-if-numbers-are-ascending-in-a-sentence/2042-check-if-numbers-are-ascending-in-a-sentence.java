// class Solution {
//     public boolean areNumbersAscending(String s) {
//         String[] parts = s.split(" ");
//         int prev = -1;
//         for (String part : parts) {
//             if (part.matches("\\d+")) {
//                 int num = Integer.parseInt(part);
//                 if (num <= prev) return false;
//                 prev = num;
//             }
//         }
//         return true;
//     }
// }


class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = 0;
        
        for(String token: s.split(" ")) {
            try {
                int number = Integer.parseInt(token);
                if(number <= prev)
                    return false;
                prev = number;
            }
            catch(Exception e) {}
        }
        
        return true;
    }
}