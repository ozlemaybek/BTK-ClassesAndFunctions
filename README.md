# BTK-ClassesAndFunctions

>The "final" keyword is used so that the value of the variable cannot be changed again.

>"public" means accessible from all classes.

>"this" refers to the class we are in.

>before Kotlin:

![image](https://user-images.githubusercontent.com/109730490/180984851-32c92d48-d553-4f6f-9ef4-a880a11ea6ac.png)

>new feature of kotlin:

![image](https://user-images.githubusercontent.com/109730490/180985729-fcfd6a9a-107a-4764-bfb0-cb2db6abacd5.png)

>There are 4 access levels in Kotlin:

- 1 ) public: Accessible from everywhere.

- 2 ) private: It can only be used within the class we are writing. It cannot be accessed from elsewhere.

- 3 ) protected: If there is another class in the class file, it can be accessed from there.

- 4 ) internal: It can only be accessed from within our own modules. So, it can be accessed from everywhere in the project, but if we add an external library, it cannot be accessed from there.

>If we haven't added anything, it is considered "public" by default.

>The way to access a private variable from outside the class is getters and setters. If I want it to see but not change, I use the getter but comment the setter.


