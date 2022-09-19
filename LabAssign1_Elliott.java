
/**
 *
 * @author Dan Elliott CIT-111-Z01
 * Lab Assignment 1
 */
public class LabAssign1_Elliott {

    
    public static void main(String[] args) {
        
        String star = "*";               //Setting up variables, A and B left
        int A = 31;                      //C and D right
        int B = 15;
        int C = 15;
        int D = 11;
        int E = 31;
        for(int i= 0; i< 14;i++ ){            //Print 14 lines in total
            if( i < 5 && i > 0 ){             // Make first point
                B--;
                C++; 

            }
            if( i < 9 && i > 5 ){       //turn lines inward for second point set
                B = B + 3;
                C = C - 3;
            }
            if(i == 9){                //Starting final point set             
                A = 15;
                E = 15;
                B = B - 1;
                C = C + 1;              
            }
            if( i < 13 && i > 9 ){                   //last point bodies
                B = B - 1;
                C = C + 1; 
                A = A - 3;
                E = E + 3;
            }
            if( i == 13){                             //last point tips
                B = B - 1;
                C = C + 1; 
                A = 31;
                E = 31;   
            }

            if( i == 5){
                B = 0;
                C = 30;
                for(int ii = 0; ii < 31; ii++){
                    if(ii <= 19 && ii > 11){
                        D++;
                    }
                    if(ii != D){
                        System.out.print(star);                
                    }else{
                        System.out.print(" ");               
                    }
                }
            }else{          
                for(int ii = 0; ii < 31; ii++){    
                    
                    if(ii == A || ii == B || ii == C || ii == E){
                        System.out.print(star);                
                    }else if( i == 6 && ii == 8 ){
                        System.out.print("Stars are Hard");    //the star was
                    ii = 21;                                   //difficult
                   }else{ 
                        System.out.print(" ");
                    }
                }
            }
        System.out.println("");
        } 
    } 
}
