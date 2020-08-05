class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        //반 학생들의 체육복 갯수를 나타내는 배열
        int [] classMate = new int[n+1];
        classMate[0]=0;
        //모든 학생의 체육복 갯수 초기화 
        for(int i=1;i < classMate.length;i++){
            classMate[i]=1;
        }
        
        //여벌의 체육복을 가져온 학생 
        for(int i=0;i < reserve.length;i++){   
            classMate[reserve[i]]=classMate[reserve[i]]+1;
        }
        
        //체육복을 잃어버린 학생 
        for(int i=0;i < lost.length;i++){   
            classMate[lost[i]]=classMate[lost[i]]-1;
        }        
        
        for(int i=1;i < classMate.length-1;i++){
            int myCloth = classMate[i];
            if(myCloth==0){
               int nextCloth = classMate[i+1];
                if(nextCloth==2){
                    classMate[i]=1;
                    classMate[i+1]=1;
                }
            }else if(myCloth==2){
                int nextCloth = classMate[i+1];
                if(nextCloth==0){
                    classMate[i]=1;
                    classMate[i+1]=1;  
                }
            }
            
        }
        
        for(int i=1;i < classMate.length;i++){
            if(classMate[i]>0){
                answer= answer+1;
            }
        }
        
        return answer;
    }
}
