package parity.parity

class Parity {

    companion object {
        fun getParity(num: Int): String {
            if(num % 2 == 0) {
                return "Even"
            }
            return "Odd"
        }
    }

}