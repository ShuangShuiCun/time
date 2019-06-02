import org.junit.Test;

public class JunitTest {
/*
* Junit 测试也是程序员测试，即所谓的白盒测试，它需要程序员知道被测试的代码如何完成功能，以及完成什么样的功能
* 通常我们写完代码想要测试这段代码的正确性，那么必须新建一个类，
* 然后创建一个 main() 方法，然后编写测试代码。如果需要测试的代码很多呢？
* 那么要么就会建很多main() 方法来测试，要么将其全部写在一个 main() 方法里面。
* 这也会大大的增加测试的复杂度，降低程序员的测试积极性。而 Junit 能很好的解决这个问题，
* 简化单元测试，写一点测一点，在编写以后的代码中如果发现问题可以较快的追踪到问题的原因，减小回归错误的纠错难度。
* */
    @Test
    public void Testadd(){
      int all= new JuintUitl().add(3,7);
        System.out.println(all);
    }
}
