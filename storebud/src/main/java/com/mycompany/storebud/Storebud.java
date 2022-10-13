/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.storebud;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro
 */
public class Storebud {

    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);  
    
       // five(5) items and price
    int Nike = 1500;
    int Adidas = 1200;
    int Oxygen = 500;
    int Penshoppe= 300;
    int Bench = 600;
    
    String b = "yes";
    String c = "no";
    String d = "Nike Tshirt";
    String e = "Adidas Tshirt";
    String f = "Oxygen Tshirt";
    String g = "Penshoppe Tshirt";
    String h = "Bench Tshirt";
    String I ="I";
    
    int x;
    int m;
    int y;
    int z;
    int q;
    int p;
    
    System.out.println("Hello Welcome to BudClothing!" + "\n" + "If you want to take a look at my shop just type 'yes' if not then type 'no'");
    System.out.println("(Note: Choose Carefully!)" );
    String J = a.next();
    
     if (J.equals(b)) {
    	do {
            System.out.println("If you want to take a look at the list of the items just press 'I'");
           J=a.next();
           
           if (J.equals(I)  ) {
            	System.out.println("\n" + "1:" + d + "\n" + "\n" + "2:" + e + "\n" + "\n" + "3:" + f + "\n" + "\n" + "4:" + g + "\n" + "\n" + "5:" + h + "\n");
            	System.out.println("We Have A Special Promo Today!"+"\n"+"If you Buy 2 Items in Bench Tshirt you get 1000 !"+"\n"+"If you buy 3 Items in Nike Tshirt you get 4000!");
            	System.out.println("\n");
              m = a.nextInt();
                switch (m) {  
                    
                case 1:
                        System.out.println("Nike Tshirt" + "\n" +"1500");
                        break;  
                case 2:
                        System.out.println("Adidas Tshirt" +"\n" +"1200");
                        break; 
                case 3:
                        System.out.println("Oxygen Tshirt" + "\n" +"500");                       
                        break;
                case 4:
                        System.out.println("Penshoppe Tshirt" +"\n"+"300");                        
                        break;   
                case 5:
                        System.out.println("Bench Tshirt" +"\n"+"600");                        
                        break;           
                }
                
            System.out.println("\n");
            System.out.println("Do you want to look at another Item?");
            System.out.println("yes or no?");
            J = a.next();
            
            if (J.equals(c)) {
            System.out.println("Have you chosen your Best Tshirt" );
            
             x=a.nextInt();
            
            //Nike
            if (x==1) {
            	System.out.println("Type The Item Number of the Tshirt: ");
            	x=a.nextInt();
      
            	if(x==1) {
                    
                    System.out.println("The Price of the Nike Tshirt would be:   "+"Tshirt");            		
            		p=a.nextInt();
            		if(p==3) {
                            double discount = Nike*0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                            
                            System.out.println("Please Input The Payment");
                    		x=a.nextInt();
                    		if(x<discount) {   
                            double shortmoney = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                    			System.out.println("Please Try Again");
                                    
                                } 
                            
                             }while(x<discount);
            			double Tshirt_change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is your change:   "+Tshirt_change);
                		
                		System.out.println("Thank you for Purchasing!");
            			break;
                                
                        }
                        else if(p==2) {
            			double discount = Nike*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                                
                                System.out.println("Please Input The Payment");
                    		x=a.nextInt();
                    		if(x<discount) {
                                
                                double shortmoney = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                    			System.out.println("Please Try Again");
                    			   
                                }
                                
                            }while(x<discount);
            			double Tshirt_change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is your change:   "+Tshirt_change);
                		
                		System.out.println("Thank you for Purchasing!");
            			break;
                            
                            }
            		else if(p==1) {
            			double discount = Nike*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double shortmoney = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                    			System.out.println("Please Try Again");
                                        
                                }
                    		}while(x<discount);
            			double Tshirt_change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is your change:   "+Tshirt_change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
            			break;	    
                        }
                     else {	
            		do {
            			
            		System.out.println("Please Input The Payment");
            		x=a.nextInt();
            		if(x<Nike) {
            			
            			float shortmoney = Nike - x;
            			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
            			System.out.println("Please Try Again");
                        }
                        
                        }while(x<Nike);
            		float Tshirt_change = x - Nike;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is your change:   "+Tshirt_change);
            		
            		System.out.println("Thank you for Purchasing!");
            		break;
                }
                }
                
            //Adidas
            
            else if(x==2) {
                System.out.println("Type The Item Number of the Tshirt: ");
            	x=a.nextInt();
      
            	if(x==2) {
                double discount = Adidas*0.95;
            			System.out.println("You will get 5% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                                    
                                System.out.println("Please Input The Payment");
                            		x=a.nextInt();
                            		if(x<discount) {
                            			
                            			double shortmoney = discount - x;
                            			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                            			System.out.println("Please Try Again");
                            			                    
                                }
                                }while(x<discount);
                    			double tshirt_change = x - discount;
                        		
                        		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is your change:   "+tshirt_change);
                        		
                        		System.out.println("Thank you for Purchasing!");
                        		break;        
                                }
                                }
                    		else if(x==2) {
                    			double discount = Adidas*0.80;
                    			System.out.println("You will get 20% discount!");
                    			System.out.println("Your total Payment with discount will be "+discount);
                    			do {
                        			
                            		System.out.println("Please Input The Payment");
                            		x=a.nextInt();
                            		if(x<discount) {
                            			
                            			double shortmoney = discount - x;
                            			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                            			System.out.println("Please Try Again");
                            			     
                                        }
                                        }while(x<discount);
                    			double Tshirt_change = x - discount;
                        		
                        		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is your change:   "+Tshirt_change);
                        		
                        		System.out.println("Thank you for Purchasing! til we meet again.");
                        		break;
                                        
                            }
                    		else if(x==1) {
                    			double discount = Adidas *0.70;
                    			System.out.println("You will get 30% discount!");
                    			System.out.println("Your total Payment with discount will be "+discount);
                    			do {
                        			
                            		System.out.println("Please Input The Payment");
                            		x=a.nextInt();
                            		if(x<discount) {
                            			
                            			double shortmoney = discount - x;
                            			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                            			System.out.println("Please Try Again");
                            			
                            			
                            			}            
                                    }while(x<discount);
                    			double Tshirt_change = x - discount;
                        		
                        		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+Tshirt_change);
                        		
                        		System.out.println("Thank you for Purchasing!");
                        		break;
                    		}    
                                else {
                                do {
                                System.out.println("Please Input The Payment");
                                x=a.nextInt();
                                if(x<Adidas) {
            			float shortmoney = Adidas - x;
            			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
            			System.out.println("Please Try Again");	
                                }        
                                }while(x<Adidas);
            	
            		float Tshirt_change = x - Adidas;
            		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+Tshirt_change);
            		
            		System.out.println("Thank you for Purchasing!");
            		break;
            		}
            	}        
            
            //Oxygen
                        else if(x==3) {
                	
            		System.out.println("Type The Item Number of the Tshirt: ");   		
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Oxygen*0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double shortmoney = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+shortmoney+ "moeny.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                        }while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                		
                		System.out.println("Thank you for Purchasing!");
                		break;               
                        }
            		if(p==2) {
            			double discount = Oxygen*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double shortmoney= discount - x;
                    			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                    			System.out.println("Please Try Again");
                                }
                                }while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                		
                		System.out.println("Thank you for Purchasing!");
                		break;
            		}
                        if(p==1) {
            			double discount = Oxygen*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double shortmoney = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                    			System.out.println("Please Try Again");
                    			                    			
                    			}
                                }while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                		
                		System.out.println("Thank you for Purchasing!");
                		break;
                         }
            		else {
            		do {
            		System.out.println("Please Input The Payment");
            		x=a.nextInt();
            		if(x<Oxygen) {
            			float shortmoney = Oxygen - x;
            			System.out.println("Ooops it seems like you are short on "+shortmoney+ "moeny.");
            			System.out.println("Please Try Again");	
            		} 
                        }while(x<Oxygen);
            	
            		float Oxygen_change = x - Oxygen;
            		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+Oxygen_change);
            		
            		System.out.println("Thank you for Purchasing!");
            		break;
            		}
            	}
            
            //Penshoppe
                else if(x==4) {
                   System.out.println("Type The Item Number of the Tshirt: ");  
                   p=a.nextInt();
                   if(p==3) {
                	double discount = Penshoppe*0.90;
                	System.out.println("You will get 10% discount!");
                	System.out.println("Your total Payment with discount will be "+discount);
                	do {
                    			
                        System.out.println("Please Input The Payment");
                        x=a.nextInt();
                        if(x<discount) {
                        			
                        double shortmoney = discount - x;
                        System.out.println("Ooops it seems like you are short on "+shortmoney+ "money");
                        System.out.println("Please Try Again");
                        			
                        			
                        }
                        }while(x<discount);
                		double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Sorry anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing!");
                    		break;
                		}
                		if(p==2) {
                			double discount = Penshoppe*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment");
                        		x=a.nextInt();
                        		if(x<discount) {
                                double shortmoney = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                                        System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                    		
                                        System.out.println("Thank you for Purchasing!");
                                        break;
                                        }
                                        
                		if(p==1) {
                			double discount = Penshoppe*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double shortmoney = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                                        }while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing!");
                    		break;
                		}
                		else {
                		do {
                		System.out.println("Please Input The Payment");
                		x=a.nextInt();
                		if(x<Penshoppe) {
                			float shortmoney = Penshoppe- x;
                			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<Penshoppe);
                	
                		float Penshoppe_change = x - Penshoppe;
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+Penshoppe_change);
                		
                		System.out.println("Thank you for Purchasing!");
                		break;
                		}
                	}
                
            //Bench 
                else if(x==5) {
                      System.out.println("Type The Item Number of the Tshirt: ");  
                      p=a.nextInt();
                      if(p==3) {
                       
                          double discount = Bench*0.90;
                			System.out.println("You will get 10% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double shortmoney = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                                        
                                        }while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing!");
                    		break;
                		}
                		if(p==2) {
                			double discount = Bench*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double shortmoney= discount - x;
                        			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                                        }while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing!");
                    		break;
                		}
                		if(p==1) {
                			double discount = Bench*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double shortmoney = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                                }while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing!");
                    		break;
                		}
                		else {
                		do {
                		System.out.println("Please Input The Payment");
                		x=a.nextInt();
                		if(x<Bench) {
                			float shortmoney = Bench - x;
                			System.out.println("Ooops it seems like you are short on "+shortmoney+ "money.");
                			System.out.println("Please Try Again");	
                		}        
                          }while(x<Bench);
                	
                		float Bench_change = x - Bench;
                		System.out.println("ohhh money money money mone-"+"\n"+"Sorry, anyway here is you change:   "+Bench_change);
                		
                		System.out.println("Thank you for Purchasing!");
                		break;
                		}
                                
                	}
            	
                        }
                          
                      }
                     
            }while (J.equals(b));
            
 }
    }}
	
	

   
            
            
            
 
                      