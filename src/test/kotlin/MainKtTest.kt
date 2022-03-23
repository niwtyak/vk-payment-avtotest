import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateFee_default() {
        val amount = 10000000

        assertEquals(10.0,calculateFee(amount = amount),0.0)
    }


    @Test
    fun calculateFee_VKPay() {
        val cardType=CardType.VKPay
        val monthTransfer = 0
        val amount = 10000000

        assertEquals(0.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Mastercard_noMonthlyTransfer() {
        val cardType=CardType.Mastercard
        val monthTransfer = 0
        val amount = 10000000

        assertEquals(62000.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Mastercard_withMonthlyTransfer() {
        val cardType=CardType.Mastercard
        val monthTransfer = 100000
        val amount = 10000000

        assertEquals(0.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Maestro_noMonthlyTransfer() {
        val cardType=CardType.Maestro
        val monthTransfer = 0
        val amount = 10000000

        assertEquals(62000.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Maestro_withMonthlyTransfer() {
        val cardType=CardType.Maestro
        val monthTransfer = 100000
        val amount = 10000000

        assertEquals(0.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Visa() {
        val cardType=CardType.Visa
        val monthTransfer = 0
        val amount = 10000000

        assertEquals(75000.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Visa_lower_than_35() {
        val cardType=CardType.Visa
        val monthTransfer = 0
        val amount = 1000

        assertEquals(3500.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Mup() {
        val cardType=CardType.Mup
        val monthTransfer = 0
        val amount = 10000000

        assertEquals(75000.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }

    @Test
    fun calculateFee_Mup_lower_than_35() {
        val cardType=CardType.Mup
        val monthTransfer = 0
        val amount = 1000

        assertEquals(3500.0,calculateFee(cardType,monthTransfer,amount),0.0)
    }




}