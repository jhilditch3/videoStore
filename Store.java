public class Store{
  CustomerTree ct;
  MovieTree mt;
  
  public Store(){
    ct = new CustomerTree();
    mt = new MovieTree();
  }
  
  public void addMovie(String barcode, String title){
    mt.insert(new Movie(barcode, title));
  }
  
  public void addCustomer(String fname, String lname, String PhoneNumber){
    ct.insert(new Customer(fname, lname, PhoneNumber));
  }
  public void rentmovie(String phoneNumber, String barcode){
    Customer c = ct.findByPhoneNumber(phoneNumber);
    Movie m = mt.findbybarcode(barcode);
    if (m == null || c == null){
      if(m == null){
        System.out.println("Movie not found");
      }
      else if(c == null){
        System.out.println("Customer not found");
      }
    }
    else{
      c.rentmovie(m);
      m.rented = true;
      m.customer = c;
    }
    
  }
  public void returnmovie(String phoneNumber, String barcode){
    Customer c = ct.findByPhoneNumber(phoneNumber);
    Movie m = mt.findbybarcode(barcode);
    c.returnmovie(m);
    m.customer = null;
    m.rented  = false;
  }

  public void check(String title){
    try {
    Movie m = mt.findByTitle(title);
    System.out.println("Customer Name: " + m.customer.fname + " " + m.customer.lname);
    System.out.println("Phone Number: " + m.customer.phoneNumber);
    }
    catch (NullPointerException e){
      System.out.println("Not Found");
    }
  }

  public void Movies(){
    mt.movieSelection();
  }


}