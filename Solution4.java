public class Solution4 {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==0 && n>0){
                    flowerbed[i]=1;

                    n--;
                    if(i>0 && flowerbed[i-1]!=0){
                        flowerbed[i]=0;
                        n++;
                    } else if(i< flowerbed.length -1 && flowerbed[i+1]!=0){
                        flowerbed[i]=0;
                        n++;
                    }
                }
            }
            return n==0;
        }

}
