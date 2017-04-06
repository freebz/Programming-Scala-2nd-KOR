// CHAPTER 22 자바 상호 운용성

// 22.3 자바빈즈 프로퍼티

javap -cp target/scala-2.11/classes javainterop.ComplexBean
...
  public double real();
  public double imaginary();
  ...
  public double getReal();
  public double getImaginary();
  ...
}
