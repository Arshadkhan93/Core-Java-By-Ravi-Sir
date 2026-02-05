package lab.day1_04_02_assignment;

import java.util.stream.Stream;

public class GenerateStream
{
	void main()
	{
		Stream.iterate(1, (e)->e+1).filter(n->n%2!=0).map(n->n*n).limit(10).forEach(IO::println);
	}

}
