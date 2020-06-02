# Втора лабораториска вежба по Софтверско инженерство

## Ерлин Алии, бр. на индекс 161279

### Група на код: 

Ја добив групата на код 2

###  Control Flow Graph
![Control Flow Graph](https://user-images.githubusercontent.com/24783955/83469099-0b8fd980-a47f-11ea-8efe-ca11ad1d0fed.jpg)


Фотографија од control flow graph-ot 

### Цикломатска комплексност

Цикломатската комплексност ја пресметувам со формулата
   
   V(G) = E - N + 2

N e број на јазли: 20
E e број на ребра: 26

V(G) = 26 - 20 + 2 = 8   

   Цикломатската комплексност на Control Flow Graph-от е  8  


### Тест случаи според критериумот  Every branch


 Every   | user = null,           user = (null,null, null),  user = (ErLin, null, null), 
 Branch  |allUsers = new List()   allUsers =  new List()     	allUsers = new List()              
combin-  |
 ations	 |			
 
1->2             	*                           	*                          	*	
2->3              *
2->4		          	                            *                           *
3->18	            *			
4->5		                                        *				
4->6			                                                                  *
5->18		                                        *				
6->7			                                                                  *			
6->8				
7->18			                                                                  *			
8->9.1			
9.1->9.2				
9.2->10				
9.2->14				
10->11					
10->12				
11->12					
12->9.3				
12->13						
9.3->9.2				
9.2->14				
14->15				
14->16				
16->17				
17->18						
15->18				


   user = (ErLin, null, erlinalii@outlookcom),|user = (ErLin, null, erlinalii.outlookcom), |user = (ErLin, null, erlinalii@outlook.com),
             allUsers = new List()            |                      allUsers = new List() |                allUsers = new List()
                                              |                                            |


1->2             	     *                             	                *                                       	*	
2->3					
2->4		               *                                              *                                         *
3->18						
4->5						
4->6			             *                                             	*                                       	*	
5->18			
6->7						
6->8				           *                                              *                                        	*
7->18				
8->9.1				         *	                                            *                                        	*
9.1->9.2				       *	                                            *	                                        *
9.2->10				         *                                             	*                                        	*
9.2->14				         *	                                            *	                                        *
10->11					                                                      *                                        	*
10->12				         *	                                            *                                        	*
11->12					                                                      *                                        	*
12->9.3				         *                                             	*                                       	*
12->13						                                                                                              *
9.3->9.2				       *	                                            *                                       	*
9.2->14				         *	                                            *                                       	*
14->15				         *                                            	*                                        	*
14->16				         *	                                            *	                                        *
16->17				         *	                                            *	                                        *
17->18						                                                                                              *
15->18				         *	                                            *	

### Тест случаи според критериумот Every path  

PATH 1 : 1,2,3,18

  Scenario 1: user = null, allUsers = new List()

PATH 2 : 1,2,4,5,18

  Scenario 2: user = (null, null, null), allUsers = new List()

PATH 3 : 1,2,4,6,7,18 

  Scenario 3: user = (ErLin, null, null), allUsers = new List()

PATH 4 : 1,2,4,6,8,9.1,9.2,[10,12,9.3,9.2],14,15,16,18

  Scenario 4: user = (ErLin, null, erlinalii@outlookcom), allUsers = new List()

PATH 5 : 1,2,4,6,8,9.1,9.2,[10,11,12,9.3,9.2],14,15,16,18

  Scenario 5: user = (ErLin, null, erlinalii.outlookcom), allUsers = new List()

PATH 6 : 1,2,4,6,8,9.1,9.2,[10,11,12,13,9.3,9.2],14,16,17,18

  Scenario 6: user = (ErLin, null, erlinalii@outlook.com), allUsers = new List()


### Објаснување на напишаните unit tests

Unit Test е процес на развој на софтвер во кој се испитуваат најмалите тестирачки делови на софтверот за да работат правилно индивидуално и независно. Програмерите за тестови се опишуваат и извршуваат сами.

Напишавме два методи за тестирање со ознака @Test, првата ми е за Every Path Testing a втората ми е за Every Branch Testing

public void PathTesting() - се состои од 6 проверки , assertThrows  креира објект од класата RuntimeException , со RuntimeException конструираме нов исклучок на траење со наведената детална порака каде со првата и втората ги тестираме   исклучоците . Во третата проверка корисникот има внесено username а но не нема внесена маил функцијата врати false на пример user =  "ErLin", null, "null" . Во четвртата проверка корисникот има внесено username , а маилот што е внесено е невалидно,  функцијата врати false на пример user =  "ErLin", null, " erlinalii@outlookcom" .  Во петата проверка корисникот има внесено username , а маилот што е внесено пак е невалидно,  функцијата врати false на пример user =  "ErLin", null, " erlinalii. outlookcom" .  Во шестата проверка корисникот има внесено username , маилот што е внесено е е валидно,  функцијата врати true на пример user =  "ErLin", null, " erlinalii@outlook.com" .  
public void BranchTesting() – начинот на пишување е ист со path testing со која ќе извршиме unit тестирање за Every Branch методот 
