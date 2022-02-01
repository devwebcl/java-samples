package cl.devweb.guava.bloomfilter;

import java.math.BigInteger;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class BloomFilterPoc {

	public static void main(String[] args) {

		//Creating the BloomFilter
		BloomFilter bloomFilter = BloomFilter.create(Funnels.byteArrayFunnel(), 1000);

		BigInteger bigInteger = new BigInteger("123");
		BigInteger bitIntegerII = new BigInteger("123");

		//Putting elements into the filter
		//A BigInteger representing a key of some sort
		bloomFilter.put(bigInteger.toByteArray());

		//Testing for element in set
		boolean mayBeContained = bloomFilter.mightContain(bitIntegerII.toByteArray());

	}

}
