# videoStore
Program to store members of a video store as well as the movies that are available to rent.
## Customer
This file contains the attributes for a single customer. This file also contains methods for renting and returning movies (a max of 3 movies can be rented at one time), as well as a compareTo method that allows customers to be sorted in the customer tree. 
## Customer Tree
This file contains a binary tree that stores all the customers (members of the store). Customers can be found by phone number.
## Movie
This file contains the attributes needed to identify a specific movie, as well as whether a movie has been rented and if so which customer it has been rented to. This file contains a compareTo method that allows movies to be sorted in the movie tree.
## Movie Tree
This file contains the binary tree used for storing the movies at a specific location. Movies can be found by title or barcode.
## Store
This file initializes a Movie Tree and a Customer Tree, and uses methods from MovieITree.java and CustomerTree.java to perform the basic tasks of adding movies and customers, as well renting movies and finding which customer has a movie checked out.
