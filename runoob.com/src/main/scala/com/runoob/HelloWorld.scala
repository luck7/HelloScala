package com.runoob

object HelloWorld {

   /* 这是一个 Scala 程序
    * 这是一行注释
    * 这里演示了多行注释
    */    
    def main(args: Array[String]): Unit = {
        // 输出 Hello World
        // 这是一个单行注释
        println("Hello, world!")

        var a = 10;
        var b = 20;
        var c = 25;
        var d = 25;
        println("a + b = " + (a + b) );
        println("a - b = " + (a - b) );
        println("a * b = " + (a * b) );
        println("b / a = " + (b / a) );
        println("b % a = " + (b % a) );
        println("c % a = " + (c % a) );

        println("a == b = " + (a == b) );
        println("a != b = " + (a != b) );
        println("a > b = " + (a > b) );
        println("a < b = " + (a < b) );
        println("b >= a = " + (b >= a) );
        println("b <= a = " + (b <= a) );

        var aa = true;
        var bb = false;
        println("aa && bb = " + (aa && bb) );
        println("aa || bb = " + (aa || bb) );
        println("!(aa && bb) = " + !(aa && bb) );

        a = 60;           /* 60 = 0011 1100 */  
        b = 13;           /* 13 = 0000 1101 */
        c = 0;

        c = a & b;            /* 12 = 0000 1100 */ 
        println("a & b = " + c );
        c = a | b;            /* 61 = 0011 1101 */
        println("a | b = " + c );
        c = a ^ b;            /* 49 = 0011 0001 */
        println("a ^ b = " + c );
        c = ~a;               /* -61 = 1100 0011 */
        println("~a = " + c );
        c = a << 2;           /* 240 = 1111 0000 */
        println("a << 2 = " + c );
        c = a >> 2;           /* 15 = 1111 */
        println("a >> 2  = " + c );
        c = a >>> 2;          /* 15 = 0000 1111 */
        println("a >>> 2 = " + c );

        
        a = 10;    
        b = 20;
        c = 0;

        c = a + b;
        println("c = a + b  = " + c );
        c += a ;
        println("c += a  = " + c );
        c -= a ;
        println("c -= a = " + c );
        c *= a ;
        println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        println("c /= a  = " + c );

        a = 10;
        c = 15;
        c %= a ;
        println("c %= a  = " + c );

        c <<= 2 ;
        println("c <<= 2  = " + c );

        c >>= 2 ;
        println("c >>= 2  = " + c );

        c >>= a ;
        println("c >>= a  = " + c );

        c &= a ;
        println("c &= 2  = " + c );
     
        c ^= a ;
        println("c ^= a  = " + c );

        c |= a ;
        println("c |= a  = " + c );
    }

    // 声明变量，可修改
    var myVar = 10;

    // 声明常量，不能修改
    val myVal = "Hello, Scala!";
    
}