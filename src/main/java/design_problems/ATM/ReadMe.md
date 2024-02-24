
### ATM


* 2 Design Patterns 
  * State Design Pattern 
    * Multiple Operations  and multiple state  and based on state some operation can be 
    performed.
    * Example - (o1, o2, o3, o4, o5) operations and (s1, s2, s3) state say at s1 -> o1, o2,  and at s2 -> o3 o4 and at s3 -> o5, o4
  * Chain of Responsibility Design Pattern 
    * any request which comes in goes into chain, 
      * processor 1 --- processor 2 --- processor 3 ... processor n 
      * either it can process the task or it has the next processor to process. 
    


#### FLOW 
  - User comes with An Card (ATM idle)
  - Insert the Card  ( HAS_CARD)
  - Authenticate the PIN  (HAS_VALIDATED CARD )
  - Give Lists of Operations / Options
  - Selects one of the Operation. 
  - Performs the Operation. 
  - Exit 


* Operations 
  - Insert Card 
  - Authenticate Card With PIN
  
  
* State 
  * IDLE 
  * HAS_CARD
  * HAS_VALID_CARD



* Cash Withdrawl 
  * 


  
  

  