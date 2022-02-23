1. `BufferedReader`

   ```java
   // 입력 스트림 호출
   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
   
   // 한 줄 읽기
   String str = bf.readLine(); // String 타입만 가능(다른 타입은 형변환 필요)
   
   // 띄어쓰기로 구분된 데이터를 입력받는 경우 방법 1
   // 입력 값이 정수인 경우를 예시로
   StringTokenizer st = new StringTokenizer(str);
   int num1 = Integer.parseInt(st.nextToken());
   int num2 = Integer.parseInt(st.nextToken());
   
   // 띄어쓰기로 구분된 데이터를 입력받는 경우 방법 2
   // 띄어쓰기로 구분하여 배열에 대입
   String[] arr = str.split(" ");
   ```

   - 예외 처리 필요

2. `BufferedWriter`

   ```java
   // 출력 스트림 호출
   BufferedWriter bw = new BufferedWriter(new OutputStream(System.out));
   
   // 결과값 예시
   String str = "홍길동";
   
   // 출력
   bw.write(str);
   // 버퍼 비우기
   bw.flush();
   // 스트림 종료
   bw.close;
   ```

   