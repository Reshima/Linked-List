
public class IntSet
{
  private Node head;
  private Node tail;
  private int size;
  public IntSet()
  {
    size = 0;
  }
//used to clear a set
  public void clear()
  {
    head = null;
    tail = null;
    size = 0;
  }
//used to find the index of a value when dealing with givenSet, becuase we cannot use head.
  public int indexOf(int value)
  {
    int index = 0;
    Node cursor = head;
    while(cursor != null)
    {
      if (cursor.getValue() == value)
      {
        return index;
      }
      cursor = cursor.getNext();
      index++;
    }
    return -1;
  }
//used to get a value of a certain index when dealing with givenSet, because we cannot use head.
  public int get(int index)
  {
    if(index < size())
    {
      Node cursor = head;
      for(int i = 0; i < index; i++)
      {
        cursor = cursor.getNext();
      }
      return cursor.getValue();
    }
    else
    {
      throw new RuntimeException("Index out of bound.");
    }
  }
//Returns Boolean Value. Returns true if the given value is contained in the set and false otherwise.
  public boolean contain(int value)
  {
    Node cursor = head;
    boolean in = false;
    while(cursor != null)
    {
      int check = cursor.getValue();
      if(check == value)
      {
        in = true;
        break;
      }
      cursor = cursor.getNext();
    }
    return in;
  }
//returns nothing. Remove the node containing the value from the set. If the value is not contained in the set, do nothing.
  public void remove(int value)
  {
    if (this.contain(value) == true)
    {
    // check if it is the head
      int index = this.indexOf(value);
      if (index == 0)
      {
        head = head.getNext();
	if (head == null)
        {
	  tail = null;
	}
      }
      else
      {
        Node prev = head;
	for(int i = 0; i < index - 1; i++)
        {
	  prev = prev.getNext();
	}
	prev.setNext(prev.getNext().getNext());

       //check if it is the tail
	if (index == size() - 1)
        {
	  tail = prev;
	}
      }

      size--;
      }
//I printed a method to tell the user that the method had run.
      else
      {
        System.out.println("Value not contained in set.");
      }
  }
//returns nothing. Add a node with the given value to the Set. If there is already a node containng the same value, do nothing.
  public void addElement(int value)
  {
    Node newNode = new Node(value, null);
    if(this.contain(value) == false)
    {
      // check if the list is empty
      if (head != null)
      {
        tail.setNext(newNode);
      }
      else
      {
        head = newNode;
      }
      tail = newNode;
      size++;
    }
//I added a statement to tell the user that the method had run.
    else
    {
      System.out.println("value already contained in set");
    }
  }
//returns an integer equal to the nmber of distinct nodes in the set.
  public int size()
  {
    return size;
  }
//returns a Boolean value true if every element in givenSet is in the current set and false otherwise.
  public boolean subsetOf(IntSet givenSet)
  {
    boolean subset = false;
    int counter = 0;
    int index = 0;
    while(index < givenSet.size())
    {
      int check = givenSet.get(index);
      if(this.contain(check) == true)
      {
        counter++;
      }
      if(this.contain(check) == false)
      {
        break;
      }
      index++;
    }
    if(counter == givenSet.size())
    {
      subset = true;
    }
    return subset;
  }
//returns true if both sets contain the same elements where order in either set does not count.
  public boolean isEqual(IntSet givenSet)
  {
    boolean equal = false;
    Node cursor = head;
    int counter = -1;
    if(this.size() == givenSet.size())
    {
      counter = 0;
      while(cursor != null)
      {
        int check = cursor.getValue();
        if(givenSet.contain(check) == true)
        {
          counter++;
        }
        if(givenSet.contain(check) == false)
        {
          break;
        }
        cursor = cursor.getNext();
      }
      if(counter == this.size());
      {
        equal = true;
      }
    }
    return equal;
  }
// C = A.union(B). It returns a Set that contains all the elements in set A and B but only list duplicates once.
//So you said to only list duplicates once and though you said no duplicates in the following method, I'm assuming you meant that I cannot list duplicates
//in both, because you said to do nothing in our add method if the value was already contained in the set. As in if both A and B contain a 2, 2 will only appear
//once in C.
  public IntSet union(IntSet givenSet)
  {
    IntSet C = new IntSet();
    int index = 0;
    Node cursor = head;
    while(cursor != null)
    {
      C.addElement(cursor.getValue());
      cursor = cursor.getNext();
    }
    while(index < givenSet.size())
    {
      if(C.contain(givenSet.get(index)) == false)
      {
        C.addElement(givenSet.get(index));
      }
      index++;
    }
    return C;
  }
// C = A.intersection(B) and returns a set containing only elements that are common to both A and B, but no duplicates.
  public IntSet intersection(IntSet givenSet)
  {
    IntSet C = new IntSet();
    Node cursor = head;
    while(cursor != null)
    {
      if(givenSet.contain(cursor.getValue()) == true)
      {
        C.addElement(cursor.getValue());
      }
      cursor = cursor.getNext();
    }
    return C;
  }
//C = A.complement(B) and returns a set containg only elementss that are in A but not in B.
  public IntSet complement(IntSet givenSet)
  {
    IntSet C = new IntSet();
    Node cursor = head;
    while(cursor != null)
    {
      if(givenSet.contain(cursor.getValue()) == false)
      {
        C.addElement(cursor.getValue());
      }
      cursor = cursor.getNext();
    }
    return C;
  }
//returns a string to represent the Set in the format of "[3,4,6,8]".
  public String toString()
  {
    String res = "[";
    Node cursor = head;
    while(cursor != null)
    {
      res += cursor.getValue();
      cursor = cursor.getNext();
      if (cursor != null)
      {
        res += ",";
      }
    }
    res += "]";
    return res;
  }
}
