class ArrayEx{
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for(int i=0; i <5; i++){
            System.out.printf("%d %d%n",i, score[i]);
        }

        System.out.printf("%d %n",tmp);
        System.out.printf("%d %d %n", 7, score[7]);
    }
}

//int[] score = new int[5];
//for(int i = 0; i<score.length; i++)
//    score[i] = i*10 +50;

// int[] score = new int[]{50, 60, 70, 80, 90};
// int[] score = {50, 60, 70, 80, 90};

// int[] score;
// score = new int[]{50, 60, 70, 80, 90};

// 매개변수로 배열을 받는 메서드
// int add(int[] arr){~~~^_^~~~~}
// int result = add(new int[]{100, 90, 80, 70, 60});