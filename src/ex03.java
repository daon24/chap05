public class ex03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        //배열에 1~5 저장
        for(int i=0; i<arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println("변경 전");
        System.out.println(arr.length);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //배열 복사하기 위한 tmp 생성
        int[] tmp= new int[arr.length*2];

        //배열 복사하기
        for(int i =0; i <arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println("변경 후");
        System.out.println(arr.length);

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
