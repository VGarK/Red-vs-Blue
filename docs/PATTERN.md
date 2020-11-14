->I am using the Strategy Pattern, or, as others may call it, the Policy Pattern. This type of design pattern comes under behaviour pattern, allowing the selection of an algorithm at runtime. So, instead of implementing only one algorithm directly, the code can swap the algorithms it uses as it receives instructions at during the run time about which is the most relevant.


->In this design, I create objects which represent various strategies. Each strategy contains the instructions of the different states of the game (ChoosingActor, SelectingNewLocation, SelectingMenuItem and SelectingTarget, plus others phases that could come as developement advances).
The design also includes a context object whose behaviour varies as per its strategy object, at the same time, the strategy object changes the executing algorithm of the context object.

->The benefits it brings to the code:
·It divides and encapsulates the algorithms from a host class by moving them to other classes.
·The implementation of the algorithms can be changed without affecting the Context class, as the data structures are completely encapsulated.
·The client can choose which algorithm will be performed in runtime.
·The code is easier to read and it allows better maintenance of it.
·It is easier to add more algorithms and to test them more easily.
·It follows the 'leave room for expansion but not for modification' principle.
·It gives immeasurable flexibility.


*More information about the choosing of this pattern is in the DEPARTURES.md file.


