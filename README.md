# SOUL REPOSITORY

### The Soul repo contains two folders

1. src
2. JARS

#### The src folder conatins 5 files

1. Main.java
2. Files.java 
3. Data.java
4. Soul.sh
5. README.MD

> The JARS folder contains all the external libraries for folder.

#### Data.Java

##### Data.java contains some classes that takes in some important information. Such classes are:

```
title
mood
diary
```

##### Data.java also contains some classes that generates Date and time whenever the User is done inputting the necessary information. such classes are:

```
Date
time
```

##### Data.java contains a method which executes all the classes after User is done with the inputs. such class is the

> executeData

##### The *executeData* Method is called inthe *getData* method. The getData method gathers the whole information and set them.in a json format.

## File.Data

##### File.java file contains three methods:

1. createFolder
2. createFile
3. run

### The *createFolder* creates a new folder called Memories inside the src folder at the time of its execution. Before creating the said folder in the src folder, it checks for the existence of the named folder.if it exists, it will execute nothing so as to not tamper with the existing folder.if it doesn't exists,A new folder called Memories will be created.

### The *createFolder* method is called in the createFile method.The getData Method from the Data class so as to get all the necessary info. Afterwards, the new File method is called with **title** gotten from the *getData* method passed as the arguement. The program checks whether the name exists in the Memories folder.if it exists,the program informs you about its existence. If it doesn't exists,the program creates a new file and then we input the getData method in the newly created fileas a json.

##### The *createFile* method is then called in the *run* Method.

#### Main.java

##### Main.java executes the *main* program. Inside of the ***main*** program,the *Files.run* is executed.

##### Soul.sh contains all the commands that links external libraries to certain class path. After classes have been created for each files. it executes the Main file which contains the main program.

> For this certain program to be calledwithout any error **use the _bash Soul.sh_** unless you are very good at linking external library to some certain files and also creating *java.classes* for them.





