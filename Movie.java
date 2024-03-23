public class Movie implements Comparable<Movie>{
  String barcode;
  public String title;
  Movie left;
  Movie right;
  boolean rented;
  Customer customer;
  public Movie(String barcode, String title){
    this.barcode = barcode;
    this.title = title;
    this.left = null;
    this.right = null;
    this.rented = false;
    this.customer = null;
  }
  public int compareTo(Movie other){
   return (this.barcode.compareTo(other.barcode));
  }

  public int compareByTitle(Movie other){
    return(this.title.compareTo(other.title));
  }
  
}