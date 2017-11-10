public class IntSetTest
{
  public static void main(String[] args)
  {
//this is a custom test case to show off all of the methods I created.
    IntSet A = new IntSet();
    IntSet B = new IntSet();
    System.out.println(A);
    System.out.println(B);

    // add elements
    A.addElement(5);
    A.addElement(10);
    A.addElement(12);
    A.addElement(28);
    System.out.println("A: " + A);
    System.out.println("A Size: " + A.size());

    B.addElement(12);
    B.addElement(10);
    B.addElement(5);
    B.addElement(34);
    B.addElement(16);
    B.addElement(4);
    System.out.println("B: " + B);
    System.out.println("B Size: " + B.size());

    System.out.println("Are A and B equal?: " +  B.isEqual(A));
    System.out.println("Is B a subset of A?: " + A.subsetOf(B));
    System.out.println("Is A a subsset of B?: " + B.subsetOf(A));
    System.out.println("Does A contain 10?: " + A.contain(10));
    System.out.println("Does B contain 18?: " + B.contain(18));
    System.out.println("Union: " + A.union(B));
    System.out.println("Intersection: " + A.intersection(B));
    System.out.println("B Complement: " + B.complement(A));
    System.out.println("A Complement: " + A.complement(B));

    // remove elements
    A.remove(5);
    System.out.println("A: " + A);
    System.out.println("Size: " + A.size());

    B.remove(18);
    System.out.println("B: " + B);
    System.out.println("Size: " + B.size());

// Case 1: A and B are equal but distinct sets, for example, A = {1,2,3}, B = {2,1,3}
    System.out.println();
    System.out.println("Case 1:");
    A.clear();
    B.clear();
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    A.addElement(1);
    A.addElement(2);
    A.addElement(3);
    B.addElement(2);
    B.addElement(1);
    B.addElement(3);
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    System.out.println("Are A and B equal?: " + A.isEqual(B));
    System.out.println("Is A a subset of B?: " + A.subsetOf(B));
    System.out.println("Is B a subset of A?: " + B.subsetOf(A));
    System.out.println("Union: " + B.union(A));
    System.out.println("Intersection: " + B.intersection(A));
    System.out.println("A Complement: " + A.complement(B));
    System.out.println("B Complement: " + B.complement(A));

//   Case 2: A and B are such that they have different sizes but one is a subset of the other, for example, A = {1}, B = {1,2}
    System.out.println();
    System.out.println("Case 2:");
    A.clear();
    B.clear();
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    A.addElement(1);
    B.addElement(1);
    B.addElement(2);
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    System.out.println("Are A and B equal?: " + A.isEqual(B));
    System.out.println("Is B a subset of A?: " + A.subsetOf(B));
    System.out.println("Is A a subset of B?: " + B.subsetOf(B));
    System.out.println("Union: " + B.union(A));
    System.out.println("Intersection: " + A.intersection(B));
    System.out.println("A Complement: " + A.complement(B));
    System.out.println("B Complement: " + B.complement(A));

//   Case 3: A and B are non-empty and different in size but have common elements, for example, A = {1,2,3}, B = {2,3,4,5}
    System.out.println();
    System.out.println("Case 3:");
    A.clear();
    B.clear();
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    A.addElement(1);
    A.addElement(2);
    A.addElement(3);
    B.addElement(2);
    B.addElement(3);
    B.addElement(4);
    B.addElement(5);
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    System.out.println("Are A and B equal?: " + A.isEqual(B));
    System.out.println("Is B a subset of A?: " + A.subsetOf(B));
    System.out.println("Is A a subset of B?: " + B.subsetOf(A));
    System.out.println("Union: " + A.union(B));
    System.out.println("Intersection: " + A.intersection(B));
    System.out.println("A Complement: " + A.complement(B));
    System.out.println("B Complement: " + B.complement(A));

//   Case 4: they are non-empty with nothing in common, for example, A = {1}, B = {2,3}
    System.out.println();
    System.out.println("Case 4:");
    A.clear();
    B.clear();
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    A.addElement(1);
    B.addElement(2);
    B.addElement(3);
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    System.out.println("Are A and B equal?: " + A.isEqual(B));
    System.out.println("Is B a subset of A?: " + A.subsetOf(B));
    System.out.println("Is A a subset of B?: " + B.subsetOf(A));
    System.out.println("Union: " + A.union(B));
    System.out.println("Intersection: " + A.intersection(B));
    System.out.println("A Complement: " + A.complement(B));
    System.out.println("B Complement: " + B.complement(A));

//   Case 5: one is non-empty and the other empty*/
    System.out.println();
    System.out.println("Case 5:");
    A.clear();
    B.clear();
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    A.addElement(8);
    A.addElement(18);
    A.addElement(30);
    A.addElement(48);
    System.out.println("A: " + A);
    System.out.println("B: " + B);

    System.out.println("Are A and B equal?: " + A.isEqual(B));
    System.out.println("Is B a subset of A?: " + A.subsetOf(B));
    System.out.println("Is A a subset of B?: " + B.subsetOf(A));
    System.out.println("Union: " + A.union(B));
    System.out.println("Intersection: " + A.intersection(B));
    System.out.println("A Complement: " + A.complement(B));
    System.out.println("B Complement: " + B.complement(A));

  }
}
