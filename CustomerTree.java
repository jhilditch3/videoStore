public class CustomerTree {
  Customer root;
  int size;

  public CustomerTree() {
    root = null;
  }

  public void insert(Customer c) {
    if (root == null) { // if the tree is empty make the new customer the root
      root = c;
    } else { // tree is not empty, find a spot to put the new customer
      Customer current = root;
      while (true) {
        if (c.compareTo(current) < 0) { // does the new customer belong to the left?
          if (current.left == null) { // if the left is empty, put the new customer there
            current.left = c;
            return;
          } else {
            current = current.left; // if the left is not empty, move to the left
          }
        } else {// does the new customer belong to the right?
          if (current.right == null) { // if the right is empty, put the new customer there
            current.right = c;
            return;
          } else { // if the right is not empty, move to the right
            current = current.right;
          }
        }
      }
    }
  }

  public Customer findByPhoneNumber(String phoneNumber) { // Search the tree for a customer based on phone number
    Customer current = root; // movie object to iterate through my tree yo!
    while (current != null) { 
      if (current.phoneNumber.equals(phoneNumber)) { // is this the droid i am looking for?
        return current;
      } 
      else if (current.phoneNumber.compareTo(phoneNumber) > 0) { 
        current = current.left;
      } 
      else {
        current = current.right;
      }
    }
    return null;
  }
}