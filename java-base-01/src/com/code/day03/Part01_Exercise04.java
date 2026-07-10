package com.code.day03;

public class Part01_Exercise04 {
    public static void main(String[] args) {
        part1();
        part2();
    }

    public static void part1(){
        System.out.println("part1");
        boolean x = true;
        boolean y = false;
        short z = 42;

        /*
		表示if成立，执行z++，不成立，不执行z++。

		（1）z++
		先取z的值42，然后z自增为43
		（2）==
		42==42为true

		左边是true，&&没有满足短路的条件，右边继续

		（3）==
		false == true，不成立，为false

		（4）&&
		true && false，结果是false

		即if条件不成立，不执行z++;

		*/
        if((z++==42)&&(y==true))   z++;

        /*
		这里把x赋值为false，x=false结果是false

		||的左边是false，没有满足||的短路情况，右边继续

		++z，先对z自增为44，然后取z的值44
		==，44==45，不成立，为false
		if条件不成立，不执行z++;
		*/
        if ((x=false) || (++z==45))  z++;

        System.out.println("z="+z);
    }
    public static void part2(){
        System.out.println("part2");
        boolean x = true;
        boolean y = false;
        short z = 42;
        /*
		这里表示如果if(y=true)成立，那么再看if((z++==42)&&(y==true))	z++;这段。
		如果if(y=true)不成立，那么就不看if((z++==42)&&(y==true))	z++;这段。

		这里是y=true，是赋值，修改y的值为true，结果是true，表示if(y=true)成立
		*/
        if (y=true)
            /*
		z++，先取z的值42，然后z自增为43。
		==，42==42比较，成立
		&&左边是true，没有满足短路的情况，右边继续。
		y==true，上面把y修改为true, true==true成立

		true && true 结果是true，if成立，执行z++;
		z自增为44。
		*/
        if((z++==42)&&(y==true))   z++;
        /*
		x=false，x被修改为false, 结果是false
		||左边是false，没有满足短路的情况，右边继续。
		++z，先对z自增为45，再取z的值
		45==45成立，为true
		false || true，结果为true，if成立，执行z++;
		z自增为46
		*/
        if ((x=false) || (++z==45))  z++;

        System.out.println("z="+z);
        //z的值是46
    }
}
