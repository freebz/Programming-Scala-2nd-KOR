// Part IV 고급 주제 및 실전 응용

// CHAPTER 17 동시성 프로그래밍 도구

// 17.2 퓨처

// 17.2.1 Async

def async[T](body: => T): Future[T]
def await[T](future: Future[T]): T
