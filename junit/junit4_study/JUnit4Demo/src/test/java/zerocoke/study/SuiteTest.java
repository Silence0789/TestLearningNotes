package zerocoke.study;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Junit4DemoSuiteTest
 *
 * 深入学习
 * https://blog.csdn.net/weixin_43291944/article/details/101980554
 *
 * https://blog.csdn.net/weixin_43291944/article/category/9098942
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Junit4DemoTest.class
        ,Junit4DemoChildren2Test.class
        ,Junit4MethodTest.class
        ,Junit4DemoChildrenTest.class

})
public class SuiteTest {


}