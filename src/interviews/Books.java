package interviews;

public class Books {
    /*
    Find the total number of Books can be purchased for given input.
The input will be an array of integers as [a, p, e], where
a = Total amount you have to purchase the books
p = Cost of a book
e = Number of books to return for a new book
Print total books (integer) as output.

Sample Case 0
Input: [10,2,5]
Spend 10 units amount to purchase 10/2 = 5 books => Total 5 books
Return 5 books to get one new book => 5 + 1 => Total 6 books
Output:
6

Sample Case 1
Input: [10,2,2]
Spend 10 units amount to purchase 10/2 = 5 books => Total 5 books
Out of 5 old books return 4 books to get 2 new books. => 5 + 2 => 7 books
Out of 2 new books and 1 remaining from step 2, return 2 to get one more book => 7+1 => 8
books
Still there is an old book remaining from step 3, return 1 old and 1 new book (exchanged in
step-3) to get a new book => 8 + 1 => 9 books
Output: 9"
     */

    public static void main (final String[] args) {
        countBooks (10, 2, 5);
        countBooks (10, 2, 2);
        countBooks (30, 7, 3);
    }

    private static void countBooks (final int totalAmount, final int cost, final int booksToReturn) {
        int ans = totalAmount / cost;
        int remaining = ans;
        do {
            final int newBookAfterReturn = remaining / booksToReturn;
            ans += newBookAfterReturn;
            remaining -= booksToReturn * newBookAfterReturn;
            remaining += newBookAfterReturn;
            System.out.println (format ("\t{0}-{1}-{2}", ));
        } while (remaining >= booksToReturn); System.out.println (ans);
    }
}
