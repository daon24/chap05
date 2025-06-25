//로또 번호 생성 예제
class ArrayEx8{
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i=0; i<ball.length; i++)
            ball[i] = i+1; //1~45 값 저장

        int temp =0; //값 change 위한 임시 변수
        int j =0;

        //6개 바꾸기
        for(int i =0; i<6; i++){
            j = (int)(Math.random()*45);
            //ball[i]와 ball[j]의 값을 서로 바꾸기
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        for(int i=0; i <6; i++)
            System.out.printf("%d%n",ball[i]);
    }
}