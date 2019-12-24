# Student Info
271616 NURUL FATIN SHAHIRA BINTI RAHIM
 
271278 NURUL NADIAH BINTI YUSUF

271501 HUSNA BINTI MOHD JAMIL

271661 NURUL FATIN FARZANA BINTI MOHD RAFIZA

       
# Intoduction

All members in this group complete this assignment by doing their parts. For complete this assignment, we areb using many method such as Next Day Delivery, Same Day Delivery, Prepaid Box And Envelope, Pos Ekspress and so on. Before we write the java program, we need to write and finish the pseudocode and flowchart first to find certain values.

# Pseudocode

Pseudocode for main Method

Start

Call method choice()

End

Pseudocode for main.choice Method

Start

Declare variable as following :

1.	Display “Main Menu”

			Call line()
   
			Display “1.	Next-Day Delivery”
   
			Display “2.	Same-Day Delivery”
   
			Display “3.	Prepaid Box and Envelope”
   
			Display “4.	Pos Express”
   
			Display “5.	Receipt”
   
			Display “6.	Exit”
   
Pseudocode for case next day delivery

1.	Start 

2.	Declare class for mainmenu

3.	Declare variable for choice

4.	Display “menu”
4.1) display “1. Input your data”

4.2) display “2. Return to Main Menu”
5. input =0, type, weight

Int zone

Output “customer”+i

Output “enter your packges type :”
Display customer

Input first packagetype

Convert packagetype to uppercase

WHILE packagetype not equal to “X”

Input weight

Input zone

WHILE zone more than five THEN

Display “Invalid Input”

Input zone

WHILE zone less than or equal to five THEN

break

Call calCharge method

Display packagetype and charge1

totalcharge1[customer]=totalcharge1[customer]+charge1

Input next packagetype

Convert packagetype to uppercase

Display totalcharge1[customer]

customer=customer+1

End


Start

Declare variable for charge1.

Case 1:

IF zone is equal to one THEN

IF weight is below than two or equal to two thousand then

IF weight is below than or equal to two thousand THEN

Charge 1=4.90+(weight-500)/250X0.80

IF weight is below than or equal to five hundred THEN

Charge 1=4.90

IF weight is more than two thousand THEN

IF weight is below than or equal to two thousand five hundred 

Charge 1=10.50

IF weight is more than two thousand five hundred 

Charge 1=10.50+(weight-2500)/500X0.50

Case 2:

IF zone is equal to two THEN

IF weight is below than or equal to two thousand THEN

Charge 1=5.40+(weight-500)/250X1.00

IF weight is below than or equal to five hundred THEN

Charge 1=5.40

IF weight is more than two thousand THEN

IF weight is below than or equal to two thousand five hundred 

Charge 1=16.00

IF weight is more than two thousand five hundred 

charge1=16.00+(weight-2500)/500X2.00

Case 3:

IF zone is equal to three THEN

IF weight is below than or equal to two thousand THEN

charge1=6.90+(weight-500)/250X1.50

IF weight is below than or equal to five hundred THEN

charge1=6.90

IF weight is more than two thousand THEN

IF weight is below than or equal to two thousand five hundred THEN

Charge 1=21.00

IF weight is more than two thousand five hundred THEN

Charge 1=21.00+(weight-2500)/500X3.00

Case 4:
IF zone is equal to four THEN

IF weight is below than or equal to two thousand THEN

Charge 1=7.40+(weight-500)/250X1.50

IF weight is below than or equal to five hundred THEN

Charge 1=7.40

IF weight is more than two thousand THEN

IF weight is below than or equal to two thousand five hundred THEN

Charge 1=26.00

IF weight is more than two thousand five hundred THEN

Charge 1=26.00+(weight-2500)/500X3.50

Case 5:

IF zone is equal to five THEN

IF weight is below than or equal to two thousand THEN

Charge 1=7.90+(weight-500)/250X2.00

IF weight is below than or equal to five hundred THEN

Charge 1=7.90

IF weight is more than two thousand THEN

IF weight is below than or equal to two thousand five hundred 

Charge 1=31.00

IF weight is more than two thousand five hundred 

charge1=31.00+(weight-2500)/500X4.00

END

Pseudocode no3   

Declare variable as the following :

int i=0, type, weight

int zone

String reservation

output “customer “ + i

output “Enter your packages type : “

output “1.Envelope S”+” 2.Envelope L”+” 3.Prepaid Box S”+” 4.Prepaid Box M”+”5. Prepaid Box L”

output “Your type is : “

type = scan.nextInt ()

output “enter your item weight (in gram) : “

weight = scan.nextInt ()

output “Price is RM 7.31”

output “Price is RM 10.49”

output “Price is RM 13.78”

output “Price is RM 21.20”

output “Price is RM 31.80”

output “Error input”

output “Item can not over than 10 kg”

output “Do you want to continue? (Yes or No) : “ 

reservation = scan.next()

reservation.equaIsIgnoreCase (“yes”)

Pseudocode No.4

Start

Declare variable as the following :

int i=0, type, weight

String zone

int tebal = 0

String reservation

output “customer “ +i

output “Enter your zone : “

output “1.LG” + “2.LE (C5)” + “LD (B4)” + “4.LK”

output “Your type is : “

type = scan.nextInt ()

output “enter your item weight (in g) : “

weight = scan.nextIn ()

output “enter your item thickness (in mm) : “

tebal = scan.nextInt ()

output “Price is RM 3.18”

output “Price is RM 3.71”

output “Price is RM 4.77”

output “Price is RM 7.42”

output “Thickness max is only 25 mm”

output “Price is RM 3.18”

output “Price is RM 3.71”

output “Price is RM 4.77”

output “Price is RM 7.42”

output “Thickness max is only 25 mm”

output “Price is RM 3.18”

output “Price is RM 3.71”

output “Price is RM 4.77”

output “Price is RM 7.42”

output “Thickness max is only 25 mm”

output “Price is RM 3.18”

output “Price is RM 3.71”

output “Price is RM 4.77”

output “Price is RM 7.42”

output “Thickness max is only 25 mm”

output “Error input !”

output “Item can not over than 1 kg (1000 g) “

output “Do you want to continue? (Yes or No) : “

reservation = scan.next()

reservation.equaIsIgnoreCase (“yes”)







# Flowchart

# Screenshot of the output

![Output1](https://user-images.githubusercontent.com/55240830/71404023-68839a00-266c-11ea-80c2-3c159c3f2ff7.png)


![Output2](https://user-images.githubusercontent.com/55240830/71404089-9668de80-266c-11ea-9a2d-833ba864a43a.png)

![Output3](https://user-images.githubusercontent.com/55240830/71404101-a1237380-266c-11ea-91f5-0b89a1b0d7d3.png)

![Output3](https://user-images.githubusercontent.com/55240830/71404101-a1237380-266c-11ea-91f5-0b89a1b0d7d3.png)






