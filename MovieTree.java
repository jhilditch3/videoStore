public class MovieTree{
  Movie root;
  public MovieTree(){
    root = null;
  }
  public Movie findbybarcode(String search){
    return findbybarcode(root, search);
  }
  public Movie findbybarcode(Movie m, String search){
    if (m == null) return null;
    if (m.barcode.equals(search)) return m;

    if (search.compareTo(m.barcode) < 0){
      return findbybarcode(m.left, search);
    }
    else {
      return findbybarcode(m.right, search);
    }
  }

  public void insert(Movie m){
    if (root == null){
      root = m;
      return;
    }

    Movie current = root;
    while (true){
      if (m.compareTo(current) < 0){
        if(current.left == null){
            current.left = m;
            return;
        }
        else {
            current = current.left;
        }
      }
      else {
        if (current.right == null){
           current.right = m;
            return;
        }
        else{
          current = current.right;
        }
      }
    }
  } 

  public Movie findByTitle(String search){
    Movie current = root;
    while(current != null){
      if (current.title.equals(search)){
        return current;
      }
      else if(current.title.compareTo(search) < 0){
        current = current.left;
      }
      else{
        current = current.right;
      }   
    }

    return null;
  }

  public void movieSelection(){
    printPreOrder(root);
  }

  public void printPreOrder(Movie m){
      if (m == null){
          return;
      }
      System.out.println(m.title);
      printPreOrder(m.left);
      printPreOrder(m.right);
  }

  
} 
  
  
