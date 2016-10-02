/**
 * Created by BADZ on 10/2/2016.
 *
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz".
 */

class FizzBuzz {

    static void main(args) {
        def isMultThree = {
            it%3 == 0
        }

        def isMultFive = {
            it%5 == 0
        }

        (1..100).each {
            def toPrint = null
            if (isMultThree(it)) {
                toPrint = "Fizz"
                if (isMultFive(it)) {
                    toPrint += "Buzz"
                }
            } else if (isMultFive(it)) {
                toPrint = "Buzz"
            }

            println toPrint?: it
        }
    }
}