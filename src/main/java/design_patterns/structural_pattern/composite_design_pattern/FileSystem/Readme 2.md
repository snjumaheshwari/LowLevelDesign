# FileSystem [ Complete]

* We have some files and directories in nested way.
* A directory can have files and other directories. 
* Both have common ls() method. When it is invoked with the file - it should list down file name. 
* When it is invoked with the directory -- it should list out files names of it

* Bad design is when you need to check if the instance is of which type to perform functionality. 

* Good design 
  * File and directory both have a parent class FileSystem.
  * both have their impl of ls method.
  * Use recursive style of code. 
  
