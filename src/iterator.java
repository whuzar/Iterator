public interface iterator {
    static int[] next(int[] tab){
        int temp;
        int change = 1;
        while(change > 0){
            change = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    change++;
                }
            }
        }
        return tab;
    }

    static int getElement(int num, int[] tab){
        return tab[num-1];
    }
}
