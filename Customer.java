public class Customer implements Comparable<Customer> {
  String fname;
  String lname;
  String phoneNumber;
  Movie [] list;
  Customer left;
  Customer right;
  int count;

  public Customer(String fname, String lname, String phoneNumber) {
    this.fname = fname;
    this.lname = lname;
    this.phoneNumber = phoneNumber;
    this.list = new Movie[3];
    this.count = 0;
  }

  public int compareTo(Customer other) {
    return this.phoneNumber.compareTo(other.phoneNumber);
  }

  public void rentmovie(Movie m){
    if (this.list[0] == null){
      this.list[0] = m;
      count ++;
      return;
    }
    if (this.list[1] == null){
      this.list[1] = m;
      count++;
      return;
    }
    if (this.list[2] == null){
      this.list[2] = m;
      count++;
      return;
    }
    else {
      System.out.println("You have reached the maximum number of movies you can rent.");
    }
  }

  public void returnmovie(Movie m){
    if (this.list[0] == m){
      this.list[0] = null;
      count --;
      return;
    }
    if (this.list[1] == m){
      this.list[1] = null;
      count --;
      return;
    }
    if (this.list[2] == m){
      this.list[2] = null;
      count --;
      return;
    }
    else {
      System.out.println("You have not rented this movie.");
    }
  }

  public int getCount(){
    return count;
      
  }
  
}