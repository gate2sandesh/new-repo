package com.radial.payment.interview;

import java.util.HashMap;
import java.util.Map;

public class Implementation {
    /**
     * Add an implementation of this method so that it passes all of the tests in ImplementationTest.
     * This method calculates the prime factors of the input argument (including count).
     * For example the prime factors of
     * -- 15 = 3 * 5
     * -- 28 = 2 * 2 * 7
     * -- 4,840 = 2 * 2 * 2 * 5 * 11 * 11
     *
     * The prime factors may include 1 and zero. See associated unit test.
     *
     * @param number The value for which the prime factors are to be calculated.
     * @return A map whose keys are prime integers and values are the number of times
     *      that prime integer is a factor of the input argument.
     */
    public static Map<Long, Long> primeFactors(long number) {
        Map<Long, Long> returnValue = new HashMap<>(1);
        if(number<=1){
            returnValue.put(number,1L);
            return returnValue;
        }
        while(number%2==0){
            if(returnValue.containsKey(2)){
                returnValue.put(2L,returnValue.get(2)+1);

            }else{
                returnValue.put(2L,1L);
            }
            number /=2;
        }
        for(long i=3; i<=Math.sqrt(number);i+=2){
            while(number%i==0){
                if(returnValue.containsKey(i)){
                    returnValue.put(i,returnValue.get(i)+1);

                } else{
                    returnValue.put(i,1L);
                }
                number /=i;
            }
        }
        if(number>2){
            if(returnValue.containsKey(number)){
                returnValue.put(number,returnValue.get(number)+1);

            } else{
                returnValue.put(number,1L);
            }
        }
        return returnValue;
    }
}
