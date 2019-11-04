package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import p4.csvfilesource.Customer;

public class TestComputation_CsvFileSource {

   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int input1, int input2, int expected) throws Exception {

	  Computation com = new Computation();
      int actualResult = com.getDiscount(input1, input2); 
      Assert.assertEquals(actualResult, expected);

   }
}