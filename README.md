<img src="https://images.squarespace-cdn.com/content/v1/5bcb6986b9144925be49f344/1553181207298-V19P07PLX7LAEW9SLR2C/Logo_Labs.png" width=50%>

Welcome to the Optimal Dynamics take home assessment! We know how stressful it can be to have a time limit so for our assessment you will be given 5 days & will just need to submit the assesment in HackerRank when you are done. The time expected to complete this assesment is <2 hour. 

#### Critera for Grading
- Ability to resolve issues and debug 
- Ability to adhere to proper OOP principles
- Ability to produce testable and **extensible** code

#### Structure of the Assessment 
This assessment will be be completed in `Java 11` & we will be using the `gradle` build system. The tasks that you are asked to complete are marked with a `TODO` in the code files so you may search for them or take advantage of Intellij's [checklist](https://www.jetbrains.com/help/idea/using-todo.html) functionality. 

We **HIGHLY** recommend using IntelliJ to complete this assessment.  

There are 3 problems (A, B, C) and pre-check for you to complete in this assessment. For every problem (i.e. A, B, C), there is an associated package in the `src.java` directory. Feel free to add/remove as much code as you believe is necessary to complete the assessment. There is an `extras` package where we have a few domain objects. The `Person` class that you will need to edit for problem A is located here. Implement the unit tests using the specified `junit` provided. For the portions of the assessment that ask for a written answer - please type your responses in the `answers.txt` file at the root of the repository. 

For the in person follow-up to this assessment, we will be asking you to edit and extend the implementations you write. Emphasize what you think is the best approach that will allow you to later add more to these classes. 

The entry point can be found in `src.java.Main`.

* Pre-check
    * Import this code into your favorite editor and get it running
    * You will be required to install JDK 11 & Gradle to complete this assessment
    * Did you run into any issues? 
* A - Debugging
    * When you uncomment `problemA` you will notice that both the `solange` & `beyonce` instances say Beyonce when the `sayMyName` function is called
    * Update the `Person` class so that => `solange.sayMyName()` prints "Solange" to the console and `beyonce.sayMyName()` prints "Beyonce" to the console
    * Explain in 2-3 sentences why there was an error and why the code wasn't working
    * (Optional) Explain why this is funny
* B - Math & Unit Testing
    * Implement a distance calculator that can calculate the distance between 2 locations using [Euclidean](#eclidean) distance or the [Haversine](#haversine) formula 
    * Your distance functions must be impletmented in the `B` package. Feel free to use the provided interface in your implementation or ignore it
    * Write two unit tests : one for the Euclidean method & one for the Haversine method
    * How would you make it so that you could easily switch between these methods without having to recompile the code? 
    * Hint : Think of how you can use a Factory and/or Stategy method to provide a clean interface
    * Why is unit testing floating point numbers difficult? 
* C - Modeling
    * Assuming a constant driving speed of 50 mph use your Haversine formula from above to calcuate travel time (e.g. Haversine => 300 mi / 50 mph should result in 6 hours) in the `Simulator` class
    * Implement the function `goOnATrip` according to the rules provided in the function body
    * Who has to drive more when going on a trip? 

#### Formula Reference

##### Eclidean
![image](https://user-images.githubusercontent.com/41996797/135862352-846f2279-8b74-43ac-b17a-1d2548a5cec2.png)

##### Haversine
![image](https://user-images.githubusercontent.com/41996797/135862627-5e814b76-b27b-4b05-b874-2d818b713958.png)

Φ – latitude, λ – longitude, R – radius of the earth (R ≈ 6.371 km)

Please feel free to email me at sraparti@optimaldynamics.com if there are any issues or follow up questions about this assessment.
